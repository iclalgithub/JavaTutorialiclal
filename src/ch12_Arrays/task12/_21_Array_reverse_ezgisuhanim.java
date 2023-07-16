package ch12_Arrays.task12;

import java.util.Arrays;
import java.util.Scanner;

public class _21_Array_reverse_ezgisuhanim {

    public static void main(String[] args) {

        /*
        Girilen 123 Intiger'ının basamaklarını ters çevirin.
        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
         */

        //Kodu aşağıya yazınız.

        Scanner input = new Scanner(System.in);

        System.out.println("sayı gir");

        // String [] sayi1 = input.nextLine().split("");

        // for (int i = sayi1.length-1; i >= 0; i--) {

        //     System.out.print(sayi1[i]);






        String sayi = input.nextLine();
        int[] array = new int[sayi.length()];
        int x = 0;

        for (int i = sayi.length()-1; i >=0; i--) {
            array[i] = Character.getNumericValue(sayi.charAt(x));
            x++;


        }
        System.out.println(Arrays.toString(array));


    }
}


