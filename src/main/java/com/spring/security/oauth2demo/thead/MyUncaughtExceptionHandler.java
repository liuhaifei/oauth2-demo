package com.spring.security.oauth2demo.thead;

/**
 * 自定义uncaughtException
 */
public class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("异常捕获");
    }
}
