package Java_Challenge_Derslerim.Challange03_07062023;

import java.util.Scanner;

public class Task02_Ternary {
    public static void main(String[] args) {
        /* Task->
         * Girilen fiyat içinb
         * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
         * print eden code create ediniz
         */
        //Ternary üçlemek
        // ŞART ? TRUE İSE burası çalışır: FALSE İSE burası çalışır//
        //Ne kadar ekmek ? ne kadar if varsa  3 soru işareti
        //O kadar köfte :  o kadar else olmalı  3 : olmalı
        //
        Scanner input= new Scanner(System.in);
        System.out.println("ürün fiyatını giriniz");
        double fiyat= input.nextDouble();

        //şart              ise        true         false
      //  fiyat <10            ?       "ucuz"             :    (fiyat >=10&& fiyat<20 ? "normal": "pahalı" )
        //TRUE  dış şart                                            //FALSE  özel şart-10dan büyükse iki farklı durum var

        String sonuc1= fiyat <10            ?       "ucuz"             :    (fiyat >=10&& fiyat<20 ? "normal": "pahalı" );
        System.out.println("ürünün fiyat durumu= " + sonuc1);


    // System.out.println("yeni yöntem= ");
    // // chat GPT  den buldum bu kısmı sonradan anladım-hoca anlatmış
    // System.out.println("yeni ürün fiyatını giriniz");
    // int fiyat2= input.nextInt();
    // String sonuc2 = (fiyat < 10) ? "ucuz" : (fiyat2 >= 10 && fiyat2 <= 20) ? "normal" : "pahali";
    // System.out.println(sonuc2);

        //10dan az ise ucuz  - bu ilk ternary için ilk durum
        //değilse ??? ikinci durum
        //10<sayi<20 ise normal - bu ikinci ternary için ilk durum
        //değilse pahali ??? ikinci durum








    }
}
