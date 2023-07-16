package ch12_Arrays.task12;

import java.util.Arrays;

public class _17_2d_Array_iclal {

    public static void main(String[] args) {

        /*
        Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
        Bütün 2'leri 6'yla değiştirin.
        Array'i yazdırınız.
         */

        //Kodu aşağıya yazınız.

        //örnek iki boyutlu array

        /* int [] [] aprMD = {{1,2,3}, //0.kat
                {10,23 }, //1. kat
                {103 }   //2. kat
        };
        */

        int [] [] aprMD = {{2,3,2}, //0.kat
                {4,1,5} , //1. kat
                {7,2,5}  //2. kat
        };
        System.out.println("aprMD = " + Arrays.deepToString(aprMD));
        for (int i = 0; i < aprMD.length; i++) {
            for (int j = 0; j < aprMD.length ; j++) {
                if(aprMD[i][j]==2){
                    aprMD[i][j]=6;
                }
            }
        }
        System.out.println("son aprMD = " + Arrays.deepToString(aprMD));
    }
}