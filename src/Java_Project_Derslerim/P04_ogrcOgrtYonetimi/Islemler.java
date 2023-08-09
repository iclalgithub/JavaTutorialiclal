package Java_Project_Derslerim.P04_ogrcOgrtYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    static List<Ogretmen> ogretmenList = new ArrayList<>();//ogret obj atanacagı bos list
    static List<Ogrenci> ogrenciList = new ArrayList<>();//ogrc obj atanacagı bos list
    static Scanner input = new Scanner(System.in);
    //static Scanner inputLine = new Scanner(System.in);//dumy yerine next() ve nextLine() için farklı scanner obj kullanılır
    static String kisiTuru;
    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";

    public static void girisPaneli() {//2. task
        System.out.print("**********************************\nOGRENCI VE OGRETMEN ANA MENU \n**********************************" +
                "\n1- OGRENCI ISLEMLERI\n2- OGRETMEN ISLEMLERI\nQ- CIKIS \nLutfen yapmak istediginiz islemi giriniz : ");
        /*
        System.out.println(R+"**********************************    "+Y+" \nOGRENCI VE OGRETMEN YONETIM PANELI\n"+G+"**********************************");
        System.out.println(B+"1- OGRENCI ISLEMLERI\n2- OGRETMEN ISLEMLERI\nQ- CIKIS ");
         */
        // String secim = input.next().toUpperCase();
        // switch (secim) {
        switch (input.next().toUpperCase()) {
            case "1":
                kisiTuru = "OGRENCI";//kisituru öğrenci atandı
                islemMenu();
                break;
            case "2":
                kisiTuru = "OGRETMEN";//kisituru öğrenci atandı
                islemMenu();
                break;
            case "Q":
                cıkıs();
                break;
            default:
                System.out.println("hatalı giris yaptınız tekrar deneyiniz");
                girisPaneli();//recursive method call
                break;
        }


    }

    private static void islemMenu() {//2. task
        System.out.print("Sectiginiz kisi turu: " + kisiTuru + " ISLEM MENU , Lutfen asagidaki islemlerden tercih yapiniz.\n"
                + "*********** " + kisiTuru + " ISLEMLER ************\n 1-EKLEME\n 2-ARAMA\n 3-LISTELEME\n 4-SILME\n 0-ANA MENU \n" +
                "Islem Tercihinizi giriniz : ");
        // int secim = input.nextInt();
        // switch (secim) {
        switch (input.nextInt()) {
            case 0:
                girisPaneli();
                break;
            case 1:
                ekle();
             //   islemMenu();
                break;
            case 2:
                ara();
                break;
            case 3:
                listele();
                break;
            case 4:
                sil();
                break;
            default:
                break;


        }


    }

    private static void sil() {
        System.out.println("   ***  "+kisiTuru+" Silme sayfası   ***   ");
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {
            System.out.print("aradıgınız öğrenci kimlik_no giriniz : ");
            String silinecekOgrcKimlikNo=input.next();
            for (  Ogrenci k:ogrenciList   ) {
                if (k.getKimlikNo() .equals(silinecekOgrcKimlikNo)) {
                    ogrenciList.remove(k);
                    System.out.println("Silinecek  ogrenci : "+silinecekOgrcKimlikNo+" başarı ile silindi ");
                    break;
                }else {
                    System.out.println("Silinecek ogrenci : "+silinecekOgrcKimlikNo+" lstemizde mevcut  değil  ");
                }
            }



        }else {
            System.out.print("Silenecek  OGRETMEN kimlik_no giriniz : ");
            String silinecekOgrtKimlikNo=input.next();
            for (  Ogretmen k:ogretmenList   ) {
                if (k.getKimlikNo() .equals(silinecekOgrtKimlikNo)) {
                    ogretmenList.remove(k);
                    System.out.println("Silinecek OGRETMEN : "+silinecekOgrtKimlikNo+" başarı ile silindi ");
                    break;
                }else {
                    System.out.println("Silinecek OGRETMEN : "+silinecekOgrtKimlikNo+" listemizde mevcut  değil  ");
                }
            }



        }

        islemMenu();
    }

    private static void listele() {
        System.out.println("   ***  "+kisiTuru+" Listeleme sayfası   ***   ");
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {

            System.out.println(ogrenciList);

        }else {
            System.out.println(ogretmenList);

        }
        islemMenu();
    }

    private static void ara() {
        System.out.println("   ***  "+kisiTuru+" Arama sayfası   ***   ");
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {
            System.out.print("aradıgınız öğrenci kimlik_no giriniz : ");
           String arananOgrcKimlikNo=input.next();
            for (  Ogrenci k:ogrenciList   ) {
                if (k.getKimlikNo() .equals(arananOgrcKimlikNo)) {
                    System.out.println("aradıgınız ogrenci : "+k.getAd_soyad()+" lstemizde mevcut ");
                    break;
                }else {
                    System.out.println("aradıgınız ogrenci : "+arananOgrcKimlikNo+" lstemizde mevcut  değil  ");
                }
            }



        }else {
            System.out.print("aradıgınız OGRETMEN kimlik_no giriniz : ");
            String arananOgrtKimlikNo=input.next();
            for (  Ogretmen k:ogretmenList   ) {
                if (k.getKimlikNo() .equals(arananOgrtKimlikNo)) {
                    System.out.println("aradıgınız OGRETMEN : "+k.getAd_soyad()+" lstemizde mevcut ");
                    break;
                }else {
                    System.out.println("aradıgınız OGRETMEN : "+arananOgrtKimlikNo+" lstemizde mevcut  değil  ");
                }
            }



        }
        islemMenu();


    }

    private static void ekle() {
        System.out.println("   ***  "+kisiTuru+" ekleme sayfası   ***   ");
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {
            System.out.println("öğrenci ad_soyad giriniz : ");
           // input.next();//dummy
           // String ad_soyad=inputLine.nextLine();
            //String ad_soyad=input.nextLine();
            String ad_soyad=new Scanner(System.in).nextLine();//yeni bir scanner obj
            System.out.println("öğrenci kimlik_No giriniz : ");
            String kimlikNo=input.next();
            System.out.println("öğrenci yas giriniz : ");
            int yas=input.nextInt();
            System.out.println("öğrenci No giriniz : ");
            String no=input.next();
            System.out.println("öğrenci sınıf giriniz : ");
            String sınıf=input.next();
            Ogrenci ogrcObj=new Ogrenci(ad_soyad,kimlikNo,yas,no,sınıf);//nurtopu gibi bir ogrc obj create edildi
            ogrenciList.add(ogrcObj);//ogrc obj ogrenciList'e eklendi
            System.out.println("oğrenciniz "+ogrcObj.getAd_soyad()+" basarı ile eklendi " +
                    "\nOGRENCI ISLEM MENU'ye yonlendiriliyorsunuz  ");
            islemMenu();
        }else {
            System.out.println("OGRETMEN ad_soyad giriniz : ");
            // input.next();//dummy
            // String ad_soyad=inputLine.nextLine();
            //String ad_soyad=input.nextLine();
            String ad_soyad=new Scanner(System.in).nextLine();//yeni bir scanner obj dummy yerine
            System.out.println("OGRETMEN kimlik_No giriniz : ");
            String kimlikNo=input.next();
            System.out.println("OGRETMEN yas giriniz : ");
            int yas=input.nextInt();
            System.out.println("OGRETMEN sicil_No giriniz : ");
            String sicil_no=input.next();
            System.out.println("OGRETMEN bolum giriniz : ");
            String bolum=input.next();
            Ogretmen ogrtObj=new Ogretmen(ad_soyad,kimlikNo,yas,bolum,sicil_no);//nurtopu gibi bir ogrc obj create edildi
            ogretmenList.add(ogrtObj);//ogrc obj ogrenciList'e eklendi
            System.out.println("OGRETMEN "+ogrtObj.getAd_soyad()+" basarı ile eklendi " +
                    "\nOGRETMEN ISLEM MENU'ye yonlendiriliyorsunuz  ");
            islemMenu();
        }


    }

    private static void cıkıs() {
        System.out.println("agam DEWMKEEE yine bekleriz");
    }
}
