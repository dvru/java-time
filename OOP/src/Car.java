public class Car {

    // these variables are the state of the car
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    //create a setter
    public void setModel(String model) {
        String validModel = model.toLowerCase(); // validation
        if(validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    //create a getter
    public String getModel(){
        return this.model;
    }

}
