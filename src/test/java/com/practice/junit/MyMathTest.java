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

    @Test
    public void testAsserts(){
        List<String> courses = Arrays.asList("AWS", "Azure", "Devops");
        String str1 = "Hey!";
        String str2 = null;

        Boolean test1 = courses.contains("AWS");
        Boolean test2 = courses.contains("Docker");

        assertTrue(test1);
        assertFalse(test2);

        assertNull(str2);
        assertNotNull(str1);

        assertEquals(10, 10);
        assertEquals(3, courses.size());

        assertArrayEquals(new int[]{1,2,3}, new int[]{1,2,3});

    }
}
