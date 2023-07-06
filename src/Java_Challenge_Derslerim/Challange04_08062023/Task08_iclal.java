package Java_Challenge_Derslerim.Challange04_08062023;

import java.util.Scanner;

public class Task08_iclal {

    /*  Task->
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik"  print eden code create ediniz
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("birinci ismi giriniz");
        String name1 = input.next().toUpperCase();
        System.out.println("ikinci ismi giriniz");
        String name2 = input.next().toUpperCase();

        int uzunluk1 = name1.length();

        if (uzunluk1 % 2 == 0) {
            //java derslerinde vardı bu kısım
            String yeniKelime = name1.substring(0,2)+name2+name1.substring(3);
            System.out.println("yeniKelime = " + yeniKelime);
        } else System.out.println("name1 cift sayili olmadigi icin ortasina yerlestiremedim");

    }


}
