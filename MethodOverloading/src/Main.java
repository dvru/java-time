public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Beth", 500);
        System.out.println("New Score is " + newScore);
        calculateScore(75);
        calculateScore();
        double centimeters = calcFeetAndInchesToCentimeters(6, 13);
        if(centimeters <0.0){
            System.out.println("Invalid params");
        }

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }


    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }



    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if((feet < 0 ) || ((inches < 0) || inches > 12)){
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;

    }





}
