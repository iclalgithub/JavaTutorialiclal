package ch13_ArrayList.Tasks13;

import java.util.Arrays;

public class Task07_alibey_arrayile {
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

        String[] isimler = {"Umit", "Emin", "Kemal", "Kerem", "Taylan", "Orhan", "Sinan", "Furkan", "Ahmet", "Ali"};
        System.out.print(" ilk hali"+ Arrays.toString(isimler));
        //Dizinin 3. elemanı ile 8 elemanının yerlerini değiştirme
        String temp = isimler [2];
        isimler [2]=isimler [7];
        isimler [7]=temp;
        //sonucu ekrana yazdırma

        System.out.println("dizinin 3. elemanı değiştirildi");

        for (String isim:isimler) {
            System.out.print(isim+" ");
        }

    }
}
