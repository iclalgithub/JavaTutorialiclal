package Java_Interview_Questions.Interview_03_12072023;

import java.util.ArrayList;

public class Q14_CreateRandomList_SetList_halukhocailecozum {
    //Task->
    // int array list oluşturun 10 elemandan oluşmalı
    // random ekle isminde void bir metod oluşturun  ve parametresi int array list olsun.
    // bu metod array list içinde 0' dan 20 ye kadar değer atasın.
    // eğer çift sayı atarsa o elemanının yerine 111 yazsın
    // eğer çift sayı yoksa çift sayı yoktur mesajını versin.


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        randomEkle(list);

    }

    private static void randomEkle(ArrayList<Integer> list) {
        int ciftSayiAdedi = 0;
        for (int i = 0; i < 10; i++) {
            if ((int) Math.random() * 20 % 2 == 0) {
                list.add(111);
                ciftSayiAdedi++;
                //list.add( Math.random());
                list.add((int) Math.random()); //0-20 arası random sayı liste ekler
            }else{
                list.add((int) Math.random()*20);
            }
        }
        System.out.println("ciftSayiAdedi = " + ciftSayiAdedi);

    }


}