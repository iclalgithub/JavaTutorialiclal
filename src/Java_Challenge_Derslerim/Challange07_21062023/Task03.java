package Java_Challenge_Derslerim.Challange07_21062023;

import java.util.Scanner;

public class Task03 {
    /* task->
     cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method create ediniz.
      */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Agam bi cm sayi giresen : ");
        int cmSayi = input.nextInt();

        System.out.println("girilen cm 'nin m değeri : " +mConvert(cmSayi)+" metre");
        System.out.println("girilen cm 'nin km değeri : " +kmConvert(cmSayi)+" kilometre");

    }

    private static double kmConvert(int cmSayi) {

        return cmSayi/10000;
    }

    private static double mConvert(int cmSayi) {
        return cmSayi/100;
    }

}