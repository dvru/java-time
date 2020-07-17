public class challenge {
    public static void main(String[] args) {

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000L + 10L *
                (byteValue + shortValue + intValue);
        System.out.println(longTotal);

    }
}

//create a byte, short and int variable with valid numbers,
//create a variable of type long, make it equal to 5000 plus 10 times the sum of byte plus the short plus the integer values