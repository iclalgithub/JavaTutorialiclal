package ch29_iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(Arrays.asList("Zeynep ", "Ahmet", "Eren", "Iclal", "Safak", "Fatih", "Ali"));


        System.out.println("list1 in ilk hali  = " + list1);

        //task list1 in elemanlarini for loop ile yanyana print ediniz
        for (int i = 0; i < list1.size(); i++) { //rukiye hanımdan
            System.out.print(list1.get(i) + " ");
        }

        for (String avuc : list1) { //ali beyden
            System.out.print(avuc + " ");
        }


        //task list1 in herbir elemani for
        // loop ile isimlere SDET ekleryerek
        // kalıcı update ediniz...
        for (int i = 0; i < list1.size(); i++) {//burda kalıcı olmaz
            System.out.println((list1.get(i) + " SDET"));
        }

        System.out.println("list1 in son hali= " + list1);
        //SDET eklenmemiş hali ile sout edildi


        for (int i = 0; i < list1.size(); i++) {//ezgisu hanım
            String name = list1.get(i);
            list1.set(i, name + " SDET");
        }

        System.out.println("list1 in son hali= " + list1);
        //burda set metodu sayesinde kalıcı olarak SDET eklenir
        //set metodu listin içindeki değerleri kalıcı olarak değiştirir.



        //list1'i iterator a alıp print ediniz
        Iterator< String > list1Iterator = list1.iterator();//List dden iterator methodu kullanilarak
        // Iterator interface den list1Iterator variable tanimlandi

        while (list1Iterator.hasNext()){
            System.out.print(" "+ list1Iterator.next());
            //hasNext(); bir sonraki eleman var ise true return eder
            //next(); onunde oldugu elemani getirir
        }

        System.out.println();
        System.out.println("list1Iterator in while sonrasi hali = " + list1Iterator);
        //list1Iterator in while sonrasi hali = java.util.ArrayList$Itr@3fb6a447



    }
}
