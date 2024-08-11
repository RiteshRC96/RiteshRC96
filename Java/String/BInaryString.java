public class BInaryString {
    public static void main(String[] args) {
        System.out.println(Calculate("1c0b1a1"));
    }

    public static int Calculate(String str) {
        if (str.length()<3)
        return -1;
        int result = Character.getNumericValue(str.charAt(0));
        for (int i = 1; i < str.length(); i+=2) {
            char operator = str.charAt(i);
            int number = Character.getNumericValue(str.charAt(i+1));

            switch (operator) {
                case 'c' | 'C':
                result =result ^number;
                    break;
                
                case 'b' | 'B':
                result =result | number;
                    break;
                    
                case 'a' | 'A':
                result =result & number;
                    break;
                default:
                return -1;
            }
            
            
        }
        return result;
        
    }
    
}
