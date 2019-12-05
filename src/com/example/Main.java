package com.example;

public class Main {
    /**test convert integer to roman numeral*/
    public static void main(String[] args) {
        int num = 1999;
        String romanNumeral = IntToRoman.generateRomanNumber(num);
        System.out.println(num + " -> " + romanNumeral);
    }
}
