package RiteshRC96.Java.Numbers;

public class Try {
    public static void main(String[] args) {
        
        int arr[] = {11,21,35,48,60,12,72};
        check(arr, 2);
    }
    public static void check(int arr[], int k) {

        
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int sum=0;
            while (temp>0) {
                int rem = temp%10;
                sum = sum + rem;
                temp = temp/10;
            }
            
                if (sum%k ==0 && arr[i] % k != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
