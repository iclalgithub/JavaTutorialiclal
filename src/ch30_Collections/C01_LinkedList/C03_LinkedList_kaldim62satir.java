package ch30_Collections.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class C03_LinkedList_kaldim62satir {
    public static void main(String[] args) {
        LinkedList<String> linkedlist1= new LinkedList<>(Arrays.asList("berlin","ankara","izmir","dortmund","istanbul","newyork"));

        //print
        System.out.println("linkedlist1 = " + linkedlist1);

        //remove bulduğu ilk nod'u siler
        System.out.println("linkedlist1.remove() = " + linkedlist1.remove());

        System.out.println("linkedlist1.remove(2) = " + linkedlist1.remove(2));

        System.out.println("linkedlist1 = " + linkedlist1);
        //linkedlist1 = [ankara, izmir, istanbul, newyork]

        System.out.println("linkedlist1.remove(\"ankara\") = " + linkedlist1.remove("ankara"));
        //true ya da false döndürür
        //burda true verdi sonucu - sildi yani

        System.out.println("linkedlist1.remove(\"ankara\") = " + linkedlist1.remove("ankara"));
        //burda false verdi sonucu - silmedi yani

        linkedlist1.add("izmir");
        System.out.println("linkedlist1 = " + linkedlist1);
        System.out.println("linkedlist1.removeFirst(\"izmir\") = " + linkedlist1.removeFirstOccurrence("izmir"));
        System.out.println("linkedlist1 = " + linkedlist1);


        linkedlist1.add("newyork");
        System.out.println("linkedlist1 = " + linkedlist1);
        System.out.println("linkedlist1.removeLastOccurrence(\"newyork\") = " + linkedlist1.removeLastOccurrence("newyork"));

        System.out.println("linkedlist1 = " + linkedlist1);

        System.out.println("linkedlist1.element() = " + linkedlist1.element());
        //listin birinci elemanını dönecek
        //arraylistten ayıran method linkedlisti

        System.out.println("linkedlist1.getLast() = " + linkedlist1.getLast());
        System.out.println("linkedlist1.getFirst() = " + linkedlist1.getFirst());
        //getFirst ve element aynı işi yapıyor

    }
}
