package com.test;

import org.junit.Test;

public class MockInterview {

    static int[] arr = {1,2,3,4,5,6,7,8,9};
    static String[] bintang = {"1","2","3","4","5","6","7","8","9","10"};

    public void sumTargetNumber(int target){
        int temp = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                temp = arr[i] + arr[j];
                if (temp == target && i != j){
                    System.out.println(arr[i] + "+" + arr[j] + " = " + target);
                }
            }
        }
    }

    public void bintang(){
        for (int i = 0; i<bintang.length; i++){

        }
    }

    @Test
    public void testBintang() {
        bintang();
    }

    @Test
    public void testSumTarget() {
        sumTargetNumber(4);
    }
}
