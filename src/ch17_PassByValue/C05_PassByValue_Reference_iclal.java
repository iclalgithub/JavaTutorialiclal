package ch17_PassByValue;

public class C05_PassByValue_Reference_iclal {

    public static void main(String[] args) {
        /*
        eger bir method Da yapılan değişiklik kalıcı olsun istenirse
       2 .değişklik  yapılan variable'lar atama tanımlanır.

         */
        double etiketFiyat = 100 ; //static değil normal tanımladık
        double indirimOrani = 0.1 ;
       //indirim yapılmadan önce etiketfiyatı
        System.out.println("indirim oncesi etiket fiyati "+ etiketFiyat);//indirim oncesi etiket fiyati 100.0
        //değişmeme ihitmali yok atama yaptık çünkü
        etiketFiyat = indirim(etiketFiyat , indirimOrani);  //method icinden fiyat 90.0
        //değişiklik kalıcı olsun istersek ya static olarak tanımlarız
        //ya da atama yapmış oluruz!!!

        //indirim(etiketFiyat , indirimOrani);
        //atama yapmadan hesaplasak değişiklik kalıcı olmaz!!!!

        //etiketFiyat =
        //indirim sonraı etiket fiyatı görüntüle
        System.out.println("indirim sonrasi etiket fiyati "+ etiketFiyat);  //indirim sonrasi etiket fiyati 90.0

    }

    private static double indirim(double etiketFiyat, double indirimOrani) {
        etiketFiyat *= (1-indirimOrani);
        System.out.println("method icinden fiyat "+etiketFiyat);
        return etiketFiyat;
    }
}
