import java.util.Arrays;

public class ReverseArrayChallenge {

    public static void main (String[] args){

        //original array
        int[] array = {1, 5, 3, 7, 11, 9, 15};
        System.out.println("Array = " + Arrays.toString(array)); // to convert array to string to print out in console

        // reversed array
        reverse(array);
        System.out.println("Reversed Array = " + Arrays.toString(array));
    }

    private static void reverse(int[] array){

        int maxIndex = array.length -1; //declare int variable
        int halfLength = array.length / 2; // split the array
        for (int i=0; i<halfLength; i++){ // loop over every element in the array but swapping the first and last value
            int temp = array[i];
            array[i] = array[maxIndex -i];
            array[maxIndex - i] = temp;

//          when i = 0
//          int temp = array[0];
//          array[0] = array[4];
//          array[4] = temp;

        }
    }
}

//-Write a method called reverse() with an int array as a parameter.
//
//        -The method should not return any value. In other words, the method is allowed to modify the array parameter.
//        -In main() test the reverse() method and print the array both reversed and non-reversed.
//        -To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
//        -For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.
//        Tip:
//        -Create a new console project with the name ReverseArrayChallenge

