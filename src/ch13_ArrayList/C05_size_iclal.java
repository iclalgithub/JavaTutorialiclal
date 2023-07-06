package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C05_size_iclal {
    public static void main(String[] args) {
        //size definiton

        //ArrayList<String> city = new ArrayList<>(ArrayList.asList("Angara","erzurum","izmir","konya","bursa","mogadishu","aydin"));

        // System.out.println("country = " + country);
        ArrayList<String> country = new ArrayList<>(Arrays.asList("MADAGASKAR","ALMANYA","POLONYA","UGANDA","ITALYA"));
        System.out.println("country = " + country);

        System.out.println("country.size() = " + country.size());

    }
}
