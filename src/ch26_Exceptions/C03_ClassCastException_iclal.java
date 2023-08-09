package ch26_Exceptions;

public class C03_ClassCastException_iclal {
    public static void main(String[] args) {

        // ClassCastException -> Biribirne dönüştürülemeyen data type'lar biribirine dönüştürüldüğünde oluşan
        // RTE Exception dur

        Object obj = "javadan sudan konusuyoruz";
        String str = (String) obj;
        //aslında parent class tanımlanmış String bir variable
        //String'e cast edildi
        System.out.println("str = " + str);

        Object sayi = 10;
        //String str2=(String) sayi;
        //System.out.println("str2 = " + str2);
        //ClassCastException - RTE
        //Exception in thread "main" java.lang
        try {
            String str2 = (String) sayi; //hatayı burda alcaz
        } catch (ClassCastException e) {
            System.out.println("integer değer String'e cast edilemez");
        }

        try {//try bloğu içinde hata olmazsa catch çalışmaz...
            String str3 = (String) sayi;
            System.out.println("bu kodu okuduysan kod hatasız çalışmıştır demektir");
        } catch (Exception e) {
            System.out.println("cast işlemi başarısız oldu");
        }

        System.out.println("bu kod çalışır mı?");
    }

}
