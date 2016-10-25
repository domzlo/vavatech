package com.company;


public class Całkowite {
    public static void main(String[] args) {
        byte a = 120;
        a = (byte) (a + 20);
//        rzutujemy int na byte
        System.out.println(a);

        short s = -32000;
        s = (short) (s - 1000);
        System.out.println(s);

        int i = 2000000000;
        i = 2 * i;
        System.out.println(i);

        char c = 50;
        System.out.println(c);

        int j = '9';
        System.out.println(j);
    }

}
