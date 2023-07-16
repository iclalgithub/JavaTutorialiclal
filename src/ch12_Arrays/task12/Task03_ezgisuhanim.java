package ch12_Arrays.task12;


import java.util.Arrays;

public class Task03_ezgisuhanim {

    public static void main(String[] args) {

		 /*
       Task-> Verilen  bir arrayin tum elemanlarini
        bir soldaki konuma print eden code create ediniz
       input:  [1,2, 3]
        output [2, 3, 1]
        */
// arraydeki her bir elemani index degeri kadar artiralim

        int []array={1,2,3,4,5};

        int sonEleman = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] =sonEleman;

        // Kaydırılmış diziyi yazdırma
        //for (int eleman : array) {
        //    System.out.print(eleman + " ");
        // }
        System.out.println(Arrays.toString(array));
    }
}










