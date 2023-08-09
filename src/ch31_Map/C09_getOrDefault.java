package ch31_Map;

import java.util.HashMap;
import java.util.Map;

public class C09_getOrDefault {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        //iki data type key ve value

        map.put("Apple", "250 $");//put ekleme metodu
        map.put("Samsung", "200 $");
        map.put("Huwei", "150 $");
        map.put(null, "125 $");
        map.put(null, null);
        map.put("Hp", "200 $");
        map.put("Casper", "1000 $");
        map.put("Casper", "101 $");
        System.out.println("map = " + map);


        /*
getOrDefault() yöntemi, belirtilen bir anahtarın değerini alırken, eğer anahtar haritada
bulunmuyorsa varsayılan bir değer döndürmek için kullanılır.
 Eğer anahtar haritada varsa, o anahtarın mevcut değerini döndürür.
 */

        System.out.println("map.getOrDefault(\"Hp\",\"50000 $\") = " + map.getOrDefault("Hp", "50000 $"));
        //default 200
        System.out.println("map.getOrDefault(\"hp\",\"5000000 $\") = " + map.getOrDefault("hp", "5000000 $"));

        //hp default olanı veriyor
        //verdiğimizi geri alıyorsak yüzümüze vuruyor gibi düşünün
        //iyi birşey değil


        //key ayniysa eski,key farkliysa yeni degeri veriyor
        

    }
}
