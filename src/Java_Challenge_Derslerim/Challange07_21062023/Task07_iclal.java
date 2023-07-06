package Java_Challenge_Derslerim.Challange07_21062023;

import java.util.Scanner;

public class Task07_iclal {

    /* task ->
    İki integer sayının eşitliğini kontrol eden java methodunu yazınız.

    num1 = num2 => true
    */

    static Scanner input =new Scanner(System.in);


    public static void main(String[] args) {
        esitMi();

    }

    private static void esitMi() {
        System.out.println("Bir sayı giriniz!");
        int sayi1=input.nextInt();
        System.out.println("İkinci sayıyı giriniz!");
        int sayi2=input.nextInt();
        if(sayi1==sayi2){
            System.out.println("Sayılar eşittir");
        }else System.out.println("Sayılar eşit değildir");


    }
}




