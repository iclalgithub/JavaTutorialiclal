package ch08_Loops.L02_WhileLoop.Tasks08_whileLoops;

import java.util.Scanner;

public class Task02_iclal {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */
        Scanner input = new Scanner(System.in);
        System.out.println("bir tamsayı giriniz : ");
        int sayi1 = input.nextInt();
        System.out.println("ikinci tamsayıyı giriniz : ");
        int sayi2 = input.nextInt();

        // for ile çözüm
        System.out.println("****FOR İLE ÇÖZÜM***");
        for (int i = sayi1+1; i <sayi2 ; i++) {
            System.out.print(i+" ");
        }

        // while (sayi1<i<sayi2) HATA!!! while içinde karşılaştırma olmaz

        // while ile çözüm
        int i= sayi1+1;
        System.out.println("\n **** WHILE İLE ÇÖZÜM***");
        while (i<sayi2){
           System.out.print(i+ " ");
           i++;
       }


    }
}
