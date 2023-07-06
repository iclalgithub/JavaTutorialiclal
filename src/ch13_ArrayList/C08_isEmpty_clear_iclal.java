package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C08_isEmpty_clear_iclal {
    public static void main(String[] args) {
        //isEmpty();-> listin boş olmasını kontrol eder true/false return eder.
        //clear(); -> listin tum elelmalrını siler

        ArrayList<String> country = new ArrayList<>(Arrays.asList("MADAGASKAR","ALMANYA","POLONYA","UGANDA","ITALYA"));
        System.out.println("country = " + country);
        System.out.println("country.isEmpty() = " + country.isEmpty());
        //country.isEmpty() = false

        country.clear();
        System.out.println("country.isEmpty() = " + country.isEmpty());
        //country.isEmpty() = true

    }
}
