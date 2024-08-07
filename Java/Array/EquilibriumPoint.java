package RiteshRC96.Java.Array;

public class EquilibriumPoint {
    public static void main(String[] args) {
        int[] arr = { -7, 1, 5, 2, -4, 3, 0 };
        System.out.println(eqPt(arr));
    }
    // Common Apporach Time Complexity = O(n^3):-
    // public static int eqPt(int[] arr){
    //     for (int i = 0; i < arr.length; i++) {
    //         int leftsum = 0;

    //         for(int j=0; j<i; j++)
    //             leftsum = leftsum + arr[j];
    //             int rightsum =0;

    //             for(int k=i+1; k<arr.length; k++)
    //                 rightsum = rightsum + arr[k];

    //                 if (rightsum == leftsum) {
    //                     return i+1;
    //                 }
    //     }
    //     return -1;
    // }

    // time complexity = O(n):-
    public static int eqPt(int[] arr){
        int totalSum =0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        int leftSum =0;
        for (int i = 0; i < arr.length; i++) {
            totalSum = totalSum - arr[i]; //act as the right sum
            
            if (leftSum == totalSum) {
                return i+1;
            }
            leftSum = leftSum + arr[i];
        }
        return -1;
    } 


}
