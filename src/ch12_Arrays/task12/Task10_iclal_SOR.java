package ch12_Arrays.task12;

import java.util.Arrays;
import java.util.Scanner;

public class Task10_iclal_SOR {
    static int boyut;
    static Scanner input=new Scanner(System.in);
   static  int [] arr=new int[boyut];
    static  int [] yeniarr=new int[boyut];
    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6
         */
        diziBelirle();
        isaretDegistir();
    }

    private static void isaretDegistir() {
        for (int i = 0; i < arr.length; i++) {
            yeniarr[i] = arr[i] * -1;
        }
        System.out.println("yeniarr = " + yeniarr);
        // SOR burda çıktı görünmüyor neden????
        // yeniarr = [I@27c170f0
        // dizinin işareti değiştirildi[]
        System.out.println("dizinin işareti değiştirildi"+ Arrays.toString(yeniarr));

    }

    private static void diziBelirle() {
        System.out.println("kac elamanli array istersin");
        int boyut=input.nextInt();

        int [] arr=new int[boyut];//kullaniciidan alinan deger yeni array in boyutu olarak belirlendi


        for (int i = 0; i < boyut ; i++) {
            System.out.println(i+1 +". nci degeri gir");
            arr[i]=input.nextInt();//boyut kadar kullanicindan deger alinarak arr array inin elemanlari atandi
        }
        System.out.println("dizi belirlendi: "+Arrays.toString(arr));
    }


}
