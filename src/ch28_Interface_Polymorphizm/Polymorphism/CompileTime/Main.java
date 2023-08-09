package ch28_Interface_Polymorphizm.Polymorphism.CompileTime;

public class Main {
    public static void main(String[] args) {

        /**
         * Compile time Polymorphism (static polymorphism)
         * *method overloading
         */

        Calculation.sum(5,9);
        Calculation.sum(5,9,55);
        Calculation.sum(5.9,5,6);
        Calculation.sum(5.9,6.5,99.36);


        //sum of 2 integers: 14
        //sum of 2 integers: 69
        //sum of 3 doubles: 16.9
        //sum of 3 doubles: 111.76

        //Rumeysa hanimdan
        Calculation.subtract(100,54);
        Calculation.subtract(55,23,2);
        Calculation.subtract(99.6,56.4);
        //Zeynep hanimdan
        Calculation.subtract2(5,3);
        Calculation.subtract2(5,3,2);
        Calculation.subtract2(5.4,3.1);
        Calculation.subtract2(55.25,35.10,2.1);
    }
}
