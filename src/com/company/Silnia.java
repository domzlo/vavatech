package com.company;
import java.util.Scanner;

public class Silnia {

    public static void main(String[] args) {


        System.out.println("Podaj liczbę");
        Scanner scanner1 = new Scanner(System.in);
        int liczba = scanner1.nextInt();

        int wynik = silnia(liczba);

        System.out.println(wynik);
        System.out.println(wynik);
    }

    public static int silnia(int p) {
        if (p == 1) {
            return 1;
        }
            else {
                int wyniks = (silnia(p - 1)) * p;
                return wyniks;
            }
        }

    }


//        System.out.println("Podaj liczbę");
//        Scanner scanner = new Scanner(System.in);
//        int k = scanner.nextInt();
//
//        int wynik = 1;
//        for (int i = 1; i <= k; i++) {
//                wynik = wynik * i;
//        }
//
//        System.out.println(wynik);