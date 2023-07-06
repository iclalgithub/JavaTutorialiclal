package Java_Challenge_Derslerim.Challange05_14062023;

import java.util.Scanner;

public class Q04_ForLoop_iclal {
   /*   Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
	    ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
	    hesaplayan kodu yazın
	    Örnek Ekran Çıktısı
	    Girilen sayı=4               1 -> 1  2-> 4  3->9
	    Kareler toplamı=14
	     */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1'den büyük bir tam sayı giriniz!");
        int sayi = input.nextInt();

        int toplam = 0; // BUNU TANIMLAMAYI UNUTMUŞUM

        for (int i = 0; i < sayi + 1; i++) {

            int kare = i * i;
            System.out.println("i = " + i);
            System.out.println("i^2 = " + kare);
            toplam += kare;


        }
        System.out.println("toplam = " + toplam);

    }
}

