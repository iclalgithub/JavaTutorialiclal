package Java_Challenge_Derslerim.Challange07_21062023;

import java.util.Scanner;

public class Task01_iclal {
    /* Task->
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod create ediniz.
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */


    static Scanner input =new Scanner(System.in);

    public static void main(String[] args) {
        icerirMi();


    }

    private static void icerirMi() {
        System.out.println("Bir metin giriniz!");
        String metin=input.nextLine();
        if (metin.contains("xyz")){
            System.out.println("true");
        }else System.out.println("false");

    }
}
