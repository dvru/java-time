public class Main {

    public static void main(String[] args) {

        //create object based off Car class
        Car porsche = new Car();
        Car holden  = new Car();

        System.out.println("Model is " + porsche.getModel()); // Model is null
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel()); // Model is Carrera

    }

}
