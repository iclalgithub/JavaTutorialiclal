package ch12_Arrays.task12;

import java.util.Scanner;

public class _21_Array_reverse_aytekinbey {

    public static void main(String[] args) {

        /*
        Girilen 123 Intiger'ının basamaklarını ters çevirin.
        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
         */

        //Kodu aşağıya yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Üç basamaklı sayı girin");
        int number = input.nextInt();
        int n1 = number % 10;
        int n2 = number/10 % 10;
        int n3 = number/100 % 10;
        System.out.println("Girdiğin sayıların rakamları: " + n1 + " " + n2 + " " + n3);

        System.out.println(number+ " Sayısının tersi");

        System.out.println(n1*100+n2*10+n3);


    }
}


