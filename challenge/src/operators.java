public class operators {

    public static void main(String[] args) {
        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("myValuesTotal = " + myValuesTotal);
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("theRemainder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if(!isNoRemainder) {
            System.out.println("Got Some Remainder");
        }
    }

}

// create a double variable with a value of 20.00
// create a second variable of a type double with a value of 80.00
// add both number together and multiply by 100.00
// use the remainder operator to figure out what the remainder from the result of the
// operation in step 3 and 40.00

// we used the modulus or remainder operator on its in the course, but we can also use on a double.

//create a boolean variable that assigns the value true if the remainder in #4 is 0, or false if its not zero

// write an if-them statement that displays a message "Got some remainder" if the boolean is step 5 is not true
