public class DecimalComparator {

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));

    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        if((int) (num1 * 1000) == (int) (num2 * 1000)) {
            System.out.println("Are Equal!");
            return true;
        }
        System.out.println("Are Not Equal");
        return false;
    }
}
