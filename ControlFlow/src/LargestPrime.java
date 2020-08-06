public class LargestPrime {

    public static int getLargestPrime(int num) {
        //no prime factor for 1, 0 and negative numbers
        if (num < 2) {
            return -1;
        }

        int largestPrime = 2; // 1 is not considered as prime. First prime no is 2
        boolean iAmPrime = true;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                iAmPrime = false;
                boolean isPrime = true;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                //if i is prime then update largestPrime
                largestPrime = (isPrime ? i : largestPrime);
            }
        }

        //check if number itself is prime
        if (iAmPrime) {
            largestPrime = num;
        }
        return largestPrime;
    }

}

//    Write a method named getLargestPrime with one parameter of type int named number.
//        If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
//        The method should calculate the largest prime factor of a given number and return it.
//
//        EXAMPLE INPUT/OUTPUT:
//        getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)
//        getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)
//        getLargestPrime (0); should return -1 since 0 does not have any prime numbers
//        getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
//        getLargestPrime (-1); should return -1 since the parameter is negative
//
//        HINT: Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.
//        NOTE: The method getLargestPrime should be defined as public static like we have been doing so far in the course.
//        NOTE: Do not add a main method to the solution code.