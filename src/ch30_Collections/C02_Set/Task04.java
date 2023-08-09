package ch30_Collections.C02_Set;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Task04 {

    public static void main(String[] args) {

        //treeSet ve HashSet e 100 adet random deger ekleyin
        //ve surelerini kiyaslayin
        //hashset ten set olusturup eleman ekleyip bunu tree set e cevirin


       long startTimeHashSet= System.nanoTime();
       //system class'ından current time nanotime
       //long gönderiyor
       //time'mızı alıyoruz
        //hashset'in başlangıcı


       HashSet <Integer>  hashSet = new HashSet<>();
       //hashset oluşturalım

       Random random = new Random();
       //Random class'tan random objesini create ediniz

        for (int i = 0; i <100 ; i++) {
            hashSet.add(random.nextInt(1000));//0 ile 999 arasi bir deger ekler
        }
        //her döndüğünde hashset'e random değer eklenir

        long endTimeHashSet= System.nanoTime();
        //hashset'in bitişi
        //system nano time'ı alıyoruz


        System.out.println("endTimeHashSet-startTimeHashSet = " + (endTimeHashSet - startTimeHashSet));
        System.out.println("hashSet = " + hashSet);


        //aynısını treeset için yapıyoruz
        //sadece setlerin ismini değiştiriyoruz
        //random değer treeset'e eklenir

        long startTimeTreeSet= System.nanoTime();


        TreeSet <Integer>  treeSet = new TreeSet<>();

        for (int i = 0; i <100 ; i++) {
            treeSet.add(random.nextInt(1000));//0 ile 999 arasi bir deger ekler
        }
        long endTimeTreeSet= System.nanoTime();

        System.out.println("endTimeTreeSet-startTimeTreeSet = " + (endTimeTreeSet - startTimeTreeSet));


        TreeSet <Integer>  treeSet2 = new TreeSet<>(hashSet);

        System.out.println("treeSet2 = " + treeSet2);


    }
}
