package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C02_nCopies_iclal {
    public static void main(String[] args) {
        //nCopies az kullanılıyor

        // bende asList ve Listof ta hata vardı diye
        // burayı yazamadım

        // ArrayList<String> yeniList = new ArrayList<>(Collections.nCopies(7,"NEW ZELLAN");

        ArrayList<String> city = new ArrayList<>(Arrays.asList("Angara","erzurum","izmir","konya","bursa","mogadishu","aydin"));
        System.out.println("city = " + city);//city = [Angara, erzurum, izmir, konya, bursa, mogadishu, aydin]

        ArrayList<String> country = new ArrayList<>(Arrays.asList("MADAGASKAR","ALMANYA","POLONYA","UGANDA","ITALYA"));
        System.out.println("country = " + country);

        ArrayList<String> yeniList= new ArrayList<>(Collections.nCopies(7,"New Zelland"));
        System.out.println("yeniList = " + yeniList);

        //adAll metodu iki
        city.addAll(country);
        System.out.println("city = " + city);
        //city YE country eklendi
        //ekleme en sona yapılır

        //belirlenen indekse nasıl eklenir
        city.addAll(1,country);
        System.out.println("city = " + city);
        System.out.println("country = " + country);

        //indeksin tamamını belirtilen şekilde ekler
    }
}
