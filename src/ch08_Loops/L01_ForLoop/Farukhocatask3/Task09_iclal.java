package ch08_Loops.L01_ForLoop.Farukhocatask3;

import java.util.Scanner;

public class Task09_iclal {
    public static void main(String[] args) {
           /*
        task-> girilen boyutta aşağıdaki şekli  print eden code create ediniz
          Örnek Ekran çıktısı
      *
      * *
      * * *
      * * * *

         */

        Scanner input = new Scanner(System.in);
        System.out.println("boyut giriniz");
        int boyut = input.nextInt();


        for (int i = 0; i < boyut; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //i=1 için j=1
        //i=2 için j=1,2
        //i=3 için j=1,2,3
        //i=4 için j=1,2,3,4
    }
}
