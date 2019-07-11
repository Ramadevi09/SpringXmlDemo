package com.stackroute;
import com.stackroute.domain.Moive;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
public static void main(String[]args) {
    //using ApplicationContext
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    Moive movie = context.getBean("movie", Moive.class);
    movie.moiveDisplay();
    Moive moive1=context.getBean("movie1",Moive.class);
    moive1.moiveDisplay();
    Moive moive2=context.getBean("movie2",Moive.class);
    moive2.moiveDisplay();




}
}
