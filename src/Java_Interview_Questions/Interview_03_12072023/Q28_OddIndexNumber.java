package InterviewQuestions;

import java.util.Scanner;

public class Q28_OddIndexNumber {
    // Task-> girilen str'deki indexi tek olan karakterleri print eden code create ediniz.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("agam bişeyler giresen : ");
        String metin = input.nextLine();// emine

        System.out.println("   ***  for loop   ***   ");

        // for (int i = 0; i <metin.length() ; i++) {
        //     if (i%2==1) {//metin index tek olma şartı
        //         System.out.print(metin.charAt(i));
        //     }
        // }

        for (int i = 1; i < metin.length(); i += 2) {

            System.out.print(metin.charAt(i));

        }
        System.out.println("   ***  do-while loop   ***   ");

        int index = 1;
        do {
            System.out.println(metin.charAt(index));
            index += 2;
        }
        while (index < metin.length());


    }
}