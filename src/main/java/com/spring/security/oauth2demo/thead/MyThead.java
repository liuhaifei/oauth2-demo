package com.spring.security.oauth2demo.thead;

/**
 * 自定义线程
 */
public class MyThead extends Thread {

    @Override
    public void run() {
        System.out.println("执行run方法。。。。。");
        int i=1/0;
        System.out.println("执行完成");
    }
}
