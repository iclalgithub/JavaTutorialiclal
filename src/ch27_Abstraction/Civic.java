package ch27_Abstraction;

public class Civic extends Lastik{

    //abstract olmayan =concrete

    //sadece lastikEbat değil HOnda nın içindeki metotları da
    //implement etmek zorundayız

    /**
     *extend Lastik yazılarak Lastik class a concrete bir class
    tanımlandı
     Java CTE verdi
     çözüm olarak
     a--->unimplememt methodlar implement edilmeli
     b--->parent lastik class dan abstract keyword kaldırılmaı
     c--->concreate olan child Civic class abstarct edilmeli
     **/


    //soru:abstarct class da abstract method tanımlanabilir---evet
    //soru:concrete class da abstarct method tanımlanamaz.---hayır
    @Override//implement edilen abs method
    void motor() {
        System.out.println("civic için ideal motor 1.6");
    }

    @Override//implement edilen abs method
    void koltuk() {
        System.out.println("koltuklar kadife kumaş");
    }

    @Override//implement edilen abs method
    void kapi() {
        System.out.println("4 kapı uzun kasa");
    }

    @Override//implement edilen abs method
    public void lastikEbat() {
        System.out.println("lastikler 18 inç");
    }


    public int vites(){
        return 6;
    }
}
