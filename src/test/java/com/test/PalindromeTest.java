package com.test;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest {

    public boolean isPalindrome(String text){
        String temp = "";
        for (int i = text.length() -1 ; i >= 0; i--){
            temp = temp + text.charAt(i);
        }
        return temp.equals(text);
    }

    @Test
    public void testPalindrome() {
        isPalindrome("aba");
    }
}
