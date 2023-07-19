package ch12_Arrays.task12;

import java.util.Arrays;

public class _09_array_second_max_iclal {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
         */

        // Kodu aşağıya yazınız..
        int[] arr = {15, 25, 22, 18, 30};

        // Diziyi küçükten büyüğe sırala
        Arrays.sort(arr);
        Arrays.sort(arr);
        System.out.println("En büyük 2. eleman: " + arr[arr.length - 2]);


    }
}
