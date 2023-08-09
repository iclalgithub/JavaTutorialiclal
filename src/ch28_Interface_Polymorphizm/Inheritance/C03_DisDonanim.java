package ch28_Interface_Polymorphizm.Inheritance;

public interface C03_DisDonanim {//parent interface
    public abstract void kapi();
        //redundat gereksiz   public abstract
    void kaporta();
    String RENK="siyah"; //değiştirilemez final value
    //bu değer değitirilemez sadece kullanılır
    public default String sisLamp(){
        return "sisli havada otomatik çalışır";

    }


}
