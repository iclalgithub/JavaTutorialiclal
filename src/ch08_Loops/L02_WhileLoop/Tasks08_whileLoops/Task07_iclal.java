package ch08_Loops.L02_WhileLoop.Tasks08_whileLoops;

import java.util.Scanner;

public class Task07_iclal {
    public static void main(String[] args) {
        // task-> girilen  5 sayının  en büyüğünü print den code create ediniz
        //   Scanner input = new Scanner(System.in);
        //   System.out.println("bir tamsayı giriniz : ");
        //   int sayi1 = input.nextInt();
        //   System.out.println("ikinci tamsayıyı giriniz : ");
        //   int sayi2 = input.nextInt();
        //   System.out.println("üçüncü tamsayıyı giriniz : ");
        //   int sayi3 = input.nextInt();
        //   System.out.println("dördüncü tamsayıyı giriniz : ");
        //   int sayi4 = input.nextInt();
        //   System.out.println("beşinci tamsayıyı giriniz : ");
        //   int sayi5 = input.nextInt();

        //   int enBuyuk=sayi1;

        //  int sayi=11;//başlangıç değeri create edildi
        //  while(sayi<20){//şartımız sayı 20 olana kadar çalışması kotrol edildi. 20 dahil değil
        //      System.out.print(sayi+" ");
        //      sayi++; //sonsuz loop olmaması için sayı birer arttırıldı
        //  }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int number1 = scanner.nextInt();

        int maxNumber = number1; // Integer.MIN_VALUE; // rastgele bir sayı da verilebilir
        System.out.println("maxNumber = " + maxNumber);
        int count = 1;

        while (count < 5) {
            System.out.print("Bir sayı girin: ");
            int number = scanner.nextInt();

            if (number > maxNumber) {
                maxNumber = number;
            }

            count++;
        }

        System.out.println("En büyük sayı: " + maxNumber);
    }
}


