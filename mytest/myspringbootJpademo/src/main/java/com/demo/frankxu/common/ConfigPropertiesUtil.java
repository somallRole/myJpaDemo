package com.frankxu.codetest.common;


import java.util.*;

/**
 * 配置文件获取工具类
 */
public class ConfigPropertiesUtil {
    
    /**
     * 获取.properties的配置文件key-value值
     * 
     * @param propertyFileName .properties的文件名
     * @param key .properties的文件对应的key
     * @return
     */
    public static String getPropertiesValues(String propertyFileName,String key) {
        Locale locale = new Locale("zh", "CN");
        ResourceBundle resource = ResourceBundle.getBundle(propertyFileName, locale);
        Enumeration<String> keys = resource.getKeys();//所有的文件key集合
        String message = resource.getString(key);
        return message;
    }

//----------------------------.properties end--------------------------------------------- 

    public static void main(String[] args) {
       ConfigPropertiesUtil.getPropertiesValues("application","spring.datasource.name");
    }
}
