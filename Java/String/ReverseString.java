import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String Str = sc.nextLine();
        String reversed = new StringBuilder(Str).reverse().toString();
        System.err.println(reversed);
        sc.close();
    }
}
