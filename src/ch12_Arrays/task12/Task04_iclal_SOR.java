package ch12_Arrays.task12;

import java.util.Arrays;
import java.util.Scanner;

public class Task04_iclal_SOR {
    static Scanner input = new Scanner(System.in);
    static int boyut;
    static int[] arr = new int[0];

    static int toplam;
    static int ortalama;
    public static void main(String[] args) {
        // task-> girilen bir int array elamanlarından  ortlamadan buyuk olan eleman sayısını print eden code create ediniz
        arrayTanimla();
        ortalama();
        ortalamadanBuyuk();
    }

    //Exception in thread "main" java.lang.ArithmeticException: / by zero
    //hata veriyor
    private static void arrayTanimla() {
        System.out.println("Array eleman sayısını belirleyiniz: Kaç elemanlı array istiyorsunuz?");
        int boyut=input.nextInt();

        int [] arr=new int[boyut];//kullaniciidan alinan deger yeni array in boyutu olarak belirlendi
        //int toplam=0;

        for (int i = 0; i < boyut; i++) {
            System.out.println(i + 1 + ". nci degeri gir");
            arr[i] = input.nextInt();//boyut kadar kullanicindan deger alinarak arr array inin elemanlari atandi
        }
        System.out.println(boyut+" elemanlı array belirlenmiştir = " + Arrays.toString(arr));

    }


    private static void ortalama() {
        System.out.println(boyut+" elemanlı array'in ortalaması belirleniyor." );
        for (int i = 0; i <arr.length ; i++) {
            toplam+=arr[i];
        }
          ortalama=toplam/arr.length;
        System.out.println(boyut+" elemanlı array'in ortalaması"+ ortalama);
    }

    private static void ortalamadanBuyuk() {



    }

}
