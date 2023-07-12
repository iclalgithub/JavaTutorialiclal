package ch16_DateTime;

import java.time.LocalDate;

public class C07_ComparingDateTime_iclal_dogumgunu {
    public static void main(String[] args) {

        //bugünün tarihi
        LocalDate bugun = LocalDate.now();
        //dünün tarihi
        LocalDate dun = bugun.minusDays(1);
        //yarının tarihi
        LocalDate yarin =bugun.plusDays(10);
        //doğum günü
        LocalDate dogumGun = LocalDate.of(2000,2,29);

        System.out.println("bugun = " + bugun);
        System.out.println("dun = " + dun);
        System.out.println("yarin = " + yarin);
        System.out.println("dogumGun = " + dogumGun);

        System.out.println("bugun.isBefore(dun) = " +   bugun.isBefore(dun)); // bugun.isBefore(dun) = false
        System.out.println("bugun.isBefore(yarin) = " + bugun.isBefore(yarin)); /// bugun.isBefore(yarin) = true
        System.out.println("bugun.isAfter(yarin) = " +  bugun.isAfter(yarin));  //bugun.isAfter(yarin) = false

        System.out.println("dogumGun.isLeapYear() = " + dogumGun.isLeapYear()) ;//dogumGun.isLeapYear() = true

        int fark = bugun.compareTo(yarin);

        System.out.println("fark = " + fark);

        System.out.println("bugun.compareTo(dogumGun) = " + bugun.compareTo(dogumGun));


    }
}
