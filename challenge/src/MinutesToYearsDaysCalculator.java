public class MinutesToYearsDaysCalculator {

    public static void main(String[] args){
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long YY = minutes / 60 / 24 / 365;
            long ZZ = (minutes % (60 * 24 * 365)) / (60 * 24);

            System.out.println(minutes + " min = " + YY + " y and " + ZZ + " d");
        }
    }
}
