package ch08_Loops.L03_DoWhileLoop.Tasks08_doWhileLoops;

public class Task02 {

    public static void main(String[] args) {
        //Task-> girilen baslangic ve bitis karakterleri dahil
        // aradaki tum karakterleri prnt eden code create ediniz
        //Faruk hoca paylaştı çözümlü

        char baslangic='f';
        char bitis='m';

        do {
            System.out.print(baslangic + " ");
            baslangic= (char)(baslangic+1);

        }while(baslangic<=bitis);
    }
}
