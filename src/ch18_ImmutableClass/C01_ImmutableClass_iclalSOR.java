package ch18_ImmutableClass;

public class C01_ImmutableClass_iclalSOR {
    public static void main(String[] args) {
        String str1="kahve";
        //String literal ile oluşturulan String variable
        //String Constant POOL da tutulur.
        String str2="kahve";
        //bunlar bellek yönetimi için aynı yerde tutulur

        String str3=new String("kahve");
        String str4=new String("kahve");
        //objelerde referanslar farklı olduğu için farklı alırız
        //equals ile  denesek false çıkar

        System.out.println("karşılaştırma 1");
        if(str1.equals(str2)){
            System.out.println("str1 ve str2 eşit");
        }else{
            System.out.println("str1 ve str2 eşit değildir");
        }


        //SOR?????
        //s1=s2
        //s3=s4
        //burda s3 s4'e eşit çıkmaz demişti hoca ama kodda öyle çıkmadı!!!


        System.out.println("karşılaştırma 2");

        if(str3.equals(str4)){
            System.out.println("str3 ve str4 eşit");
        }else{
            System.out.println("str3 ve str4 eşit değildir");
        }

    }
}
