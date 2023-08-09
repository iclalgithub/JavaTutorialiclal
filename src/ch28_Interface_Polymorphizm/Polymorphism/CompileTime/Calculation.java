package ch28_Interface_Polymorphizm.Polymorphism.CompileTime;

public class Calculation {
    public static void sum(int number1, int number2){
        System.out.println("sum of 2 integers: "+(number1+number2));
    }
    //overload
    public static void sum(int number1, int number2,int number3){
        System.out.println("sum of 2 integers: "+(number1+number2+number3));
    }
    //overload
    public static void sum(double number1, double number2){
        System.out.println("sum of 2 doubles: "+(number1+number2));
    }

    //overload
    public static void sum(double number1, double number2,double number3){
        System.out.println("sum of 3 doubles: "+(number1+number2+number3));
    }


    //TASK
    //Create substract method and use Polymorphism
    //3 veya 4 tane overload şeklinde yazılacak

    //Rumeysa hanımdan
    public static void subtract(int number1, int number2){
        System.out.println("2 integers farki" + (number1 - number2));
    }public static void subtract(int number1, int number2, int number3){
        System.out.println("3 integers farki" + (number1 - number2 - number3));
    }public static void subtract(double number1, double number2){
        System.out.println("2 double farki" + (number1 - number2));
    }

    //zeynep hanimdan
    public static void subtract2(double number1, double number2){

        System.out.println("subtract of 2 doubles : " + (number1- number2));
    }
    public static void subtract2(int number1, int number2){

        System.out.println("subtract of 2 integers : " + (number1- number2));
    }
    public static void subtract2(double number1, double number2, double number3){

        System.out.println("subtract of 3 doubles : " + (number1- number2- number3));
    }
    public static void subtract2(int number1, int number2, int number3){

        System.out.println("subtract of 3 integers : " + (number1- number2- number3));
    }

}








