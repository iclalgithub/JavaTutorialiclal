package Java_Challenge_Derslerim.project26062023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MarketProject_iclal {
    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * Bu adımları kendimiz yazdırmamız lazım (!!!!DİKKAT!!!!)
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan aşağıysa o günleri return yap.
     * */
    static ArrayList<String> gunler = new ArrayList<>(Arrays.asList("Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar")); //1. adım
    static ArrayList<Double> gunlukKazanclar = new ArrayList<>(); //2.adım
    static Scanner input = new Scanner(System.in);
    static double haftaninToplamKazanci = 0;

    //yukarda import ederken dikkat et!!!
    //
    public static void main(String[] args) {
        //gün String
        //günler listi açılacak
        //method yazılacak - return type double
        //toplama alp ortalama bulunacak
        //ortalamanın altında mı üstünde mi kontrol edilecek
        int gun = 0;
        while (gun < 7) {
            System.out.println(gunler.get(gun) + " gününün hasılatını giriniz");
            double gununkazanci =
                    //get.gun(0)--pazartesi
                    //get.gun(1)--salı
                    //get.gun(2)--çarşamba
                    gun++;
            double gununKazanci = input.nextDouble();
            gunlukKazanclar.add(gununKazanci);//tekrardan gelen her bir gunun hasılatı gunlukKazanclar liste eklendi
            haftaninToplamKazanci += gununKazanci;


            System.out.println("Haftanin Ortalama Kazancı = " + getOrtalamaKazanc());//meth call
            System.out.println("getOrtalamaninUstundeKazancGunleri() = " + getOrtalamaninUstundeKazancGunleri());
            System.out.println("getOrtalamaninAltındaKazancGunleri() = " + getOrtalamaninAltindaKazancGunleri());

        }
        System.out.println(gunlukKazanclar);

    }//main sonu

    private static String getOrtalamaninAltindaKazancGunleri() {
        String ortalamaninAltiGun="";
        for (int i = 0; i <gunlukKazanclar.size() ; i++) {
            if(gunlukKazanclar.get(i)<getOrtalamaKazanc()){
                ortalamaninAltiGun+=gunler.get(i);
            }
        }
        return ortalamaninAltiGun;
    }
    private static String getOrtalamaninUstundeKazancGunleri() {
        String ortalamaninUstuGun="";
        for (int i = 0; i <gunlukKazanclar.size() ; i++) {
             if(gunlukKazanclar.get(i)>getOrtalamaKazanc()){
                 ortalamaninUstuGun+=gunler.get(i);
             }
        }
        return ortalamaninUstuGun;
    }

    private static double getOrtalamaKazanc() {
        return haftaninToplamKazanci / 7;

    }
}//class sonu
