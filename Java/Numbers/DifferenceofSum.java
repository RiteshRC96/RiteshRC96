package RiteshRC96.Java.Numbers;

public class DifferenceofSum {
    public static void main(String[] args) {
        System.out.println(Diff(10, 100 ));
        
    }
    public static int Diff(int divisor, int number){
        int DivisibleSum =0;
        int notDivisibleSum =0;
        for (int i = 0; i <=number; i++) {
            if (i%divisor ==0) {
                DivisibleSum += i;
            }
            else{
                notDivisibleSum += i;
            }
        }
        return notDivisibleSum -DivisibleSum;
    }
}
