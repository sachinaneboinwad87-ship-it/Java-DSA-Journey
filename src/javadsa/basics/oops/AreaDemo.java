package javadsa.basics.oops;
class Area {

    public double area(double side) {
        return side * side;
    }


    public double area(double length, double width) {
        return length * width;
    }


    public double area(int radius) {
        return Math.PI * radius * radius;
    }
}

public class AreaDemo {
    public static void main(String[] args) {
        Area area = new Area();
        System.out.println("Areas of Circle "+ area.area(10));
        System.out.println("Areas of Square  "+ area.area(10.00));
        System.out.println("Areas of Rectangle "+ area.area(22,12));



    }
}
