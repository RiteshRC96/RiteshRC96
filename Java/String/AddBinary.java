public class AddBinary {
    public static void main(String[] args) {

        String a = "1101";
        String b = "1011";
        System.out.println("Sum: " + addBinary(a, b));
        
    }

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0'; // Convert char to int
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0'; // Convert char to int
                j--;
            }

            // Add the sum's least significant bit to the result
            result.append(sum % 2);

            // Update carry
            carry = sum / 2;
        }

        // If carry is left, append it
        if (carry != 0) {
            result.append(carry);
        }

        // Reverse the result to get the correct order
        return result.reverse().toString();
    }
}
