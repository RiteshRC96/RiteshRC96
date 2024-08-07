package RiteshRC96.Java.Numbers;

public class Try {
    public static void main(String[] args) {
        int number =16;
        int count = 0;
        while (number != 0 && number%2 ==0) {
            number = number/2;
            count++;
        }
        System.out.println(count);
    }
}
