public class ParseValues {

    public static void main(String[] args){
        String numberString = "2018";
        System.out.println("numberString = " + numberString); //numberString = 2018

        int number = Integer.parseInt(numberString);
        System.out.println("number = " + number); //number = 2018

//        double number = Double.parseDouble(numberString);
//        System.out.println("number = " + number); // number = 2018.125

        // INCREMENT NUMBER STRING AND NUMBER
        numberString += 1;
        number += 1;
        System.out.println("numberString = " + numberString); //numberString = 20181
        System.out.println("number = " + number); //number = 2019
    }
}
