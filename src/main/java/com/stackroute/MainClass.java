package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Moive;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.io.ClassPathResource;
public class MainClass {
    public static void main(String[]args) {
        //displaying Actor details using ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Actor actor = context.getBean("actor", Actor.class);
        actor.display();
        Moive movie = context.getBean("movie", Moive.class);
        movie.moiveDisplay();
        //displaying actor details using Beanfactory
        System.out.println("================================================");
        System.out.println("using BeanFactor");
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Actor actor1 = context.getBean("actor", Actor.class);
        actor1.display();
        Moive movie1 = context.getBean("movie", Moive.class);
        movie1.moiveDisplay();
        System.out.println("================================================");
        //displaying actor details using BeanDefinitionRegistry
        System.out.println("using beanDefinitionReader");
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        BeanDefinitionRegistry register = new GenericApplicationContext(factory);
        BeanDefinitionReader reader = new XmlBeanDefinitionReader(register);
        reader.loadBeanDefinitions("beans.xml");
        Moive picture1 = factory.getBean("movie", Moive.class);
        picture1.moiveDisplay();


    }
}
