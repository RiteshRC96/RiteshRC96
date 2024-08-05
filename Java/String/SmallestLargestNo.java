import java.util.*;
public class SmallestLargestNo {
    public static void main(String[] args) {
        String str = "Ritesh Ramprakash Chougule Tardal";
        SmallAndLagge(str);
        
    }  
    public static void SmallAndLagge(String str){
        String s[] = str.split(" ");
        int max = 0;
        String result="";
        for (int i = 0; i < s.length; i++) {
            String a = s[i];
             int count = a.length();
             if (count>max){
                max=count;
                result = s[i];
             }
        }
        int min =max;
        String minResult="";
        for (int i = 0; i < s.length; i++) {
            int count1 = s[i].length();

            if (min>=count1) {
                min = count1;
                minResult = s[i];

            }

        }
        System.err.println(result);
}
}
