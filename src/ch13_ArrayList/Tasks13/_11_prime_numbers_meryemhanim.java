package ch13_ArrayList.Tasks13;

import java.util.ArrayList;
import java.util.Scanner;

public class _11_prime_numbers_meryemhanim {

    /*
    negatif olmayan bir n sayısı girin ve bu sayıya kadar olan kaç asal sayı var ise yazdırın.

        Örnek 1:
        n = 20

        cevap: 8      ==   (2,3,5,7,11,13,17,19)  20 ye kadar 8 adet asal sayı vardır.
        Örnek2:
        Input(Girdi): 10
        Output(Çıktı): 4
        Explanation(Açıklama): 10'dan küçük 4 adet asal sayı vardır. (2,3,5,7)
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("negatif olmayan bir sayı giriniz");
        int sayi = input.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <= sayi; i++) {
            boolean control = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                //Chat GPT ----
                //Math.sqrt(i) ifadesi, bu asal sayı kontrolü için kullanılır
                // çünkü bir sayının bölenleri kendi kareköküne kadar olan
                // sayılardır. Dolayısıyla, j değeri 2 ile Math.sqrt(i)
                // arasında değişerek i sayısının bölenlerini kontrol eder.
                // Bu yöntem, asal sayı kontrolünü daha verimli hale
                // getirir, çünkü i sayısının bölenlerini kontrol etmek için
                // tüm olası değerleri döngüde kontrol etmek yerine,
                // sadece kareköküne kadar olan değerlere bakar.

                //Chat GPT ----
                //Karekök optimizasyonu ise asal sayıları bulmak için kullanılan
                // bir yöntemdir. Asal sayılar, sadece 1 ve kendisiyle tam
                // bölünebilen sayılardır. Asal sayıları bulmak için bir sayının
                // kareköküne kadar olan sayıları kontrol ederiz çünkü eğer bir
                // sayının karekökü üzerinde bir bölen varsa, karekökün altında
                // da bir tane veya daha fazla bölen bulunacaktır. Bu yöntem, asal
                // sayıları bulmak için hesaplama süresini azaltır ve daha verimli
                // bir algoritma sağlar.

                if (i % j == 0) {
                    control = false;
                    break;
                }
            }
            if (control) {
                numbers.add(i);
            }
        }

        int count =numbers.size();
        System.out.println("count = " + count);
        System.out.println(" numbers= " +numbers);

    }
}



