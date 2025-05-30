package com.practice.mockito;


import com.practice.mockito.repo.DataService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BusinessImplTest_mocks2 {

    @Mock
    private DataService dataServiceMock;

    @InjectMocks
    private BusinessImpl service;

    @Test
    void test1_findGreatest(){
        when(dataServiceMock.retreiveAllData()).thenReturn(new int[]{1,2,3});
        int res = service.findGreatest();
        assertEquals(3, res);

    }

    @Test
    void test2_findGreatest(){
        when(dataServiceMock.retreiveAllData()).thenReturn(new int[]{5});
        int res = service.findGreatest();
        assertNotEquals(3, res);

    }
}

