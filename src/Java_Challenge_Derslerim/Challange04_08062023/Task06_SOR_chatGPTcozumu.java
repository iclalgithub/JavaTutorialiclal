package Java_Challenge_Derslerim.Challange04_08062023;

import java.util.Scanner;

public class Task06_SOR_chatGPTcozumu {
    /*  Tsk->
   girilen  Stringin ilk iki karakteri haric string return eden code create ediniz
        Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin (gh  -  g  -  h   : 3 durum var)

       ORNEK:          INPUT     OUTPUT
                       goat        gat
                      photo        hoto
                      ghost        ghost
                      kalem        lem
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime girin: ");
        String input = scanner.nextLine();
        String output = "";

        if (input.length() >= 2) {
            char firstChar = input.charAt(0);
            char secondChar = input.charAt(1);

            if (secondChar == 'h') {
                output = input.substring(1);
            } else if (firstChar == 'g') {
                output = input.substring(0, 1) + input.substring(2);
            } else {
                output = input.substring(2);
            }
        } else {
            output = input;
        }

        System.out.println("Sonuç: " + output);
    }
}