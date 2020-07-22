public class Main {

    public static void main(String[] args) { // method is the main, everything below is a statements

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculatedScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculatedScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);




        //Create a method called displayHighScorePosition
        // 2 parameters of players name, and position in high score table
        // Display the players name with message " managed to get into position " and the
        // position in high score table they got and " on the high score table".

        // Create a 2nd method called calculateHighScorePosition
        // it should return int
        // have 1 argument only, the player score
        // return data should be:
        // 1 if the score is > 1000
        // 2 if the score is > 500 and < 1000
        // 3 if the score is > 100 and < 500
        // 4 in all other cases call both methods of the following
        // a score of 1500, 900, 400, and 50



        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Sara", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Beth", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Kim", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Meg", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Lin", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
        + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if(playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500){
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
        return 4;

    }


    public static int calculatedScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }





}
