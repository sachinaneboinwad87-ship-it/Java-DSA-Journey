package javadsa.basics.oops;
class Calculator {
    public void add(int a, int b){
        int res = a+b;
        System.out.println("Addition of two number : "+res);
    }
    public void sub(int a ,int b){
        int res = a-b;
        System.out.println("Subtraction of two Number : "+res);
    }
    public void mul(int a ,int b){
        int res = a*b;
        System.out.println("Multiplication  of two Number : "+res);
    }
    public void div(int a ,int b){
        int res = a/b;
        System.out.println("Division  of two Number : "+res);
    }
}
public class CalculatorDemo {
    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        c1.add(10,20);
        c1.sub(30 ,10);
        c1.mul(10,20);
        c1.div(20,10);
    }
}
