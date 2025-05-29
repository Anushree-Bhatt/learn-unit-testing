package com.practice.mockito;


import com.practice.mockito.repo.DataService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BusinessImplTest {

    @Test
    void test_findGreatest(){
        DataServiceImpl_stub1 stub1 = new DataServiceImpl_stub1();
        BusinessImpl service = new BusinessImpl(stub1);
        int res = service.findGreatest();

        assertEquals(67, res);

    }
}

class DataServiceImpl_stub1 implements DataService {

    @Override
    public int[] retreiveAllData() {
        return new int[]{24,67,25};
    }

    @Override
    public void nothing() {

    }

}