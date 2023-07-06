package Java_Challenge_Derslerim.Challange07_21062023;

import java.util.Scanner;

public class Task07 {

    /* task ->
    İki integer sayının eşitliğini kontrol eden java methodunu yazınız.

    num1 = num2 => true
    */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("agam 1. sayi giresen : ");
        int sayi1 = input.nextInt();
        System.out.print("agam 2. sayi giresen : ");
        int sayi2 = input.nextInt();
        System.out.println(esitControlEt(sayi1, sayi2));


    }

    private static String esitControlEt(int sayi1, int sayi2) {
        return sayi1 ==sayi2 ? " girilen sayılar EŞİT :) " : "girilen sayıler EŞİT DEĞİL :( ";
    }
}




