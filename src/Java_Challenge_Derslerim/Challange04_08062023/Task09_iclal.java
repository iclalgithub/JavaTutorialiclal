package Java_Challenge_Derslerim.Challange04_08062023;

import java.util.Scanner;

public class Task09_iclal {
    /* Task->
      Girilen bir kelimede  tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
      * kelimenin ortasindaki karakteri print eden code create ediniz.
      */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String kelime = input.next();

        int uzunluk = kelime.length();

        int ortadakiindeks= uzunluk/2;
        if(uzunluk%2!=0 && uzunluk>=3){
            char ortadakikarakter= kelime.charAt(ortadakiindeks);
            System.out.println("ortadaki karakter = " + ortadakikarakter);
        }


    }
}
