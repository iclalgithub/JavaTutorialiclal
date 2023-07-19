package ch24_Encapsulation.encapsulation01;

public class C01_Encapsulation_iclal {
    public static void main(String[] args) {
        C02_Encapsulation_iclal obj1=new C02_Encapsulation_iclal();
        System.out.println("obj1.getId() = " + obj1.getId());//obj1.getId() = 0
        //default
        System.out.println("obj1.getName() = " + obj1.getName());
        //atama yapılmadığı için default değer

        C02_Encapsulation_iclal obj2=new C02_Encapsulation_iclal(1001,"Rumeysa Hanim");

        System.out.println("obj2.getId() = " + obj2.getId());
        System.out.println("obj2.getName() = " + obj2.getName());

        obj1.setName("Şafak Hanım");
        System.out.println("obj1.getName() = " + obj1.getName());
        obj2.setName("Furkan Bey");
        System.out.println("obj1.getName() = " + obj2.getName());

    }


}
