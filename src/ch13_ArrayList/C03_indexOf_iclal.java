package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C03_indexOf_iclal {
    public static void main(String[] args) {

       // city.indexOf("samsun")
       // sout
      // city.idexOf("Angara")

        // burda kod eksik yazamadım country de hat aolduğu için en başta

        //country.add("Ingiltere");
        //country.indexOf("Ingiltere")

        //country.add("ALMANYA");
        //country.indexOf("ALMANYA")

        //indexOf soldan ilk gördüğünü
        //LastindexOf sağdan ilk gördüğünü

        ArrayList<String> city = new ArrayList<>(Arrays.asList("Angara","erzurum","izmir","konya","bursa","mogadishu","aydin"));
        System.out.println("city = " + city);

        ArrayList<String> country = new ArrayList<>(Arrays.asList("MADAGASKAR","ALMANYA","POLONYA","UGANDA","ITALYA"));
        System.out.println("country = " + country);

        System.out.println("city.indexOf(\"Samsun\") = " + city.indexOf("Samsun"));
        //city.indexOf("Samsun") = -1
        //Samsun yok çünkü

        System.out.println("city.indexOf(\"Angara\") = " + city.indexOf("Angara"));
        //city.indexOf("Angara") = 0

        country.add("İngiltere");
        System.out.println("country.indexOf(\"İngiltere\") = " + country.indexOf("İngiltere"));
        System.out.println("country.indexOf(\"İngiltere\") = " + country.lastIndexOf("İngiltere"));
        //country.indexOf("İngiltere") = 5
        //country.indexOf("İngiltere") = 5
        //her ikisinin de indeksleri aynı

        country.add("ALMANYA");
        System.out.println("country.indexOf(\"ALMANYA\") = " + country.indexOf("ALMANYA"));
        System.out.println("country.indexOf(\"ALMANYA\") = " + country.lastIndexOf("ALMANYA"));

        //country.indexOf("ALMANYA") = 1 -->SOLDAN GELİYOR ARAMAYA
        //country.indexOf("ALMANYA") = 6 -->SONDAN GELİYOR ARAMAYA



    }
}
