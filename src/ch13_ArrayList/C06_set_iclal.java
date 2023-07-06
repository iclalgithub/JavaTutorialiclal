package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C06_set_iclal {
    public static void main(String[] args) {
        //crud -update işlemi için kullanılır
        //ArrayList<String> country=new ArrayList<>(List.of());
        //9. satırda hata var

        ArrayList<String> country = new ArrayList<>( Arrays.asList("MADAGASKAR","ALMANYA","POLONYA","UGANDA","ITALYA"));
        System.out.println("country = " + country);
        System.out.println("country.size() = " + country.size());

        System.out.println("country.set(0,\"AMERİKA\") = " + country.set(0, "AMERİKA"));

        System.out.println("country = " + country);
        System.out.println("country.size() = " + country.size());

    }
}
