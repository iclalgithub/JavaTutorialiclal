package Java_Interview_Questions.Interview_01_13072023;

import java.util.Scanner;

public class Q21_CountFactors_iclaleksik {
    /* Task->
      Type java code by using while loop,
     Write a program to count the factors of an integer which is entered by user.
     Girilen sayının tam bolen sayısını print eden code create ediniz.
     Factors of 12 = 1, 2, 3, 4, 6, 12 ==> 6
     Factors of 8  = 1, 2, 4, 8 ==> 4
*/
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Sayi giriniz");
        int sayi = input.nextInt();
        System.out.println("**  while  **");
        int bolenSayisi = 0;
        int bolen = 1;
        while (bolen <= sayi) {
            if(sayi%bolen==0){
                bolenSayisi++;
                System.out.print(bolen+" ");
            }
        bolen++;
        }
        //hata var

        System.out.println("**  for ile **");
        int bolenSayisi2= 0;
        int bolen2 = 1;
        for (int i = 1; i <= sayi; i++) {
            if(sayi%bolen2==0){
                bolenSayisi2++;
                System.out.print(bolen2+" ");
            }
            bolen2++;
        }

    }//main sonu
}//class sonu
