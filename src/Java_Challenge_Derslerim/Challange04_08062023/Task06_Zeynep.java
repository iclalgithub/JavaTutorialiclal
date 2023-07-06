package Java_Challenge_Derslerim.Challange04_08062023;

import java.util.Scanner;

public class Task06_Zeynep {
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
        Scanner input = new Scanner(System.in);
        System.out.println("bir String giriniz");
        String str = input.nextLine();
        if (str.startsWith("gh")) {

            System.out.println(str);


        }else System.out.println(str.substring(2));
    }



    }

