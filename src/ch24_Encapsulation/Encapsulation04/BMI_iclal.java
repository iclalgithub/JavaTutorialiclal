package ch24_Encapsulation.Encapsulation04;

import java.util.Scanner;

public class BMI_iclal {

    /* Task ->
1. step -> Bmı class fields -> name, age, weight,height: encapsulated
2. step -> getBMI() method -> bmi = weight/(height*height) return type olmalı
3. step -> getStatus() method -> bmi 18.5 ten kucukse zayif,
  25 ten kucukse normal,
  30 dan kucukse kilolu,
  30 ustu obez return type
4. step -> getter setter  constructor toString methodlari create ediniz
5. step -> runner class obj ile dataları print eden code create ediniz
 */

    private String name;
    private int age;
    private double weight;
    private double height;


    public BMI_iclal(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public double getBMI() {
        double bmi = weight / (height * height);
        return bmi;
    }

    public double getStatus() {
        double deger = getBMI();
        if (deger < 18.5) {
            System.out.println("zayıf");
        } else if (deger < 25) {
            System.out.println("normal");
        } else if (deger < 30) {
            System.out.println("kilolu");
        } else if (deger > 30)
            System.out.println("obez");
        return deger;
    }

    public BMI_iclal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "BMI{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

}//class sonu

//RUNNER CLASS BURAYA YAZINCA KENDİSİ OTOMATİK CLASS İÇİNDE CLASS
//CREATE ETTİ

class Runner_iclal {
    public static void main(String[] args) {
        BMI_iclal obj1 = new BMI_iclal("Adali", 35, 88.5, 1.60);
        System.out.println("obj1 = " + obj1);
        System.out.println("BMI test sonucunuz: \n isminiz" + obj1.getName() + "\n" +
                "durumunuz:" + obj1.getStatus() + "\n vücut kitle indexiniz:" + obj1.getBMI());
        //TASK BMI class daki 4 field i kullanicidan alarak
        // full pm li const. kullanarak obje olusturun ve print edin


        Scanner input = new Scanner(System.in);
        System.out.println("ismini giriniz");
        String name= input.nextLine();

        System.out.println("yaşınızı giriniz");
        int age= input.nextInt();

        System.out.println("kilonuzu giriniz");
        double weight= input.nextDouble();


        System.out.println("boyunuzu giriniz");
        Double height= input.nextDouble();


        BMI_iclal obj2= new BMI_iclal(name,age,weight,height);
        System.out.println("obj2.getName() = " + obj2.getName());
        System.out.println("obj2.getBMI() = " + obj2.getBMI());
        System.out.println("obj2.getStatus() = " + obj2.getStatus());

        //rümeysa hanım
        //Scanner input = new Scanner(System.in);
        //        BMI kisi = new BMI();
        //        System.out.println("isminiz");
        //        kisi.setName(input.nextLine());
        //        System.out.println("yasiniz");
        //        kisi.setAge(input.nextInt());
        //        System.out.println("kilonuz");
        //        kisi.setWeight(input.nextDouble());
        //        System.out.println("boyunuz");
        //        kisi.setHeight(input.nextDouble());
        //        System.out.println(kisi);

        //ali bey
        //public static void main(String[] args) {
        //        Scanner input = new Scanner(System.in);
        //
        //        System.out.print("ismini gir: ");
        //        String isim = input.nextLine();
        //
        //        System.out.print("yaş gir: ");
        //        int yas = input.nextInt();
        //
        //        System.out.print("kilonu gir: ");
        //        double kilo = input.nextDouble();
        //
        //        System.out.print("boyunu gir ");
        //        double boy = input.nextDouble();
        //
        //        BMI adam = new BMI(isim, yas, kilo,boy);
        //
        //        System.out.println("isim ":+ isim);
        //        System.out.println("yas: " + yas);
        //        System.out.println("kilo: " + kilo );
        //        System.out.println("boy: " + boy);


        //zeynep hanım
        // obj2 = new BMI();
        //        Scanner input = new Scanner(System.in);
        //        System.out.println("isim giriniz : ");
        //        String isim =input.next();
        //        obj2.setName(isim);
        //        System.out.println("yaş giriniz : ");
        //        int yas =input.nextInt();
        //        obj2.setAge(yas);
        //        System.out.println("kilonuzu giriniz");
        //        double kilo = input.nextDouble();
        //        obj2.setWeight(kilo);
        //        System.out.println("boyunuzu giriniz");
        //        double boy = input.nextDouble();
        //        obj2.setHeight(boy);
        //
        //        System.out.println("obj2 = " + obj2);

    }//main sonu
}//class sonu