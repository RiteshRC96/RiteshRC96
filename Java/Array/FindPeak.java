package RiteshRC96.Java.Array;

import java.util.ArrayList;

public class FindPeak {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,3,2,1};
        //int arr1[] = {1,2,3,4,3,2,1,5,6,7,8,9,8,7,6,5};
        peak(arr);
        //peak(arr1);

    }

    public static void peak(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        if (arr.length ==0) {
            System.out.println(-1);
            return;    
        }
        if (arr[0] > arr[1]) {
            System.out.println(arr[0]);
            return;
        }
        else if (arr[arr.length-1] > arr[arr.length-2]) {
            System.out.println(arr[arr.length-1]);
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            int num = arr[i];
            if (arr[i-1]< num && arr[i+1]< num) {
                list.add(num);
            }
        }
        list.toArray();
        for (int i:list ) {
            System.out.println(i);
        }
    }
}
