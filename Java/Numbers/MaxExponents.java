package RiteshRC96.Java.Numbers;

public class MaxExponents {
    public static void main(String[] args) {
        System.out.println(Exponents(10, 20));
        
    }

    public static int Exponents(int num1, int num2) {
        
        int MaxExponent =0;
        if (num1> num2) {
            return -1;
        }
        for (int i = num1; i <=num2; i++) {
            int number = i;
            int count = 0;
            while (number != 0 && number%2 ==0) {
                number = number/2;
                count++;
            }
            if (count > MaxExponent) {
                MaxExponent = count;
            }
        }
        return MaxExponent;
    }
    
}
