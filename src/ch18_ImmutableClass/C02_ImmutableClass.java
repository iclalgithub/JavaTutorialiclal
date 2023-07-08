package ch18_ImmutableClass;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class C02_ImmutableClass {
    public static void main(String[] args) {
        //Immutable
        LocalDate bugun= LocalDate.now();
        System.out.println("bugun = " + bugun);

        bugun.plusDays(5);
        System.out.println("bugun"+bugun);

        LocalTime simdi=LocalTime.now();
        System.out.println("simdi = " + simdi);
        simdi.plusHours(5);
        System.out.println("simdi = " + simdi);

        //Mutable
        Date date=new Date();
        System.out.println("date = " + date);
        date.setTime(1213131313131L);
        System.out.println("date = " + date);


    }

}
