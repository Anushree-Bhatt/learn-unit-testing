package com.practice.mockito;


import com.practice.mockito.repo.DataService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BusinessImplTest_stubs {

    @Test
    void test1_findGreatest(){
        DataServiceImpl_stub1 stub1 = new DataServiceImpl_stub1();
        BusinessImpl service = new BusinessImpl(stub1);
        int res = service.findGreatest();

        assertEquals(67, res);

    }

    @Test
    void test2_findGreatest(){
        DataServiceImpl_stub2 stub2 = new DataServiceImpl_stub2();
        BusinessImpl service = new BusinessImpl(stub2);
        int res = service.findGreatest();

        assertEquals(1, res);

    }
}

class DataServiceImpl_stub1 implements DataService {

    @Override
    public int[] retreiveAllData() {
        return new int[]{24,67,25};
    }

}

class DataServiceImpl_stub2 implements DataService{

    @Override
    public int[] retreiveAllData() {
        return new int[]{1};
    }
}