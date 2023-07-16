package ch08_Loops.L02_WhileLoop.Tasks08_whileLoops;

import java.util.Scanner;

public class Task05_ezgisuhanim {

	public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz

		 */


		Scanner input = new Scanner(System.in);

		System.out.print("İsim soyisim: ");
		String isim = input.nextLine();


		int harfSayi = isim.length()-1;
		int i=0;

		while (i <= harfSayi) {
			String harf = String.valueOf(isim.charAt(i));
			if (!(harf.equals(" "))){
				System.out.print(isim.charAt(i)+ " ");


			}i++;

		}


	}
}
