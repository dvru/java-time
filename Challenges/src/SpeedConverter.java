public class SpeedConverter {

    public static void main(String[] args) {
        long miles = toMilePerHour(75.114);
        System.out.println("Miles = " + miles);

        printConversion(75.114);
    }

    public static long toMilePerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }


        public static void printConversion(double kilometersPerHour){

        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilePerHour(kilometersPerHour);
            System.out.println(kilometersPerHour +
                    " km/h = " + milesPerHour +
                    " mi/h");
        }
    }
}
