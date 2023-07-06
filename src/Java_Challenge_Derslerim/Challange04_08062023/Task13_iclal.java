package Java_Challenge_Derslerim.Challange04_08062023;

import java.util.Scanner;

public class Task13_iclal {
    //Task-> Girilen   4 harfli bir kelimeyi tersten print eden code create ediniz.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("4 harfli bir kelime giriniz");
        String kelime = input.next().toUpperCase();
        System.out.println("girdiğiniz = " + kelime);
        System.out.println("Girdiğiniz kelime tersten yazılacak");
        // String ucuncu=kelime.charAt(3); hatalı

        if (kelime.length() == 4) {
            String kelimenintersi = ""+ kelime.charAt(3) + kelime.charAt(2) + kelime.charAt(1) + kelime.charAt(0);
            System.out.println("Kelimenin tersi: " + kelimenintersi);
        } else {
            System.out.println("Lütfen dört harfli bir kelime girin!");
        }




    }

}

