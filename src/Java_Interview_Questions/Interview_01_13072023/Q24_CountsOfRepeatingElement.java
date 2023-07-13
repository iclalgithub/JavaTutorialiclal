package InterviewQuestions;

import java.util.Scanner;

public class Q24_CountsOfRepeatingElement {
    /*  Task->
            How many times a given number is repeated in a sequence
            Create the Java program that finds it.
            Verilen arrayde istenen sayının tekrar saysını print eden code create ediniz.
     */

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 6, 8, 4, 5, 6, 7, 5, 4, 9, -6, -6, 0, 2, 0, 2, 2, 2, 0};

        Scanner input = new Scanner(System.in);

        System.out.println("Biiziim olan bisayı gireceng mi :");

        int sayi = input.nextInt();//10
        int tekrarSayisi=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==sayi) tekrarSayisi++;
        }

        System.out.println("istenen sayi : "+sayi+" arrayda "+tekrarSayisi+" kadar kullanıldı");





    }
}
