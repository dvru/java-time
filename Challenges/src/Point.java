public class Point {

    public static void main(String[] args){
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }


    private int x;
    private int y;

    public Point(){
        this(0,0);
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return distance(0, 0);
    }

    public double distance(int x, int y) {
        //Distance = √(x2−x1)^2+(y2−y1)^2
        int xFactor = x - this.getX();
        int yFactor = y - this.getY();
        double distance = Math.sqrt(xFactor * xFactor + yFactor * yFactor);
        return distance;
    }

    public double distance(Point p) {
        return distance(p.getX(), p.getY());
    }
}
