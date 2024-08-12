public class FindFirstLastPosition {
    public static void main(String[] args) {
        int arr[] ={5,7,7,8,8,10};
        int res[] = FindPosition(arr, 8);
        System.out.println(res.toString());

    }
    public static int[] FindPosition(int arr[], int target){
        int result[] = {-1,-1};
        int first = first(arr, target);
        if (first == -1) {
            return result;
        }
        
        // Find the last occurrence
        int last = Last(arr, target);
        
        result[0] = first;
        result[1] = last;
        
        return result;
    }

    public static int first(int arr[], int target){
        int start =0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = (start + end)/2;
            if(arr[mid]>=target){
                end = mid -1;
            }
            else{
                start = mid +1;
            }
        }
        if (arr[start] == target && start < arr.length){
            return start;
        }
        return -1;
    }

    public static int Last(int arr[], int target){
        int start =0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = (start + end)/2;
            if(arr[mid] <= target){
                start =mid +1;
            }
            else{
                end = mid -1;
            }
        }
        if (end>0 && arr[end] == target){
            return end;
        }
        return -1;
    }
}
