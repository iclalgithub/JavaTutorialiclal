package ch20_Constructor;

public class C07_OgretmenRunner_iclal {
    public static void main(String[] args) {

        C07_Ogretmen_iclal ogretmen=new C07_Ogretmen_iclal("İclal hanım",25);

        System.out.println("ogretmen.isim = " + ogretmen.isim);
        System.out.println("ogretmen.tecrube = " + ogretmen.tecrube);
        System.out.println("ogretmen.kidem = " + ogretmen.kidem);
        ogretmen.kidemHesapla(12);

        /*
        ogretmen.isim = İclal hanım
        ogretmen.tecrube = 25
        ogretmen.kidem = 0
        kıdem24
        this.kidem = 0
         */

    }
}
