/*package com.kfit.base.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

*//**
 * ��ͨ�����Spring bean����
 * ˵����
 * 1��������Ҫ�ŵ�App.javaͬ�������Ӱ��²��ܱ�ɨ�裬����ʧЧ��
 * @author Administrator
 *//*

@Component
public class SpringUtil implements ApplicationContextAware{
    private static ApplicationContext applicationContext = null;


    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
       if(SpringUtil.applicationContext == null){
           SpringUtil.applicationContext  = applicationContext;
       }

      System.out.println("---------------------------------------------------------------------");
      System.out.println("---------------------------------------------------------------------");
      System.out.println("---------------com.kfit.base.util.SpringUtil------------------------------------------------------");
      System.out.println("========ApplicationContext���óɹ�,����ͨ�����ͨ������SpringUtils.getAppContext()��ȡapplicationContext����,applicationContext="+SpringUtil.applicationContext+"========");
      System.out.println("---------------------------------------------------------------------");

    }

    //��ȡapplicationContext
    public static ApplicationContext getApplicationContext() {
       return applicationContext;
    }
    
    //ͨ��name��ȡ Bean.
    public static Object getBean(String name){
       return getApplicationContext().getBean(name);
    }

   

    //ͨ��class��ȡBean.

    public static <T> T getBean(Class<T> clazz){

       return getApplicationContext().getBean(clazz);

    }

   

    //ͨ��name,�Լ�Clazz����ָ����Bean

    public static <T> T getBean(String name,Class<T> clazz){

       return getApplicationContext().getBean(name, clazz);

    }

}

*/