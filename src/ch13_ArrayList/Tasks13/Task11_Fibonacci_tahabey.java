package ch13_ArrayList.Tasks13;

import java.util.ArrayList;
import java.util.Scanner;

public class Task11_Fibonacci_tahabey {
    /*
    Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
    1-1-2-3-5-8-13-21-34....
    */

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(method());

    }//main sonu

    private static ArrayList<Integer> method() {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("rasgele bir sayı giriniz");
        int numb=sc.nextInt();
        int fibonacci=0;
        int fibonacciBirOnceki=1;
        int temp=0;

        while(numb>fibonacci){
            temp=fibonacci;
            fibonacci+=fibonacciBirOnceki;
            fibonacciBirOnceki=temp;
            list.add(fibonacci);
        }
        list.remove(list.size()-1);
        return list;
    }
}
