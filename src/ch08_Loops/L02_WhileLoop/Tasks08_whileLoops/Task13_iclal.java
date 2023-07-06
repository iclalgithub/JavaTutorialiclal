package ch08_Loops.L02_WhileLoop.Tasks08_whileLoops;

import java.util.Scanner;

public class Task13_iclal {
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde "jAVATAR" print eden code create ediniz.
        do-while lopp
         */
        Scanner input = new Scanner(System.in);


        String kelime;
        do {
            System.out.println("bir kelime giriniz : ");
            kelime = input.nextLine();

            if (kelime.equals("x")) {
                System.out.println("jAVATAR");
                System.out.println("Çıkış yapılıyor güle güle!");
                break;
            }
            System.out.println("javaCAN");

        } while (true); //sonsuz döngü


        //     while (kelime.equalsIgnoreCase("javaCAN")) {
        //       //System.out.println("bir kelime giriniz : ");
        //       //String kelime = input.nextLine();
        //         System.out.println("javaCAN");
        //         if(kelime.equalsIgnoreCase("x")){
        //             System.out.println("jAVATAR");
        //         }
//
        //     }
//


    }
}
