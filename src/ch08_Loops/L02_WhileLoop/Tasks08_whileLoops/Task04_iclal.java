package ch08_Loops.L02_WhileLoop.Tasks08_whileLoops;

public class Task04_iclal {

	public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.

		 */

		int i = 99;
		int count=1;
		while (i < 1000) {
			if ((i % 4 == 0) && (i % 6 == 0)) {
				System.out.println(count+".sayi = " + i);
				count++;
			}
			i++;
		}


	}
}