package javadsa.basics.string;

public class Duplicate {
    public static void findDuplicates(String str){
        char[] ch = str.toCharArray();
        boolean[] visited = new boolean[ch.length];

        for (int i = 0; i < ch.length; i++) {

            if (visited[i]) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            if (count > 1) {
                System.out.println(ch[i] + " : " + count);
            }
        }

    }

    public static void main(String[] args) {
        String str = "programming";
        findDuplicates(str);
    }
}
