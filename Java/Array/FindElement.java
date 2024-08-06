package RiteshRC96.Java.Array;

public class FindElement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6};
        System.out.println(Check(arr, 0));
        System.out.println(Check(arr, 3));
        
    }

    public static boolean Check(int arr[], int n){    
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return true;
            }
        }
        return false;
    }
}
