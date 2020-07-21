public class floatAndDouble {
    public static void main(String[] args) {

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted Kilograms = " + convertedKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_89d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }

}

// Convert a given number of pounds to Kilograms
//Steps:
//  1. Create a Variable with the appropriate type to store the number of pounds to be converted to Kilograms
//  2. Calculate the result i.e. the number of Kilograms based on the contents of the variable above
//   and store the result in a 2nd appropriate variable.
//  3. Print out the result.

//HINT: 1 pound is equal to 0.45359237 of Kilogram. This should help you perform the calculation.