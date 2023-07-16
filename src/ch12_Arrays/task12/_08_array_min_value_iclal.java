package ch12_Arrays.task12;

import java.util.Arrays;

public class _08_array_min_value_iclal {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */

        // Kodu aşağıya yazınız..
        //1. yol
        int [] arr={14 , 19 , 5 , 21};
        System.out.println("Arrays.stream(arr).min() (dizinin en küçük elemanı stream ile())= " + Arrays.stream(arr).min());
        //2. yol
        Arrays.sort(arr);
        System.out.println("En küçük eleman: " + arr[0]);

    }
}

