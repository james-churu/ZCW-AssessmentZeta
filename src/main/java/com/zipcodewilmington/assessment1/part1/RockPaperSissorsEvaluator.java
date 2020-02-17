package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        String answer = "";
        if(handSign.equals("rock")){
            answer = "paper";
        }else if(handSign.equals("paper")){
            answer = "scissor";
        }else{
            answer = "rock";
        }

        return answer;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        String answer = "";
        if(handSign.equals("rock")){
            answer = "scissor";
        }else if(handSign.equals("paper")){
            answer = "rock";
        }else{
            answer = "paper";
        }

        return answer;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        String answer = "";
        if(handSignOfPlayer1.equals("rock") && handSignOfPlayer2.equals(getLosingMove(handSignOfPlayer1))){
            answer = "rock";
        }else if(handSignOfPlayer1.equals("paper") && handSignOfPlayer2.equals(getLosingMove(handSignOfPlayer1))){
            answer = "paper";
        }else if(handSignOfPlayer1.equals("scissor") && handSignOfPlayer2.equals(getLosingMove(handSignOfPlayer1))){
            answer = "scissor";
        }else{
            answer = handSignOfPlayer2;
        }

        return answer;
    }
}
