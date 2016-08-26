package com.pregnant.health.db;

import com.pregnant.health.dao.CatalogDao;
import com.pregnant.health.db.base.AbstractDatabaseManager;
import com.pregnant.health.model.Catalog;

import java.util.List;

import de.greenrobot.dao.AbstractDao;

/**
 * Created by cws on 2016/3/15.
 */
public class DictCatalogDbManager extends AbstractDatabaseManager<Catalog,Long> {
    @Override
    public AbstractDao<Catalog, Long> getAbstractDao() {
        return daoSession.getCatalogDao();
    }

    public Catalog loadByCode(String code) {
        openReadableDb();
        List<Catalog> list = getAbstractDao().queryBuilder()
                .where(CatalogDao.Properties.Code.eq(code))
                .list();
        if (list.size() > 0) {
            return list.get(0);
        }
        return null;
    }
//
//    public List<Catalog> loadDictsByCatalogCode(long id) {
//        Catalog catalog = loadAllById(id).get(0);
//        return catalog.getChildren();
//    }

}
