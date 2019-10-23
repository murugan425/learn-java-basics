/* Created by Murugan_Nagarajan on 5/30/2018 */
package com.tamil.learn.java.basics.beginners;

/**
 * @author Murugan_Nagarajan
 * @created date 5/30/2018 / 12:14 PM
 */
public class Methods {
    public static void main(String []args) {
        int scorePosition = 0;
        scorePosition = calculateScorePosition(1500);
        displayScorePosisition("Murugan", scorePosition);
    }

    private static void displayScorePosisition(String playername, int position) {
        System.out.println(playername + " managed to get into posistion " + position);
    }

    private static int calculateScorePosition(int score) {
        if(score >= 1000) {
            return 1;
        } else if (score >= 500 && score < 1000) {
            return 2;
        } else if (score >= 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
    }

    private static int calculateScorePositionSingleReturnPoint(int score) {
        int position = 4;
        if(score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;
    }
}
