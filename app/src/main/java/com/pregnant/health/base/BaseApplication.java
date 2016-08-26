package com.pregnant.health.base;

import android.app.Application;
import android.content.Context;

import com.pregnant.health.dao.DaoMaster;
import com.pregnant.health.dao.DaoSession;
import com.pregnant.health.db.base.AbstractDatabaseManager;
import com.pregnant.health.utils.ImageLoadProxy;

/**
 * Created by cws on 2016/3/12.
 */
public class BaseApplication extends Application {
    private static final String DB_NAME = "ph.db";
    private static Context mContext;
    private static DaoMaster daoMaster;
    private static DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;

        ImageLoadProxy.initImageLoader(this);
        initOpenHelper();

//        Thread.setDefaultUncaughtExceptionHandler(AppException.getAppExceptionHandler(this));
    }

    public static Context getContext() {
        return mContext;
    }

    private void initOpenHelper() {
        AbstractDatabaseManager.initOpenHelper(getApplicationContext());
    }

    public static DaoMaster getDaoMaster(Context context) {
        if (daoMaster == null) {
            DaoMaster.OpenHelper helper = new DaoMaster.DevOpenHelper(context, DB_NAME, null);
            daoMaster = new DaoMaster(helper.getWritableDatabase());
        }
        return daoMaster;
    }

    public static DaoSession getDaoSession(Context context) {
        if (daoSession == null) {
            if (daoMaster == null) {
                daoMaster = getDaoMaster(context);
            }
            daoSession = daoMaster.newSession();
        }
        return daoSession;
    }



}
