public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score <= 5000 && score > 1000) { // { } code block
//            System.out.println("Your score is less than 5000 and greater than 1000");
//        } else if (score < 1000) {
//            System.out.println("your score was less than 1000");
//        }   else {
//            System.out.println("Your score is wrong");
//        }

        if(gameOver) {
            int finalScore = score + (levelCompleted *  bonus);
            System.out.println("Your final score was " + finalScore);
        }
        // int savedFinalScore = finalScore;
        // will show as an error as it is out the code block and you cant access it outside the code block


        boolean newGameOver = true;
        int secondScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;

        if(newGameOver) {
            int finalScore = secondScore + (newLevelCompleted *  newBonus);
            System.out.println("Your final score was " + finalScore);
        }

    }

}
