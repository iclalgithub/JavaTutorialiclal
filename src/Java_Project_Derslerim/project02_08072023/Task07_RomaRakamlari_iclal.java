package Java_Project_Derslerim.project02_08072023;

public class Task07_RomaRakamlari_iclal {
    /*  TASK :
		 	Create a method to convert Roman numerals to numbers
		 	Romen rakamlarını sayılara dönüştürmek için bir method create ediniz
		 	Input:
		 		System.out.println(romanNumbers(805));
		   		System.out.println(fromRomans("DCCCV"));
		   	Output: DCCCV   805


		   		M + [C M] + [X L] + V   ---->   1945
		   		The chars in the brackets are in ascending order.
		   		 Parantez içindeki karakterler artan sıradadır (C-100, M-1000) ---> [C M]=900
		*/
    public static void main(String[] args) {
        String sayi = "MCMXLV";
        //romaRakam();
        System.out.println("yakarimRomayi(sayi) = " + yakarimRomayi(sayi));


        //hakan peker:)
        //tahin pekmez:)

    }//main sonu

    private static int yakarimRomayi(String sayi) {
        //roma rakamlarının nümerik değerlerini return ediyor
        int rakamToplam = 0;

        for (int i = 0; i < sayi.length() - 1; i++) {
            //rakamToplam+=sayi.charAt(i);

            //döngüden gelen roma rakamı bir sonrakiden büyükse değeri al
            //eğer değilse farkını al
            if (romaRakam(sayi.charAt(i)) < romaRakam(sayi.charAt(i + 1))) {
                rakamToplam += romaRakam(sayi.charAt(i + 1)) - romaRakam(sayi.charAt(i));
                //i--;
                //replace ile M'yi öldürdüm
                sayi = sayi.replace(sayi.substring(i, i + 2), "");//CM öldü
                //length değişti
                //replace anladım hocam replace yerine i++; yapsak handle etmiş olurmuyuz
                //mustafa aba bey
                i--;
            }

        }

        for (int i = 0; i < sayi.length(); i++) {
            rakamToplam += romaRakam(sayi.charAt(i));
        }

        return rakamToplam;
    }

    public static int romaRakam(char a) {//Roma rakamlarını numerik değer return ediyor
        if (a == 'I') return 1;
        if (a == 'V') return 5;
        if (a == 'X') return 10;
        if (a == 'L') return 50;
        if (a == 'C') return 100;
        if (a == 'D') return 500;
        if (a == 'M') return 1000;
        return 0;

    }


}
