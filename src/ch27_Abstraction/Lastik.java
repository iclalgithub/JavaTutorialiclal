package ch27_Abstraction;

public abstract class Lastik extends Honda{
    //interface ve abstarct class lar birbirini override etmek zorunda değiller

    //Override (Geçersiz Kılma): Alt sınıf,
    // üst sınıfta zaten tanımlı olan bir
    // yöntemi aynı isimle ve imzayla yeniden
    // tanımlayarak (override) kendi ihtiyacına
    // göre değiştirebilir.

    public  abstract void  lastikEbat(); //abs metot

    public void kisLastik(){
        System.out.println("nisandan sonra kullanılmaz");
    }


}
