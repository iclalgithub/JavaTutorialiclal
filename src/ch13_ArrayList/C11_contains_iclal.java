package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C11_contains_iclal {
    public static void main(String[] args) {
        ArrayList<String> country = new ArrayList<>(Arrays.asList("MADAGASKAR","ALMANYA","POLONYA","UGANDA","ITALYA"));
        System.out.println("country = " + country);

        System.out.println("country.contains(\"almanya\") = " + country.contains("almanya"));
        //country.contains("almanya") = false
        //case sensitive

        System.out.println("country.contains(\"UGANDA\") = " + country.contains("UGANDA"));
        //country.contains("UGANDA") = true
    }
}
