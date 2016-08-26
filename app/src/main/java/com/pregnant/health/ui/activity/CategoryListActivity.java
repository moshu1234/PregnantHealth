package com.pregnant.health.ui.activity;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.alibaba.fastjson.JSON;
import com.pregnant.health.Constants;
import com.pregnant.health.R;
import com.pregnant.health.base.BaseActivity;
import com.pregnant.health.bean.Meal;
import com.pregnant.health.db.DictCatalogDbManager;
import com.pregnant.health.model.Catalog;
import com.pregnant.health.ui.adapter.TextAdapter;
import com.pregnant.health.utils.DateUtil;
import com.pregnant.health.utils.DialogHelp;
import com.pregnant.health.utils.JSONUtils;
import com.pregnant.health.utils.TaskUtil;

import java.util.ArrayList;
import java.util.List;

import butterknife.InjectView;

/**
 * 膳食选择
 * Created by cws on 2016/3/14.
 */
public class CategoryListActivity extends BaseActivity implements AdapterView.OnItemClickListener {

    @InjectView(R.id.lv_category)
    ListView lv_category;
    @InjectView(R.id.lv_category_list)
    ListView lv_category_list;

    TextAdapter adapter1;
    TextAdapter adapter2;


    Meal meal;
    String mealType;
    String mealTypeId;

    Catalog catalog1;
    Catalog catalog2;
    Catalog catalog3;
    Catalog catalog4;
    Catalog catalog5;
    Catalog catalog6;
    Catalog catalog7;
    Catalog catalog8;
    Catalog catalog9;
    Catalog catalog10;

    List<Catalog> bigs;
    List<Catalog> catalogs = new ArrayList<Catalog>();
    List<Catalog> catalogs1;
    List<Catalog> catalogs2;
    List<Catalog> catalogs3;

    List<Meal> meals = new ArrayList<Meal>();

    String[] big = {"主食类", "豆类及制品", "蔬菜类", "禽畜肉类及制品", "水产类", "水果类", "蛋类/乳类制品", "油脂类/调料类/饮料类", "坚果类", "膳食增补剂"};
    boolean fromDetail;
    String unit;

    @Override
    protected int getLayoutView() {
        return R.layout.act_category_list;
    }

    @Override
    public int getTitleName() {
        return R.string.title_category_list;
    }

    @Override
    protected void initView() {

    }


    @Override
    protected void initData() {

        catalog1 = new DictCatalogDbManager().loadByCode(Constants.CODE_STAPLEFOODINSPECTION);
        catalog2 = new DictCatalogDbManager().loadByCode(Constants.CODE_BEANFOODINSPECTION);
        catalog3 = new DictCatalogDbManager().loadByCode(Constants.CODE_VEGETABLEFOODINSPECTION);
        catalog4 = new DictCatalogDbManager().loadByCode(Constants.CODE_LIVESTOCKFOODINSPECTION);
        catalog5 = new DictCatalogDbManager().loadByCode(Constants.CODE_SEAFOODINSPECTION);
        catalog6 = new DictCatalogDbManager().loadByCode(Constants.CODE_FRUITINSPECTION);
        catalog7 = new DictCatalogDbManager().loadByCode(Constants.CODE_EGGMILKINSPECTION);
        catalog8 = new DictCatalogDbManager().loadByCode(Constants.CODE_DRINKOILFOODINSPECTION);
        catalog9 = new DictCatalogDbManager().loadByCode(Constants.CODE_NUTINSPECTION);
        catalog10 = new DictCatalogDbManager().loadByCode(Constants.CODE_NURTUREINSPECTION);

        catalogs1 = JSONUtils.string2Array(catalog1.getChildren(), Catalog.class);

        catalogs.add(catalog1);
        catalogs.add(catalog2);
        catalogs.add(catalog3);
        catalogs.add(catalog4);
        catalogs.add(catalog5);
        catalogs.add(catalog6);
        catalogs.add(catalog7);
        catalogs.add(catalog8);
        catalogs.add(catalog9);
        catalogs.add(catalog10);

        if (getIntent() != null) {
            meal = (Meal) getIntent().getSerializableExtra(EXTRA_KEY_BEAN);
            fromDetail = TextUtils.isEmpty(meal.getFoodName()) ? false : true;
            mealType = meal.getMealType();
            mealTypeId = meal.getMealTypeId();
        }

        adapter1 = new TextAdapter(this, catalogs);
        lv_category.setAdapter(adapter1);
        adapter1.setSeclection(0, 0);
        lv_category.setOnItemClickListener(this);

        adapter2 = new TextAdapter(this, catalogs1);
        lv_category_list.setAdapter(this.adapter2);


        lv_category_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final Catalog catalog = CategoryListActivity.this.adapter2.getItem(position);
                CategoryListActivity.this.adapter2.setSeclection(position);

                if (!fromDetail) {
                    confrimUnit(catalog.getCaption());
                    DialogHelp.getInputDialog3(CategoryListActivity.this, catalog.getCaption(), new DialogHelp.ResultHandler() {

                        @Override
                        public void handle(String data) {
                            Meal m = new Meal();
                            m.setMealType(mealType);
                            m.setMealTypeId(mealTypeId);
                            m.setFoodName(catalog.getCaption());
                            m.setAmount(data + unit);
                            m.setDate(DateUtil.getFormatDate(System.currentTimeMillis()));
                            m.setTableName(catalog.getTableName());
                            m.setFieldName(catalog.getFieldName());
                            meals.add(m);
                            adapter2.setSeclection(-1);
                        }
                    }, unit);
                } else {
                    meal.setFoodName(catalog.getCaption());
                    doBack();
                }

            }
        });
    }

    private void confrimUnit(String caption) {
        if (caption.equals("VB1")
                || caption.equals("VB12")
                || caption.equals("叶酸")
                || caption.equals("VA")
                || caption.equals("硒")
                ) {
            unit = "ug";
        } else if (caption.equals("VB6")
                || caption.equals("VC")
                || caption.equals("钙")
                || caption.equals("镁")
                || caption.equals("锌")
                || caption.equals("铁")
                || caption.contains("亚麻酸")
                || caption.contains("DHA")
                || caption.contains("EPA")
                ) {
            unit = "mg";
        } else {
            unit = "g";
        }
    }

    @Override
    public void doBack() {
        if (fromDetail) {
            Intent intent = new Intent();
            intent.putExtra(EXTRA_KEY_BEAN, meal);
            setResult(3, intent);
            finish();
        } else {
            Intent intent = new Intent();
            intent.putExtra(EXTRA_KEY_BEAN, JSON.toJSONString(meals));
            setResult(1, intent);
            finish();
        }

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
        final Catalog c = catalogs.get(position);
        adapter1.setSeclection(0, position);
        TaskUtil.backFore(new TaskUtil.BackFore() {
            @Override
            public void onFore() {
                adapter2.replaceAll(catalogs1);
            }

            @Override
            public void onBack() {
                catalogs1 = JSONUtils.string2Array(c.getChildren(), Catalog.class);
            }
        });


    }
}
