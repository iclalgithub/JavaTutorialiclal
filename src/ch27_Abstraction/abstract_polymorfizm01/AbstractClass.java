package ch27_Abstraction.abstract_polymorfizm01;

public class AbstractClass {

    public static void byLinkText(){//concrete method

        System.out.println("Link text super");

    }
    public void get(){//concrete method

        System.out.println("chrome");

    }

    void absMethod() {

    }

}

class Test extends AbstractClass{

    public static void byLinkText(){//concrete method

        System.out.println("Link text sub class");

    }
    public void get(){//concrete method

        System.out.println("firefox");

    }



    @Override
    void absMethod() {

        System.out.println("abs method override edildi");

    }

    public static void  test(){

        System.out.println("test method");
    }

    public static void main(String[] args) {

        Test.byLinkText();
        AbstractClass.byLinkText();

        AbstractClass obj =new Test();//polymorfizm kullanılarak create edilen obje
        //classtan create edileceksin ama senin data type ın AbstractClass
        obj.absMethod();
        obj.get();


    }
}

