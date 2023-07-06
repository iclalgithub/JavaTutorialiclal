package Java_Challenge_Derslerim.Challange04_08062023;

import java.util.Scanner;

public class Task11_iclal {
    // Task-> Girilen  isim ve soyismini  hangisinin daha uzun oldugunu print eden code create ediniz.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("isminizi giriniz");
        String isim = input.next().toUpperCase();
        System.out.println("isim = " + isim);
        System.out.println("soyisminizi giriniz");
        String soyisim = input.next().toUpperCase();
        System.out.println("soyisim = " + soyisim);
        int uzunluk1=isim.length();
        int uzunluk2=isim.length();

        if(uzunluk1>uzunluk2){
            System.out.println("isminizin uzunluğu soyisminizin uzunluğundan daha büyüktür");
        }else System.out.println("soyisminizin uzunluğu isminizin uzunluğundan daha büyüktür");



    }

}