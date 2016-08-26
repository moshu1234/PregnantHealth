package com.pregnant.health.db;

import com.pregnant.health.db.base.AbstractDatabaseManager;
import com.pregnant.health.model.Type;

import de.greenrobot.dao.AbstractDao;

/**
 * Created by cws on 2016/3/15.
 */
public class TypeDbManager extends AbstractDatabaseManager<Type, String> {
    @Override
    public AbstractDao<Type, String> getAbstractDao() {
        return daoSession.getTypeDao();
    }

}
