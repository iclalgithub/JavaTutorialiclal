package ch20_Constructor;

public class C07_Ogretmen_iclal {

    //fields

    String isim;
    int tecrube;
    int kidem;

    public C07_Ogretmen_iclal(String isim, int tecrube) {
        this.isim = isim;
        this.tecrube = tecrube;
    }


    public void kidemHesapla(int kidem){
        System.out.println("kıdem"+(kidem*2));
        System.out.println("this.kidem = " + this.kidem);
        //Biri objecten biri methdo parametresinden geldi

    }
}
