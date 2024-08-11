//import java.util.ArrayList;

public class RepeateString {
    public static void main(String[] args) {

        System.out.println(repeat("abc", 3));
    }

    public static String repeat(String str, int count) {
        // System.out.println(str*count);
        // ArrayList <String> list = new ArrayList<>();
        // for (int i = 0; i < count; i++) {
        //     list.add(str);
        // }
        // String s = list.toString();
        // for(char ch: s.toCharArray()){
        //     System.out.println(ch);
        // } 

        return str.repeat(count);
    }
}
