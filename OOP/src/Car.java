public class Car {

    // these variables are the state of the car
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    //create a setter
    public void setModel(String model) {
        this.model = model;
    }

    //create a getter
    public String getModel(){
        return this.model;
    }

}
