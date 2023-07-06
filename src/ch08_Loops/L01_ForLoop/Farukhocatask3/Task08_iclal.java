package ch08_Loops.L01_ForLoop.Farukhocatask3;

public class Task08_iclal {
    public static void main(String[] args) {
/*
        task-> girilen boyutta kare çarpım tablosu print eden code create ediniz
          Örnek Ekran çıktısı
       1  2  3  4  5
       2  4  6  8 10
       3  6  9 12 15
       4  8 12 16 20
       5 10 15 20 25

       5x5
         */
        // Scanner input = new Scanner(System.in);
        // System.out.print("satır sütun sayısı giriniz : ");
        //  int n = input.nextInt();
        System.out.println("***Birinci Satır***");
        int n = 5;
        for (int i = 1; i <= 1; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + " ");
            }
        }
        System.out.println("\n***İki Satır***");
        int n2 = 5;
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + " ");
            }

        }
        System.out.println("\n***İki Satır araya boşluk eklendi***");

        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }

        System.out.println("\n***Problemde istenilen code***");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }

        System.out.println("\n***Faruk hoca çözümü***");
        int boyut = 5;
        int n3 = 5;
        for (int i = 1; i <= n3; i++) {
            for (int j = 1; j <= n3; j++) {
                System.out.println("i=" + i + "   j=" + j);
            }
            System.out.println("   " + i + ". tur bitti");
        }

    }
}
