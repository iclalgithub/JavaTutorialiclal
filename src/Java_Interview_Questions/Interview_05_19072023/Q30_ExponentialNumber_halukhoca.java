package InterviewQuestions;

import java.util.Scanner;

public class Q30_ExponentialNumber_halukhoca {
    //Task->
    // Get 2 numbers from the user.
    //first number base
    //second number Top
    //Write a code that calculates the prime of a number.
    // Girilen taban ve us değerleri için sayının kuvvetini print eden code create ediniz.
    // 2, 3 --> 2^3 = 2*2*2= 8

    // 4, 3 --> 4^3= 4*4*4 = 64
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("agam taban giresen : ");
        int taban = input.nextInt();
        int sonuc = 1;
        System.out.print("agam üss giresen : ");
        int uss = input.nextInt();

       // System.out.println("   ***  for loop   ***   ");
       // for (int i = 1; i <= uss; i++) {
       //     sonuc *= taban;
       // }

        System.out.println("   ***  while loop   ***   ");
        while (uss != 0) {
            sonuc *= taban;
            uss--;
        }
        System.out.println(sonuc);
    }

}
