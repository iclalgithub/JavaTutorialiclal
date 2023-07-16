package ch12_Arrays.task12;

import java.util.Arrays;

public class _20_Arrayboth_Ends_aytekinbey {

    public static void main(String[] args) {

     /*
     Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve int array'inin(ilk oluşturduğunuz array)
     ilk ve son elementlerini kapsayan yeni array'e return edin.

    Oluşturacağınız int array'i =   ([1, 2, 3, 4])

    Sonuç bu şekilde olmalıdır. [1, 4]
      */
        //Kodu aşağıya yazınız..


        int[] array1 = new int[4];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        array1[3] = 4;

        System.out.println("Arrays.toString(array1) = " + Arrays.toString(array1));


        int array2[] = new int[2];
        array2[0] = array1[0];
        array2[1] = array1[3];


        System.out.println("Arrays.toString(array2) = " + Arrays.toString(array2));


    }
}