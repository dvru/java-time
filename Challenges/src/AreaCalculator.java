public class AreaCalculator {

    public static void main(String[] args){

        area(-1);
        area(-1.0, 4.0);

    }

    public static double area(double radius){
        if(radius < 0){
            System.out.println(-1);
            return -1;
        }
        double areaSolution = radius * radius * Math.PI;
        System.out.println(areaSolution);
        return areaSolution;
    }

    public static double area(double x, double y){
        if((x < 0) || (y < 0)) {
            return -1;
        }

        double areaSolution = x * y;
        System.out.println(areaSolution);
        return areaSolution;
    }

}
