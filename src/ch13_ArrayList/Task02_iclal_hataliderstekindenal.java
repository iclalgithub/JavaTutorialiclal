package ch13_ArrayList;

import java.util.ArrayList;

public class Task02_iclal_hataliderstekindenal {
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
        ArrayList<String> nameList = new ArrayList<>();

        for (int i = 0; i <str.length ; i++) {
            for (int j = 0; j <str.length ; j++) {
                nameList.add(str[i][j]);
            }
        }
        return nameList;
    }
}
