package ch31_Map;

import java.util.HashMap;
import java.util.Map;

public class C08_replace {
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

        //Put ile ekliyoruz

        System.out.println("map.replace(\"Apple\",\"500 $\") = " + map.replace("Apple", "500 $"));

        // hocam 250 yi 550 ye replace edince, 250 döndürür ama değeri de 550 yapar.
        // daha sonra 550 yi 1000'e replace edersek, 550 döndürür ama yeni değer
        // 1000 olur

        System.out.println("map.replace(\"apple\",\"550 $\") = " + map.replace("apple", "550 $"));
        //replace set gibi
        //örneğin key value değerlerinden update edilmesiyle ilgili bir task de kullanılır
        System.out.println("map = " + map);


        //task replace methodu ile istedigniz bir key in value sunu update ediniz


        System.out.println("map.replace(\"Samsung\",\"230 $\") = " + map.replace("Samsung", "Samsung $"));

    }
}
