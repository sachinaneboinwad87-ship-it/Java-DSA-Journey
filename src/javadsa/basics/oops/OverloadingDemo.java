package javadsa.basics.oops;
class Person{
    String name ;
    int age ;
    String city ;
    public void display(String name){
        System.out.println("Name : "+name);
    }
    public void display(int age){
        System.out.println("Age : "+age);
    }
    public void display(String name , int age , String city){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("City : "+city);

    }
}

public class OverloadingDemo {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.display("Shreyash");
        p1.display(22);
        p1.display("Sachin",22,"Nagpur");


    }
}
