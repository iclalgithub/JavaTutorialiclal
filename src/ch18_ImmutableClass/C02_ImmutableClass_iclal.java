package ch18_ImmutableClass;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class C02_ImmutableClass_iclal {
    public static void main(String[] args) {
        //Immutable
        LocalDate bugun= LocalDate.now();//immutable değişmez yani
        System.out.println("bugun = " + bugun);

        bugun.plusDays(5);//bugüne 5 gün ekle
        System.out.println("bugun"+bugun);

        LocalTime simdi=LocalTime.now();
        //
        System.out.println("simdi = " + simdi);
        simdi.plusHours(5);
        System.out.println("simdi = " + simdi);

        //Mutable
        Date date=new Date();
        //uğraştırıyor diye sevmiyor hoca - eskiymiş Date
        //genelde immutable kullanmayı tavsiye ediyor Java
        System.out.println("date = " + date);
        date.setTime(1213131313131L);
        System.out.println("date = " + date);


    }

}
