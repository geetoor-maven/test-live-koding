package com.test;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MinMax {

    static int arr[] = {10, 24, 43, 3, 44, 42, 30};

    // bilangan terbesar
    public int max(){

        int max = arr[0];

        for (int i = 0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    // bilangan terkecil array
    public int min(){
        int min = arr[0];

        for (int i = 0; i<arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    // jumlahkan array
    public int sumArray(){
        int value = 0;

        for (int i = 0; i < arr.length; i++) {
            value += arr[i];
        }
        return value;
    }

    // nilai rata rata
    public int average(){
        int value = 0;

        for (int i = 0; i < arr.length; i++) {
            value += arr[i];
        }
        return value / arr.length;
    }


    public int secondMax(){
        int max = 0;
        int secondMax = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                secondMax = max;
                max = arr[i];
            }else if (arr[i] > secondMax){
                secondMax = arr[i];
            }
        }

        return secondMax;
    }


    @Test
    public void testSecondMax() {
        System.out.println(secondMax());
    }

    @Test
    public void testMax() {
        Assert.assertEquals(44, max());
        System.out.println(max());
    }

    @Test
    public void testMin() {
        Assert.assertEquals(3, min());
        System.out.println(min());
    }

    @Test
    public void testSum() {
        System.out.println(sumArray());
    }

    @Test
    public void testAverage() {
        System.out.println(average());
    }
}
