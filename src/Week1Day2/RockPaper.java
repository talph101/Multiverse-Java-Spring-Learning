package Week1Day2;

import java.sql.SQLOutput;

public class RockPaper {


    public static String randomChoice() {
        double choice = Math.floor(Math.random() * 3);

        if (choice == 0) {
           return "rock";
        } else if(choice == 1) {
            return "paper";
        }else {
            return "scissors";
        }
    }

    public static String winner(String player1, String player2){
        if(player1.equals("rock") && player2.equals("rock") || player1.equals("scissors") && player2.equals("scissors") || player1.equals("paper") && player2.equals("paper")) {
            return "Its a tie";
        } else if (player1.equals("rock") && (player2.equals("scissors") || player2.equals("paper")) || player1.equals("scissors") && player2.equals("paper")) {
            return "Player 1 Wins!";
        } else {
            return "Player 2 Wins!";
        }

    }
    public static void main(String[] args){

        String player1 = randomChoice();
        String player2 = randomChoice();

        String result = winner(player1, player2);

        System.out.println(result);


    }

}
