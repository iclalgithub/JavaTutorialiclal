package Java_Challenge_Derslerim.Challange01_31052023;

import java.util.Scanner;

public class Task08_ScannerClass {
    /*
   girilen iki tam sayının toplam ve farkını print eden code create ediniz.

   */
    public static void main(String[] args) {

        System.out.println("***Kendi Çözümüm***");
        Scanner input= new Scanner(System.in);
        System.out.println("birinci numarayı giriniz");
        int number1= input.nextInt();
        System.out.println("ikinci numarayı giriniz");
        int number2= input.nextInt();
        System.out.println("number1-number2 = " + (number1 - number2));
        System.out.println("number1+number2 = " + (number1 + number2));

       // Scanner input=new Scanner(System.in);
        System.out.print("Gardaş hele 1. sayı giresen : ");
        int sayi1=input.nextInt();

        System.out.print("Gardaş hele 2. sayı giresen : ");
        int sayi2=input.nextInt();

        System.out.println("girilen sayıların toplamı : "+(sayi1+sayi2)+ "\ngirilen sayıların farkı : "+(sayi1-sayi2));

    }
}
