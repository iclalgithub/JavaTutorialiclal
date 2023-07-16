package ch10_MethodCreation.tasks10;

import java.util.Scanner;

public class Task02_ezgisuhanim {

    public static void main(String[] args) {
        //task -> girilen ad ve soyadın ilk harfleri buyuk diğerlerini kucuk yapan method create ediniz

        Scanner input = new Scanner(System.in);
        System.out.println("adını gir");
        String isim = input.nextLine();

        System.out.println("soyadını gir");
        String soyIsim = input.nextLine();

        System.out.println("methodIsim(isim,soyIsim) = " + methodIsim(isim, soyIsim));

        char chr = Character.toUpperCase(isim.charAt(0));
        char chr2 = Character.toUpperCase(soyIsim.charAt(0));


    }

    private static String methodIsim(String isim, String soyIsim) {

        char chr = Character.toUpperCase(isim.charAt(0));
        char chr2 = Character.toUpperCase(soyIsim.charAt(0));

        return isim;


    }


}
