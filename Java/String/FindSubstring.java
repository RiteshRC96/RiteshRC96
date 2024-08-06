public class FindSubstring {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        String sub = "geeks";
        System.out.println(search(str, sub));

    }
    public static String search(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        //int result = -1;
        for(int i=0; i<X.length() - Y.length()+1; i++){
            if(X.substring(i, i+Y.length()).equals(Y)){
                sb.append(i + " ");
               // result = i+1;
            }
        }
        //return result;
        return sb.toString();
    }
}
