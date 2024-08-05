public class Replacecharacter {
    public static void main(String[] args) {
        String str ="abcdaaa";
        System.out.println(Replace(str, 'a', 'd'));
        
    }

    public static String Replace(String str, char ch1, char ch2){
        char arr[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
             if(arr[i] == ch1){
                arr[i] = ch2;
            }  
            else if(arr[i] == ch2){
                arr[i] = ch1;
            }          
        }

        str = new String(arr);
        return str;
    }
}
