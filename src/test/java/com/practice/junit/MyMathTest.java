package com.practice.junit;

import com.practice.junit.calci.MyMath;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MyMathTest {

    @Test
    public void addTest_ThreeMemberArray(){
        MyMath math = new MyMath();
        assertEquals(6, math.add(new int[]{1,2,3}));
    }

    @Test
    public void addTest_ZeroLengthArray(){
        MyMath math = new MyMath();
        assertEquals(0, math.add(new int[]{})); //sum = 0
    }
}
