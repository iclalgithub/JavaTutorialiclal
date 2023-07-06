package ch12_Arrays.task12;

import java.util.Arrays;
import java.util.Scanner;



public class Task08_iclal_methodile {
    static Scanner input=new Scanner(System.in);
    static int[] arr = new int[7];
    public static void main(String[] args) {
        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.
        System.out.println("7 elamanli bir array giriniz");
        tekElemanBulma();
    }

    private static void tekElemanBulma() {
        for (int i = 0; i <= 6; i++) {
            System.out.println(i + " . elemanı giriniz");
            arr[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <= 6; i++) {
            if (arr[i] % 2 == 1) {
                System.out.println(arr[i]);
            }
        }
    }
}
