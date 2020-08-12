public class Circle {

    private double radius;

    public Circle(double radius){
        if(radius < 0){
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

}

//Write a class with the name Circle. The class needs one field (instance variable) with name radius of type double.
//        The class needs to have one constructor with parameter radius of type double and it needs to initialize the fields.
//        In case the radius parameter is less than 0 it needs to set the radius field value to 0.
//        Write the following methods (instance methods):
//        Method named getRadius without any parameters, it needs to return the value of radius field.
//        Method named getArea without any parameters, it needs to return the calculated area (radius * radius * PI).
//        For PI use Math.PI constant.