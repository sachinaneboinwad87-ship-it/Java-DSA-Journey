package javadsa.basics.string;

public class vowels {
    public static  void vowels(String str){
        int count =0;

      for (int i =0; i <str.length();i++){
            char ch = Character.toLowerCase(str.charAt(i));
          if (ch == 'a' || ch == 'e' || ch == 'i' ||
                  ch == 'o' || ch == 'u') {
              count++;
          }
        }
        System.out.println("Total count of vowels "+count);
    }

    public static void main(String[] args) {
        String str = "Education";
        vowels(str);

    }
}
