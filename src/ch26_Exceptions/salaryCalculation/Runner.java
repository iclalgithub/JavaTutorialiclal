package ch26_Exceptions.salaryCalculation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Employee employee=new Employee("Iclal hanım",12500,2333,12);
        System.out.println("employee.getName() = " + employee.getName());
        System.out.println(employee.getSalary());
        System.out.println(employee.tax());
        System.out.println(employee.bonus());
        System.out.println(employee.raiseSalary());

        System.out.println("employee"+employee);

        salaryCalculate();


    }

    private static void salaryCalculate() {
        Scanner input=new Scanner(System.in);
        System.out.println("isminizi giriniz");
        String name=input.nextLine().trim();

        int salary=0;
        int workHours=0;
        int year=0;

        System.out.println("maaşınızı giriniz");
        try {//integer bekliyoru zharf girdi
             salary=input.nextInt();//int kaldır başında
        } catch (InputMismatchException e) {
            System.out.println("hatalı giriş yaptın tekrar dene");
            salaryCalculate();
        }

        System.out.println("çalışma saatini giriniz");
        try {//integer bekliyoru zharf girdi
             workHours=input.nextInt();//int kaldır başında
        } catch (InputMismatchException e) {
            System.out.println("hatalı giriş yaptın tekrar dene");
            salaryCalculate();
        }

        System.out.println("işe başlama yılını giriniz");
        try {//integer bekliyoru zharf girdi
             year=input.nextInt();//int kaldır başında
        } catch (InputMismatchException e) {
            System.out.println("hatalı giriş yaptın tekrar dene");
            salaryCalculate();
        }

        //Parametreli constructordan obj create ederek sout içinde yazdıralım


        Employee employee =new Employee(name,salary,workHours,year);

        System.out.println("employee.getName() = " + employee.getName());
        System.out.println(employee.getSalary());
        System.out.println(employee.tax());
        System.out.println(employee.bonus());
        System.out.println(employee.raiseSalary());

        System.out.println("employee"+employee);


    }
}
