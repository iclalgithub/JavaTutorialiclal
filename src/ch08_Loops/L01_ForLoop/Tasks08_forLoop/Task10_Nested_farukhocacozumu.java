package ch08_Loops.L01_ForLoop.Tasks08_forLoop;

public class Task10_Nested_farukhocacozumu {
    public static void main(String[] args) {
         /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli yazdırınız
        */



        //FARKLI ŞEKİL
        System.out.println("Birinci Çözüm");
        char karakter = 65;
         for (int i = 0; i <= 5; i++) {//satır
            for (int j = 0; j <= i; j++) {//sütun --i kadar dönsün
                System.out.print((char)(i+karakter)+" ");//j+
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("İkinci Çözüm");
        //TASK ın çözümü
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(i+karakter)+" ");//i
            }
            System.out.println();
        }

        System.out.println();

        //HOCANIN ÇÖZÜMÜ
        System.out.println("Üçüncü Çözüm");
        int harf=65;
        for (int i = 0; i < 6 ; i++) {

            for (int j = 0; j <= i ; j++) {//yine icteki loop a i kadar calis dedik
                System.out.print( (char) ( harf + i )+" ");// i yi j kadar yazdirdi ayni satira. hep i yi yazdik


            }
            System.out.println();
        }

        //FARKLI ŞEKİL
        System.out.println();
        System.out.println("Dördüncü Çözüm");
        //TASK ın çözümü
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(j+karakter)+" ");//i
            }
            System.out.println();
        }




    }
}

