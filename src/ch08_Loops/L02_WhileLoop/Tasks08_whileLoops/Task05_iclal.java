package ch08_Loops.L02_WhileLoop.Tasks08_whileLoops;

import java.util.Scanner;

public class Task05_iclal {

	public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print eden code create ediniz

		 */

	Scanner input = new Scanner(System.in);
	//System.out.println("isminizi giriniz");
	//String name = input.nextLine();
	//System.out.println("name = " + name);
	//System.out.println("soyisminizi giriniz");
	//String surname = input.nextLine();
	//System.out.println("surname = " + name);


		//ZORLANDIM

		//Ezgisu hanım
		System.out.println("İsim: ");
		String isim = input.nextLine();
		System.out.print("Soyisim: ");
		String soyisim = input.nextLine();

		int i = 0;//isim için döngü
		int j = 0;

		while (i < isim.length()) {
			System.out.print(isim.charAt(i) + " ");
			i++;
		}

		while (j < soyisim.length() ) {
			System.out.print(soyisim.charAt(j) + " ");
			j++;
		}








	}

}
