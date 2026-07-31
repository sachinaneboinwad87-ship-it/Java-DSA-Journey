package javadsa.basics.oops;
interface Payment{
    void pay(double amount);
  }
  class UPI implements  Payment{
      private  String UpiId;
     UPI(String UpiId){
         this.UpiId=UpiId;
     }
      @Override
      public void pay(double amount) {
          System.out.println("Amount paid : "+amount);
          System.out.println("UPI ID :"+UpiId);
          System.out.println("Payment Successfully");

      }
  }
  class Card implements  Payment{
     String card_holder_name;
     private long card_number;
     Card(String card_holder_name,long card_number){

         this.card_holder_name=card_holder_name;
         this.card_number=card_number;
     }
      @Override
      public void pay(double amount) {
          System.out.println("Amount paid : "+amount);
          System.out.println("Card Holder Name : "+card_holder_name);
          System.out.println("Card Number : "+card_number);
          System.out.println("Payment Successfully");


      }
  }
  class Cash implements  Payment{
      @Override
      public void pay(double amount) {
          System.out.println("Amount paid : "+amount);
          System.out.println("Payment Successfully");

      }
  }


public class PayementDemo {
    public static void main(String[] args) {
      Payment p1 = new UPI("Sachin@123");
      Payment p2 = new Card("Sachin",12345678);
      Payment p3 = new Cash();
      p1.pay(500);
      p2.pay(2000);
      p3.pay(500);
    }
}
