package ch13_ArrayList.Tasks13;

import java.util.ArrayList;
import java.util.Scanner;

public class _04_arraylist4_aytekinbey {

    /*
        İsmi changeInArraylist() olan bir method oluşturun.
        Parametre olarak String ArrayList, String s1, String s2
           Arraylist'te s1'i s2 olarak değiştirin

        Return String arrayList

        Örneğin;
        Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
        s1 = blue
        s2 = yellow
        Tüm blue 'ları yellow'a dönüştürün.
        cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
     */

    public static void main(String[] args) {
        ArrayList<String> changingWords = new ArrayList<String>();
        System.out.println("changeInArrayList(changingWords) = " + changeInArrayList(changingWords));


    }

    private static String changeInArrayList(ArrayList<String> changingWords) {
        Scanner input = new Scanner(System.in);
        System.out.println("\"Gireceğiniz string ifadelerin sayısını belirtin\"");
        int stringSayisi = input.nextInt();
        input.nextLine();
        System.out.println("String ifadelerini gir");
        for (int i = 0; i < stringSayisi; i++) {
            String words = input.nextLine();
            changingWords.add(words);

        }
        String s1 = "blue";
        String s2 = "yellow";
        System.out.println("changingWords.get(i) = " + changingWords);
        for (int i = 0; i < stringSayisi; i++) {
            if (changingWords.get(i).equalsIgnoreCase(s1)) {
                changingWords.set(i, s2);
            } else {
                System.out.println("Sayın kullanıcı adam gibi renkleri gir, bi zamet incelazca olsun");
            }
        }
        System.out.println("changingWords.get(i) = " + changingWords);

        return " ";
    }


}
