package javadsa.basics.operators;

public class Operators {
    static void main() {


                // Arithmetic Operators
                int a = 20;
                int b = 10;

                System.out.println("=== Arithmetic Operators ===");
                System.out.println("Addition       : " + (a + b));
                System.out.println("Subtraction    : " + (a - b));
                System.out.println("Multiplication : " + (a * b));
                System.out.println("Division       : " + (a / b));
                System.out.println("Modulus        : " + (a % b));

                // Assignment Operators
                int x = 10;

                System.out.println("\n=== Assignment Operators ===");
                System.out.println("Initial value : " + x);

                x += 5;
                System.out.println("x += 5 : " + x);

                x -= 3;
                System.out.println("x -= 3 : " + x);

                x *= 2;
                System.out.println("x *= 2 : " + x);

                x /= 4;
                System.out.println("x /= 4 : " + x);

                x %= 3;
                System.out.println("x %= 3 : " + x);

                // Relational Operators
                int p = 15;
                int q = 20;

                System.out.println("\n=== Relational Operators ===");
                System.out.println("p == q : " + (p == q));
                System.out.println("p != q : " + (p != q));
                System.out.println("p > q  : " + (p > q));
                System.out.println("p < q  : " + (p < q));
                System.out.println("p >= q : " + (p >= q));
                System.out.println("p <= q : " + (p <= q));

                // Logical Operators
                boolean isJava = true;
                boolean isDSA = false;

                System.out.println("\n=== Logical Operators ===");
                System.out.println("AND (&&) : " + (isJava && isDSA));
                System.out.println("OR (||)  : " + (isJava || isDSA));
                System.out.println("NOT (!)  : " + (!isJava));

                // Unary Operators
                int n = 5;

                System.out.println("\n=== Unary Operators ===");
                System.out.println("Original : " + n);
                System.out.println("n++ : " + (n++));
                System.out.println("After n++ : " + n);

                System.out.println("++n : " + (++n));

                System.out.println("n-- : " + (n--));
                System.out.println("After n-- : " + n);

                System.out.println("--n : " + (--n));

                // Ternary Operator
                int age = 20;

                String result = (age >= 18) ? "Eligible to Vote" : "Not Eligible";

                System.out.println("\n=== Ternary Operator ===");
                System.out.println(result);

                // Bitwise Operators
                int m = 5;
                int k = 3;

                System.out.println("\n=== Bitwise Operators ===");
                System.out.println("m & k : " + (m & k));
                System.out.println("m | k : " + (m | k));
                System.out.println("m ^ k : " + (m ^ k));
                System.out.println("~m    : " + (~m));

                // Shift Operators
                System.out.println("\n=== Shift Operators ===");
                System.out.println("5 << 1 : " + (5 << 1));
                System.out.println("20 >> 2 : " + (20 >> 2));
                System.out.println("20 >>> 2 : " + (20 >>> 2));

        }
}
