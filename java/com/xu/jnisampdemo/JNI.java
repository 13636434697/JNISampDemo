package com.xu.jnisampdemo;

public class JNI {


    static{
        System.loadLibrary("passdata");
    }

    public native int add(int x, int y);

    public native String sayHelloInC(String s);

    public native int[] arrElementsIncrease(int[] intArray);

}
