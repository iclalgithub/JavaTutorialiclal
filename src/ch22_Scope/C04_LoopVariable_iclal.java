package ch22_Scope;

public class C04_LoopVariable_iclal {

    public static void main(String[] args) {
        int yas=33;
        System.out.println("yas = " + yas);
        for (int i = 0; i < yas; i++) {
            System.out.println("yas = " + yas);
            int mass=30000;
        }//loop sonu
        C01_InstanceVariable_iclal obj =new C01_InstanceVariable_iclal();
        System.out.println("obj.name = " + obj.name);
        System.out.println("obj.tecrube = " + obj.tecrube);

        //C01_InstanceVariable_iclal.sta
        //C01 tam yazılı değil diye burda kaldım eklenecek
        //!!!!!!


        //CTE sout(maas)
    }//main sonu
}
