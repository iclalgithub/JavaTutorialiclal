package ch13_ArrayList;

import java.util.ArrayList;

public class Task02_iclal {
    public static void main(String[] args) {
        /*TASK :
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        Ex : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
           Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
         */
        String[][] mdArray = {{"Ali", "Fatih", "Hasan"}, {"Derya", "Zeynep"}, {"Tommy"}};
        arrayConverToList(mdArray);


    }

    private static ArrayList<String> arrayConverToList(String[][] str) {//mdArray istediğimiz ismi verebiliyoruz
        //metodun içinde isim değiştirebiliriz
        //str yerine mdArray ya da başka isim verilebilir
        ArrayList<String> nameList = new ArrayList<>();

        for (int i = 0; i <str.length ; i++) {
            for (int j = 0; j <str[i].length ; j++) {//içerdeki her bir array
                //tek tek elemanlara ulaşmak istiyoruz
                //str[0].length---->3
                //str[1].length---->2
                //str[2].length---->1
                nameList.add(str[i][j]);//her bir i nin je inci elemanı
            }
        }
        System.out.println("nameList = " + nameList);
        //nameList = [Ali, Fatih, Hasan, Derya, Zeynep, Tommy]
        nameList.add("Zafer");
        System.out.println("nameList = " + nameList);
        //nameList = [Ali, Fatih, Hasan, Derya, Zeynep, Tommy, Zafer]
        return nameList;
    }
}
