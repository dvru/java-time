public class SumOddRange {

    public static void main(String[] args){
        System.out.println(sumOdd(1, 100));
    }

    private static boolean isOdd(int number)
    {
        if(number < 0) {
            return false;
        } return number % 2 != 0;
    }

    public static int sumOdd(int start, int end)
    {
        if(start > end || start < 0)
        {
            return -1;
        }

        int sumOfOddNumbers = 0;

        for(int i = start; i <= end; i++)
        {
            if(isOdd(i)) sumOfOddNumbers += i;
        }

        return sumOfOddNumbers;
    }

}
