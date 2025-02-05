package com.hema;

public class StringManipilator {
    public  String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
