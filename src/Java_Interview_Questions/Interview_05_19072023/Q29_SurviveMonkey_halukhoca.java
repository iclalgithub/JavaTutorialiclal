package InterviewQuestions;

public class Q29_SurviveMonkey_halukhoca {
    /* Task->
    There is a lonely monkey in the island
    He needs to eat 4 bananas every day
    there are just 165 bananas in that island
    Create following variables and find how many days
    monkey can survive.
    Use do while loop, increment and decrement and if statements
    int numberOfBananas =165, survivalDays = 1;
    boolean monkeyAlive = true;
    */
    public static void main(String[] args) {
        int numberOfBananas = 165, survivalDays = 1;
        boolean monkeyAlive = true;
        System.out.println("Agam senin maymın günde 4 muz yer  : ) ");

        do {
            numberOfBananas -= 4;// bir gün geçti
            System.out.println("agam senin maymının kalan muz sayısı : " + numberOfBananas);
            survivalDays++;//adada yaşadiğı gun sayısı 1 arttı
            if (numberOfBananas < 4) {
                monkeyAlive = false;
                System.out.println("Agam bugun " + survivalDays + ". gun muz bitti maymın bizimle değil adaya veda etmeli");
            } else System.out.println("Agam bugun " + survivalDays + ". gun maymın bizimle  adaya Dewamkeee :) ");


        }
        while (monkeyAlive);


    }

}

