package RiteshRC96.Java.Numbers;

public class MagicalNumber {
    public static void main(String[] args) {
        System.out.println(MagicalNo(4));

    }
    public static int MagicalNo(int number){
        int count =0;
        
        for(int i=1; i<=number; i++){

            String str = Integer.toBinaryString(i);

            str =str.replace('1', '2');
            str =str.replace('0', '1');

            int n = Integer.parseInt(str);
            
            int sum =0;

            while (n>0) {
                int rem = n%10;
                sum = sum +rem;
                n/=10;
            }
            if (sum%2 !=0) {
                count ++;
            }
        }
        return count;
    }
}
