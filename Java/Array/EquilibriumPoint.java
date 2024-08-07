package RiteshRC96.Java.Array;

public class EquilibriumPoint {
    public static void main(String[] args) {
        int[] arr = { -7, 1, 5, 2, -4, 3, 0 };
        System.out.println(eqPt(arr));
    }
    public static int eqPt(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int leftsum = 0;

            for(int j=0; j<i; j++)
                leftsum = leftsum + arr[j];
                int rightsum =0;

                for(int k=i+1; k<arr.length; k++)
                    rightsum = rightsum + arr[k];

                    if (rightsum == leftsum) {
                        return i+1;
                    }
        }
        return -1;
    }
}
