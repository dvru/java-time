public class Main {
    
    public static void main(String[] args) {
        
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum value = " + myMinDoubleValue);
        System.out.println("Double Maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;  // float myFloatValue = (float)5.25;
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

    }
    
}
