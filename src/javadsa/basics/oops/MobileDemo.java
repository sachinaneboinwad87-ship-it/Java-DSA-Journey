package javadsa.basics.oops;
class Mobile{
    String brand ;
    int ram;
    int price;
    Mobile(){
        brand="Realme";
        ram=8;
        price=10000;
       }
    Mobile(String brand , int ram , int price){
        this.brand=brand;
        this.ram=ram;
        this.price=price;

    }
    public void display(){
        System.out.println("Brand : "+brand);
        System.out.println("Ram : "+ram+"Gb");
        System.out.println("Price : "+price);
    }
}
public class MobileDemo {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Samsung",8,1200);
        Mobile m2 = new Mobile("Oppo",8,1000);
        Mobile m3 = new Mobile();
        m1.display();
        m2.display();
        System.out.println();
       m3.display();

    }
}
