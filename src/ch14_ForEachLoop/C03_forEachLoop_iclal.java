package ch14_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_forEachLoop_iclal {

    public static void main(String[] args) {
        // task-> iki string array eleamanlarının ortak olmasını kontrol eden varsa
        // ortaklari yazdiran code create ediniz.. with for-each

        String[] arr1 = {"zerrin", "fatih", "mustafa", "zeynep", "iclal", "musa", "kasim", "john"};
        String[] arr2 = {"christina", "bale", "mustafa", "zeynep", "iclal", "moossa", "reese", "angel"};

        //list oluşturup orda ortak isim bulunca bu liste ekleyeceğiz
        //ortakIsimler isminde bir list oluşturalım
        List<String> ortakIsimler = new ArrayList<>();

        for (String str1 : arr1) {//arr1 den eleman çek
            for (String str2 : arr2) {//arr2 den eleman çek
                if (str1.equalsIgnoreCase(str2)) {//eğer ortak isim varsa
                    ortakIsimler.add(str1);//ortakIsimler listine ekle
                }
            }
        }

        if (ortakIsimler.isEmpty()) {//eğer boşsa yani ortak isim yoksa sout la göster
            System.out.println("ortak isim yok " + ortakIsimler);
        } else System.out.println("ortakIsimler = " + ortakIsimler); //aksi halde ortak isim olanları göster

        //TASK ortak isim olmayanları da yeni bir listin içine ekleyelim demiş hoca
        //diğer dosyada yaptım

    }
}
