package ch08_Loops.L01_ForLoop.Tasks08_forLoop;

import java.util.Scanner;

public class Task01_iclal {
    public static void main(String[] args) {
        /*
        girilen iki sayı arasındaki çift sayıları yanyana  print eden code create ediniz..
         */
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi1 = input.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        int sayi2 = input.nextInt();

        for (int i = sayi1; i < sayi2; i++) {
            if(i%2==0){
                System.out.print( i+" ");
            }
        }


        }

    }






















