package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Moive implements ApplicationContextAware, BeanNameAware, BeanFactoryAware {
    //actor class instantiation
    private Actor actor;
    private ApplicationContext applicationContext;
    public Moive(){
    }

    public Moive(Actor actor) {
        this.actor = actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    //display actor details using movie method
public void moiveDisplay(){
    System.out.println("display using movie class");
    actor.display();
}


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
this.applicationContext=applicationContext;
        System.out.println("implemented applicationContext interface in movie");
        Moive moive=applicationContext.getBean("movie",Moive.class);
        moive.moiveDisplay();
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("bean name is :"+ s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("bean factory is :"+beanFactory);
    }
}
