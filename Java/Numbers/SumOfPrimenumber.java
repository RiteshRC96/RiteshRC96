package RiteshRC96.Java.Numbers;

public class SumOfPrimenumber {
    public static void main(String[] args) {
        System.out.println(sum(10)); 
    }
    public static int sum(int a){
        int sum = 0;
        for(int i =2; i<=a; i++){
            if (IsPrimeNo(i)) {
                sum = sum +i;
            }
        }
        return sum;
    }
    public static boolean IsPrimeNo(int number){
        for(int i=2; i<number; i++){
            
            if (number%i ==0) {
                return false;
            }
        }
        return true;
    }
}
