package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C15_ArrayConverttoList_iclal {
    public static void main(String[] args) {
        //C14 tam tersi yapılıyor burda
        //Array, Arrayliste çeviriliyor
        String[] names = {"Ali", "Zeynep", "Fatih", "Safak", "Derya"};
        System.out.println("names = " + names);
        //names = [Ljava.lang.String;@a09ee92
        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));
        //Arrays.toString(names) = [Ali, Zeynep, Fatih, Safak, Derya]
        //bu liste çevirmek istediğimiz Array

        List<String> namesList = Arrays.asList(names);
        //bunun liste çevireceğini nerden biliyoruz??
        //sağ taraftaki yanda List olarak sönük gözüken List yazıyor.
        //yani list bekleniyor bizden
        System.out.println("namesList = " + namesList);//namesList = [Ali, Zeynep, Fatih, Safak, Derya]


        // System.out.println("namesList.add(\"Zafer\") = " + namesList.add("Zafer"));
        // RTE
        // bu kod çalışmaz çünkü Listin içine Array koyduk sıkıntı oluyor
        // Exception in thread "main" java.lang.UnsupportedOperationException

        // ArrayList<String> nameArrayList = (ArrayList<String>) Arrays.asList(names);
        // RTE
        // Exception in thread "main" java.lang.ClassCastException
        // System.out.println("nameArrayList = " + nameArrayList);


        //Bu Array'i illaki ben Array liste çevireyim derseniz
        //aşağıdaki yöntemi kullanıyoruz
        ArrayList<String> nameArrayList = new ArrayList<>(Arrays.asList(names));

        System.out.println("nameArrayList = " + nameArrayList);//nameArrayList = [Ali, Zeynep, Fatih, Safak, Derya]
        Collections.sort(nameArrayList);
        System.out.println("nameArrayList = " + nameArrayList);//nameArrayList = [Ali, Derya, Fatih, Safak, Zeynep]


    }
}
