public class LeapYear {


    public static void main(String[] args){

        System.out.println(isLeapYear(2000));
    }

    public static boolean isLeapYear(int year) {
        if(year <= 0 || year > 9999 ){
            System.out.println("Invalid Value");
            return false;
        }
        else if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " is a Leap Year!");
            return true;
        }
        else{
            System.out.println(year + " is Not a leap Year!");
            return false;
        }
    }
}


