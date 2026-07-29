package javadsa.basics.oops;
abstract class Ticket{

 public void totalfare(String name,int tktid ,int tktprice){

    }
 }
class MovieTicket extends Ticket{
    int convincefee= 50;
    @Override
    public void totalfare(String name, int tktid, int tktprice) {
        super.totalfare(name, tktid, tktprice);
        int totalfare = tktprice +convincefee;
        System.out.println("Name : "+name);
        System.out.println("Ticket id : "+tktid+" Total Fare : "+totalfare);

    }
}
class TrainTicket extends Ticket{
    double servicetax = 0.05;
    @Override
    public void totalfare(String name, int tktid, int tktprice) {
        super.totalfare(name, tktid, tktprice);
        servicetax = tktprice * servicetax;
        double totalfare = tktprice +servicetax;
        System.out.println("Name : "+name);
        System.out.println("Ticket id : "+tktid+" Total Fare : "+totalfare);

    }
}
class FlightTicket extends Ticket{
    double airporttax = 0.05;
    double luggage =0.075;

    @Override
    public void totalfare(String name, int tktid, int tktprice) {
        super.totalfare(name, tktid, tktprice);
        airporttax = tktprice*airporttax;
        luggage = tktprice*luggage;
        double totalfare = tktprice+airporttax+luggage;
        System.out.println("Name : "+name);
        System.out.println("Ticket id : "+tktid+" Total Fare : "+totalfare);

    }
}


public class TicketBooking {
    public static void main(String[] args) {
        Ticket t1 = new MovieTicket();
        Ticket t2 = new TrainTicket();
        Ticket t3 = new FlightTicket();
        t1.totalfare("Sachin",101,500);
        t2.totalfare("Shree" ,1001, 670);
        t3.totalfare("Sachin",111,4000);
    }
}
