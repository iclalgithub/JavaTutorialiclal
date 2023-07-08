package ch13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Task01_iclal {
    /* TASK :

     * Input olarak verilen listteki isimlerden
     * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
     *
     * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
     * OUTPUT : [Veli,Omer]
     */

    //1-List create
    //2-for loop
    //3-get()
    //4-contains
    //5-if
    //6-remove
    //70
    public static void main(String[] args) {

        ArrayList <String> names = new ArrayList<>(List.of("Ali","Serap","Zeynep","Fuat"));
        ArrayList <String> newNames = new ArrayList<>();
        //a olmayanları ilk listte tespit edip
        //yeni liste eklemek amacımız

        System.out.println("names = " + names);//names = [Ali, Serap, Zeynep, Fuat]

        for (int i = 0; i < names.size(); i++) {
            if(!names.get(i).toLowerCase().contains("a")){
                //i ile hepsini dolaşın get metodu ile
                //tolowercase bütün i'ler hepsi tüm karakterler getirecek
                //exculamation !!!!
                //a harfi olmayanlar
                newNames.add(names.get(i));
                //a harfi olmayanları new liste ekledik
            }
        }

        System.out.println("newNames = " + newNames);//newNames = [Zeynep]
        names.clear();
        //names listini boşalttık
        System.out.println("names = " + names); // names = []
        names.addAll(newNames);
        //hepsi names'e eklemiş olduk
        System.out.println("names = " + names);//names = [Zeynep]


    }
}
