package ch26_Exceptions.Error_GarbageCollector;

public class C03_GarbageCollector_iclal {

    protected void finalize(){
        System.out.println("object is garbage collector");
    }

    public static void main(String[] args) {
        C01_Error_GarbageCollector_iclal s1=new C01_Error_GarbageCollector_iclal();
        C01_Error_GarbageCollector_iclal s2=new C01_Error_GarbageCollector_iclal();

        s1=null;
        s2=null;


        System.gc();//garbage collector çalışacağını kesinleştirmez

        //yani Jvm System.gc() komutu ile
        // finalize methodu tetiklendi
        // ve null atanan değerler temizlendi değil mi hocm
        //ahmet bey

    }
}
