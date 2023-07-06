package ch08_Loops.L01_ForLoop.Tasks08_forLoop;

public class Task10_Nested_iclal_SORfarukhocacozmus {

    public static void main(String[] args) {
         /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli yazdırınız
        */



  //    //FARKLI ŞEKİL
      char karakter = 65;
     System.out.println(karakter);
    for (int i = 1; i <= 5; i++) {//satır
        for (int j = 0; j <= i; j++) {//sütun
            System.out.print((char)(j+karakter)+" ");//j+
        }
        System.out.println();
    }

     //TASK ın çözümü
   for (int i = 1; i <= 5; i++) {
       for (int j = 0; j <= i; j++) {
           System.out.print((char)(i+karakter)+" ");//i
       }
       System.out.println();
   }

        //HOCANIN ÇÖZÜMÜ
     int harf=65;
     for (int i = 1; i < 6 ; i++) {

         for (int j = 0; j <= i ; j++) {//yine icteki loop a i kadar calis dedik
             System.out.print( (char) ( harf + i )+" ");// i yi j kadar yazdirdi ayni satira. hep i yi yazdik


         }
         System.out.println();
     }




    }
}
