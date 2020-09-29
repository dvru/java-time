import java.util.Arrays;

public class TypesVsValue {

        public static void main(String[] args) {

            // Value Types
            int myIntValue = 10;
            int anotherIntValue = myIntValue;

            System.out.println("myIntValue = " + myIntValue);
            System.out.println("anotherIntValue = " + anotherIntValue);

            anotherIntValue++;

            System.out.println("myIntValue = " + myIntValue);
            System.out.println("anotherIntValue = " + anotherIntValue);


            // Reference Types, Reference holds an address or Reference to the object but not the object itself
            int[] myIntArray = new int[5];
            int[] anotherArray = myIntArray;
            // 2 Reference pointing to the same array in memory

            System.out.println("myIntArray= " + Arrays.toString(myIntArray));
            System.out.println("anotherArray= " + Arrays.toString(anotherArray));

            anotherArray[0] = 1;
            // assigning value of 1 to the index 0 which is the first one

            System.out.println("after change myIntArray= " + Arrays.toString(myIntArray));
            System.out.println("after change anotherArray= " + Arrays.toString(anotherArray));

            anotherArray = new int[]{4, 5, 6, 7, 8};
            modifyArray(myIntArray);

            System.out.println("after modify myIntArray= " + Arrays.toString(myIntArray));
            System.out.println("after modify anotherArray= " + Arrays.toString(anotherArray));
        }


        private static void modifyArray(int[] array) {

            array[0] = 2;
            array = new int[] {1, 2, 3, 4, 5};
        }
}

