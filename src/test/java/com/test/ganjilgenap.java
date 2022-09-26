package com.test;

import org.junit.Test;

public class ganjilgenap {

    public void ganjil(int value){

        for(int i = 1; i <= value; i++){
            if (i % 2 == 1){
                System.out.print(i + " ");
            }
        }

    }

    public void genap(int value){
        for (int i = 1; i <= value; i++){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }

    @Test
    public void testGanjil() {
        ganjil(50);
    }

    @Test
    public void testGenap() {
        genap(50);
    }
}
