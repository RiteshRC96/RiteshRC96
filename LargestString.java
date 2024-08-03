
/** 
 * Here we can find the laggest string by Lexicographic way
 * Lexicographic is the method which check two strings 
 * for example apple and banana - in this example a (from apple) comes first than  the b (from banana)
 * so function says that apple is smaller than the banana
*/
public class LargestString {
    public static void main(String[] args) {
        String str[] = {"Ritesh", "Raprakash", "Chougule"};
        System.out.println(Largest(str));
    }
    public static String Largest(String a[]){
        String ls = a[0];

        for (int i=0; i<a.length; i++){
            ls = (ls.compareToIgnoreCase(a[i]) < 0)? ls = a[i] : ls;
        }
        return ls;
    }

    
}
