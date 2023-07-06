package Java_Challenge_Derslerim.Challange06_15062023;

import java.util.Scanner;

public class Task08_AsalKontrol {
    /*
 Task->
  Girilen sayının asal olup olmadığını kontrol eden code create ediniz.
   */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Agam hele bi sayi giresen : ");
        int sayi = input.nextInt(); // 7
        boolean asalMi = true;
        //while hatalı kod - derste çözüldü
       // while (sayi > 1) {
       //     if (sayi % (sayi - 1) == 0) {//sayi  başak bir sayıya tam bölünüyor-> asal değil
       //         asalMi = false;
       //         break;
       //     }

       //     if (asalMi) {
       //         System.out.println("girilen sayı ASAL :)");
       //     } else System.out.println("girlen sayı asal değil :( ");
       //     sayi--;
       // }
        for (int i = 2; i < sayi; i++) {
            if (sayi%i==0) {
                asalMi = false;
                break;
            }

        }if (asalMi) {
            System.out.println("girilen sayı ASAL :)");
        } else System.out.println("girilen sayı asal değil :( ");


    }


}
