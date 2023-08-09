package ch27_Abstraction;

public abstract class Honda { //parent
    abstract void motor(); //abstract bir metot
    protected void sunroof(){
        System.out.println("panaromik cam tavan olsa harika seyir katar");
    }

    String name="Fatih bey";//abstract class da variable tanımlanabilir
    // abstract String name="Fatih bey";//abstract class da variable tanımlanabilir
    //variable abstract olamaz

    abstract void koltuk();
    abstract void kapi();


}
