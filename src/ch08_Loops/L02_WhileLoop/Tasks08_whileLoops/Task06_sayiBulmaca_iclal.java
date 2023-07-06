package ch08_Loops.L02_WhileLoop.Tasks08_whileLoops;

import java.util.Scanner;

public class Task06_sayiBulmaca_iclal {

    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin


        // Chat GPT açıklaması
        //   (Math.random() * 100) ifadesi, 0 ile 1 arasında rasgele bir ondalık sayı üretir.
        //   Math.random() fonksiyonu, 0 dahil (sıfır) ve 1 hariç (bir) arasında rastgele bir ondalık sayı döndürür.
        //   Bu ifade, 0 ile 100 arasında (100 dahil değil) bir ondalık sayı üretir.[0,1)
        //   (int) ifadesi, üretilen ondalık sayıyı tam sayıya dönüştürmek için kullanılır.
        //   Bu, ondalık kısmı atarak sadece tam sayı kısmını elde etmemizi sağlar.
        //           * 100 ifadesi, 0 ile 100 arasındaki sayıları elde etmek için üretilen rasgele sayıyı 100 ile çarpar.
        //   + 1 ifadesi, 1 ile 100 arasındaki sayıları elde etmek için üretilen sayıya 1 ekler.
        //   Bu sayede, sonuç olarak 1 ile 100 arasında bir tam sayı elde ederiz.
        //   Sonuç olarak, verilen ifade, 1 ile 100 arasında rastgele bir tam sayı üretir ve randomSayi değişkenine atar.

        //Random - Chat GPT
        //Math.random() fonksiyonu [0,1) aralığında rastgele sayı üretir.
        //Math.random() * 100  fonksiyonu [0,100) aralığında rastgele sayı üretir.
        //Math.random() * 100+1 yapıldığında  [1,100) aralığında rastgele sayı üretir.


        Scanner input= new Scanner(System.in);

        //Faruk hoca çözdü derste 17.06.2023-ders başında//
        int randomNumber= (int)(Math.random()*100+1); //[1,100) arasında rasgele sayı
        int tahmin=0;
        int sayac=0;
        System.out.println("Bir sayı giriniz");
        tahmin= input.nextInt();
        while (randomNumber != tahmin) {
            if (tahmin>randomNumber) {
                System.out.println("Daha küçük bir sayı giriniz");
                tahmin= input.nextInt();
            } else if (tahmin<randomNumber)  {
                System.out.println("Daha büyük bir sayı giriniz");
                tahmin= input.nextInt();
            }
            sayac++;
        }
        System.out.println("sayac = " + sayac);
        if(tahmin==randomNumber){
            System.out.println("Sayıyı tahmin ettiniz");
        }
    }

}
