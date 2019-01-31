package com.spring.security.oauth2demo.thead;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestDemo {

   static ExecutorService executorService= Executors.newFixedThreadPool(10);


    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
        Thread thread=new MyThead();
        executorService.execute(thread);
        executorService.shutdown();
    }
}
