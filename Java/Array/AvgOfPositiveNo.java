package RiteshRC96.Java.Array;

public class AvgOfPositiveNo {
    public static void main(String[] args) {
        int arr[] = {-12,-6,1,2,-7,3,4,5};
        System.out.println(Avarage(arr));
        
    }
    public static int Avarage(int[] arr){
        int sum = 0;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (i>=0) {
                count++;
                sum = sum + i;
            }
        }
        int avg = sum/count;

        return avg;
    }
}
