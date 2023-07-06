package ch08_Loops.L01_ForLoop.Farukhocatask3;

public class Task34_iclal_kendin_bidaha_bak {

    public static void main(String[] args) {

//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6

        System.out.println("***Üçgen şekli farklı***");
        for (int i = 1; i <=6 ; i++) {

            for (int j = i; j <=6 ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("***Üçgen şekli istenilen şekilde***");
        for (int i = 1; i <=6 ; i++) {
            for (int bosluk = 1; bosluk <i ; bosluk++) {
                System.out.print(" "); //burayı en başta düşünemedim
            }
            for (int j = i; j <=6 ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}


