package Java_Challenge_Derslerim.Challange04_08062023;

import java.util.Scanner;

public class Task01_iclal {

    //Task-> Girilen ismini ve soyisimi  buyuk harfler ile print eden code create ediniz.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("isminizi giriniz");
        String isim = input.next().toUpperCase();
        System.out.println("isim = " + isim);
        System.out.println("soyisminizi giriniz");
        String soyisim = input.next().toUpperCase();
        System.out.println("soyisim = " + soyisim);
        String bitisikIsim=  isim.concat( " "+soyisim);
        System.out.println("bitisikIsim = " + bitisikIsim);
        String bitisikIsim2=isim+" "+soyisim;
        System.out.println("bitisikIsim2 = " + " " + bitisikIsim2);




    }

}
