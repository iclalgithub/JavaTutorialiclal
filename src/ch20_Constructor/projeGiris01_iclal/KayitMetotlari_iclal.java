package ch20_Constructor.projeGiris01_iclal;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

import static ch20_Constructor.projeGiris01_iclal.KayitMethodlari.kullaniciList;

public class KayitMetotlari_iclal {
    //step 2 a)

    static ArrayList<Kullanici_iclal> kullanicilist = new ArrayList<>();
    //array list'leri islerken gormustuk, kendi olusturdugumuz class'lari da alabilecegimizi,
    // ama uygulamali olarak ilk defa gormus olduk
    static Scanner input = new Scanner(System.in);

    //step 2-b
    public static ArrayList<Kullanici_iclal> kayitAl() {
        //kullanıcıdan class dan obje üretecek
        //kullanıcıdan aldığı ismi arrayliste ekleyecek
        System.out.println("ismini gir");
        String isim = input.nextLine();


        Kullanici_iclal kullaniciIclal = new Kullanici_iclal(isim, LocalDateTime.now());
        //kullanıcıdan aldığımız isim 1. parametre
        //ikinci parametre olarak da LocalDateTime.now() verdik

        kullanicilist.add(kullaniciIclal);
        ArrayList<String> isimler = new ArrayList<>();

        return kullanicilist;
    }

    //step 3
    public void sansliKullanici(ArrayList<Kullanici_iclal>list) {
        //bu metot her dakikanın ilk 10 saniyesinde kaydolanları bulacak
        //kullanıcılar bir listin içinde tutuyoruz

        for (Kullanici_iclal each :kullanicilist ) {//each her bir kullanıcı
                //parametere olarak verilen listin içinde geziyoruz
            if(each.kayitZamani.getSecond()<=10){
                System.out.println();
            }else System.out.println("malesef şanslı gününde değilsin");
        }

    }

    public void listele(){
        System.out.println(kullaniciList);
    }

    public void cikis(){
        System.out.println("gule gule");
    }
}

