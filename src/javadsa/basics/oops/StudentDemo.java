package javadsa.basics.oops;
class student{
    int roll_no ;
    String name;
    int year;
    String branch ;
    int marks ;
    public  void studentInfo(){

        System.out.println("Student Roll No : "+roll_no );
        System.out.println("Student Name : "+name);
        System.out.println("Student Year : "+year);
        System.out.println("Student Branch : "+branch);
        System.out.println("Student Marks : "+marks);
    }
}
public class StudentDemo {
    public static void main(String[] args) {
        student s1 = new student();
        s1.roll_no=10;
        s1.name="Sachin";
        s1.year=4;
        s1.branch="ETC";
        s1.marks=89;
        s1.studentInfo();

    }
}
