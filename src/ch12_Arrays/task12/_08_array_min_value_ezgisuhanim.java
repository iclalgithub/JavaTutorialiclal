package ch12_Arrays.task12;

import java.util.Arrays;

public class _08_array_min_value_ezgisuhanim{

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */

        // Kodu aşağıya yazınız..

        int [] arr = {12,2,5,15,8};

        Arrays.sort(arr);

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        System.out.println("arr[0] = " + arr[0]);

        //2. yol

        System.out.println("Arrays.stream(arr).min() = " + Arrays.stream(arr).min());


    }


}


