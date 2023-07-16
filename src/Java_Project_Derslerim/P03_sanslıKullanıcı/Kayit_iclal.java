package Java_Project_Derslerim.P03_sanslıKullanıcı;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Kayit_iclal {
    //step 2 -
    static ArrayList<Kullanici_iclal> kullanicilar = new ArrayList<>();
    //bu list kullanıcıları tutacak
    //kullanıcı class'ına gidiyoruz
    //onu kullancaz
    //Kullanıcıı class'dan üretilen objelerin
    //depolanacağı boş list

    public static ArrayList<Kullanici_iclal> kayitAl() {
        //Arraylist return eder
        //parametresi yok bu metodun
        System.out.println("Adınızı giriniz:");
        Kullanici_iclal k1objesi = new Kullanici_iclal(new Scanner(System.in).nextLine(), LocalDateTime.now());
        //ilki ad-ikincisi şimdiki zaman
        //ad--->new Scanner(System.in).nextLine()
        //bir kez kullanılacak variable'a atama yapmak mantıklıd- değil
        //input--->new Scanner(System.in)

        //Kullanıcı Class'ını kullanarak onun
        //metoduna ulaşıyoruz

        return kullanicilar;

    }

    public static void sansliKullaniciBul(ArrayList<Kullanici_iclal> kllnc) {
        for (Kullanici_iclal avuc : kllnc) {
            if(avuc.kayitZamani.getSecond()<=10){
                //her
                System.out.println(avuc.name+"şanslısınız"+avuc.kayitZamani);
                System.out.println(avuc.name+"şanslı değilsiniz"+avuc.kayitZamani);
            }
        }
    }

}

