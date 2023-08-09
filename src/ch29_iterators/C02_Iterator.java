package ch29_iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C02_Iterator {
    public static void main(String[] args) {

        System.out.println("*********** Iterator ***********");
        List<String > list1 = new ArrayList<>(Arrays.asList("Zeynep ","Ahmet","Eren","Iclal","Safak","Fatih","Ali"));
        System.out.println("list1 in ilk hali  = " + list1);

        //task list deki elemanlari silip print ediniz Iterator ile
        Iterator<String > iteratorList = list1.iterator();

        //loop acin
        while (iteratorList.hasNext()){
            iteratorList.next(); //forloop  daki i++ bunun ile ayni islemi yapiyor
            //next olmazsa hata verir
            //next() ile bir sonraki değere geçmiş oluyoruz
            iteratorList.remove();
        }
        System.out.println("list1 in son hali  = " + list1);






    }
}
