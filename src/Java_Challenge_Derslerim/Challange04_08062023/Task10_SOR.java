package Java_Challenge_Derslerim.Challange04_08062023;

public class Task10_SOR {


    // Task-> "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde print eden code create ediniz.

    public static void main(String[] args) {
        String eskiKelime1="   Java ogrenmek123 Cok guzel@ ";
        String eskiKelime2="   Java ogrenmek123 Cok guzel@ ";
        String eskiKelime3="   Java ogrenmek123 Cok guzel@ ";
        String eskiKelime4="   Java ogrenmek123 Cok guzel@ ";
        String eskiKelime5="   Java ogrenmek123 Cok guzel@ ";
        String eskiKelime6="   Java ogrenmek123 Cok guzel@ ";
       // String eskiKelime7="   Java ogrenmek123 Cok guzel@ ";

        System.out.println("eskiKelime= " + eskiKelime1);

        //Sayılar olmasın
        System.out.println("***sadece tum rakamları çıkar \\d ile****");
        eskiKelime1 = eskiKelime1.replaceAll("\\d", "");
        System.out.println("yeniKelime= " + eskiKelime1);
        //Sadece sayılar olsun
        System.out.println("***sadece sayıları göster \\D ile****");
        eskiKelime2 = eskiKelime2.replaceAll("\\D", "");
        System.out.println("yeniKelime= " + eskiKelime2);// 13.99
        //Sadece özel karakterler olsun
        System.out.println("***sadece özel karakterleri göster \\w ile****");
        eskiKelime3 = eskiKelime3.replaceAll("\\w", "");
        System.out.println("yeniKelime= " + eskiKelime3);
        //Sadece sayılar olsun
        System.out.println("***sadece tüm özel karakterleri çıkar \\W ile****");
        eskiKelime4 = eskiKelime4.replaceAll("\\W", "");
        System.out.println("yeniKelime= " + eskiKelime4);
        //Sadece boşluk??
        System.out.println("***boşluk \\s ile****");
        eskiKelime5 = eskiKelime5.replaceAll("\\W", "");
        System.out.println("yeniKelime= " + eskiKelime5);
        //Sadece boşluk??
        System.out.println("***boşluk \\S ile****");
        eskiKelime6 = eskiKelime6.replaceAll("\\W", "");
        System.out.println("yeniKelime= " + eskiKelime6);



        //TASK YAPALIM ---KARIŞTI---
        String eskiKelime7="   Java ogrenmek123 Cok guzel@ ";
        eskiKelime7= eskiKelime7.replaceAll("\\d", "");
        System.out.println("yeniKelime1= " + eskiKelime7);
        eskiKelime7 = eskiKelime7.replaceAll("\\W", "");
        System.out.println("yeniKelime2= " + eskiKelime7);
        eskiKelime7=eskiKelime7.substring(0, 1) + eskiKelime7.substring(1).toLowerCase();
        System.out.println("Son hali= " + eskiKelime7);
        eskiKelime7 = eskiKelime7.replaceAll("\\d", "").replaceAll("\\W", "");
        System.out.println("Son hali= " + eskiKelime7);


    }

}
