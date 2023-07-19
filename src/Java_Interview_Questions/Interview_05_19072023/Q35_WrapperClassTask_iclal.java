package Java_Interview_Questions.Interview_05_19072023;

public class Q35_WrapperClassTask_iclal {
 /* Task->
     create a method that accepts an int
     and returns twice of that int
     overload this method with wrapper class: Integer

     int parametreli ve parametrenin 2 katını return eden method create ediniz.
     Bu methodu Wrapper class ile overload ediniz.
      */

    public static void main(String[] args) {

        int sayi=1453;
        tljMethod(sayi);
        Integer yas=48;//yaş değeri Wrapper class
        //body ler aynı parametrelerin tipleri farklı
        tljMethod(yas);
        tljMethod(571);

        //yazdıralım

        System.out.println("tljMethod(sayi) = " + tljMethod(sayi));
        System.out.println("tljMethod(yas) = " + tljMethod(yas));
    }

    private static int tljMethod(int sayi) {
        return sayi*2;
    }

    private static int tljMethod(Integer sayi) {
        return sayi*2;
    }


}
