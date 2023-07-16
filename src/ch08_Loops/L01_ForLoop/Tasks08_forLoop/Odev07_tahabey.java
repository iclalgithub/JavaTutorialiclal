package ch08_Loops.L01_ForLoop.Tasks08_forLoop;

public class Odev07_tahabey {
    public static void main(String[] args) {


        /*
         *
         * *
         * ! *
         * ! ! *
         * ! ! ! *
         * ! ! ! ! *
         * ! ! ! ! ! *
         * * * * * * * *

         */

        int i, j, k;
        for (i = 1; i <= 8; i++) {
            for (j = 8; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                if (i == 8) {
                    System.out.print(" *");
                } else {
                    if (k == i || k == 1) {
                        System.out.print(" *");
                    } else {
                        System.out.print(" !");
                    }
                }
            }
            System.out.println();//dumy
        }
    }
}

