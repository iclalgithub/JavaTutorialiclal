package Java_Challenge_Derslerim.Challange05_14062023;

import java.util.Scanner;

public class Q06_MetCreationForLoop_iclal {
    /* Interview Question
    Write a Java program to reverse a string.
    Use for loop and create a method called reverseString */


    public static void main(String[] args) {
            // ÖNCEDEN YAPMIŞTIM BUNU SANKİ
        Scanner input = new Scanner(System.in);
        System.out.println("bir kelime giriniz :");
        String  kelime=input.next();

        for (int i = kelime.length()-1; i >=0 ; i--) {
            System.out.print(kelime.charAt(i));
        }



    }

}
