package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C07_subList_iclal {
    public static void main(String[] args) {

        //From dahil to dahil değil
        ArrayList<String> country = new ArrayList<>(Arrays.asList("MADAGASKAR","ALMANYA","POLONYA","UGANDA","ITALYA"));
        System.out.println("country = " + country);

        System.out.println("country.subList(3,5) = " + country.subList(3, 5));
        //[3,5)

        //System.out.println("country.subList(3,6) = " + country.subList(3, 6));
        //[3,6) olunca hata verir
       // Exception in thread "main" java.lang.IndexOutOfBoundsException: toIndex = 6

    }
}
