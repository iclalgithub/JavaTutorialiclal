package Java_Challenge_Derslerim.Challange05_14062023;

public class Q03_ForLoop_iclal {

    //Convert "Java" to "J*a*v*a*"

	/*	ForLoop
		print even numbers from 100 to 0 but do not use decrement(i--).

		     INPUT      :
		     OUTPUT  : 100 98 96 94 92 ....2 0
      */

    public static void main(String[] args) {
        String kelime = "Java";
        for (int i = 0; i < kelime.length()-1; i++) {
            //KAFAM KARIŞTI YİNE BAK
            if(i%2!=0){
               char ch= kelime.charAt(i);
                System.out.println("ch = " + ch);

                //System.out.print("i = " +ch);

            }
            
        }


    }


}
