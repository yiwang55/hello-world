package com.yiwang.javainterview.atguiguphase1.p2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestSingleton5 {
    public static void main(String[] args) throws Exception {
        Callable<Singleton5> c = new Callable<Singleton5>() {
            @Override
            public Singleton5 call() throws Exception {
                return Singleton5.getInstance();
            }
        };
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Singleton5> f1 = es.submit(c);
        Future<Singleton5> f2 = es.submit(c);
        Singleton5 s1 = f1.get();
        Singleton5 s2 = f2.get();
        System.out.println(s1.equals(s2));
        es.shutdown();
    }
}
