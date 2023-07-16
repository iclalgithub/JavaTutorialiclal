package ch10_MethodCreation.tasks10;


import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Task01_ezgisuhanim {

    public static void main(String[] args) {
        //task-> girilen iki sayının eşitliğini kontrol eden method create ediniz...



        Scanner input = new Scanner(System.in);
        System.out.println("birinci sayıyı giriniz");

        int sayi1 = input.nextInt();

        System.out.println("ikinci sayıyı giriniz");

        int sayi2 = input.nextInt();

        System.out.println("esitmi(sayi1,sayi2) = " + esitmi(sayi1, sayi2));


    }//main sonu

    private static boolean esitmi(int sayi1, int sayi2) {
        return sayi1 == sayi2;
    }




}



