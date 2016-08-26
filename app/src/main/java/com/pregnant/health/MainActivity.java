package com.pregnant.health;

import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.pregnant.health.api.Api;
import com.pregnant.health.base.BaseActivity;
import com.pregnant.health.db.DictCatalogDbManager;
import com.pregnant.health.model.Catalog;
import com.pregnant.health.net.CallbackListener;
import com.pregnant.health.ui.activity.MealSurveyActivity;
import com.pregnant.health.ui.activity.PersonalInfoActivity;
import com.pregnant.health.ui.activity.RoutineSurveyActivity;
import com.pregnant.health.ui.activity.SportSurveyActivity;
import com.pregnant.health.ui.activity.SystemAnalysisActivity;
import com.pregnant.health.ui.adapter.ItemAdapter;
import com.pregnant.health.utils.ACache;
import com.pregnant.health.utils.JSONUtils;
import com.pregnant.health.view.convenientbanner.CBViewHolderCreator;
import com.pregnant.health.view.convenientbanner.ConvenientBanner;
import com.pregnant.health.view.convenientbanner.NetworkImageHolderView;

import java.util.ArrayList;
import java.util.List;

import butterknife.InjectView;

/**
 * Created by cws on 2016/3/12.
 */
public class MainActivity extends BaseActivity implements AdapterView.OnItemClickListener {
    @InjectView(R.id.convenientBanner)
    ConvenientBanner mBanner;//顶部广告栏控件
    @InjectView(R.id.gv)
    GridView gv;

    private int[] resIds = {R.drawable.main_routine, R.drawable.main_sport, R.drawable.main_meal, R.drawable.main_info, R.drawable.main_result};
    private int[] names = {R.string.title_routine_survey, R.string.title_sport_survey, R.string.title_meal_survey, R.string.title_personal_info, R.string.title_analyze_results};

    private List<String> adList = new ArrayList<String>();

    @Override
    protected int getLayoutView() {
        return R.layout.act_main;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        gv.setAdapter(new ItemAdapter(this, resIds, names));
        gv.setOnItemClickListener(this);

        String json = ACache.get(MainActivity.this).getAsString(Constants.KEY_ALL);
        init();
        initBannerData();
    }

    @Override
    public int getTitleName() {
        return 0;
    }

    @Override
    protected void onResume() {
        super.onResume();
        mBanner.startTurning(Constants.AUTO_TURNING_TIME);
    }

    @Override
    protected void onPause() {
        super.onPause();
        mBanner.stopTurning();
    }

    private void init() {
        showProgressDialog();
        executeRequest(Api.DICT_DOWNLOAD, null, new CallbackListener() {
            @Override
            public void onSuccess(String data) {
//                ACache.get(MainActivity.this).put(Constants.KEY_ALL, JSONUtils.getString(data, Constants.RESULT_DATA));

                List<Catalog> catalogs = JSONUtils.string2Array2(data, Catalog.class);

                new DictCatalogDbManager().insertList(catalogs);
//                for (int i = 0; i < catalogs.size(); i++) {
//                    new DictCatalogDbManager().insertList(catalogs.get(i).getChildren());
//                }

                dismissDialog();
            }

            @Override
            public void onFailure(String message) {
                dismissDialog();
            }
        });
    }


    private void initBannerData() {
        adList.clear();
        adList.add("http://banbao.chazidian.com/uploadfile/2016-01-25/s145368924044608.jpg");
        adList.add("http://banbao.chazidian.com/uploadfile/2016-01-25/s145368924044608.jpg");
        adList.add("http://banbao.chazidian.com/uploadfile/2016-01-25/s145368924044608.jpg");
        mBanner
                .setPages(new CBViewHolderCreator<NetworkImageHolderView>() {
                    @Override
                    public NetworkImageHolderView createHolder() {
                        return new NetworkImageHolderView();
                    }
                }, adList)
                        //设置两个点图片作为翻页指示器，不设置则没有指示器，可以根据自己需求自行配合自己的指示器,不需要圆点指示器可用不设
                .setPageIndicator(new int[]{R.drawable.icon_indicate, R.drawable.icon_indicate_focused})
                        //设置指示器的方向
//                .setPageIndicatorAlign(ConvenientBanner.PageIndicatorAlign.ALIGN_PARENT_RIGHT)
                        //设置翻页的效果，不需要翻页效果可用不设
                .setPageTransformer(ConvenientBanner.Transformer.DefaultTransformer);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                intent(RoutineSurveyActivity.class);
                break;
            case 1:
                intent(SportSurveyActivity.class);
                break;
            case 2:
                intent(MealSurveyActivity.class);
                break;
            case 3:
                intent(PersonalInfoActivity.class);
                break;
            case 4:
                intent(SystemAnalysisActivity.class);
                break;
        }
    }

    @Override
    public void onBackPressed() {
        doExitApp();
    }

    private long exitTime = 0;
    public void doExitApp() {
        if ((System.currentTimeMillis() - exitTime) > 2000) {
            Toast.makeText(this, "再按一次退出程序", Toast.LENGTH_SHORT).show();
            exitTime = System.currentTimeMillis();
        } else {
            finish();
        }
    }
}
