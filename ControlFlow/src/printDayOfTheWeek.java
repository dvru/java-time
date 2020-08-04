public class printDayOfTheWeek {

    public static void main(String[] args){

        dayOfTheWeek(-1);
        dayOfTheWeek(0);
        dayOfTheWeek(1);
        dayOfTheWeek(2);
        dayOfTheWeek(3);
        dayOfTheWeek(4);
        dayOfTheWeek(5);
        dayOfTheWeek(6);
        dayOfTheWeek(7);

    }

    private static void dayOfTheWeek(int day){

        switch (day) {
            case 0:
                System.out.println("Sunday");
            break;
            case 1:
                System.out.println("Monday");
            break;
            case 2:
                System.out.println("Tuesday");
            break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }

}
