package ch08_Loops.L01_ForLoop.Tasks08_forLoop;

public class Odev04_farukhocacozdutask3 {

    public static void main(String[] args) {


//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15

        System.out.println(" BİRİNCİ ÇÖZÜM");
        // Faruk hoca çözümü
        int n = 5;
        int sayi = 1;
        for (int i = 1; i <= n; i++) {
            sayi = i;
            for (int j = 1; j <= i; j++) { //satır sayısı kadar yazılacak
                System.out.print(sayi + " "); //j satır içindeki sütunları yazıyor.
                sayi += (n - j); // n=5 için j=1 sayi=5
            }
            System.out.println();
        }
        //i=1 j=i yani j=1
        //i=2 j=1,2  7=3+ (n-1) , 10=7+(n-2)
        //i=3 j=1,2,3
        //
        //5 9 12 14 15  9=5+(n-1)   12 = 9+(n-2)  14=12+(n-3)   15 = 14+(n-4)


        System.out.println(" İKİNCİ ÇÖZÜM");


        // Taha bey
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
            int cikanSayi = 0;
            for (int j = 1; j < i; j++) {
                cikanSayi += j;
                System.out.print(((i + (j * 5)) - cikanSayi) + " ");
            }
            System.out.println();//dumy
        }
    }
//1
//2 6    6= 2+ (n-1)
//3 7 10   7=3+ (n-1) , 10=7+(n-2)
//4 8 11 13
//5 9 12 14 15  9=5+(n-1)   12 = 9+(n-2)  14=12+(n-3)   15 = 14+(n-4)
}
