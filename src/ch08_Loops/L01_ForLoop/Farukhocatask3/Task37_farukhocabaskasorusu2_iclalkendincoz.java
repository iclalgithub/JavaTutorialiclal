package ch08_Loops.L01_ForLoop.Farukhocatask3;

import java.util.Scanner;

public class Task37_farukhocabaskasorusu2_iclalkendincoz {
    public static void main(String[] args) {
     /*
            1
           2 3
          4 5 6
         7 8 9 10
       11 12 13 14 15
      16 17 18 19 20 21
     */ //piramit şeklinde

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen satır sayısı giriniz");
        int satir = scan.nextInt();
        int count = 1;
        for (int i = 1; i <= satir; i++) {
            for (int k = 0; k <satir-i ; k++) {
                System.out.print(" ");
            }
            //
            for (int j = 0; j <= i; j++) {
                // satır sayısı ile işlem sayısı aynı
                //i ye kadar gitmeli
                System.out.print("* ");
               // System.out.print(count );
                count++;
            }
            System.out.println();
        }


    }


}
