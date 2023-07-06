package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C10_sort_reverse_iclal {
    public static void main(String[] args) {
        //Collections.sort(list);-> verilen list'i naturel sıralama return eder..
        //Collections.reverse(list);-> verilen listin ters sıralamasını return eder index nolarina gore
        ArrayList<String> country = new ArrayList<>(Arrays.asList("MADAGASKAR","ALMANYA","POLONYA","UGANDA","ITALYA"));
        System.out.println("country = " + country);
        // çıktı 1 --> country = [MADAGASKAR, ALMANYA, POLONYA, UGANDA, ITALYA]

        Collections.sort(country);
        System.out.println("country = " + country);
        // çıktı 2 --> country = [ALMANYA, ITALYA, MADAGASKAR, POLONYA, UGANDA]

        Collections.reverse(country);
        System.out.println("country = " + country);
        //çıktı 3 --> country = [UGANDA, POLONYA, MADAGASKAR, ITALYA, ALMANYA]
    }
}
