package ch20_Constructor;

public class C02_Arac_iclal {

    //fields
    String marka;
    String model;
    int km;
    double motorHacmi;
    boolean vitesAuto;
    boolean ikinciEl;
    int yil;
    String tramer;

    public static void main(String[] args) {

        C02_Arac_iclal arac1 = new C02_Arac_iclal();//pm siz const.  kullanilarak arac1 objesi create edildi
        //arac1 objesi create edildi
        //arac1'in özelliklerini giriyoruz

        arac1.ikinciEl = true;
        arac1.marka = "mercedes";
        arac1.km = 50000;
        arac1.model = "CLA";
        arac1.motorHacmi = 2.0;
        arac1.tramer = "5 kaza var";
        arac1.yil = 2022;

        System.out.println("Referans değeri görünüyor");
        System.out.println("arac1 = " + arac1);  //arac1 = ch20_Constructor.C02_Arac@6aaa5eb0
        //heap bellekteki bir bilgi toString metodu override edilmediyse referans değeri alırız
        //toString metodu override edilmeden doğrudan obje yazdırılırsa
        //referans değeri alırız

       //obje üzerinden tüm field ları alacaksınız
       //önermiyor hoca çok yorucu
        System.out.println("Birinci yol objenin kendi değerini görüntüleme");
        System.out.println(arac1.marka + " " + arac1.tramer + " " + arac1.ikinciEl + " " + arac1.km + " " + arac1.model + " "
                + arac1.motorHacmi + " " + arac1.yil);


        //task -> 2. bir aracın tum field'larını atayarak print ediniz.

        //Ali bey in araci
        C02_Arac_iclal arac2 = new C02_Arac_iclal();
        arac2.ikinciEl = false;
        arac2.marka = "BMW";
        arac2.km = 105000;
        arac2.model = "M3";
        arac2.motorHacmi = 3.5;
        arac2.tramer = " kaza yok";
        arac2.yil = 2023;

        System.out.println("Ali bey in arac2 = " + arac2);

        //İclal aracı
        C02_Arac_iclal arac3 = new C02_Arac_iclal();
        arac3.ikinciEl = false;
        arac3.marka = "Hundai";
        arac3.km = 120000;
        arac3.model = "Getz";
        arac3.motorHacmi = 1.5;
        arac2.tramer = " kaza yok";
        arac2.yil = 2007;

        System.out.println("İclal hanımın aracı = " + arac3);


    }//main metod
    //main metot dışına çıkınız class'ın içinde kalınız
    //sağ tıkla - Generate-toString-otomatik olarak hepsi seçili
    //Override yapılmış olarak gelir aşağıdaki gibi

    //Heap bellekten veri böyle alınır işte

    @Override
    public String toString() {
        return "C02_Arac_iclal{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", km=" + km +
                ", motorHacmi=" + motorHacmi +
                ", vitesAuto=" + vitesAuto +
                ", ikinciEl=" + ikinciEl +
                ", yil=" + yil +
                ", tramer='" + tramer + '\'' +
                '}';
    }
}
