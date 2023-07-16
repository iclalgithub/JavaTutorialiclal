package ch13_ArrayList.Tasks13;

import java.util.ArrayList;
import java.util.Scanner;

public class _02_arraylist2_aytekinbey {

      /*
        getSum() isminde bir method oluşturun.
        Parametresi ArrayList olmalı
        Return tipi int olmalı.
        ArrayList teki tüm sayıları birbiri ile toplayın.
        return olarak toplam sonucu döndürün.
        Örneğin;
        Arraylist = 1,2,3,4,5
        return 15 olmalı
         */

    public static void main(String[] args) {


        //System.out.println("------------------Bu kısım Prototip------------------------");

        // ArrayList<Integer> numberList = new ArrayList<Integer>();
        // Scanner input = new Scanner(System.in);
        // System.out.println("Kaç eleman gireceksiniz");
        // int elemanSayisi = input.nextInt();
        // int sum = 0;
        // System.out.println("Sayılarınızı girin");
        // for (int i = 0; i < elemanSayisi; i++) {
        //     int eleman = input.nextInt();
        //     numberList.add(eleman);
        //     sum+=numberList.get(i);
        // }
        // System.out.println("sum = " + sum);


        ArrayList<Integer> numbersList = new ArrayList<Integer>();
        int result = getSum(numbersList);
        System.out.println("Girdiğiniz sayıların toplamı");
        System.out.println(result);


    }

    private static int getSum(ArrayList<Integer> numbersList) {
        Scanner input = new Scanner(System.in);
        System.out.println("Gireceğiniz eleman sayınızı belirtin");
        int elemanSayisi = input.nextInt();
        int sum = 0;
        System.out.println("Gireceğiniz elemanları belirtin");
        for (int i = 0; i < elemanSayisi; i++) {
            int eleman = input.nextInt();
            numbersList.add(eleman);
            sum += numbersList.get(i);


        }

        return sum;
    }


}
