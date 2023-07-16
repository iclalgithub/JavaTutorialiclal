package ch13_ArrayList.Tasks13;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_arraylist3_aytekinbey {

    /*
        getLength() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        Return tipi Integer ArrayList
        ArrayList içindeki her bir Stringin uzunluğunu bulunuz.

        Tüm elementlerin uzunluğunu döndürün

        Örneğin;
        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        Tüm Stringlerin uzunluklarını yazdırın;
        cevap: 10 ,  8 , 4 , 7 , 6 olmalı
     */

    public static void main(String[] args) {

        ArrayList<String> stringCharacter = new ArrayList<String>();
        System.out.println(getLength(stringCharacter));
    }

    private static String getLength(ArrayList<String> stringCharacter) {

        Scanner input = new Scanner(System.in);
        System.out.println("Gireceğiniz string ifadelerin sayısı");
        int sayi = input.nextInt();
        input.nextLine();
        System.out.println("String ifadelerinizi girin");
        for (int i = 0; i < sayi; i++) {
            String words = input.nextLine();
            stringCharacter.add(words);

        }
        System.out.println("Girdiğiniz stringler = " + stringCharacter);
        for (int i = 0; i < sayi; i++) {
            System.out.println(stringCharacter.get(i).toUpperCase() + " ifadesinin string uzunluğu " + stringCharacter.get(i).length());
        }
        return " ";
    }


}