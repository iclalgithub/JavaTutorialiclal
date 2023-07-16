package ch12_Arrays.task12;

import java.util.Arrays;

public class _13_Advance_zeroFront_SOR {

    public static void main(String[] args) {

      /*

   Verilen Array tam olarak aynı sayıları içeren, ancak tüm sıfırların dizinin başında gruplandırılması
   için yeniden düzenlenmiş bir Array döndürün.
   Sıfır olmayan sayıların sırası önemli değildir.
   Böylece {1, 0, 0, 1} {0, 0, 1, 1} olur. Verilen diziyi değiştirebilir ve döndürebilir veya yeni bir dizi oluşturabilirsiniz.

   Bu şekilde bir Array oluşturunuz: 1,0,0,1,0
   Sonuç böyle olmalı :  0,0,0,1,1

       */

        // Kodu aşağıya yazınız..
        int[] arr = {1, 0, 0, 1};
        //kaç tane sıfır var onu saymamız lazım
        //sıfır sayısı kadar sıfırı ekle
        //diziden sıfırları çıkar
        //önce sıfırları
        //sonra diziden sıfır çıkan halini ekle

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        System.out.println("sıfır sayısı" + count);
        int[] yeniarr = new int[count];
        for (int i = 0; i < count; i++) {
            yeniarr[i] += 0;
        }
        System.out.println("yeniarr = " + Arrays.toString(yeniarr));
        //0 elemanları yeni arr'ye eklendi
        //sıfır olmayanları yeni arr'ye ekle
        int[] yeniarr2 = new int[count];
        for (int i = 0; i < arr.length-1; i++) {
            if(!(arr[i] == 0)){
                yeniarr2[i]=arr[i];
            }
        }
        System.out.println("yeniarr2= " + Arrays.toString(yeniarr2));
    }
}