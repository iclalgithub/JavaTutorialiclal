package ch08_Loops.L02_WhileLoop;

public class C01_WhileLoop_iclal {
    public static void main(String[] args) {

        // task01-> 11 den 20'ye kadar olan tamasayıları print eden code create ediniz...
        System.out.println("**********for ile çözüm*******");

        for (int i = 11; i <20 ; i++) {
            System.out.print(i+" ");
        }

        System.out.println("\n ********** while loop ile çözüm*******");

        int sayi=11;//başlangıç değeri create edildi
        while(sayi<20){//şartımız sayı 20 olana kadar çalışması kotrol edildi. 20 dahil değil
            System.out.print(sayi+" ");
            sayi++; //sonsuz loop olmaması için sayı birer arttırıldı
        }




//task02-> 7 kere javaCAN print eden code create ediniz...

        int sayi2=0;
        while(sayi2<7) {
            System.out.print("\njavaCAN\n");
            sayi2++;
        }


        //task 03--- ikibasamaklı tek sayıları print eden code create ediniz

        int sayi3=11;
        while(sayi3<100 && sayi3%2==1) {
            System.out.print(sayi3+ " ");
            sayi3+=2;
            // sayi3++; şeklinde yazarsak kod bir kere çalışır ve kırılır
        }





    }
}
