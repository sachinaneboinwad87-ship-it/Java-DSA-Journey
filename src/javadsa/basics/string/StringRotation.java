package javadsa.basics.string;

public class StringRotation {
    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "CDAB";

        if (str1.length() == str2.length() && (str1 + str1).contains(str2)) {
            System.out.println("The strings are rotations of each other.");
        } else {
            System.out.println("The strings are not rotations of each other.");
        }
    }
}
