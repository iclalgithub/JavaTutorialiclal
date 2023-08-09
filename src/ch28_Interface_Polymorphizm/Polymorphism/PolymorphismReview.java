package ch28_Interface_Polymorphizm.Polymorphism;

class A {//parent A

    public void methodA() {
        System.out.println("method A from A class");
    }

    public static void methodC() {
        System.out.println("method C from A class");
    }
    //EĞER METOT STATIC İSE CHILD'IN OVER RIDE ETMESİNE İZİN VERMEZ
    //yani çekemez demek istedim evet
    //çekmek istersek
    // //TASK
    //        //B CLASS INDAN METHOD C'Yİ CALL EDİN
    //        B.methodC();
    //eğer static değilse child'dan alır metodu
    //zaten override etmiş olur


}//class sonu


class B extends A {//child B

    public void methodA() {
        System.out.println("method A from B class");
    }

    public void methodB() {
        System.out.println("method B from B class");
    }

    public static void methodC() {
        System.out.println("method C from B class");
    }

}//class sonu

interface E {

}

abstract class C {

}

abstract class F implements E {

}

class D extends C implements E {

}


public class PolymorphismReview {
    public static void main(String[] args) {
        A obj = new B();

        obj.methodA();

        obj.methodC();

        //TASK
        //B CLASS INDAN METHOD C'Yİ CALL EDİN
        B.methodC();


        //B obj1 =new A();
        //B obj1 =(B)new A(); bu casting hatalı oluşturulmaz
        //olmaz
        //constructor parent ise child class data type olamaz
        //data type parent olur
        //constructur child olur
        //alışveriş metotları variable ları yukarıdan alıyoruz

        C obj2 = new D();


        E obj3 = new D();



    }
}
