package com.stackroute;
import com.stackroute.domain.Moive;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
public static void main(String[]args) {
    //retriving Actor details using ApplicationContext

    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    System.out.println("============================================");
    System.out.println("in main class applicationcontext");
    Moive movie = context.getBean("movie", Moive.class);
    movie.moiveDisplay();





}
}
