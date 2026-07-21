package javadsa.basics.oops;
class Car{
    String brand;
    String model;
    int price;
    public void carDetails(){
        System.out.println("Car Brand : "+brand);
        System.out.println("Car Model : "+model);
        System.out.println("Car Price : "+price);
    }
}
public class CarDemo {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();

        c1.brand="Mahindra";
        c1.model="Thar";
        c1.price=1400000;
        c1.carDetails();
        c2.brand="TATA";
        c2.model="Sierra";
        c2.price=2000000;
        c2.carDetails();


    }
}
