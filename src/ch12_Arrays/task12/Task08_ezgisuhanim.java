package ch12_Arrays.task12;

import java.util.Scanner;

public class Task08_ezgisuhanim {

    public static void main(String[] args) {

    /*
    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol eden method create ediniz

    Test Data:
    2017

    Beklenen Çıktı:
    false
    */
        Scanner input = new Scanner(System.in);

        System.out.println("yıl gir");
        int yil = input.nextInt();

        System.out.println("artikYil(yil) = " + artikYil(yil));


    }

    private static boolean artikYil(int yil) {
        boolean artikYilMi = false;
        if((yil % 4 == 0 && !(yil%100 == 0)) || ((yil % 100 == 0 && yil % 400 == 0))) {
            artikYilMi = true;

        }

        return artikYilMi;

    }
}


