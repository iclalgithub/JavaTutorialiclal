package Java_Challenge_Derslerim.Challenge08_22062023;

import java.util.Arrays;

public class Task02_iclal {
    public static void main(String[] args) {
        /* task->
         * dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan buyuk olan elemanlari print eden code create ediniz.
         * input[]= {1,2,3,4,5,6,7}
         * Output1 : 4
         * Output2 : 5,6,7
         */

        int arr[] = {1, 2, 3, 4, 5, 6, 7};

        Arrays.sort(arr);
        System.out.println("arr = " + arr); //
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        int ortalama = 0;
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
        }
        ortalama = toplam / arr.length;
        System.out.println("ortalama = " + ortalama);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ortalama) {
                System.out.println(i+". eleman ortalamadan büyüktür ve değeri: " + arr[i]);
            }

        }

    }
}
