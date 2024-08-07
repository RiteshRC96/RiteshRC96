package RiteshRC96.Java.Array;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {   
        int arr[] = {1,2,3,4,5,6};
        Remove(arr);
        for (int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void Remove(int[] arg) {
        Arrays.sort(arg);
        int arr[] = new int[arg.length];
        int j = 0;
        for (int i = 0; i < arg.length-1; i++) {
            if (arg[i] != arg[i+1]) {
                arr[j] = arg[i];
                j++;
            }
        }
    }
}
