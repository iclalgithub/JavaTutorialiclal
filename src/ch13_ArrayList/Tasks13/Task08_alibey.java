package ch13_ArrayList.Tasks13;

import java.util.ArrayList;
import java.util.Scanner;

public class Task08_alibey {
    public static void main(String[] args) {
        // Task-> Girilen sayıların içinde ortalamadan buyuk olanları print eden METHOD create ediniz.
        Scanner input = new Scanner(System.in);
        System.out.println("kaç adet sayı gireceksiniz");
        int sayiAdedi = input.nextInt();

        ArrayList<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < sayiAdedi; i++) {
            System.out.println("Sayı" + (i + 1) + ":");
            int sayi = input.nextInt();
            sayilar.add(sayi);
        }

        ArrayList<Integer> buyukSayilar = filtreOrtalamadanBuyukSayilar(sayilar);


        System.out.println("ortalamadan büyük sayılar" + buyukSayilar);

    }

    private static ArrayList<Integer> filtreOrtalamadanBuyukSayilar(ArrayList<Integer> sayilar) {
        int toplam = 0;

        for (int sayi : sayilar) {
            toplam += sayi;
        }

        double ortalama = (double) toplam / sayilar.size();

        ArrayList<Integer> buyukSayilar = new ArrayList<>();

        for (int sayi : sayilar) {
            if (sayi > ortalama) {
                buyukSayilar.add(sayi);
            }
        }

        return buyukSayilar;
    }


}
