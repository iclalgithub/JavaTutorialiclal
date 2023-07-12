package ch20_Constructor;

public class C01_Constructor_iclal {
    /*
   1- constructor ismi Class name ile aynı olmalı.Buyuk harf ile başlamalı
   2- constructor create eedildigğinde name den sonra () {} mutlaka kullanılmalı
   3- eger p'li cons. create edilirse java default cons ezer(siler)
   4- cons. return type olmaz method'dan ayıran özelliğidir.
   5-Class create edildiginde java default cons. kendi create eder.
    */
//fields
    String str; //instance variable
    String selam = "hello World"; //tercih edilmez bu ama yapılabilir

    //default constructor
    // public  C01_Constructor(){
    //
    // }

    public static void main(String[] args) {
        //main metot içinde obje create ettik
        C01_Constructor_iclal obj1 = new C01_Constructor_iclal();
        C01_Constructor_iclal obj2 = new C01_Constructor_iclal();
        C01_Constructor_iclal obj3 = new C01_Constructor_iclal();
        C01_Constructor_iclal obj4 = new C01_Constructor_iclal();

        System.out.println("obj1.str = " + obj1.str);
        //obj1'den field lara ulaştık
        System.out.println("obj1.selam = " + obj1.selam);
        //obje üzerinden yapılara fieldd lara variable lara ulaşabilirsiniz

        obj1.str = "JavAslan";
        obj2.str = "JavAtar";
        //önceden atama yapılmasa da sonradan yapılabilir bunu anladık:)

        System.out.println("obj1.selam = " + obj1.selam);

        System.out.println("obj1.str = " + obj1.str);
        System.out.println("obj2.str = " + obj2.str);
        System.out.println("obj4.str = " + obj4.str);

/*obj1.str = null
obj1.selam = hello World //obj1.selam başlangıç değerini alıyor- atama yapmadık
obj1.selam = hello World
obj1.str = JavAslan //JavAslan atadık
obj2.str = JavAtar //JavAtar atadık
obj4.str = null  //atama yapmadık
*/


        obj2.method();
        //object name ile static olmayan bir method call edildi
        // static olan main method icerisinden
        obj4.method();

       }

    public void method() {

        System.out.println("methodddan merhaba ");
    }


}
