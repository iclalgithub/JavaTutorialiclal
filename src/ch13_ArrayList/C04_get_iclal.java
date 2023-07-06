package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C04_get_iclal {
    public static void main(String[] args) {
        //get();

        //11. satırda hata var ilerleyemedim

        //ArrayList<String> city = new ArrayList<>(ArrayList.asList("Angara","erzurum","izmir","konya","bursa","mogadishu","aydin"));

       // System.out.println("city = " + city);

       // System.out.println("city.get(\"\") = " + city.get(1));
        //System.out.println("city.get(\"\") = " + city.get(20));

        ArrayList<String> city = new ArrayList<>(Arrays.asList("Angara","erzurum","izmir","konya","bursa","mogadishu","aydin"));
        System.out.println("city = " + city);

        System.out.println("city.get(1) = " + city.get(1));
        //city = [Angara, erzurum, izmir, konya, bursa, mogadishu, aydin]
        //city.get(1) = erzurum


        System.out.println("city.get(20) = " + city.get(20));
        //bulamazsa hata verir
        //20. indekste eleman yok o yüzden

    }
}
