package ch12_Arrays.task12;

import java.util.Scanner;

public class Task05_iclal {


    public static void main(String[] args) {
        // Task-> girilen int değeri tersten print eden code create ediniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Üç basamaklı sayı girin");
        int number = input.nextInt();
        int number1 = number % 10;
        int number2 = number/10 % 10;
        int number3 = number/100 % 10;
        System.out.println("Girdiğin sayıların rakamları: " + number1 + " " + number2 + " " + number3);

        System.out.println(number+ " Sayısının tersi");

        System.out.println(number1*100+number2*10+number3);





    }

}
