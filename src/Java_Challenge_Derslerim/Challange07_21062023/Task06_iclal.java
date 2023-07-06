package Java_Challenge_Derslerim.Challange07_21062023;

import java.util.Scanner;

public class Task06_iclal {
    static Scanner input = new Scanner(System.in);

    /* task->
     Girilen  isim ve soyismin ilk harflerini büyük
     diğer harflerini küçük harf olarak print eden method create ediniz.
     */
    public static void main(String[] args) {
        isimYaz();

    }

    private static void isimYaz() {
        System.out.println("İsminizi giriniz!");
        String isim=input.nextLine();
        System.out.println("Soyisminizi giriniz!");
        String soyIsim=input.nextLine();

        String yeniIsim= isim.substring(0,1).toUpperCase()+isim.substring(1);
        String yenisoyIsim= soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1);

        String sonHali=yeniIsim+" "+yenisoyIsim;
        System.out.println("sonHali = " + sonHali);
    }


}
