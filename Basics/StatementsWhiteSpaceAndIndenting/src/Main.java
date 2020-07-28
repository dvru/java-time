public class Main {

    public static void main(String[] args) {
        int myVariable = 50; // a valid statement
        if(myVariable == 50 ) {
            // auto indenting
        }


        myVariable++;
        myVariable--;
        System.out.println("This is a statement = " + myVariable);

        System.out.println("This is" +
                " another" +
                " still more."); // this will still run the whole statement on multiple lines

        int anotherVariable = 50; myVariable--; // you can add statements on same line, not best practice
    }
}
