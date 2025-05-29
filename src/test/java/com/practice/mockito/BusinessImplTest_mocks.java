package com.practice.mockito;


import com.practice.mockito.repo.DataService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BusinessImplTest_mocks {

    @Test
    void test1_findGreatest(){
        DataService dataServiceMock1 = mock(DataService.class);
        when(dataServiceMock1.retreiveAllData()).thenReturn(new int[]{1,2,3});
        BusinessImpl service = new BusinessImpl(dataServiceMock1);
        int res = service.findGreatest();
        assertEquals(3, res);

    }

    @Test
    void test2_findGreatest(){
        DataService dataServiceMock2 = mock(DataService.class);
        when(dataServiceMock2.retreiveAllData()).thenReturn(new int[]{5});
        BusinessImpl service = new BusinessImpl(dataServiceMock2);
        int res = service.findGreatest();
        assertNotEquals(3, res);

    }
}

