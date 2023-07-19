package ch24_Encapsulation.encapsulation02;

public class UserRunner_iclal {
    public static void main(String[] args) {
        User_iclal obj1 = new User_iclal("ali", "veli", "1234", 23);
        System.out.println("obj1.getAd() = " + obj1.getAd());
        System.out.println("obj1.getSoyad() = " + obj1.getSoyad());
        System.out.println("obj1.getPassword() = " + obj1.getPassword());
        System.out.println("obj1.getPassword() = " + obj1.getPassword());

        //obj1.getAd() = ali
        //obj1.getSoyad() = veli
        //obj1.getPassword() = 1234
        //obj1.getPassword() = 1234


    }
}
