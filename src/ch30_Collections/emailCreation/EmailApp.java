package ch30_Collections.emailCreation;

import java.util.Scanner;

public class EmailApp {
    private  String name;
    private  String lastName;
    private  String password;
    private  String department;
    private  String email;
    private  String emailSuffix="clarusway.com";
    private  int PasswordLength=12;

    public EmailApp() {
    }

    public EmailApp(String name, String lastName, String password, String department, String email, String emailSuffix, int passwordLength) {
        this.name = name;
        this.lastName = lastName;
        this.password = password;
        this.department = department;
        this.email = email;
        this.emailSuffix = emailSuffix;
        PasswordLength = passwordLength;
    }

    public EmailApp(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.password = setRandomPassWord(PasswordLength);
        System.out.println();
    }




    public String setRandomPassWord(int passwordLength){
        //buyukkucuk harf rakam olmalı

        String dataSource = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+
                "abcdefghijklmnopqrstuvwxyz"+
                "0123456789!@#$%^&*()-_=+[]{}|;:'\",.<>?";

        char [] password = new char [passwordLength];


        for (int i = 0; i < passwordLength; i++) {
            int random= (int) (Math.random()*dataSource.length());
            //her seferinde bir random değer alınacak
            //index olur bizim için bu int değeri

            password[i]=dataSource.charAt(random);

        }
return new String(password);

    }

    @Override
    public String toString() {
        return "EmailApp{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", department='" + department + '\'' +
                ", email='" + email + '\'' +
                ", emailSuffix='" + emailSuffix + '\'' +
                ", PasswordLength=" + PasswordLength +
                '}';
    }


public String setDepartment() {
    System.out.println("bu departmanlardan birini seç" +
            "1 Test Automation\n" +
            "2 Developer\n" +
            "2 Devops\n");

    Scanner input = new Scanner(System.in);
    int secim = input.nextInt();

    if (secim == 1) {
        return "Test Automation";
    } else if (secim == 2) {
        return "Developer";
    } else if (secim == 2) {
        return "Devops";
    } else return "hatalı girdin";
}




}

