package Java_Challenge_Derslerim.Challange05_14062023;

import java.util.Scanner;
public class Q05Task05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Agam satır sayısı giresen hele :");

        int satir = input.nextInt();

        System.out.print("Agam sutun sayısı giresen hele :");

        int sutun = input.nextInt();


        for (int i = 1; i <= satir; i++) {// i=1...satır  satır kontrolu

            for (int j = 1; j <= sutun; j++) { //j=1...sutun kontrolu

                System.out.print("* ");

            }
            System.out.println();// dummy-! hayalet komut action almayan satır düzeni sağlar;

        }

    }


}
