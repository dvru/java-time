public class While {

    public static void main(String [] args) {
        int count = 1;
        while(count != 6){
            System.out.println("Count value is "+ count);
            count++;
        }

//        for(count = 1; count != 6; count++){
//            System.out.println("Count value is "+ count);
//        }
        count = 1;
        while(true) {
            if(count == 5){
                break;
            }
            System.out.println("Count value is "+ count);
            count++;
        }
    }

}
