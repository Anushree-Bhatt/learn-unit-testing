package com.practice.junit;

import org.junit.jupiter.api.*;

public class MyAnnotationsTest {

    @BeforeAll
    static void beforeAll(){
        System.out.println("Before all tests");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("Before Each test method");
    }

    @Test
    void test1(){
        System.out.println("test1");
    }

    @Test
    void test2(){
        System.out.println("test2");
    }

    @Test
    void test3(){
        System.out.println("test3");
    }

    @AfterEach
    void afterEach(){
        System.out.println("After Each test method");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("After all tests");
    }
}
