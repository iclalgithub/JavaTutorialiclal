package Java_Interview_Questions.Interview_05_19072023;

import java.util.Scanner;

public class Q30_ExponentialNumber_iclal {
    //Task->
    // Get 2 numbers from the user.
    //first number base
    //second number Top
    //Write a code that calculates the prime of a number.
    // Girilen taban ve us değerleri için sayının kuvvetini print eden code create ediniz.
    // 2, 3 --> 2^3 = 2*2*2= 8

    // 4, 3 --> 4^3= 4*4*4 = 64
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("taban değeri giriniz : ");
        int taban = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.print("üs değeri giriniz : ");
        int us = input.nextInt();

        int sonuc=1;

        System.out.println("***for ile çözüm***");

        for (int i = 0; i <= us ; i++) {
            sonuc*=taban;
        }
        System.out.println("for ile sonuc = " + sonuc);
        System.out.println();
        System.out.println("***while ile çözüm***");

        while(us!=0){
            sonuc*=taban;
            us--;
        }
        System.out.println();
        System.out.println("while ile sonuc = " + sonuc);

    }

}
