package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C09_equals_iclal {
    public static void main(String[] args) {
        // equals()
        //equals(); -> iki listin index ve elelman eşitliğini montrol eder true/false return


        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("a", "b"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("A", "b"));
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("a", "b"));
        ArrayList<String> list4 = new ArrayList<>(Arrays.asList("b", "a"));

        //list1.equals(list2) = false
        //list1.equals(list3) = true
        //list1.equals(list4) = false

        System.out.println("list1.equals(list2) = " + list1.equals(list2));
        //Case sensitive den kaybetti
        System.out.println("list1.equals(list3) = " + list1.equals(list3));
        System.out.println("list1.equals(list4) = " + list1.equals(list4));


    }
}
