package ch12_Arrays.task12;

import java.util.Arrays;

public class _07_array_max_value_iclal {

    public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */

        // code start here

        //1.yol
        int [] arr={12,2,5,15,8};
        System.out.println("Arrays.stream(arr).max() (dizinin en büyük elemanı stream ile())= " + Arrays.stream(arr).max());
        //2.yol
        Arrays.sort(arr);
        System.out.println("En büyük eleman: " + arr[arr.length - 1]);

    }
}

