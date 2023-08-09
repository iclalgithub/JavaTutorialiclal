package ch25_Inheritance.Overriding;

public class Cat extends Pet { // cat class i Pet class in child idir
    public Cat() {
        super();
        System.out.println("kediler psikolojiye iyi gelir");
    }
    public void mirmir(){
        System.out.println("kediler mirmir la sizin moralinizi duzeltir");
    }

    public Cat(String str) {
        this();
        System.out.println(super.number);//34
        System.out.println(this.number); //22
        System.out.println("kediler psikolojiye iyi gelir");
    }


    int number = 22;
    int age = 11;
    int numberOfCats = 50;

    //cat objesini yazdırırken number , age ve  numberOfAnimals gelecek
    //ama biz istiyoruz ki  cat objesine bağlı parent 'taki variable lar da gelsin


    @Override
    public void icme() {
        //super.icme();
        //içeriğini değiştirebiliriz
        System.out.println("override edilmiş cat'e göre icme methodu");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "number=" + number +
                ", age=" + age +
                ", numberOfAnimals=" + numberOfCats +" "+
                //istiyorum ki cat objesine bağlı parent 'taki variable lar da gelsin
                //parent'l alakalı variable'lar toSrting için ulaşmak istersek
                super.toString()+//super parent tan objenin değerlerini çekmek için super kullanılır
                '}';
    }
}
