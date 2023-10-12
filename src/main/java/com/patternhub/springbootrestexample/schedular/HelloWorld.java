package com.patternhub.springbootrestexample.schedular;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

    //@Scheduled(fixedRate = 100)
    public void run(){
        System.out.println("Hello");
    }
}
