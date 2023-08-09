package ch25_Inheritance.Inheritance;

public class Dog extends Pet{
    //Dog Pet'i parent aldı
    //Dog class'ı Pet class'ın child ıdır
    public Dog(){
        System.out.println("köpekler sadık hayvanlardır");
    }

    public void dogMethod(){
        System.out.println("dog classdan bir  method");
    }
}
