package com.pregnant.health;


import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Property;
import de.greenrobot.daogenerator.Schema;

/**
 * 用来为GreenDao框架生成Dao文件
 * 参考 http://www.androidchina.net/3472.html
 *      http://www.buhaoting.com/chengxu/yundongjianfei/shoushencao/106250.html  (一对一，一对多，多对多)
 *      http://www.w2bc.com/Article/63079
 */
public class MyDaoGenerator {

    //辅助文件生成的相对路径
    public static final String DAO_PATH = "./app/src/main/java-gen";
    //辅助文件dao的包名
    public static final String DAO_PACKAGE_NAME = "com.pregnant.health.dao";
    //辅助文件model的包名
    public static final String MODEL_PACKAGE_NAME = "com.pregnant.health.model";
    //数据库的版本号
    public static final int DATA_VERSION_CODE = 1;

    public static void main(String[] args) throws Exception {
        // first parameter for version, second for default generate package
        Schema schema = new Schema(DATA_VERSION_CODE, MODEL_PACKAGE_NAME);

        // set dao class generate package
        schema.setDefaultJavaPackageDao(DAO_PACKAGE_NAME);
        // keep custom code block
        schema.enableKeepSectionsByDefault();

        addCategory(schema);
        addDict(schema);
//        addType(schema, "Type");

        //生成Dao文件路径
        new DaoGenerator().generateAll(schema, DAO_PATH);

    }

    /**
     * 添加不同的缓存表
     * @param schema
     * @param tableName
     */
    private static void addType(Schema schema, String tableName) {

        Entity entity = schema.addEntity(tableName);

        //主键id自增长
//        entity.addIdProperty().primaryKey().autoincrement();
        // id
        entity.addStringProperty("id").primaryKey();
        entity.addStringProperty("parentId");
        entity.addStringProperty("name");
        entity.addIntProperty("type");
        entity.addStringProperty("typeName");
    }
    /**
     * @param schema
     */
    private static void addCategory(Schema schema) {
        Entity type = schema.addEntity("Type");
        type.addStringProperty("id").primaryKey();
        type.addStringProperty("name").notNull();

        Entity category = schema.addEntity("Category");
        category.addStringProperty("id").primaryKey();
        category.addStringProperty("parentId");
        category.addStringProperty("name");
        Property typeId = category.addStringProperty("typeId").notNull().getProperty();
        category.addLongProperty("updateTime");
        category.addToOne(type, typeId);
        type.addToMany(category, typeId).setName("categorys");
    }
    /**
     * @param schema
     */
    private static void addDict(Schema schema) {

        Entity catalog = schema.addEntity("Catalog");
        catalog.implementsSerializable();
        catalog.addLongProperty("id").primaryKey();
        catalog.addStringProperty("name");  //
        catalog.addStringProperty("code");  // 目录标识
        catalog.addStringProperty("caption");  // 显示标题,用于设定选项名称 例如：（不抽、5支以下...）
        catalog.addStringProperty("defaultValue");  // 默认值 用于设定选项默认的值
        catalog.addStringProperty("tableName");  // 对应数据库表名
        catalog.addStringProperty("fieldName");  // 对应数据库表中的字段
        catalog.addStringProperty("remark");  // 描述
        catalog.addStringProperty("addTime");  // 添加时间
        catalog.addStringProperty("updateTime");  // 更新时间
        catalog.addStringProperty("children");

//        Entity dict = schema.addEntity("Dict");
//        dict.addStringProperty("code");  // 目录标识
//        dict.addStringProperty("caption");  // 显示标题,用于设定选项名称 例如：（不抽、5支以下...）
//        dict.addStringProperty("defaultValue");  // 默认值 用于设定选项默认的值
//        dict.addStringProperty("fieldName");  // 对应数据库表中的字段
//        dict.addStringProperty("remark");  // 描述
//        dict.addStringProperty("addTime");  // 添加时间
//        dict.addStringProperty("updateTime");  // 更新时间

        //建立一对多关联
//        Property parentId = catalog.addLongProperty("parentId").getProperty();
//        catalog.addToOne(catalog, parentId);
//        catalog.addToMany(catalog, parentId).setName("children");


    }

    /**
     * 添加不同的缓存表
     * @param schema
     * @param tableName
     */
    private static void addCache(Schema schema, String tableName) {

        Entity entity = schema.addEntity(tableName);

        //主键id自增长
        entity.addIdProperty().primaryKey().autoincrement();
        //请求结果
        entity.addStringProperty("result1");
        //页数
        entity.addIntProperty("page");
        //插入时间，暂时无用
        entity.addLongProperty("time");

    }

}