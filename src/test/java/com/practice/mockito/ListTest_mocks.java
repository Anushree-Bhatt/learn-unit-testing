package com.practice.mockito;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest_mocks {

    @Test
    void singleReturn(){
        List mocked_list = mock(List.class);
        //size() => 3
        when(mocked_list.size()).thenReturn(3);
        assertEquals(3, mocked_list.size());
    }

    @Test
    void multipleReturns(){
        List mocked_list = mock(List.class);
        //size() => 3
        when(mocked_list.size()).thenReturn(3).thenReturn(1);
        assertEquals(3, mocked_list.size());
        assertEquals(1, mocked_list.size());
        assertEquals(1, mocked_list.size());
    }

    @Test
    void specificParam_1(){
        List mocked_list = mock(List.class);
        //get(0) => "Coffee time!"
        when(mocked_list.get(0)).thenReturn("Coffee time!");
        assertEquals("Coffee time!", mocked_list.get(0));
        assertEquals(null, mocked_list.get(1));
    }

    @Test
    void specificParam_2(){
        List mocked_list = mock(List.class);
        //get(0) => "Coffee time!"
        when(mocked_list.get(3)).thenReturn(93);
        assertEquals(null, mocked_list.get(1));
    }

    @Test
    void genericParam_1(){
        List mocked_list = mock(List.class);
        //get(0) => "Coffee time!"
        when(mocked_list.get(Mockito.anyInt())).thenReturn("Any time!");
        assertEquals("Any time!", mocked_list.get(0));
        assertEquals("Any time!", mocked_list.get(1));
    }






}
