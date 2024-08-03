import java.util.Scanner;

class Palimdrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = (CheckPalindrome(str) == true)? "Palindrome" : "Not Palindrome";
        System.out.println(result);
        sc.close();
        
    }

    public static boolean CheckPalindrome(String s){
        boolean result =false;
        for(int i=0; i<(s.length())/2 ; i++){
           result = (s.charAt(i) == s.charAt(s.length() -i-1))? true : false;
        }

        return result;
    }
}