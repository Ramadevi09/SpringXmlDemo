package com.stackroute;
import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.domain.Moive;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
public static void main(String[]args) {
    //using ApplicationContext

   AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

    //BeanLifecycleDemoBean beanLifecycleDemoBean = context.getBean("lifecycleDemo", BeanLifecycleDemoBean.class);
   context.registerShutdownHook();





}
}
