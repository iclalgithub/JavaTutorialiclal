package ch08_Loops.L01_ForLoop.Tasks08_forLoop;

public class Odev02_iclal {

    public static void main(String[] args) {

        /*
        0 ile 100 arasındaki hem 5'e, hem de 4'e bölünebilen  sayıları print eden coode create edinz.


         */

        //Kodu aşağıya yazınız.


        for (int i = 0; i <= 100; i++) {
            if(i%5==0 && i%4==0){
                System.out.println("4 ve 5 e bölünebilen sayılar = " + i);
            }
        }

        System.out.println("***Farklı yaklaşım ile çözüm***");
        for (int i = 0; i <= 100; i++) {
            if(i%20==0){
                System.out.println("20 ye bölünebilen sayılar = " + i);
            }
        }



    }
}
