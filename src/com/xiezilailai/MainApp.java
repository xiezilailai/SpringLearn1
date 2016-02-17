package com.xiezilailai;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 蝎子莱莱123 on 2016/2/15.
 */
public class MainApp {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
        HelloWorld obj=(HelloWorld)context.getBean("helloWorld");
        obj.printMessage();
    }
}
