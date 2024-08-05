/*in this code we have to return the words from the given array of string,
which contain the pattern of the uppercase laetters given to us
 * 
 * in the following example the pattern is WTG which is followed by the "WelcomeToGeeksForGeeks"
 so it retun that word 
 */

import java.util.ArrayList;
import java.util.Collections;

public class Camelcase {
    public static void main(String[] args) {
        String Dictionary[]={"WelcomeGeek","WelcomeToGeeksForGeeks","GeeksForGeeks"};
        String Pattern="WTG";
        int n = Dictionary.length;
        Camelcase camelcase = new Camelcase();

        // Call the Camel method
        ArrayList<String> matches = camelcase.Camel(n, Dictionary, Pattern);

        // Print the results
        for (String match : matches) {
            System.out.println(match);
        }
        
    }
    public ArrayList<String> Camel(int N,String[] Dictionary,String Pattern){
        
        
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < Dictionary.length; i++) {
            String s = Dictionary[i];
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < s.length(); j++) {
                if (Character.isUpperCase(s.charAt(j))) {
                    sb.append(s.charAt(j));
                }
            }

            if (sb.toString().startsWith(Pattern)) {
                result.add(s);
            }
        }
        if(result.isEmpty()){
            result.add("-1");
        }
        else{
            Collections.sort(result);
        }
        return result;
    }
}
