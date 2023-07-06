package Java_Challenge_Derslerim.Challange06_15062023;

import java.util.Scanner;

public class Task01_RakamToplamı {
    // Task-> girilen sayının basamaklarındaki rakamların toplamını print eden code create ediniz.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Agam hele bi sayi giresen : ");
        int sayi = input.nextInt(); // 1453->145->14->1

        int rakamToplami = 0;// rakamların toplanacagı boş kutu create edildi.

        while (sayi > 0) {
            rakamToplami += sayi % 10;// sayının birler basamagındaki rakam toplama eklendi
            sayi = sayi / 10;// sayi'nin 10'a bölümü yeni değer olarak sayıya atandı
        }
        System.out.println("rakamToplami = " + rakamToplami);


    }// main sonu
}// Class sonu

