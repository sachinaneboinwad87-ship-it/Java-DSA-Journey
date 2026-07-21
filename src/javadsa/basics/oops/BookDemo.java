package javadsa.basics.oops;
 class Book{
     String title;
     String author;
     int price;
     public void displayBook(){
         System.out.println("Book Title : "+title);
         System.out.println("Book Author : "+author);
         System.out.println("Book price : "+price);
     }

}
public class BookDemo {
    public static void main(String[] args) {
  Book b1 = new Book();
  b1.price=200;
  b1.author="V.S.Khandekar";
  b1.title="Yayati";
  b1.displayBook();
    }
}
