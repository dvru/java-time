public class BarkingDog {

    public static void main(String[] args) {

        System.out.println(shouldWakeUp(true,23));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (!barking || hourOfDay < 0 || hourOfDay > 23){
            return false;
        } else if (hourOfDay < 8) {
            return true;
        } else if (hourOfDay > 22 ) {
            return true;
        }
        return false;
    }
}






