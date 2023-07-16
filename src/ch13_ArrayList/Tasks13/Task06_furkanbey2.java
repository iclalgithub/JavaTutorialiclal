package ch13_ArrayList.Tasks13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task06_furkanbey2 {
    public static void main(String[] args) {
         /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         yazdırınız.

        */
        arrTek();

    }//main sonu

    private static void arrTek() {
        int[] arr = new int[6];
        int sayTek = 0;
        Scanner input = new Scanner(System.in);
        ArrayList<String> arrYeniTek= new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            System.out.println("6 elemanlı dizinin " + i + ". elemanı giriniz");
            arr[i] = Integer.parseInt(input.next()); //String tipe çevirdik
            if (arr[i] % 2 != 0) {
                arrYeniTek.add(String.valueOf(arr[i]));  //String tipe çevirdik
            }//array boyutu belilirliyoruz
        }

        String [] array = arrYeniTek.toArray(new String[arrYeniTek.size()]);
        //array list oluşturduk tek sayıları ona atıyoruz
        //en son array e çeviriyoruz

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println("Arrays.toString(arrTek) = " + Arrays.toString(array));

    }


}
