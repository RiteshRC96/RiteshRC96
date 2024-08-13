package RiteshRC96.Java.Numbers;
public class SumOfDivisor {
    public static void main(String[] args) {
        System.out.println(Sum(6));
        //1+2+3+6 = 12
    }

    public static int Sum(int num){
        int sum =0;
        for (int i = 1; i <=num; i++) {
            if (num%i ==0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
