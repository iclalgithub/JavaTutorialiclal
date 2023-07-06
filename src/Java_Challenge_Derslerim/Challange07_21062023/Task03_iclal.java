package Java_Challenge_Derslerim.Challange07_21062023;

import java.util.Scanner;

public class Task03_iclal {
    /* task->
     cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method create ediniz.
      */
    public static void main(String[] args) {
        donustur();
    }

    private static void donustur() {
        Scanner input =new Scanner(System.in);
        System.out.println("Bir sayı giriniz!- cm değeri olmalıdır-metre ve kilemetreye dönüştürülecektir!");
        double sayi=input.nextInt();



        double sayi_kmdegeri=sayi*0.001;

        System.out.println("sayi_kmdegeri = " + sayi_kmdegeri);
        double sayi_mdegeri=sayi*0.01;

        System.out.println("sayi_mdegeri = " + sayi_mdegeri);

    }

}