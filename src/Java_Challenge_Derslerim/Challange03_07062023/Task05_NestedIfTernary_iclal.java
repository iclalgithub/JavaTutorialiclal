package Java_Challenge_Derslerim.Challange03_07062023;

import java.util.Scanner;

public class Task05_NestedIfTernary_iclal {
/* Task ->
       0 ~ 9 arasındaki sayilari ENG translate eden  code create ediniz.
       sayı 9'dan buyuk veya sifirdan kucukse, "Gecersiz" print ediniz.
      NestedIf ve Ternary kullanarak 2 yolla da cozunuz
    */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("translate edecek sayıyı giriniz");
        int sayi = input.nextInt();

        System.out.println("***NESTED IF İLE ÇÖZÜM***");
        if (sayi > 9 || sayi < 0)
            System.out.println("sayı geçersiz");  // BU KOMUT NEDEN GÖRÜNMÜYOR???
            //SİSTEME 10 GİRDİM ÇIKTI YOK ??????????SORRR??????
            // || yerine && yazmışım hatayo buldum!!!!!!!!!!
        else {
            if (sayi == 0) {
                System.out.println("zero");
            } else if (sayi == 1) {
                System.out.println("one");
            } else if (sayi == 2) {
                System.out.println("two");
            } else if (sayi == 3) {
                System.out.println("three");
            } else if (sayi == 4) {
                System.out.println("four");
            } else if (sayi == 5) {
                System.out.println("five");
            } else if (sayi == 6) {
                System.out.println("six");
            } else if (sayi == 7) {
                System.out.println("seven");
            } else if (sayi == 8) {
                System.out.println("eight");
            } else if (sayi == 9) {
                System.out.println("nine");
            }

            System.out.println("***NESTED TERNARY İLE ÇÖZÜM***");
            String sonuc = sayi == 0 ? "Zero" :
                    sayi == 1 ? "One" :
                            sayi == 2 ? "Two" :
                                    sayi == 3 ? "Three":
                                            sayi == 4? "Four":
                                                    sayi == 5? "Five":
                                                            sayi == 6 ? "Six":
                                                                    sayi==7?"Seven":
                                                                            sayi==8?"Eight":
                                                                                    sayi==9?"Nine":"Geçersiz";


            System.out.println("sonuc = " + sonuc);
        }// main sonu
    }



}
