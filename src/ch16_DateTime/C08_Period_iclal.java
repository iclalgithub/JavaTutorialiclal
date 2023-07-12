package ch16_DateTime;

import java.time.LocalDate;
import java.time.Period;

public class C08_Period_iclal {
    public static void main(String[] args) {
        //Period iki tarih arasindaki zamani tutar

        LocalDate bugun = LocalDate.now();

        LocalDate birthDay = LocalDate.of(1990 ,8 ,23 );

        Period fark = Period.between(birthDay, bugun);
        System.out.println("fark = " + fark); // fark = P 32Y 10M 13D

        System.out.println("bugun.compareTo(birthDay) = " + bugun.compareTo(birthDay)); //bugun.compareTo(birthDay) = 33
        System.out.println("Kendi doğum günüm");
        LocalDate birthDay2 = LocalDate.of(1988 ,12 ,23 );
        //fark = P34Y6M19D


        Period fark2 = Period.between(birthDay2, bugun);
        System.out.println("fark = " + fark2); // fark = P 32Y 10M 13D


        // task -> 2.5.2023 de (5.ayin 2 i) başlayan kurs 9 ay olduguna göre bitiş tarihini print eden code create ediniz
        LocalDate baslangic = LocalDate.of(2023,5,2);
        System.out.println("kurs başlangıcı = " + baslangic);

        Period period = Period.ofMonths(9);

        System.out.println("kurs bitişi = " + baslangic.plus(period));//baslangic.plus(period) = 2024-02-02
        // 2024-02-02 işe başlama tarihimiz : sunglasses:

        //kurs başlangıcı = 2023-05-02
        //kurs bitişi = 2024-02-02

    }
}
