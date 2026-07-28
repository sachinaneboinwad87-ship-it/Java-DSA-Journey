package javadsa.basics.oops;
class Person1 {
    String name;
    int age ;
    Person1(String name , int age){
        this.name=name;
        this.age=age;
    }
   public void display(){
       System.out.println("Name : "+name);
       System.out.println("Age : "+age);
   }
}
class Student extends Person1{
    int roll_no;
    String branch;
     Student(String name , int age,int roll_no, String branch){
         super(name ,age );
        this.roll_no=roll_no;
        this.branch=branch;
     }

    @Override
    public void display() {
        super.display();
        System.out.println("Roll No :"+roll_no);
        System.out.println("Branch :"+branch);
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Sachin",22,56,"ETC");
        s1.display();
    }
}
