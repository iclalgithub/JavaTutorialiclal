package Java_Challenge_Derslerim.Challange06_15062023;

import java.util.Scanner;

public class Task07 {


    // Task-> Girilen bir stringin harflerini teker teker ekrana alt alta olacak
    // sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Agam hele bi şey ciziktiresen : ");

        String aganınCizigi=input.nextLine();


        for (int i = 0; i < aganınCizigi.length(); i++) {

            if (aganınCizigi.charAt(i)=='a' || aganınCizigi.charAt(i)==' ') {// girilen ifadede a veya " " kontrolu
                continue;//if sartı true vardiğinde döngü bu tekrarı pass(çalışma) geçip diğer tekrardan devam eder
            }

            System.out.println(aganınCizigi.charAt(i));


        }
    }

}
