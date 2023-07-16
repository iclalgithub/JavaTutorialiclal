package ch10_MethodCreation.tasks10;

import java.util.Scanner;

public class Odev03_ezgisuhanim {

    /* Kullanıcıdan aldığımız sayının, asal olup olmadığını return eden
     * bir method create ediniz.
     *
     *  getAsalMi(int sayi)
     *  	return true/false

     * */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("sayı gir");
        int sayi = input.nextInt();


        System.out.println("getAsalMi(sayi) = " + getAsalMi(sayi));


    }

    private static boolean getAsalMi(int number) {
        boolean result;

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;




    }
}
