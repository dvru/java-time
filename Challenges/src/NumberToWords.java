public class NumberToWords {

    public static void main(String [] args){
        getDigitCount(0); // should return 1 since there is only 1 digit
        getDigitCount(123); // should return 3
        getDigitCount(-12); // should return -1 since the parameter is negative
        getDigitCount(5200); // should return 4 since there are 4 digits in the number

//        Example Input/Output - reverse method

        reverse(-121); // should  return -121
        reverse(1212); // should return  2121
        reverse(1234); // should return 4321
        reverse(100); // should return 1

//        Example Input/Output - numberToWords method

        numberToWords(123); //should print "One Two Three".
        numberToWords(1010); // should print "One Zero One Zero".
        numberToWords(1000); // should print "One Zero Zero Zero".
        numberToWords(-12); // should print "Invalid Value" since the parameter is negative.
    }


    public static void numberToWords(int num) {
        if (num < 0) {
            System.out.println("Invalid Value");
        }

        //reverse(num) will truncate any of the trailing zero hence we need to
        //remember the digit count before that
        int digitCount = getDigitCount(num);

        //we need to reverse the num otherwise it will print in reverse order
        num = reverse(num);
        while (digitCount > 0) {
            //get last digit
            int lastDigit = num % 10;
            num /= 10;
            digitCount--;

            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Something went wrong");
                    break;
            }
        }
    }

    //courtesy : https://www.geeksforgeeks.org/reverse-digits-integer-overflow-handled/
    public static int reverse(int num) {
        int reverseNum = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            reverseNum = reverseNum * 10 + lastDigit;
            num /= 10;
        }
        return reverseNum;
        //Below is bit level operations and is not what we need here
//        return Integer.reverse(num);
    }

    public static int getDigitCount(int num) {
        if (num < 0) {
            return -1;
        }

        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
