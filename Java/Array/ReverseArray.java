package RiteshRC96.Java.Array;

public class ReverseArray {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        Rotate(arr, 8);
        for (int i : arr) {
            System.out.print(i + " ");   
        }

    }
    public static int[] reverse(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end-1];
            arr[end-1] = temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void Rotate(int []arr, int k){
        k = k%arr.length;
        arr = reverse(arr, 0, arr.length);
        arr = reverse(arr, 0, k);
        arr = reverse(arr, k, arr.length);
    }
}
