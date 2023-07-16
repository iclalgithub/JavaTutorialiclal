package ch10_MethodCreation.tasks10;


import java.util.Locale;
import java.util.Scanner;

public class C07_Palidrome_alibey {
    public static void main( String[] args) {
        // girilen ifadenin polindrome olmasini kontrol eden method create ediniz ..
        // polindrome : her iki yönde okundugunda eşit olan ifadeler .
        // madam , ada , asa , 121
        Scanner input = new Scanner(System.in);
        System.out.println("Bir kelime giriniz : ");
        String kelime = input.nextLine().toLowerCase();

        palindrome(kelime);
    }
    private static void palindrome(String k) {
        String ters = "" ;// bos konteyner olusturuldu .

        for (int i = k.length()-1 ; i>=0 ; i--) { // kelime tersten alindi
            ters += k.charAt(i); // tersten herbir karekter atandi

        }
        System.out.println("girdigin kelimenin tersi = "  + ters);

        if (ters.equals(k)) {
            System.out.println("bu kelime palindromdur ");
        }else System.out.println("bu kelime palindrom degildir ");
    }
}

