package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Moive;
import org.springframework.beans.factory.BeanDefinitionStoreException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.SimpleBeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class Main {
public static void main(String[]args) {
    //displaying actor details for using ApplicationContext
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    Moive movie = context.getBean("movie", Moive.class);
    movie.moiveDisplay();
    Moive movie1 = context.getBean("movie", Moive.class);
    movie1.moiveDisplay();
    System.out.println(movie==movie1);
    System.out.println("===============");
    Moive movie2 = context.getBean("movie2", Moive.class);
    movie2.moiveDisplay();
    Moive movie3= context.getBean("movie4", Moive.class);
    movie3.moiveDisplay();




}
}
