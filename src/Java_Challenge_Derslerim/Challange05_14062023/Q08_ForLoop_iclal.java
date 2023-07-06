package Java_Challenge_Derslerim.Challange05_14062023;

import java.util.Scanner;

public class Q08_ForLoop_iclal {

    // Kullanicidan iki sayi isteyin.
    // Girilen sayilar ve aralarindaki tum
    // tamsayilari toplayip, sonucu yazdiran bir program yaziniz

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("birinci sayı giriniz  :");
        int sayi1 = input.nextInt();
        System.out.println("ikinci sayıyı giriniz  :");
        int sayi2 = input.nextInt();

        int toplam=0;

        for (int i = sayi1; i <sayi2+1 ; i++) {
            System.out.println("i = " + i);
            toplam+=i;
            System.out.println("toplam = " + toplam);
        }



    }




}
