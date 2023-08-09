package ch24_Encapsulation.task24.task01;

public class Subscribe {
    //0. adım varible create etmek
    private String name;
    private boolean doYouWanaSubscribe;
    private String whichMember;

    //1. adım constructor
    public Subscribe() {
    }

    //2. adım parametreli constructor
    public Subscribe(String name, boolean doYouWanaSubscribe, String whichMember) {
        this.name = name;
        this.doYouWanaSubscribe = doYouWanaSubscribe;
        this.whichMember = whichMember;
    }
    //3. adım getter ve setter metotları


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDoYouWanaSubscribe() {
        return doYouWanaSubscribe;
    }

    public void setDoYouWanaSubscribe(boolean doYouWanaSubscribe) {
        this.doYouWanaSubscribe = doYouWanaSubscribe;
    }

    public String getWhichMember() {
        return whichMember;
    }

    public void setWhichMember(String whichMember) {
        this.whichMember = whichMember;
    }


    //4. adım tostring metodu override
    @Override
    public String toString() {
        return "Subscribe{" +
                "name='" + name + '\'' +
                ", doYouWanaSubscribe=" + doYouWanaSubscribe +
                ", whichMember='" + whichMember + '\'' +
                '}';
    }

    //5. adım üyelik tipi seçimini sout ile ekrana yazdırma
    public void createMembership() {
        if (doYouWanaSubscribe) {
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
}

