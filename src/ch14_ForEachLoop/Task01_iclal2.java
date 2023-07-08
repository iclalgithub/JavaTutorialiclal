package ch14_ForEachLoop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task01_iclal2 {
    static     List<Integer> listNotlar = new ArrayList<>();
    static Scanner input=new Scanner(System.in);
    static    int ortalamaGecenSayi = 0;
    static double ortalama=0;
    public static void main(String[] args) {

        /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

         */

        //öğretmenden not al
        //Ortalama al
        //her bir öğrenciyi kontrol et-ortalamanın durumuna göre
        //ortalama yüksek öğrenci sayısını yazdır
        String devamMi;
        do {
            System.out.println("istedigin kadar not gir");
            int ogrnNot = input.nextInt();
            //not girişi istedik
            System.out.println("devam edecek misin? devam etmek icin (E)'ye  devam etmek istemiyorsan (H)'ye bas");
            devamMi = input.next();
            //e ya da h girmesini istiyoruz
            listNotlar.add(ogrnNot);
            //listime girilen tüm notlar ekleniyor
        }while (devamMi.equalsIgnoreCase("E"));

        Collections.sort(listNotlar);
        System.out.println("listNotlar = " + listNotlar);

        //metot ile yapalım
        ortalamaHesapla();
        ortalamaUstuOlanNotSayisi();
        //ortalamayı geçenleri de liste ekleyelim mi

    }

    private static void ortalamaUstuOlanNotSayisi() {

        for (int each : listNotlar    ) {
            if (each > ortalama ){
                ortalamaGecenSayi++;
                System.out.print("ortalamayi gecen not = " + each);
            }
        }
        System.out.println();
        System.out.println("ortalamaGecenSayi = " + ortalamaGecenSayi);

    }

    private static void ortalamaHesapla() {
        int notlarToplami= 0;
        for (int w : listNotlar       ) {//her bir elemanı notlar
            //kısmına ekle
            notlarToplami += w;
        }
        double ortalama = notlarToplami / listNotlar.size();

        System.out.println("ortalama = " + ortalama);
    }
}
