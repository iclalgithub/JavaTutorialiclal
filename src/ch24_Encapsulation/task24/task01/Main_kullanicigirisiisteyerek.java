package ch24_Encapsulation.task24.task01;

public class Main_kullanicigirisiisteyerek {

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
            // Kullanıcıdan giriş alarak Subscribe nesnesi oluştur
            Subscribe_kullanicigirisiisteyerek subscribe = Subscribe_kullanicigirisiisteyerek.createSubscriptionFromUserInput();

            // Üyelik oluştur ve mesajı yazdır
            subscribe.createMembership();
        }

}