package ch26_Exceptions;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task02_iclalstringverigirisi {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("sıcaklık giriniz");
        int sicaklik= 0;

        try {
            sicaklik = input.nextInt();
        } catch (InputMismatchException e) {
            //throw new RuntimeException(e);
            System.out.println("sayısal değer giriniz");
            sicaklik = input.nextInt();
        }


        try {
            sicaklikKontrol(sicaklik);
        } catch (Exception e) {
            System.out.println("e"+e);
            System.out.println("e.getMessage() = " + e.getMessage());
        }
        System.out.println("main method sonu");

    }//main sonu

    private static void sicaklikKontrol(int celcius) throws IOException {

        if(celcius<10) {
            throw  new IOException("DİKKAT ! sıcaklık 10 derecenin altında..");
        }else System.out.println("sıcaklık normal değerlerde...");

    }


}
