package ch22_Scope;

public class C02_StaticVariable_iclal {
    /*  instance variable'lar obje'ye bagimlidir ve her obje farkli degerler alabilir
   ogrenci notlari veya ogretmen branslari gibi
   bir objeye ait bir variable'in son degerini bulmak icin sadece o objeyi dikkate aliriz

  Static variabler ise class variable olarak tanimlanir
  ve tum class uyeleri icin aynidir. Okul ismi, okul mudurunun adi gibi
  eger static variable'in degeri degistirilirse herkes icin degisir.-> güneş misali

*/
    static String firmaName;
    static int firmaId;
    static boolean yerliMi;

    public static void main(String[] args) {
        System.out.println("firma ID"+firmaId);
        firmaId=1001;

        System.out.println("firma ID"+firmaId);
        C02_StaticVariable_iclal.firmaName="zararına satışlar";
        yerliMi=false;

        //
        staticmethod();

        C02_StaticVariable_iclal obj=new C02_StaticVariable_iclal();
        obj.nonstaticmethod();
    }

    private static void staticmethod() {
        System.out.println("static method çalıştı");
    }


    private  void nonstaticmethod() {
        System.out.println("static olmayan method çalıştı");
        firmaName="nefes";
        firmaId=3003;
    }


}
