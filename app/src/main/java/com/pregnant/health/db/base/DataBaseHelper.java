/**
 * owner:liyizhang
 * time: 2011/06/06
 * site: http://wadiff.cn
 */


package com.pregnant.health.db.base;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.pregnant.health.db.CatalogDao1;

public class DataBaseHelper extends SQLiteOpenHelper {
    public DataBaseHelper(Context context, String name, CursorFactory factory,
                          int version) {
        super(context, name, factory, version);

        Log.v("DataBaseHelper", "name:" + name);

        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        try {

            db.execSQL("CREATE TABLE " + CatalogDao1.CATALOG_TABLENAME + " ("
                    + CatalogDao1.ID + " INTEGER PRIMARY KEY,"
                    + CatalogDao1.CATALOG_NAME + " TEXT,"
                    + CatalogDao1.CATALOG_CODE + " TEXT,"
                    + CatalogDao1.CATALOG_TABLENAME + " TEXT,"
                    + CatalogDao1.CATALOG_REMARK + " TEXT"
                    + CatalogDao1.CATALOG_ADDTIME + " TEXT"
                    + CatalogDao1.CATALOG_UPDATETIME + " TEXT"
                    + CatalogDao1.CATALOG_CAPTION + " TEXT"
                    + CatalogDao1.CATALOG_DEFAULTVALUE + " TEXT"
                    + CatalogDao1.CATALOG_FIELDNAME + " TEXT"
                    + ");");
        } catch (SQLException e) {

        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
        Log.w("cardnote", "Upgrading database from version " + oldVersion + " to "
                + newVersion + ", which will destroy all old data");
        db.execSQL("DROP TABLE IF EXISTS " + CatalogDao1.CATALOG_TABLENAME);
//        db.execSQL("DROP TABLE IF EXISTS " + Cardnote.REPAYMENTTABLE);
        onCreate(db);
    }
}
