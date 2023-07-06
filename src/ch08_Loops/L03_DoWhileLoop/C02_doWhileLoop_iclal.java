package ch08_Loops.L03_DoWhileLoop;

import java.util.Scanner;

public class C02_doWhileLoop_iclal {
    public static void main(String[] args) {

        //task-> girilen sayı 17 den kucuk ise "kazandınız" print eden  değilse ise sonsuz kere sayı girişi isteyen
        //  code create ediniz...
        //17 den büyük sayı girerse tekrar sayı isteyecek


        Scanner input = new Scanner(System.in);



        int sayi;
        do {
            System.out.println("bir sayı giriniz");
            sayi = input.nextInt();
        } while (sayi >= 17);
        System.out.println("kazandınız");

    }
}
