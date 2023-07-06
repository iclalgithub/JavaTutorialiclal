package Java_Challenge_Derslerim.Challange07_21062023;
import java.util.Scanner;

public class Task02_iclal {

		// task-> girilen tamsayının tek-çift olmasını kontrol eden method create ediniz.

    public static void main(String[] args) {
        tekMi();

    }

    private static void tekMi() {
        Scanner input =new Scanner(System.in);
        System.out.println("Bir sayı giriniz!");
        int sayi=input.nextInt();

        if(sayi%2==0){
            System.out.println("sayi çifttir");
        }else System.out.println("sayı tektir");
    }

}




