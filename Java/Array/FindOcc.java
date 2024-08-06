package RiteshRC96.Java.Array;

public class FindOcc {
        public static void main(String[] args) {
            int arr[] = {1,2,3,3,3,5,6,6,6};
            System.out.println(Check(arr, 0));
            System.out.println(Check(arr, 6));
            
        }
    
        public static int Check(int arr[], int n){  
            int count =0;  
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == n) {
                    count++;
                }
            }
            return count;
        }
    }
