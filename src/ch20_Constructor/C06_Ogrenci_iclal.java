package ch20_Constructor;

public class C06_Ogrenci_iclal {
    //fields
    String isim="Zeynep hanim";
    int yas;
    String name;
    int age;

    public C06_Ogrenci_iclal(String isim,int i) {
        //this.isim = isim;
        //this.yas=yas;
        //this leri yoruma aldığımız için zeynep hanım
        // (yani default değer) olur diye düşünmüştüm ben

        isim=isim;
        yas=yas;

        name=isim;
        age=yas;

        System.out.println("pojo için isim+"+isim);
        System.out.println("pojo için this.isim+"+this.isim);
        System.out.println("pojo için name+"+name);
    }

    public C06_Ogrenci_iclal() {
    }


}
