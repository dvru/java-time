public class Arrays {

    public static void main(String [] args){

        // Assign Array to a Variable using int & double
//      int[] myIntArray;
//      myIntArray = new int[10];
        int[] myIntArray = new int[10]; // define array and assign a new array to a variable
        myIntArray[5] = 50; // element 5 is 6 within an array
        System.out.println(myIntArray[5]);
        int[] myIntArray2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // assign these number values to the array
        double[] myDoubleArray = new double[10];
        System.out.println(myIntArray2[0]); // 1
        System.out.println(myIntArray2[6]); // 7
        System.out.println(myIntArray2[8]); // 9

        // For Loop
        for(int i=0; i<10; i++){ // starting element 0 within the loop times by 10
            myIntArray[i] = i*10;
        }

        for(int i=0; i<10; i++){ // starting element 0 within the loop times by 10
            System.out.println("Element " + i + ", value is " + myIntArray[i]);
        }

        // Using a method within a for loop, instead of a hard coding a value, you can use .length.
//        int[] myIntArray = new int[25];
//        for(int i=0; i<myIntArray.length; i++){ // starting element 0 within the loop times by 10
//            myIntArray[i] = i*10;
//        }
//        for(int i=0; i<myIntArray.length; i++){ // starting element 0 within the loop times by 10
//            System.out.println("Element " + i + ", value is " + myIntArray[i]);
//        }

    }

}
