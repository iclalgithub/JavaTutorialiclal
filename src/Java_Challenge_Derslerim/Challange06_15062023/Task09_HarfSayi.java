package Java_Challenge_Derslerim.Challange06_15062023;

import java.util.Scanner;

public class Task09_HarfSayi {
    public static void main(String[] args) {
        // Kullanıcıdan bir cümle ve harf için
        // cümlede harfin kaç kere
        //kullanıldığını bulup yazdırın.
        //ÖRNEK
        //İNPUT: Cümle: Java öğrenmek çok güzel. Harf:e
        //OUTPUT: Girdiğiniz cümlede e harfi 3 kere kullanılmış.

        Scanner input= new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String cumle=input.nextLine();
        System.out.println("Bir harf giriniz");
        char harf=input.next().charAt(0);
        int harfSayisi=0;

        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i)==harf){
                harfSayisi++;
            }
        }
        System.out.println(harf+ " harfi sayisi = " + harfSayisi);

    }
}
