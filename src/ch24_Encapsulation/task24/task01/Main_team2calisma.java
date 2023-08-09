package ch24_Encapsulation.task24.task01;

import java.util.Scanner;

public class Main_team2calisma {
    /* TODO
        Burada iki class vardır. Biri Main diğeri ise Subscribe.
        Subscribe class'ının içinde;
        Bu variables'ları private oluşturunuz.
        String name
        boolean doYouWanaSubscribe
        String whichMember
        3 tip memberShip(üyelik) seviyesi vardır. Gold, Silver ve Bronze (Altın, gümüş ve bronz)

    todo    Main class'ın içinde;
        Örnek;
        Name is Victoria, doYouWanaSubscribe true, whichMember Gold
        Eğer user(kullanıcı) Gold member(üye) olmak istiyorsa;
        Welcome to membership Victoria. Your membership is 40 dollar for month you can enjoy the videos ,
        all homework and see you soon. yazdırınız.

        Eğer user(kullanıcı) Silver member(üye) olmak istiyorsa;
        Welcome to membership Victoria. Your membership is 20 dollar for month you can enjoy the videos and all homework. yazdırınız.

        Eğer user(kullanıcı) Bronze member(üye) olmak istiyorsa;
        Welcome to membership Victoria. Your membership is 10 dollar for month you can enjoy the videos. yazdırınız.

        Eğer user(kullanıcı) member(üye) olmak istemiyorsa;
        See you when you want to be a member. Thanks yazdırınız.
             */
    public static void main(String[] args) {
        Subscribe_team2calisma sb = new Subscribe_team2calisma();
        //sb objesinin trürü Subscribe_team2calisma soldaki ilk yazdığımız
        //new Subscribe_team2calisma(); sağ tarafta Subscribe_team2calisma
        // constructor çağırılır ve  obje create ediliyor.
        //Constructor sınıfın adı ile aynı olmalı ve herhangi bir değer döndürmez


    }//main sonu

}//class sonu

class Subscribe_team2calisma {
    static Scanner input = new Scanner(System.in);
    private String name;
    private boolean doYouWannaSubscribe;
    private String whichMember;

    //kullanıcıdan isim girmesini istiyoruz
    //
    public void nameGirisi() {
        System.out.println("Adınızı giriniz");
        //String isim=input.nextLine();
        //önceden bu şekilde atama yapıyorduk. şimdi ise bu class'taki field'a
        //atama yapmak isityoruz
        //yani input olarak aldık onu saklamamız gerekiyor
        this.name = input.nextLine();
        //bu class'taki field'a name'i atayalım
    }

    public void subscribe() {
        //abone olup olmadığını sormak istiyoruz
        System.out.println("Abone o");
    }
}


