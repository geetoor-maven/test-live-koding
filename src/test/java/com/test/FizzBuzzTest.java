package com.test;

import org.junit.Test;

public class FizzBuzzTest {

    public void fizzBuzz(int value){
        for (int i = 1; i <= value; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.print(" FizzBuzz ");
            } else if (i % 3 == 0){
                System.out.print(" Fizz ");
            }else if (i % 5 == 0){
                System.out.print(" Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    @Test
    public void test() {
        fizzBuzz(50);
    }
}
