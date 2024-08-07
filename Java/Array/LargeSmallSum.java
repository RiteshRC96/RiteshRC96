package RiteshRC96.Java.Array;

import java.util.Arrays;

public class LargeSmallSum {
    public static void main(String[] args) {
        int[] arr = { -7, 1, 5, 2, -4, 0, 3 };
        System.out.println(Sum(arr));
    }
    public static int Sum(int [] arr){
        int even [] = new int[arr.length];
        int odd []  = new int[arr.length];
        for(int i=0; i<arr.length-1; i++ ){
            odd[i] =arr[i];
            even[i+1] = arr[i+1];
        }
        Arrays.sort(even);
        Arrays.sort(odd);
        return even[even.length-3] + odd[1] ;
    }
}
