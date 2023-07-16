package ch13_ArrayList.Tasks13;

import java.util.Arrays;
import java.util.Scanner;

public class Task06_furkanbey {
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

        for (int i = 0; i < 6; i++) {
            System.out.println("6 elemanlı dizinin " + i + "elemani giriniz");
            arr[i] = input.nextInt();
            if (arr[i] % 2 != 0) {
                sayTek++;
            }//array boyutu belilrliyoruz
        }

        //kaç tane tek elemanı var bilmiyoruz
        //tek sayı olan sayı kadar boyutu olan bir dizi oluşturduk
        int[] arrTek = new int[sayTek];
        int index = 0;
        for (int i = 0; i < 6; i++) {
            if (arr[i] % 2 != 0) {
                arrTek[index] = arr[i];
                index++;
            }
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println("Arrays.toString(arrTek) = " + Arrays.toString(arrTek));

    }


}
