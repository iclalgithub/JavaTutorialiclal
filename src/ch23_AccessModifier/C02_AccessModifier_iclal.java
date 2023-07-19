package ch23_AccessModifier;

public class C02_AccessModifier_iclal {
    public static void main(String[] args) {
        C01_AccessModifier_iclal obj1 = new C01_AccessModifier_iclal();

        // C01_AccessModifier_iclal obj2 = new C01_AccessModifier_iclal(25,55);
        //'C01_AccessModifier_iclal(int, int)' has private access in 'ch23_AccessModifier.C01_AccessModifier_iclal'
        obj1.defaultYas = 35;
        obj1.protectedYas = 66;
        obj1.publicYas = 55;
        System.out.println("obj1 = " + obj1);
        //pm siz const. dan selamlar
        //obj1 = C01_AccessModifier{privateYas=0, defaultYas=35, protectedYas=66, publicYas=55}
        obj1.protectedMethod();
    }
}
