package ch28_Interface_Polymorphizm.Polymorphism.RunTime;

public class DemoVehicle {

    public static void main(String[] args) {
        /*
        Run time Polimorphism (Dynamic Polly.)
         Method Overriding
         */
    Vehicle vehicle1=new Vehicle();
    Vehicle vehicle2=new SportCar();
   // Vehicle vehicle3=new Truck();
//burda hata var ders notlarından kontrol ett!!!!!

        //truck kontrol edilecek

    vehicle1.speedUpTo60mph();//vehicle
    vehicle2.speedUpTo60mph();//sport
    //vehicle3.speedUpTo60mph();//truck

//extend edip parent child ilişkisi kurup,
// parentteki methodu child de bir de override
// edersek, mainde de polymorphism ile obje
// create edince methot child classdan geliyor
// tabi obje de poly ile sport dan create edilmeli


    }
}
