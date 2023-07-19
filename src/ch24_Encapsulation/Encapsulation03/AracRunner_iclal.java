package ch24_Encapsulation.Encapsulation03;

public class AracRunner_iclal {
    public static void main(String[] args) {
        Arac_iclal arac1= new Arac_iclal("Tesla","blue",900,-2023);

       // Arac_iclal arac2= new Arac_iclal();
        Arac_iclal arac2= new Arac_iclal("Audi","black",2000,-2015);

        //arac2.setMotor(800);

        //motor hacmi ya 4pm li constrcur ile ya da set metodu ile girilebilir
        //hem consta hem set de if koyalım
        Arac_iclal arac3=new Arac_iclal();
        arac3.setModel("Merso");
        arac3.setRenk("red");
        arac3.setMotor(800);
        arac3.setYil(1923);

        System.out.println("arac1 = " + arac1);
        System.out.println("arac2 = " + arac2);
        System.out.println("arac3 = " + arac3);

    }
}
