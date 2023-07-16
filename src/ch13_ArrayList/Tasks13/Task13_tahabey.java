package ch13_ArrayList.Tasks13;

import java.util.ArrayList;
import java.util.Arrays;

public class Task13_tahabey {
    /* TASK :
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
     */
    public static void main(String[] args) {
        ArrayList<Integer> arr1= new ArrayList<>(Arrays.asList(3, 5, 1, 2, 7, 9, 2, 3, 5, 7));
        yeniArrOlustur(arr1);
    }

    private static void yeniArrOlustur(ArrayList<Integer> arr1) {
        ArrayList<Integer> yeniarr= new ArrayList<>();
        for (int i = 0; i < arr1.size() ; i++) {
           int toplam=0;
            for (int j = 0; j < i+1; j++) {
                toplam+= arr1.get(i);

            }
            yeniarr.add(i);
        }

    }
}