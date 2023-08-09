package ch28_Interface_Polymorphizm.Polymorphism.RunTime;

public class SportCar extends Vehicle{
    @Override
    void speedUpTo60mph() {
        System.out.println("Sport car is speeding up to 60in 3.2 seconds!");
    }
}
