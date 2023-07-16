package ch20_Constructor.projeGiris01_iclal;

import java.util.Scanner;

import static ch20_Constructor.projeGiris01_iclal.KayitMethodlari.kullaniciList;
import static ch20_Constructor.projeGiris01_iclal.KayitMetotlari_iclal.kullanicilist;

public class GirisPaneli_iclal {
    public void giris() {
        //giriş panelindeki metottan diğer metotları
        //göstermek ulaşmak istiyorum

        //obje ile ulaşabiliriz
        KayitMetotlari_iclal obj = new KayitMetotlari_iclal();
        //biz nerden istersek orda obje üretebiliriz
        //çünkü java her classta default olarak
        //parametresiz constructor'ı vardır

        //
        // boolean
        Scanner input=new Scanner(System.in);
        System.out.println("yapacağınız islemi seciniz" +
                "  \n1 -> kayit ol \n2 -> sansli kisi bul " +
                "\n3 -> tum kullanicilari listele \n4 -> cikis");

        int secim =input.nextInt();
        switch (secim){
            case 1:
                obj.kayitAl();
                giris();
                break;
            case 2:
                obj.sansliKullanici(kullanicilist);
            case 3:

        }


    }
}
