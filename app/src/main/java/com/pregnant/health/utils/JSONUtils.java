package com.pregnant.health.utils;

import android.text.TextUtils;

import com.alibaba.fastjson.JSONObject;
import com.pregnant.health.Constants;

import java.util.List;

public class JSONUtils {

    /**
	 * 获取json字符串某个字符串
	 */
	public static String getString(String result,String key){
		return JSONObject.parseObject(result).getString(key);
	}

    /**
     * 获取json字符串 resultData 下某个字符串
     * @param result
     * @param key
     * @return
     */
	public static String getString2(String result,String key){
		return JSONObject.parseObject(JSONObject.parseObject(result).getString(Constants.RESULT_DATA)).getString(key);
	}

	public static boolean getBoolean(String result,String key){
		return JSONObject.parseObject(result).getBoolean(key);
	}

	/**
	 * 获取json字符串某个jsonobject
	 */
	public static JSONObject getJSONObject(String result,String key){
		return JSONObject.parseObject(result).getJSONObject(key);
	}
	
	
	/**
	 * string2JSONObject
	 */
	public static JSONObject str2JSONObject(String result){
		return JSONObject.parseObject(result);
	}
	
	/**
	 * string2Bean
	 */
	public static <T> T string2Bean(String result, Class<T> clazz){
		if (TextUtils.isEmpty(result)) {
			return null;
		}
		return JSONObject.parseObject(result, clazz);
	}

	public static <T> T string2Bean2(String result, Class<T> clazz){
		return JSONObject.parseObject(getString(result, Constants.RESULT_DATA), clazz);
	}

	/**
	 * string2Array
	 * @param <T>
	 */
	public static <T> List<T> string2Array(String result, Class<T> clazz){
		if (TextUtils.isEmpty(result)) {
			return null;
		}
		return JSONObject.parseArray(result, clazz);
	}

	public static <T> List<T> string2Array2(String result, Class<T> clazz){
		return JSONObject.parseArray(getString(result, Constants.RESULT_DATA), clazz);
	}

	public static <T> List<T> string2Array3(String result, String key, Class<T> clazz){
		return JSONObject.parseArray(getString2(result, key), clazz);
	}

	/**
	 * string 2 String[]
	 * @param images
	 * @param class1
	 * @return
	 */
	public static String[] sting2Array(String images, Class<String> class1) {
		List<String> list = JSONObject.parseArray(images, class1);
		String[] array = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			array[i]=list.get(i); 
		}
		return array;
	}
}
