package com.cc3002.java.exercises.classmethod;

public class A {
    public static String method1() {
        return "A.method1()";
    }

    public String method2() {
        return "A.method2() > " + method1();
    }
}
