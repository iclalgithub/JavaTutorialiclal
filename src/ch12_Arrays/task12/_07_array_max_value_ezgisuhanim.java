package ch12_Arrays.task12;


import java.util.Arrays;

public class _07_array_max_value_ezgisuhanim {

    public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */

        // code start here

        int [] arr = {12,2,5,15,8};

        Arrays.sort(arr);

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        System.out.println("arr[arr.length-1] = " + arr[arr.length - 1]);

        //chatGPT

        int[] numbers = {12, 2, 5, 15, 8};
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("En büyük değer: " + max);

        //taha bey

        System.out.println("Arrays.stream(numbers).max() = " + Arrays.stream(numbers).max());


    }




}


