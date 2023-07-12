package ch20_Constructor;

public class C05_Arac_iclal {
    int maxHiz;
    String model;

    public C05_Arac_iclal() {
        this(30);
        System.out.println("pm siz const calisti");
    }


    public C05_Arac_iclal(int i) { //1 pm li
        this(340, "Tesla");
        this.maxHiz = i;
        System.out.println("1 pm li const calisti");
    }


    public C05_Arac_iclal(int i, String marka) { //2 pm li
        this("AUDI", 400);
        System.out.println("2 pm li pm calisti int ve String");
        this.maxHiz = i;
        this.model = marka;
    }


    public C05_Arac_iclal(String marka, int i) { //2 pm li
        System.out.println("2 pm li const calisti String ve int");
        this.maxHiz = i;
        this.model = model;
    }


}
