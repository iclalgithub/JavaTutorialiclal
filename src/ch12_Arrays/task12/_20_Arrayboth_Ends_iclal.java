package ch12_Arrays.task12;

import java.util.Arrays;

public class _20_Arrayboth_Ends_iclal {

    public static void main(String[] args) {

     /*
     Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve int array'inin(ilk oluşturduğunuz array)
     ilk ve son elementlerini kapsayan yeni array'e return edin.

    Oluşturacağınız int array'i =   ([1, 2, 3, 4])

    Sonuç bu şekilde olmalıdır. [1, 4]
      */
        //Kodu aşağıya yazınız..
        int [] arr = {1, 2, 3, 4};
        // int [] yeniarr=new int[2];
        int[] yeniarr= {arr[0], arr[arr.length - 1]};

        System.out.println("ilk array = " + Arrays.toString(arr));
        System.out.println();
        System.out.println("yeni array = " + Arrays.toString(yeniarr));

    }
}