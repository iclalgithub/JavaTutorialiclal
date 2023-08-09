package ch24_Encapsulation.task24.task01;

import java.util.Scanner;

public class Subscribe_tahabey {
    private String name;
    private boolean doYouWannaSubscribe;
    private String whichMember;
    //boolean levelControl =true;
    boolean control=true;

    static Scanner sc = new Scanner(System.in);

    public Subscribe_tahabey() {
        level();
    }

    public void name() {
        System.out.print("Plz enter ur username in: ");
        this.name = sc.nextLine();
    }
    public void subscribe() {
        name();
        System.out.println("Do u wanna sub:\n 1-> For yes\n 2-> For no ");
        int girdi = sc.nextInt();

        if (girdi==1){
            doYouWannaSubscribe = true;
        }else if (girdi==2){
            System.out.println("See you when you want to be a member. Thanks...");
            doYouWannaSubscribe = false;
        }else System.out.println("Try again");
    }

    public void level() {
        subscribe();
        if (doYouWannaSubscribe) {
            System.out.println("Which subscription would you like:\n 1-> For Gold\n 2-> For Silver\n 3-> For Bronz ");
            int membGirdi = sc.nextInt();
            switch (membGirdi) {
                case 1:
                    whichMember = "Gold";
                    System.out.println("Welcome " + name + ". Your membership is 40 dollar for month you can enjoy the videos, all homework and see you soon.");
                    break;
                case 2:
                    whichMember = "Silver";
                    System.out.println("Welcome " + name + ". Your membership is 20 dollar for month you can enjoy the videos and all homework.");
                    break;
                case 3:
                    whichMember = "Bronz";
                    System.out.println("Welcome " + name + ". Your membership is 10 dollar for month you can enjoy the videos.");
                    break;
                default:
                    System.out.println("You have to choose one of these 3 membership!!! Try again:)");
                    //levelControl=false;
                    control=false;
            }
        }
    }

    public boolean isDoYouWanaSubscribe() {
        return doYouWannaSubscribe;
    }

    @Override
    public String toString() {
        return  "Member name = \"" + name + '"' +
                ", is he-she sub = \" " + doYouWannaSubscribe+ '"'  +
                ", Membership = \"" + whichMember + '"';
    }
}
