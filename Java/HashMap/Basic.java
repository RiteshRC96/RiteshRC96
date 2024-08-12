package RiteshRC96.Java.HashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Basic {
    public static void main(String[] args) {
        //Creation
        HashMap <String, Integer> map = new HashMap<>();

        //Insertion
        map.put("india", 120);
        map.put("USA", 11);
        map.put("USA", 1290);

        //Printing 
        System.out.println(map);

        //Searching
        System.out.println(map.containsKey("india"));

        //getting the value from the key
       System.out.println( map.get("USA"));

       //Removing key
       map.remove("USA");

       //Iterate 
       for(Map.Entry<String, Integer> e : map.entrySet()){
        System.out.print(e.getKey() + " ");
        System.out.println(e.getValue());

        //2nd Method
        Set<String> keys = map.keySet();
        for(String s : keys){
            System.err.println(s + " " + map.get(s));
        }

       }
    }
}
