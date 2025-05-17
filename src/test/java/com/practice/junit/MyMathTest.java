package com.practice.junit;

import com.practice.junit.calci.MyMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class MyMathTest {

    @Test
    public void addTest(){
        MyMath math = new MyMath();
        int[] numbers = {1,2,3};

        int actual = math.add(numbers);
        int expected = 5;

        assertEquals(actual, expected);


    }
}
