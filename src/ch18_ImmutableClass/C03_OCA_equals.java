package ch18_ImmutableClass;

public class C03_OCA_equals {
    public static void main(String[] args) {
        String a="";
        String c="2cfalse";

        a+=2;
        a+='c';
        a+=false;
        System.out.println("a = " + a);

        String b="2cfalse";
        System.out.println("b = " + b);

        if (a==b){ //String values are compared using '==', not 'equals()'
            System.out.println("a==b çalışır");
        }
        //if bloğu çalışmadı
        //bu şart çalışmaz çünkü referans değerleri farklı


        if(a=="2cfalse") {//String values are compared using '==', not 'equals()'
            System.out.println("a==2cfalse çalışır");
        }
        //referans yokki kıyas yapsın

        if(c==b) {
            System.out.println("c==b çalışır");
        }
        //çalışır aynı ref ve String pool da tutulduğu için

        if(a.equals("2cfalse")){
            System.out.println("a equals 2c false");
        }

    }
}
