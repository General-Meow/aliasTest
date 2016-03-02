package com.pandemic;

import com.pandemic.beans.bootstrap.Runner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");

        Runner runner = (Runner) applicationContext.getBean("runner");
        runner.run();

    }

}
