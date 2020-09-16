import java.util.Scanner;

public class totalNum {

    private static Scanner scanner = new Scanner(System.in); // System.in allows you to type input into the console and returns back to the program


    public static void main(String[] args){
        int[] myIntegers = getIntegers(5);
        for(int i=0; i<myIntegers.length; i++){
            System.out.println("Element " + i +", typed value was " +myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));
    }

    // get the integers, user/system input
    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    // average of array
    public static double getAverage(int[] array){
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }
        return (double) sum / (double)array.length;
    }
}
