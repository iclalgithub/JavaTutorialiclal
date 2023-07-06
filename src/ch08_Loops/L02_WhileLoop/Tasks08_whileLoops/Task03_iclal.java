package ch08_Loops.L02_WhileLoop.Tasks08_whileLoops;

import java.util.Scanner;

public class Task03_iclal {

	public static void main(String[] args) {
		/*

        task-> girilen  tamsayı için carpim tablosunu print eden code create ediniz.

		 Ornek input = 13
		 13x1=13 13x2=26  . . .. .  . 13x10=130
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("bir tamsayı giriniz : ");
		int sayi = input.nextInt();

		int i=1;
		int carpim=1;

		while (i<11){
			carpim=sayi*i;
			System.out.println(i+".carpim= "+sayi +"*"+ i +"="+ carpim+ " ");
			i++;
		}





	}

}
