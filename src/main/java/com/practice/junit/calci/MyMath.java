package com.practice.junit.calci;

public class MyMath {

    public int add(int[] numbers){
        int sum = 0;
        for(int x: numbers){
            sum += x;
        }
        return sum;
    }
}
