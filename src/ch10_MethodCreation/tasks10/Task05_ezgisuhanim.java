package ch10_MethodCreation.tasks10;

import java.util.Scanner;

public class Task05_ezgisuhanim {
    public static void main(String[] args) {
        // Task-> girilen iki sayıyı seçilen dört işleme göre hesaplayan method create ediniz..

        Scanner input = new Scanner(System.in);
        System.out.println("birinci sayıyı giriniz");

        int sayi1 = input.nextInt();

        System.out.println("ikinci sayıyı giriniz");

        int sayi2 = input.nextInt();

        System.out.println("topla(sayi2,sayi1) = " + topla(sayi2, sayi1));
        System.out.println("cikar(sayi2,sayi1) = " + cikar(sayi2, sayi1));
        System.out.println("carp(sayi2,sayi1) = " + carp(sayi2, sayi1));
        System.out.println("bol(sayi2,sayi1) = " + bol(sayi2, sayi1));


    }

    private static int bol(int sayi2, int sayi1) {
        return sayi1/sayi2;
    }

    private static int carp(int sayi2, int sayi1) {
        return sayi1*sayi2;
    }

    private static int cikar(int sayi2, int sayi1) {
        return sayi1-sayi2;
    }

    private static int topla(int sayi2, int sayi1) {
        return sayi1 + sayi2;
    }
}
