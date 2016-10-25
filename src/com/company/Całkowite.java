package com.company;


public class Całkowite {
    public static void main(String[] args) {
        byte a = 120;
        a = (byte) (a + 20);
//        rzutujemy int na byte
//        czyli dodawanie w byte dobrnęło do maxymalnej wartości +127 zaczął liczyć od końca, czyli od -127
//        ALE W JAVIE NIE WYSKAKUJE BLĄD!!!!
        System.out.println(a);

        short s = -32000;
        s = (short) (s - 1000);
        System.out.println(s);

        int i = 2000000000;
        i = (int) (2 * i);
        System.out.println(i);

        char c = 50;
        char eł = 322;
        System.out.println(eł);
//        zgodnie z UNICODE :)
        System.out.println(c);
//        unicode przyporządkuje znak 2 do nr 50, jako, że 2 zajmuje 50. miejsce w Unicodzie

        int j = '9' + '6';
        System.out.println(j);
//        przypisujemy char do int, nastąpiła konwersja z char na int zgodnie z Unicode
//        ale w drugą stronę niż w poprzednim przykładzie
    }

}
