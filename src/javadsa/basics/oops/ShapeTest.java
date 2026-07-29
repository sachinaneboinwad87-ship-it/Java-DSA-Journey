package javadsa.basics.oops;
class   Shape{
    double width;
    double height;

   public    void  area(double width, double height){

    }

}
class Rectangle extends Shape{
    @Override
    public void area(double width, double height) {
        super.area(width, height);
        double res = width*height;
        System.out.println("Rectangle area is :"+res);
    }
}
class Circle extends Shape{
    @Override
    public void area(double width, double height) {
        super.area(width, height);
        double res = Math.PI*width*height/4;
        System.out.println("Circle area is :"+res);

    }
}
class Tringle extends  Shape{
    @Override
    public void area(double width, double height) {
        super.area(width, height);
        double res = 0.5*(width*height);
        System.out.println("Tringle area is :"+res);
    }
}
public class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Rectangle();
        Shape s2 = new Circle();
        Shape s3 = new Tringle();
        s1.area(2,2);
        s2.area(3,8);
        s3.area(10,12);
    }
}
