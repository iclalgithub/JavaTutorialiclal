package ch20_Constructor;

public class C05_Arac_iclal {
    int maxHiz; //instance variable lar
    String model;

    public C05_Arac_iclal() {
        this(30); //pm si int olan parametreli Constructor 'ı call ediyor

        System.out.println("pm siz const calisti");
    }


    public C05_Arac_iclal(int i) { //1 pm li
        this(340, "Tesla");//1.pm si int 2. pm si string olan 2 pm li constructor call eder
        this.maxHiz = i; //bu class daki maxHiz variable 'ina i değerini atar
        System.out.println("1 pm li const calisti");
    }


    public C05_Arac_iclal(int i, String marka) { //2 pm li
        this("AUDI", 400);
        System.out.println("2 pm li pm calisti int ve String");
        this.maxHiz = i;//yine bu class daki maxHiz variable 'ina i değerini atar
        //ekleme yok son i değeri neyse onu alıyor
        this.model = marka;
    }


    public C05_Arac_iclal(String marka, int i) { //2 pm li
        System.out.println("2 pm li const calisti String ve int");
        this.maxHiz = i;//yine bu class daki maxHiz variable 'ina i değerini atar
        this.model = marka;//yine bu class daki model variable 'ina marka değerini atar

    }


}
