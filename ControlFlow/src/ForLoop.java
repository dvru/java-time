public class ForLoop {

    public static void main( String[] args){
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 5.0));


//      init, termination, increment
        for(int i = 0; i < 5; i++){
            System.out.println("Loop " + i + " hello!");
        }

        for( int i = 2; i < 9; i++){
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0, i));
        }

        for( int i = 9; i >= 2; i--){
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0, i));
        }

    }

    public static double calculateInterest( double amount, double interestRate){
        return amount *(interestRate/100);
    }




}