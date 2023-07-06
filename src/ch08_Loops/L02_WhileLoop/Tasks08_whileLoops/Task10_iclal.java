package ch08_Loops.L02_WhileLoop.Tasks08_whileLoops;

import java.util.Scanner;

public class Task10_iclal {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  tek olanlarını print eden code create ediniz.
        Scanner input = new Scanner(System.in);
        System.out.println("bir tamsayı giriniz : ");
        int sayi = input.nextInt();
        //İLERLEMEDİ SOR
        int i=1;
        while(i<=sayi){
           // if(i%2!=0){
            if(i%2==1){
                System.out.println("i = " + i);
            }
            i++; //if dışında olmalı
        }

    }
}
