package ch12_Arrays.task12;

import java.util.Arrays;

public class Task12_iclal {
        static  int [] arr={2,6,4,5,8,9};
        static int kare=1;
    public static void main(String[] args) {
		/* TASK :
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini print eden code create ediniz.)
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */
        diziBelirle();
        karesiniAl();
    }

    private static void karesiniAl() {
       System.out.println("Dizinin karesi alınıyor...");
       for (int i = 0; i < arr.length; i++) {
           int kare =arr[i]*arr[i];
       }

       System.out.println("Dizinin karesi: "+kare);
     //  for (int i = 0; i < arr.length; i++) {
     //      int square = arr[i] * arr[i];
     //      System.out.print(square + " ");
     //  }
    }

    private static void diziBelirle() {
        System.out.println("Karesi alınacak dizi...");
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }

}
