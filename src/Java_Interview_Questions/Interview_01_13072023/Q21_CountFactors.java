package InterviewQuestions;

import java.util.Scanner;

public class Q21_CountFactors {
    /* Task->
      Type java code by using while loop,
     Write a program to count the factors of an integer which is entered by user.
     Girilen sayının tam bolen sayısını print eden code create ediniz.
     Factors of 12 = 1, 2, 3, 4, 6, 12 ==> 6
     Factors of 8  = 1, 2, 4, 8 ==> 4
*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Biiziim olan bisayı gireceng mi :");

        int sayi = input.nextInt();
        System.out.println("   *** while ***   ");
        int bolenSayisi = 0;
        int bolen = 1;

        while (bolen <= sayi) {//1,2,3,...sayi tekrarı tanımlandı
            if (sayi % bolen == 0) {//tekrardaki herbir sayını girilen sayıyı tam bolme sartı
                bolenSayisi++;

                System.out.print(bolen + " ");
            }
            bolen++;
        }
        System.out.println();
        System.out.println("   *** for ***   ");
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                bolenSayisi++;
                System.out.print(i + " ");
            }

        }
        System.out.println();
        System.out.println(sayi + " nın " + bolenSayisi + " tane tam boleni vardır ");
    }
}
