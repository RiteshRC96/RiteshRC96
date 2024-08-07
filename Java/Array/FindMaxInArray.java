package RiteshRC96.Java.Array;

public class FindMaxInArray {
    public static void main(String[] args) {
        int[] arr = { -7, 1, 5, 2, -4, 3, 7 };
        MaxInArray(arr);
        
    }
    public static void MaxInArray(int [] arr){
        int max =arr[0];
        int index =0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index =i;
                
            }
        }

        System.out.println("Max number is :" + max);
        System.out.println("Max number is :" + index);
     
    }
}
