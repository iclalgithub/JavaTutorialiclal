package ch26_Exceptions.Final_finally_finalize;

public class F01_Parent {
    public void testMethod(){
        System.out.println("güven kontrole mani değildir");
    }

    /*
    Final method cannot be overriden
     */
    public final void  finalMethod(){
        System.out.println("final metottan gelirlerse");
    }


}
