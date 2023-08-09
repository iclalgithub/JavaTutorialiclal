public class Runner {
    public static void main(String[] args) {
        Ana_Menu player1 = new Ana_Menu();
        Ana_Menu player2 = new Ana_Menu();

        player1.setEnemy(player2);
        player2.setEnemy(player1);

        while (Basic.dead) {//her asamada ikisinden birinin olup olmedigini kontorl eden bir boolean
            player1.oyunBaslar();
            if (Basic.dead) {
                player2.oyunBaslar();
            }
        }
    }
}
