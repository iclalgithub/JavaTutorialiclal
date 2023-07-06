package ch12_Arrays.task12;

import java.util.Arrays;
import java.util.Comparator;

public class Task06_iclal {
    public static void main(String[] args) {
        // Task-> verilen bir int arrayi elemanlrını buyukten kucuge siralayip return eden METHOD create ediniz

        //1. yol
        int[] arr = {14, 2, 36, 4, 57};
        int[] yeniarr = new int[arr.length];

        Arrays.sort(arr);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        System.out.println("Döngü ile çözüm");
        for (int i = 1; i <= arr.length; i++) {
            yeniarr[i - 1] = arr[arr.length - i];
        }
        System.out.println("Arrays.toString(yeniarr) = " + Arrays.toString(yeniarr));


        //2. yol
        //Chat GPT Comparator---
        System.out.println("Chat GPT ile farklı array çözümü");
        Integer[] arr2 = {6, 7, 8, 9};
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));
        Arrays.sort(arr2, Comparator.reverseOrder());
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));

    }


}
