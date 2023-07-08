package ch14_ForEachLoop;

import java.util.ArrayList;
import java.util.List;


public class C01_forEachLoop_iclal {
    public static void main(String[] args) {
         /*
        for-each loop for loop'un gelilmş halıdir.
        1. clean code- yazım kolaylığı
        2. code okuma kolaylıgı
        3. hata yapma riskini azaltır.
         */

        List<Integer> sayiList = new ArrayList<>(List.of(1, 2, 55, 65, 33, 35, 34, 72));

        System.out.println("***** TASK 01 *****");
        // task list elemanlarını ayrı satırlara print ediniz.

        for (int i = 0; i < sayiList.size(); i++) {
            System.out.println(sayiList.get(i));
            //i sadece bir sayı
            //indeks olarak kullanmak istersek get metodu ile çağıracağız
        }
        //'for' loop can be replaced with enhanced 'for'


        for (Integer each : sayiList) {
            System.out.println(each);
        } //non primitif kullanmak daha iyi
        //integer yerine Integer
        /*for (Integer integer : sayiList) {
            System.out.println(integer);
        }
        Integer--->lisitimizin data tipi
        integer---->variable name
        */


        System.out.println("***** TASK 02 *****");
        //task list elemanlarinın ilk 3 eleman hariç tek olanları print ediniz.
        //for (hangi listte dolanacaksak onun data type'ı'  variable ismi each,x vb.:  hangi listte dolanacaksak) {
        //if (x % 2 == 1){
        //    System.out.println("x = " + x);
        //}
        //}


        for (Integer x : sayiList.subList(3, sayiList.size())) {
            if (x % 2 == 1) {
                System.out.println("x = " + x);
            }
        }

        System.out.println("***** TASK 02 çözüm2  *****");
        //meryem hanım çözümü
        int n = 0;
        for (Integer sayi : sayiList) {
            n++;
            if (n <= 3) {
                continue;
            }

            if (sayi % 2 != 0) {
                System.out.println(sayi);
            }
        }

        System.out.println("***** TASK 03 *****");
        //task list elemanlarinın 2 ile 5 dahil indexler  arasındaki (2,3,4,5) elemanların toplamını  print ediniz.
        int toplam = 0;

        for (int a : sayiList.subList(2, 6)) {//2. index dahil 6. index dahil degil
            toplam += a;  // [2,6)
        }
        System.out.println("toplam = " + toplam);//toplam = 188

        System.out.println("***** TASK 03 çözüm 2-hatalı*****");
        //zeynep hanım
        int toplam2 = 0;
        int index = 0;
        for (Integer sayi : sayiList) {
            if (index >= 2 && index <= 5) {
                toplam += sayi;
            }
            index++;
        }

        System.out.println("Toplam: " + toplam2);

        System.out.println("***** TASK 03 çözüm 3-hatalı*****");
        //ali bey
        int toplam3 = 0;
        for (int i = 2; i <= 5; i++) {
            int sayi = sayiList.get(i);
            toplam += sayi;
        }
        System.out.println("Toplam: " + toplam3);
    }//main sonu

}//class sonu
