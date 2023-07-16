package ch13_ArrayList.Tasks13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _05_arraylist5_aytekinbey {

    /*
        rotateList() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
        Tersten yazılmış halini return edin.
        Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
        cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
     */

    public static void main(String[] args) {

        ArrayList<String> rotationWords = new ArrayList<String>();
        rotateList(rotationWords);


    }

    private static String rotateList(ArrayList<String> rotationWords) {
        Scanner input = new Scanner(System.in);
        System.out.println("Gireceğiniz stringlerin sayısını belirtin");
        int stringSayisi = input.nextInt();
        input.nextLine();
        System.out.println("\"Stringlerinizi sırasıyla girin\" ");
        for (int i = 0; i < stringSayisi; i++) {
            String words = input.nextLine();
            rotationWords.add(words);

        }
        ArrayList<String> yeniList = new ArrayList<String>(stringSayisi);
        System.out.println("Öncesi = " + rotationWords);
        reverseList(rotationWords);

        return " ";
    }

    private static String reverseList(ArrayList<String> rotationWords) {
        Collections.reverse(rotationWords);
        System.out.println("Sonrası " + rotationWords);
        return " ";
    }


}

