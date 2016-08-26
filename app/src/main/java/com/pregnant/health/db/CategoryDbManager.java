package com.pregnant.health.db;

import com.pregnant.health.dao.CategoryDao;
import com.pregnant.health.db.base.AbstractDatabaseManager;
import com.pregnant.health.model.Category;

import java.util.List;

import de.greenrobot.dao.AbstractDao;

/**
 * Created by cws on 2016/3/15.
 */
public class CategoryDbManager extends AbstractDatabaseManager<Category, String> {
    @Override
    public AbstractDao<Category, String> getAbstractDao() {
        return daoSession.getCategoryDao();
    }

    public List<Category> loadAllByParentId(String parentId) {
        openReadableDb();
//        return getAbstractDao().queryRaw("where " + CategoryDao.Properties.ParentId.columnName + " = ?", parentId);
        return getAbstractDao().queryBuilder()
                .where(CategoryDao.Properties.ParentId.eq(parentId))
                .orderDesc(CategoryDao.Properties.UpdateTime)
                .list();
    }
}
