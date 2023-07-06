package ch12_Arrays;

import java.util.Arrays;

public class C02_Arrays_iclal {
    public static void main(String[] args) {
        //Array elemanı varlığını  kontrol etme...
        //istenen sayiyi arrayda varmi yokmu kontrol ediniz

        int[] numbers = {12, 13, 55, 66, 35, 3, 4, 34, 33, 63, 72};

        int istenenSayi = 35;

        int count=0;
        boolean flag=false;


        for (int i = 0; i <numbers.length ; i++) {
            if(numbers[i]==istenenSayi){
               count++;
               flag=true;
               break;
            }
        }

        //count mantığı ile bulma
        if(count>=1){
            System.out.println("Senin sayın bizde var"+istenenSayi);
        }else System.out.println("yoktur senin sayın bizde");
        System.out.println("senin sayının adedi = " + count);

        //flag ile kontrol
        if (flag){
            System.out.println("Senin sayın bizde var bizim array de"+istenenSayi);
        }else System.out.println("senin sayın bizim array de yoktur");

        //binary search deyince önce sort


        //Arrays.sort(numbers);
        //sort kapatılırsa
        //Arrays.binarySearch(numbers,istenenSayi) = -10
        //sonuçlar tanımsızdır

        System.out.println("numbers"+numbers);// numbers=[I@1d44bcfa

        //sort ladık
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));

        //
        System.out.println("Arrays.binarySearch(numbers,istenenSayi) = " + Arrays.binarySearch(numbers, istenenSayi));

        //2 yöntem ile çözülecek - FLAG
        //Burak bey
        for (int i = 0; i < numbers.length ; i++) {
            if(numbers[i] == istenenSayi){
                System.out.println(numbers[i]);
            }
        }


    }
}
