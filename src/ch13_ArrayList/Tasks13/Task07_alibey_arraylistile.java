package ch13_ArrayList.Tasks13;

import java.util.ArrayList;
import java.util.Arrays;

public class Task07_alibey_arraylistile {
    public static void main(String[] args) {
        /* TASK :
         * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
         */

        ArrayList< String> isimler =new ArrayList<>(Arrays.asList("Umit", "Emin", "Kemal", "Kerem", "Taylan", "Orhan", "Sinan", "Furkan", "Ahmet", "Ali"));
        System.out.println("isimler = " + isimler);
        //Dizinin 3. elemanı ile 8 elemanının yerlerini değiştirme
        String temp = isimler.get(2);
        String temp2 = isimler.get(7);
        isimler.set(7,temp);//hangi konuma ne koycaz
        isimler.set(2,temp2);//hangi konuma ne koycaz

        //sonucu ekrana yazdırma

        System.out.println("dizinin elemanı değiştirildi");

        System.out.println("isimler = " + isimler);

    }
}
