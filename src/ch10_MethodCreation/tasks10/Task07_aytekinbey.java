package ch10_MethodCreation.tasks10;

public class Task07_aytekinbey {

    public static void main(String[] args) {

    /*
    Üç sayı arasındaki en küçük sayıyı bulan  method create ediniz

    Test data:
    12,24,34

    Beklenen Çıktı:
    12
    */


        int a = 12;
        int b = 24;
        int c = 34;



        enKucuk(a,b,c);



    }

    private static void enKucuk(int a, int b, int c) {
        System.out.println("Math.min(Math.min(a,b),c) = " + Math.min(Math.min(a, b), c));
    }


}

