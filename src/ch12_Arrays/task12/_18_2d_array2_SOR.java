package ch12_Arrays.task12;

import java.util.Arrays;

public class _18_2d_array2_SOR {

    public static void main(String[] args) {

        /*
        Şu şekilde olan bir 2D int Array'i oluşturunuz.  [{5,2,1} , {10,2,3,6} , {1,2}]
        2D array'de olan elemanları toplayınız.
        toplamı yazdırınız.
        Sonuç 32 olmalıdır.
         */

        //Kodu aşağıya yazınız.
        //örnek iki boyutlu array

        /* int [] [] aprMD = {{1,2,3}, //0.kat
                {10,23 }, //1. kat
                {103 }   //2. kat
        };
        */

        int[][] aprMD = {{5, 2, 1}, //0.kat
                {10, 2, 3, 6}, //1. kat
                {1, 2}  //2. kat
        };
        //SONUÇ 32 OLMALI 19 BULUYORUM NEDEN????
        System.out.println("aprMD = " + Arrays.deepToString(aprMD));
        int toplam = 0;
        for (int i = 0; i < aprMD[i].length; i++) {
            for (int j = 0; j < aprMD[j].length; j++) {
                toplam += aprMD[i][j];
            }
        }
        System.out.println("dizi eleman toplamı = " + toplam);
    }
}