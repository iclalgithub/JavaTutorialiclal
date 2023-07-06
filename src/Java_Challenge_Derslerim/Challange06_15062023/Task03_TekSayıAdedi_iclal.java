package Java_Challenge_Derslerim.Challange06_15062023;

import java.util.Scanner;

public class Task03_TekSayıAdedi_iclal {

    /* Task->
    Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ve adedini print eden code create ediniz.

   */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("***FOR İLE ÇÖZÜM***");
        System.out.print("Bir sayı giriniz : ");
        int sayi = input.nextInt();
        int count = 0;
        for (int i = 1; i <= sayi; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " ");
                i++;
                count++;
            }

        }
        System.out.println("Girilen sayı adedi = " + count);

        System.out.println("***WHILE İLE ÇÖZÜM***");
        System.out.print("Bir sayı giriniz : ");
        int sayi2 = input.nextInt();
        int count2=0;
        while(sayi2>0) {
            if (sayi2 % 2 != 0) {
                System.out.println(sayi2 + " ");
                count2++;
            }
            sayi2--;
        }
        System.out.println("Girilen sayı adedi = " + count2);

    }

}
