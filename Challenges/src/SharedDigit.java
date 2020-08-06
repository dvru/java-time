public class SharedDigit {

    public static void main(String [] args){

        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(19, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int n1, int n2) {
        if (n1 < 10 || n1 > 99)
            return false;

        if (n2 < 10 || n2 > 99)
            return false;

        int digit;
        int temp;

        while (n1 > 0)//n1 = 12, temp = , n2 = 22
        {
            digit = n1 % 10; //digit = 2
            n1 /= 10; // 1
            temp = n2;

            while (temp > 0) {
                if ((temp % 10) == digit) {
                    return true;
                }
                temp /= 10;
            }
        }
        return false;
    }


}

//    Shared Digit
//    Write a method named hasSharedDigit with two parameters of type int.
//        Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
//        The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
//
//        EXAMPLE INPUT/OUTPUT:
//        hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
//        hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
//        hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
//
//        NOTE: The method hasSharedDigit​ should be defined as public static like we have been doing so far in the course.
//        NOTE: Do not add a main method to the solution code.