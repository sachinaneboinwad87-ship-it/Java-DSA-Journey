package javadsa.basics.oops;
class College{
    String college;
    String city;
    String type;
    College(String college,String city, String type){
        this.college=college;
        this.city=city;
        this.type=type;
    }
    public  void display(){
        System.out.println("College :"+college);
        System.out.println("City :"+city);
        System.out.println("Type :"+type);
    }
}
class StudentTest extends College{
    String name ;
    int roll_no;
    String branch ;
    double Cgpa;
    StudentTest(String college,String city,String type,String name, int roll_no,String branch, double Cgpa){
        super(college,city,type);
        this.name=name;
        this.roll_no=roll_no;
        this.branch=branch;
        this.Cgpa=Cgpa;

    }

    @Override
    public void display() {
        super.display();
        System.out.println("Name :"+name);
        System.out.println("Roll no :"+roll_no);
        System.out.println("Branch :"+branch);
        System.out.println("CGPA :"+Cgpa);

    }
}
public class EngineeringStudent {
    public static void main(String[] args) {
        StudentTest s1 = new StudentTest("PBCOE","Nagpur","Autonomous","Sachin",56,"ETC",7.23);
        s1.display();
    }
}
