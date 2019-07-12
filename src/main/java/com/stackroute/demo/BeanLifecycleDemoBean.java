package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializer");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy method");
    }
    public void customInit(){
        System.out.println("initialize bean");
    }
    public void customDestroy(){
        System.out.println("customdestroy bean");
    }
}
