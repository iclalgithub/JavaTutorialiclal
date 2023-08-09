package ch24_Encapsulation.task24.task01;
import java.util.Scanner;

public class Subscribe_kullanicigirisiisteyerek {
    private String name;
    private boolean doYouWannaSubscribe;
    private String whichMember;

    public Subscribe_kullanicigirisiisteyerek() {
    }

    public Subscribe_kullanicigirisiisteyerek(String name, boolean doYouWannaSubscribe, String whichMember) {
        this.name = name;
        this.doYouWannaSubscribe = doYouWannaSubscribe;
        this.whichMember = whichMember;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDoYouWannaSubscribe() {
        return doYouWannaSubscribe;
    }

    public void setDoYouWannaSubscribe(boolean doYouWannaSubscribe) {
        this.doYouWannaSubscribe = doYouWannaSubscribe;
    }

    public String getWhichMember() {
        return whichMember;
    }

    public void setWhichMember(String whichMember) {
        this.whichMember = whichMember;
    }

    @Override
    public String toString() {
        return "Subscribe{" +
                "name='" + name + '\'' +
                ", doYouWannaSubscribe=" + doYouWannaSubscribe +
                ", whichMember='" + whichMember + '\'' +
                '}';
    }

    public void createMembership() {
        if (doYouWannaSubscribe) {
            switch (whichMember) {
                case "Gold":
                    System.out.println("Welcome to membership " + name +
                            ". Your membership is 40 dollars per month. You can enjoy the videos, all homework, and see you soon.");
                    break;
                case "Silver":
                    System.out.println("Welcome to membership " + name +
                            ". Your membership is 20 dollars per month. You can enjoy the videos and all homework.");
                    break;
                case "Bronze":
                    System.out.println("Welcome to membership " + name +
                            ". Your membership is 10 dollars per month. You can enjoy the videos.");
                    break;
                default:
                    System.out.println("Invalid membership type!");
            }
        } else {
            System.out.println("See you when you want to be a member. Thanks");
        }
    }

    public static Subscribe_kullanicigirisiisteyerek createSubscriptionFromUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Do you want to subscribe? (true/false): ");
        boolean doYouWannaSubscribe = scanner.nextBoolean();

        // Yeni satır karakterini tüketmek için kullanıcıdan sonraki boşluğu okuyalım
        scanner.nextLine();

        System.out.print("Enter your membership level (Gold/Silver/Bronze): ");
        String whichMember = scanner.nextLine();

        return new Subscribe_kullanicigirisiisteyerek(name, doYouWannaSubscribe, whichMember);
    }
}
