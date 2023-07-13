package Java_Interview_Questions.Interview_01_13072023;

import java.util.Scanner;

public class Q23_UsingDoWhileWithCondition_iclaleksik {
    /*  Task->
        Ask user to enter an integer.
        If the integer is less than 100, tell user "Won!"
        Otherwise tell user "Lost!"
        Girilen bir sayı için 100'den küçük ise  "Won!"
        değilse "Lost!" print eden code create ediniz.
    */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi=input.nextInt();

        //hızlı geçti hoca çözümü kolay diye
        if(sayi<100){
            System.out.println("won!");
        }else System.out.println("Lost!");

    }//main sonu

}//class sonu
