package ch28_Interface_Polymorphizm.Polymorphism;


class Sekil {
    void ciz(){
        System.out.println("bir şekil çizeceksin");
    }

    void sekil(){
        System.out.println("bir şekil çizen metot");
    }
}//class sonu

class Daire extends Sekil {
    void ciz(){
        System.out.println("bir daire çizeceksin");
    }

    void daire(){
        System.out.println("bir daire çizen metot");
    }

}//class sonu

class Kare extends Sekil {
    void ciz(){
        System.out.println("bir kare çizeceksin");
    }

    void kare(){
        System.out.println("bir kare çizen metot");
    }

}//class sonu


public class C01_Polymorphism {
    public static void main(String[] args) {
        Sekil sekil =new Sekil();
        Sekil daire =new Daire();
        Sekil kare =new Kare();

        sekil.sekil();//bir şekil çizen metot
        sekil.ciz();  //bir şekil çizeceksin

        daire.ciz();
        daire.sekil();

        //daire.daire();
       //CTE verir
       // ((Daire) daire).daire();
        //her zaman çalışmayababilir

    }
}
