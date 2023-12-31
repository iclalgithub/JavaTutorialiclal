package ch20_Constructor;

public class C05_AracRunner_iclal {

    //Fields-> obj'nin uretilirken alacgı değer variables
    //bir class'da bir den çok cons tanımlanabilir
    /*   1) Constructor icinden baska bir Constructor cagirmak icin "this()"
    kullanirsaniz mutlaka ilk satira yazmalisiniz.
    Aksi takdirde Compile Time Error alirsiniz.
    2) Bir Constructor icinden sadece bir tane Constructor cagirisi
    yapabilirsiniz.Cunku iki tane cagri yaprsaz
    birisi ilk satirda olamayacaktir, bu da ilk kuralla celisir.
     */

    public static void main(String[] args) {

        C05_Arac_iclal arac= new C05_Arac_iclal();
        //new C05_Arac_iclal();
        //burda çalışır ama yeni create edilmez
        //sadece burda kod çalışmaz denilmez buna dikkat
        //
        /*2 pm li const calisti String ve int
        2 pm li pm calisti int ve String
        1 pm li const calisti
        pm siz const calisti
        */
        //Constructor içinde constructor call ettiğimiz için

        //çalışan constructor içinden obje create etmek

        System.out.println("arac.maxHiz = " + arac.maxHiz);
        C05_Arac_iclal arac2= new C05_Arac_iclal(120);
        System.out.println("arac2.maxHiz = " + arac2.maxHiz);
        System.out.println("arac2.model = " + arac2.model);



    }
}
