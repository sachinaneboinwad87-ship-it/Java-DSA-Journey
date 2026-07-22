package javadsa.basics.oops;
class Laptop{
    String brand;
    String series;
    int price ;

 public    Laptop(String brand,String series, int price){
        this.brand=brand;
        this.series=series;
        this.price=price;
    }
    public void display(){
        System.out.println("Brand : "+brand);
        System.out.println("Series : "+series);
        System.out.println("Price : "+price);
    }
}
public class LaptopDemo {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("MSI","Thin",50000);
        l1.display();
    }
}
