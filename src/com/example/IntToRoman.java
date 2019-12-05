package com.example;

public class IntToRoman {
    /** Given an integer, convert it to a roman numeral.
     *
     * @param num
     * @return Roman Numeral
     **/
    public static String generateRomanNumber(int num) {
        int arabs[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arabs.length; i++) {
            while (num >= arabs[i]) {
                sb.append(romans[i]);
                num -= arabs[i];
            }
        }

        return sb.toString();
    }
}
