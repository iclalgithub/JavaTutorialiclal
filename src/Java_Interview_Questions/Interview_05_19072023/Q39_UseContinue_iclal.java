package Java_Interview_Questions.Interview_05_19072023;

import java.util.Scanner;

public class Q39_UseContinue_iclal {

        /* Task->
         Girilen bir stringin harflerini bosluk veya a harfi teker teker  alt alta print eden code create ediniz.
         */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("bir metin giriniz : ");
        String metin = input.nextLine();// emine


        for (int i = 0; i < metin.length(); i++) {
            if(metin.charAt(i)==' ' || metin.charAt(i)=='a'){ // boşluk veya a ise basma
                continue;
            }else System.out.print(metin.charAt(i));
        }


    }

}
