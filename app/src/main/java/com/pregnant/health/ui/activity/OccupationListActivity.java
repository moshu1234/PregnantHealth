package com.pregnant.health.ui.activity;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.pregnant.health.Constants;
import com.pregnant.health.R;
import com.pregnant.health.base.BaseActivity;
import com.pregnant.health.db.DictCatalogDbManager;
import com.pregnant.health.model.Catalog;
import com.pregnant.health.ui.adapter.OccupationAdapter;
import com.pregnant.health.utils.JSONUtils;

import java.util.List;

import butterknife.InjectView;

/**
 * 职业选择
 * Created by cws on 2016/3/24.
 */
public class OccupationListActivity extends BaseActivity {
    @InjectView(R.id.lv_occupation)
    ListView lv_occupation;

    OccupationAdapter occupationAdapter;

//    List<String> datas = new ArrayList<String>();

    Catalog catalog;

    @Override
    protected int getLayoutView() {
        return R.layout.act_occupation_list;
    }

    @Override
    public int getTitleName() {
        return R.string.title_occupation_list;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        catalog = new DictCatalogDbManager().loadByCode(Constants.CODE_PROFESSION);
        final List<Catalog> catalogs = JSONUtils.string2Array(catalog.getChildren(), Catalog.class);


//        datas.add("行政、专业技术以坐为主");
//        datas.add("服务行业（服务员、美容师等）");
//        datas.add("农、畜牧、林、渔等");
//        datas.add("生产、运输设备操作等");

        occupationAdapter = new OccupationAdapter(this, catalogs);
        lv_occupation.setAdapter(occupationAdapter);
        lv_occupation.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                occupationAdapter.setSeclection(position);
                Catalog catalog = catalogs.get(position);

                Intent data = new Intent();
                data.putExtra(EXTRA_KEY_BEAN, catalog);
                setResult(3, data);
                finish();
            }
        });
    }
}
