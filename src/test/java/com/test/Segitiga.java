package com.test;

import org.junit.Assert;
import org.junit.Test;

public class Segitiga {

    public void segitiga(int value){

        for (int i = 1; i<=value; i++){
           for (int a = 1; a<=i; a++){
               System.out.print("*");
           }
            System.out.println();
        }

    }

    @Test
    public void testSegitiga() {
        segitiga(6);
    }
}
