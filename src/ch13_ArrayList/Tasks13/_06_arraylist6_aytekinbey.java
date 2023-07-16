package ch13_ArrayList.Tasks13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _06_arraylist6_aytekinbey {

    /*
    hillNum() isminde bir method oluşturun.
    Parametre olarak Integer ArrayList
    Return tipi int,
    Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
    Örneğin;
    ArrayList  5,4,6,2,1
    2, 6'dan küçük ve 1 den büyüktür.
    Return 2 olmalı.
     */

    public static void main(String[] args) {

        ArrayList<Integer> biggerThanNextSmallerThanPrevious = new ArrayList<Integer>();
        hillNum(biggerThanNextSmallerThanPrevious);


    }

    private static int hillNum(ArrayList<Integer> biggerThanNextSmallerThanPrevious) {
        Scanner input = new Scanner(System.in);
        System.out.println("\"Gireceğiniz sayı adedini belirtin\"");
        int girilecekSayiMiktari = input.nextInt();
        System.out.println("Sayılarınızı sırayla girin");
        for (int i = 0; i < girilecekSayiMiktari; i++) {
            int girilenSayi = input.nextInt();
            biggerThanNextSmallerThanPrevious.add(girilenSayi);
        }
        System.out.println("Girdiğin sayılar " + biggerThanNextSmallerThanPrevious);

        sartiSaglayanVaziyet(biggerThanNextSmallerThanPrevious);
        return girilecekSayiMiktari;
    }

    private static int sartiSaglayanVaziyet(ArrayList<Integer> biggerThanNextSmallerThanPrevious) {
        for (int i = 1; i < biggerThanNextSmallerThanPrevious.size() - 1; i++) {
            if (biggerThanNextSmallerThanPrevious.get(i - 1) > biggerThanNextSmallerThanPrevious.get(i)
                    && biggerThanNextSmallerThanPrevious.get(i) > biggerThanNextSmallerThanPrevious.get(i + 1)) {
                System.out.println(biggerThanNextSmallerThanPrevious.get(i));
            } else {
                System.out.println("Uygun nitelikte sayı girmedin");////Burası neden iki kez kendini tekrarlıyor

            }

        }
        return 0;
    }


}
