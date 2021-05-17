package com.frankxu.codetest.common;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Spring 获取application工具类
 */
@Component
public class ApplicationContextUtil implements ApplicationContextAware {
    
    private static ApplicationContext applicationContext;
    
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext= applicationContext;
    }

    /**
     * 获取spring applicationContext
     * @return
     */
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    /**
     * 根据beanName 获取bean对象
     * @param bean
     * @return
     */
    public static Object getBeanByName(String bean){
     return applicationContext.getBean(bean);   
    }
}
