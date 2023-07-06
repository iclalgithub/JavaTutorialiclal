package Java_Challenge_Derslerim.Challange03_07062023;

import java.util.Scanner;

public class Task03_NestedTernary_iclal {

    /*  Task
     Girilen Final için
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri..
    print eden code create ediniz.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("final notunuzu giriniz");
        char finalNotu = input.next().charAt(0);

        System.out.println("***SWITCH CASE İLE ÇÖZÜM***");
        switch (finalNotu) {

            case 'A':
                System.out.println("Gayet başarılı");
                break;
            case 'B':
                System.out.println("Başarılı");
                break;
            case 'C':
                System.out.println("Ha gayret");
                break;
            default:
                System.out.println("diğerleri");
                break;
        }
        System.out.println("***NESTED TERNARY İLE ÇÖZÜM***");

        String sonuc = finalNotu =='A' ? "Gayet başarılı": finalNotu =='B' ? "Başarılı": finalNotu =='C' ? "Ha gayret": "seneye inşallah";

        System.out.println("sonuc = " + sonuc);
    }

}
