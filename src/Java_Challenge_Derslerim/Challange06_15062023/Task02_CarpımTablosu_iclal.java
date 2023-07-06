package Java_Challenge_Derslerim.Challange06_15062023;

public class Task02_CarpımTablosu_iclal {
    // KAT1 x DAİRE1 = 1
    // KAT1 x DAİRE2 = 2
    // KAT1 x DAİRE3 = 3
    // KAT1 x DAİRE4 = 4
    // KAT1 x DAİRE5 = 5
    // KAT1 x DAİRE6 = 6
    // KAT1 x DAİRE7 = 7
    // KAT1 x DAİRE8 = 8
    // KAT1 x DAİRE9 = 9
    // KAT1 x DAİRE10 = 10
    // Task-> Yukarıdaki çarpım tablosunu 10 a kadar print eden code create ediniz.

    // KAT=1'DEN 10 A KADAR GİDECEK
    //DAİRE DE HER KAT İÇİN 10 TANE GİDECEK

    public static void main(String[] args) {
        System.out.println("***BİRİNCİ ÇÖZÜM***");
        for (int kat = 1; kat <=10 ; kat++) {// outer lopp-> dış döngü-> kat tekrarı
            for (int daire = 1; daire <=10 ; daire++) {// inner lopp->iç döngü-> daire tekrarı
                System.out.println(kat+" x "+daire+" = "+(kat*daire));
            }
            System.out.println();
        }


        System.out.println("***İKİNCİ ÇÖZÜM***");
            for (int kat = 1; kat <=10 ; kat++) {// outer lopp-> dış döngü-> kat tekrarı
                for (int daire = 1; daire <=10 ; daire++) {// inner lopp->iç döngü-> daire tekrarı
                    System.out.print(kat+" x "+daire+" = "+(kat*daire)+" ");
                    //System.out.println();
                }
                System.out.println();
            }

    }
}


