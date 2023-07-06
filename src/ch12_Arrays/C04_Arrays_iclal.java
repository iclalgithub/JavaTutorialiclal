package ch12_Arrays;

import java.util.Arrays;

public class C04_Arrays_iclal {
    public static void main(String[] args) {
        //Array eşitilk kontrolu... equals()-> methodu index ve value kontrolu yapar ve true/false return eder

        int sayi1[] = {39, 3, 72, 63, 84};
        int[] sayi2 = {84, 72, 63, 3, 39};

        //Arrays.equals(sayi1,sayi2)

        System.out.println("Arrays.equals(sayi1,sayi2) = " + Arrays.equals(sayi1, sayi2));
        //Arrays.equals(sayi1,sayi2) = false
        Arrays.sort(sayi1);
        Arrays.sort(sayi2);

        System.out.println("Arrays.equals(sayi1,sayi2) = " + Arrays.equals(sayi1, sayi2));
        //Arrays.equals(sayi1,sayi2) = true

        System.out.println((sayi1[0] == sayi2[0])); //true

        String str = Arrays.toString(sayi1); //burda atama yaptık bir değer atadık.
        //str burda string oldu array değil artık!!!!!!
        System.out.println("str = " + str); //değerleri alırız..
        //str = [3, 39, 63, 72, 84]

        //konsolda aynı value görürsünüz.ama işleme tabi tuttuğunuzda
        //DİKKAT BURASI KARIŞIYORMUŞ!!!!!
        System.out.println("Arrays.toString(sayi1) = " + Arrays.toString(sayi1));
        //Arrays.toString(sayi1) = [3, 39, 63, 72, 84]  //
        //burda string ama atama yapmadan yazdırdık
        //elimizde değil bu her zaman yazdırmamız gerekecek.


        System.out.println("str = " + str); // str = [3, 39, 63, 72, 84]





    }
}
