package ch12_Arrays.task12;

import java.util.Arrays;
import java.util.Scanner;

public class Task04_iclal {
    static Scanner input = new Scanner(System.in);
   //static int boyut;


    static double toplam;
    static double ortalama;
    public static void main(String[] args) {
        // task-> girilen bir int array elamanlarından  ortlamadan buyuk olan eleman sayısını print eden code create ediniz
        System.out.println("Array eleman sayısını belirleyiniz: Kaç elemanlı array istiyorsunuz?");
        int boyut=input.nextInt();
        int[] arr = new int[boyut];
        arrayTanimla(arr);
        ortalama(arr);
        System.out.println("ortalamadanBuyuk(arr) = " + ortalamadanBuyuk(arr));
    }

    //Exception in thread "main" java.lang.ArithmeticException: / by zero
    //hata veriyor
    //team2 ile çözdük
    private static void arrayTanimla(int [] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + ". nci degeri gir");
            arr[i] = input.nextInt();//boyut kadar kullanicindan deger alinarak arr array inin elemanlari atandi
        }
        System.out.println(arr.length+" elemanlı array belirlenmiştir = " + Arrays.toString(arr));

    }


    private static double ortalama(int [] arr) {
        System.out.println(arr.length+" elemanlı array'in ortalaması belirleniyor." );
        for (int i = 0; i <arr.length ; i++) {
            toplam+=arr[i];
        }
          ortalama=toplam/arr.length;

        System.out.println(arr.length+" elemanlı array'in ortalaması: "+ ortalama);
        return ortalama;
    }

    private static int ortalamadanBuyuk(int [] arr) {
        int  count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>ortalama){
                count++;
            }
        }
       return count;

    }

}
