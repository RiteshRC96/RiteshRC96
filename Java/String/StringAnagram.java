/*What are anagrams?
If two strings contain the same characters but in a different order, they can be said to be anagrams. Consider race and care. In this case, race's characters can be formed into a study, or care's characters can be formed into race. Below is a java program to check if two strings are anagrams or not.
 */

import java.util.Arrays;

public class StringAnagram {
    public static void main(String[] args) {

        String str1 = "ritesh";
        String str2 = "erisht";
        System.out.println(CheckAnagram(str1, str2));

    }

    public static boolean CheckAnagram(String str1, String str2){
        boolean result=false;
        if (str1.length() != str2.length()){
            return false;
        }
        else{
            char s1[] = str1.toCharArray();
            char s2[] = str2.toCharArray();
            Arrays.sort(s1);
            Arrays.sort(s2);

            result = Arrays.equals(s1, s2);
        }
        return result;
    }
}
