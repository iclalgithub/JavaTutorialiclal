package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C12_remove_iclal {
    public static void main(String[] args) {
        ArrayList<String> country = new ArrayList<>(Arrays.asList("MADAGASKAR","ALMANYA","POLONYA","UGANDA","ITALYA"));
        System.out.println("country = " + country);

        Collections.sort(country);

        System.out.println("country.remove(\"Norwey\") = " + country.remove("Norwey"));
        //country.remove("Norwey") = false
        System.out.println("country.remove(\"UGANDA\") = " + country.remove("UGANDA"));
        //country.remove("UGANDA") = true

        System.out.println("country.remove(0) = " + country.remove(0));
        //country.remove(0) = ALMANYA


        country.add("Amerika");
        country.add("Hollanda");
        country.add("Ukrayna");
        country.add("Amerika");
        System.out.println("country = " + country);
        //country = [ITALYA, MADAGASKAR, POLONYA, Amerika, Hollanda, Ukrayna, Amerika]

        System.out.println("country.remove(\"Amerika\") = " + country.remove("Amerika"));
        //country.remove("Amerika") = true
        System.out.println("country = " + country);
        //country = [ITALYA, MADAGASKAR, POLONYA, Hollanda, Ukrayna, Amerika]

        //first in first out---
        //ilk giren ilk çıkar
        //ilk giren amerika silindi aradaki


        ArrayList<String> city = new ArrayList<>(Arrays.asList("Angara","erzurum","izmir","konya","bursa","mogadishu","aydin"));
        System.out.println("city = " + city);//city = [Angara, erzurum, izmir, konya, bursa, mogadishu, aydin]

        country.addAll(city);
        System.out.println("country = " + country);
        //country = [ITALYA, MADAGASKAR, POLONYA, Hollanda, Ukrayna, Amerika, Angara, erzurum, izmir, konya, bursa, mogadishu, aydin]
        System.out.println("country.removeAll(city) = " + country.removeAll(city));
        //country.removeAll(city) = true
        System.out.println("city = " + city);
        //city = [Angara, erzurum, izmir, konya, bursa, mogadishu, aydin]
        System.out.println("country = " + country);
        //country = [ITALYA, MADAGASKAR, POLONYA, Hollanda, Ukrayna, Amerika]
    }
}
