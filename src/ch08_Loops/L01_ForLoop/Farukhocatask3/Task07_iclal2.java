package ch08_Loops.L01_ForLoop.Farukhocatask3;

import java.util.Scanner;

public class Task07_iclal2 {
    public static void main(String[] args) {
        /*
        Task ->
        //dikdörtgen şeklinde yazılsın istersek
        girilen boyuttta bir kare için
         Ekran Çıktısı
            Bir sayı giriniz: 7
            1 0 0 0 0 0 0
            0 1 0 0 0 0 0
            0 0 1 0 0 0 0
            0 0 0 1 0 0 0
            0 0 0 0 1 0 0
            0 0 0 0 0 1 0
            0 0 0 0 0 0 1


            Bir sayi giriniz: 5
            1 0 0 0 0
            0 1 0 0 0
            0 0 1 0 0
            0 0 0 1 0
            0 0 0 0 1

            şekli print eden code create ediniz
         */


        Scanner input = new Scanner(System.in);
        System.out.println("boyutu giriniz");
        int boyut = input.nextInt();
        System.out.println("***satır çoğaltma***");
        for (int i = 1; i <= boyut + 5; i++) {
            for (int j = 1; j <= boyut; j++) {
                if (i == j) {
                    System.out.print("1 ");
                } else System.out.print("0 ");
                //DİKKAT println yazınca olmuyor
                //print yazmanız gerekiyor
                //DİKKAT
            }
            System.out.println();

        }
        System.out.println("***sütun çoğaltma***");
        for (int i = 1; i <= boyut ; i++) {
            for (int j = 1; j <= boyut+5; j++) {
                if (i == j) {
                    System.out.print("1 ");
                } else System.out.print("0 ");
                //DİKKAT println yazınca olmuyor
                //print yazmanız gerekiyor
                //DİKKAT
            }
            System.out.println();

        }
    }
}
