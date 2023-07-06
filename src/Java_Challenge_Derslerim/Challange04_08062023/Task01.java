package Java_Challenge_Derslerim.Challange04_08062023;

import java.util.Scanner;

public class Task01 {

    //Task-> Girilen ismini ve soyisimi  buyuk harfler ile print eden code create ediniz.

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("bizim ooolan adını soyadını gir bakennggg  :");
       String  ad=input.next();
       String soyad=input.next();

      System.out.println( ad.toUpperCase().concat(" " + soyad.toUpperCase()));
      System.out.println( ad.toUpperCase()+" " + soyad.toUpperCase());
    }

}
