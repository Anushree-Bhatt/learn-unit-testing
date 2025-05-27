package com.practice.mockito;

import com.practice.mockito.repo.DataService;

public class BusinessImpl {

    private DataService dataService;

    public BusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    public int findGreatest(){
        int[] arr = dataService.retreiveAllData();
        int min = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > min){
                min = arr[i];
            }
        }
        return min;
    }
}
