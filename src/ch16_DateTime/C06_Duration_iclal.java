package ch16_DateTime;

import java.time.Duration;
import java.time.LocalTime;

public class C06_Duration_iclal {
    public static void main(String[] args) {
        LocalTime gece= LocalTime.of(0,17);
        LocalTime gunduz = LocalTime.of(17,30);

        //İki time arasındaki fark alınacak
        Duration fark = Duration.between(gece,gunduz);

        //Duration fark = Duration.between(gunduz,gece); ikinci parametreye daha ilerdeki zaman yazilir
        System.out.println("fark = " + fark);
        //fark = PT17H13M
        //17 saat 13 dakika

        //fark olarak saniyeyi getir
        System.out.println("fark.getSeconds() = " + fark.getSeconds());
        //fark olarak saati getir
        System.out.println("fark.toHours() = " + fark.toHours());
        //fark olarak dakikayı getir
        System.out.println("fark.toMinutes() = " + fark.toMinutes());


    }
}
