public class Switch {

    public static void main(String [] args){


        int value = 3;
        if(value == 1){
            System.out.println("Value was 1");
        } else if(value == 2){
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }


        int switchValue = 3;
        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
            break;
            case 2:
                System.out.println("Value was 2");
            break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("It was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");
        }


        char charValue = 'A';
        switch(charValue){
            case 'A':case 'B':case 'C':case 'D':case 'E':
                System.out.println("You found " + charValue);
            break;

            default:
                System.out.println("Was not A, B, C, D or E");
        }


        String month = "January";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("June");
                break;
            default:
                System.out.println("Not Sure");
        }

    }
}
