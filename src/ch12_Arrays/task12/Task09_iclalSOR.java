package ch12_Arrays.task12;

import java.util.Arrays;
import java.util.Scanner;

public class Task09_iclalSOR {
    static Scanner input=new Scanner(System.in);

    static int [] arr= new int[5];
    static int [] yeniarr= new int[5];
    public static void main(String[] args) {
        // Task -> Kullanıcıdan alacağınız 5 adet sayıyı , girişi sırasına göre tersten print eden code create ediniz...
        diziElemanlari();
        tersDiziElemanlari();
        }//main sonu
    //Arrays.toString(arr) = [1, 2, 3, 4, 5]
    //Arrays.toString(yeniarr) = [0, 4, 3, 2, 1] burda 5 değil 0 oluyor neden
    //SOR??????
    ///sorrrrr!!!
    private static void tersDiziElemanlari() {
        for (int i = 4; i >0 ; i--) {
            //yeniarr[i]+=yeniarr[i];
            yeniarr[i] = arr[arr.length - 1 - i];
        }
        System.out.println("Arrays.toString(yeniarr) = " + Arrays.toString(yeniarr));

    }

    private static void diziElemanlari() {
        for (int i = 0; i <5 ; i++) {
            System.out.println(i+" . sayıyı giriniz");
            arr[i]=input.nextInt();
        }

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

    }

}
