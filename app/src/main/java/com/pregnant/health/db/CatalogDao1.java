package com.pregnant.health.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;

import com.pregnant.health.bean.Catalog1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cws on 2016/5/7.
 */
public class CatalogDao1 {

    private SQLiteOpenHelper mOpenHelper;
    public static final Object SYNC= new Object();
    public static final String DATABASE_NAME = "cws.db";
    public static final int DATABASE_VERSION = 1;

    public static final String ID = "_id";
    public static final String CATALOG_NAME = "CATALOG_NAME";
    public static final String CATALOG_CODE = "CATALOG_CODE";
    public static final String CATALOG_TABLENAME = "CATALOG_TABLENAME";
    public static final String CATALOG_REMARK = "CATALOG_REMARK";
    public static final String CATALOG_ADDTIME = "CATALOG_ADDTIME";
    public static final String CATALOG_UPDATETIME = "CATALOG_UPDATETIME";
    public static final String CATALOG_CAPTION = "CATALOG_CAPTION";
    public static final String CATALOG_DEFAULTVALUE = "CATALOG_DEFAULTVALUE";
    public static final String CATALOG_FIELDNAME = "CATALOG_FIELDNAME";



    public CatalogDao1(SQLiteOpenHelper openHelper){
        mOpenHelper=openHelper;
    }

    public Cursor query(String whereClause, String []whereArgs){
        final String sql = "SELECT "
                + ID + ","
                + CATALOG_NAME + ","
                + CATALOG_CODE + ","
                + CATALOG_CAPTION
                + " FROM " + (TextUtils.isEmpty(whereClause)? CATALOG_TABLENAME : CATALOG_TABLENAME+" WHERE "+whereClause);
        return mOpenHelper.getReadableDatabase().rawQuery(sql, whereArgs);
    }

    public List<Catalog1> queryToList(String whereClause, String []whereArgs){
        Cursor cursor=null;
        try{
            synchronized(SYNC){
                if ( (cursor = query(whereClause, whereArgs) )==null || cursor.getCount()<1)return null;
                final List<Catalog1> list = new ArrayList<Catalog1>(cursor.getCount());
                while (cursor.moveToNext()){
                    final Catalog1 entity=new Catalog1();
                    entity.setId(cursor.getInt(cursor.getColumnIndex(ID)));
                    entity.setName(cursor.getString(cursor.getColumnIndex(CATALOG_NAME)));
                    entity.setCode(cursor.getString(cursor.getColumnIndex(CATALOG_CODE)));
                    entity.setCaption(cursor.getString(cursor.getColumnIndex(CATALOG_CAPTION)));
                    list.add(entity);
                }
                cursor.close();
                return list;
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            if (cursor!= null) cursor.close();
        }
        return null;
    }

    public boolean insert(Catalog1 entity){
        SQLiteDatabase db=null;
        try{
            return insert0(db=mOpenHelper.getWritableDatabase(), entity);
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            if (db!=null) db.close();
        }
        return false;
    }

    public boolean update(Catalog1 entity){
        SQLiteDatabase db=null;
        try{
            return update0(db=mOpenHelper.getWritableDatabase(), entity, ID+"=?", new String[]{String.valueOf(entity.getId())} );
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            if (db!=null) db.close();
        }
        return false;
    }

    public boolean delete(Catalog1 entity){
        SQLiteDatabase db=null;
        try{
            return delete0(db = mOpenHelper.getWritableDatabase(), ID + "=?", new String[]{String.valueOf(entity.getId())});
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            if (db!=null) db.close();
        }
        return false;
    }

    private static final boolean insert0(SQLiteDatabase db, Catalog1 entity){
        return db.insert(CATALOG_TABLENAME, null, tranEntity2CV(entity, true) ) >0;
    }
    private static final boolean update0(SQLiteDatabase db, Catalog1 entity, String whereClause, String []whereArgs){
        return db.update(CATALOG_TABLENAME, tranEntity2CV(entity, false), whereClause, whereArgs) >0;
    }
    private static final boolean delete0(SQLiteDatabase db, String whereClause, String []whereArgs){
        return db.delete(CATALOG_TABLENAME, whereClause, whereArgs) >0;
    }

    private static final ContentValues tranEntity2CV(Catalog1 entity, boolean forInsert){
        final ContentValues cv=new ContentValues(3);
        cv.put(ID, entity.getId());
        cv.put(CATALOG_NAME, entity.getName());
        cv.put(CATALOG_CODE, entity.getCode());
        cv.put(CATALOG_CAPTION, entity.getCaption());
        return cv;
    }

    /**
     * 批量插入
     * @param list
     * @return
     */
    public boolean bulkInsert(List<Catalog1> list){
        SQLiteDatabase db=null;
        try{
            (db=mOpenHelper.getWritableDatabase()).beginTransaction();
            for (int i=0, nlen=list.size(); i<nlen; i++){
                if(!insert0(db, list.get(i) ) ) return false;
            }
            db.setTransactionSuccessful();
            return true;
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            if (db!=null){
                db.endTransaction();
                db.close();
            }
        }
        return false;
    }

    public static final class COLUMNS{
        public static final String SEX="[Sex]", NAME="[Name]", AGE="[Age]", ID="[_Id]";
    }
    public static final class COLUMNINDEXS{
        public static final int SEX=0, NAME=1, AGE=2, ID=3;
    }
    static final void dropTable(SQLiteDatabase db){
        db.execSQL("DROP TABLE IF EXISTS " + CATALOG_TABLENAME + ";");
    }
    static final void createTable(SQLiteDatabase db){
        db.execSQL( "CREATE TABLE IF NOT EXISTS " + CATALOG_TABLENAME + "("
                + COLUMNS.SEX + " INTEGER DEFAULT(1),"
                + COLUMNS.NAME + " TEXT(3,15) UNIQUE NOT NULL,"
                + COLUMNS.AGE + " INTEGER DEFAULT(20),"
                + COLUMNS.ID + " INTEGER PRIMARY KEY AUTOINCREMENT);" );
    }

}
