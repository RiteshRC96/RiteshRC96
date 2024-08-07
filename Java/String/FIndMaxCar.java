

public class FIndMaxCar {
    public static void main(String[] args) {
        String str = "SSXSSSXS";
        System.out.println(Car(str));
        
    }
    public static int Car(String str){
        char[] arr = str.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]=='S' && arr[i] == arr[i+1]){
                count ++;
            }
        }
        return count*2;
    }
}
