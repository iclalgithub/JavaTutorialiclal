package ch08_Loops.L01_ForLoop.Tasks08_forLoop;

import java.util.Scanner;

public class Task09_iclal {
    public static void main(String[] args) {
        /*
        Task -> girilen 5 sayının 10 ile 20 arası hariç diğerlerinin
        toplamını hesap eden code create ediniz
         */

        Scanner input = new Scanner(System.in);

        //BURASI DÖNGÜ İÇİNE ALINACAK
        // int sayi1 = input.nextInt();
        // int sayi2 = input.nextInt();
        // int sayi3 = input.nextInt();
        // int sayi4 = input.nextInt();
        // int sayi5 = input.nextInt();

        int toplam = 0;

        System.out.println("***FOR İLE ÇÖZÜM***");
        System.out.println("Beş tane tam sayı giriniz");
        for (int i = 1; i <= 5; i++) {
            int sayi = input.nextInt();
            if (sayi < 10 || sayi > 20) {
                toplam += sayi;
            }
        }
        System.out.println("girilen 5 sayının 10 ile 20 arası hariç diğerlerinin" +
                " toplamı=" + toplam);

        System.out.println("***WHILE İLE ÇÖZÜM***");
        System.out.println("Beş tane tam sayı giriniz");
        int i = 0;
        while (i<5) {
            int sayi2 = input.nextInt();
            if (sayi2 < 10 || sayi2 > 20) {
                toplam += sayi2;
                i++;
            }
        }
        System.out.println("girilen 5 sayının 10 ile 20 arası hariç diğerlerinin" +
                " toplamı=" + toplam);
    }
}
