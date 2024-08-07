package RiteshRC96.Java.Array;

public class MergeArray {
    public static void main(String[] args) {  
        
        int arr[] = {1,2,3,5,1,6};
        int arr2[] = {7,8,9,0};

        Merging(arr, arr2);
        
    }

    public static void Merging(int arr1[], int arr2[]){
        int arr3[] = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[i+ arr1.length] = arr2[i];
        }
        for(int k: arr3){
            System.out.print(k + " ");
        }
    }
}
