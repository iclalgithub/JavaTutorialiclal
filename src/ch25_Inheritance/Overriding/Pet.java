package ch25_Inheritance.Overriding;

//import ch25_Inheritance.Inheritance.Animal;
//inheritance daki animala bağlanmaya çlışıtığı
//için hata veriyor
public class Pet extends Animal {


    public Pet(){
        System.out.println("pet den selamlar petshop her türlü bakım yapılır");
    }

    public void beslenme(){
        System.out.println("mama ile besleyin kuru ekmek vermeyin");
    }

    public void uyuma(){
        System.out.println("uygun ortamlarda uyutun");
    }
    // @Override
    // protected void hareket() { //burda protected yapamıyoruz neden?
    //CTE
    //'hareket()' in 'ch25_Inheritance.Inheritance.Pet' clashes with 'hareket()'
    // in 'ch25_Inheritance.Inheritance.Animal'; attempting to assign weaker access
    // privileges ('protected'); was 'public
    //   super.hareket();
    // }

    //OVERRIDE EDİLİRSE override edilen yerden
    //YOKSA PARENT TAN otomatik gelecek!!!!!
    @Override
    public void icme() {
        //SOR???
        //parent class da acces mod. protected
        //child da access mod. level yükseltildi
        //super.icme();

        System.out.println("overriding icme methodu pet classtan");
    }

    private void privateMethod(){
        //private olunca miras alınamaz
        System.out.println("pet class ın private metodu");
    }


    int number=104;
    int age=101;
    int numberOfPets=202;

    @Override
    public String toString() {
        return "Pet{" +
                "number=" + number +
                ", age=" + age +
                ", numberOfPets=" + numberOfPets +
                '}';
    }
}
