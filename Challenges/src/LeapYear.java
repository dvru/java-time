public class LeapYear {


    public static void main(String[] args){

        System.out.println(isLeapYear(2000));
        System.out.println(getDaysInMonth(1, 2020));
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

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12)
            return -1;
        if (year < 1 || year > 9999)
            return -1;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return -1;
        }
    }
}


