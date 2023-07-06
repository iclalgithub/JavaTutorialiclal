package Java_Challenge_Derslerim.Challange01_31052023;

import java.util.Scanner;

public class Task09_ScannerClass {
    public static void main(String[] args) {
        //  Girilen yaricap değeri için cemberin cevresini ve dairenin alanini print eden code create ediniz. (pi =3.14)


        System.out.print("***Kendi Çözümüm***\n");

        Scanner input= new Scanner(System.in);
        System.out.print("Yarıçap değeri giriniz");
        int yariCap1 = input.nextInt();
        double pi1 = 3.14;
        System.out.println("çemberin cevresi : " + (yariCap1 * 2 * pi1)+"\ndaire alanı : "+ (yariCap1 * yariCap1*pi1));


        System.out.print("***Haluk Hocanın Çözümü***\n");
        //Scanner input = new Scanner(System.in);
        System.out.print("Gardaş hele yarıçap giresen : ");
        int yarıCap = input.nextInt();
        double pi = 3.14;
        System.out.println("çember cevresi : " + (yarıCap * 2 * pi)+"\ndaire alanı : "+ (yarıCap * yarıCap*pi));


    }

}