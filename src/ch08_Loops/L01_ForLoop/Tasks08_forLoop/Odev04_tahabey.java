package ch08_Loops.L01_ForLoop.Tasks08_forLoop;

public class Odev04_tahabey {

    public static void main(String[] args) {



//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
            int cikanSayi = 0;
            for (int j = 1; j < i; j++) {
                cikanSayi += j;
                System.out.print(((i + (j * 5)) - cikanSayi)+" ");
            }
            System.out.println();//dumy
        }
    }
}