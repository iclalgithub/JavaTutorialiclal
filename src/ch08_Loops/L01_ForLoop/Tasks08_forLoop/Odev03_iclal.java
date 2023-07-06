package ch08_Loops.L01_ForLoop.Tasks08_forLoop;

public class Odev03_iclal {

    public static void main(String[] args) {

        /* İlk 10 doğal sayının toplamını hesaplamak için bir kod yazın.

         */
        int n=10;
        int toplam =0;
        int toplam2=0;

        for (int i = 1; i <= 10; i++) {
           toplam+=i;
        }
        System.out.println("toplam = " + toplam);

        //cozum 2
        toplam2=n*(n+1)/2;
        System.out.println("toplam2 = " + toplam2);


    }
}
