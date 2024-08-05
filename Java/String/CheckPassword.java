public class CheckPassword {
    public static void main(String[] args) {
        String Password = "Ritesh2003";
        System.err.println(Check(Password));
        
    }
    public static int Check(String str){

        if (str.length() < 4) {
            return 0;
        }
        boolean hasDigit = false;
        boolean hasCapitalLetter = false;

        for (char c : str.toCharArray()) {
            if (c == ' ' || c == '/') {
                return 0;
            }
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
            if (Character.isUpperCase(c)) {
                hasCapitalLetter = true;
            }
        }
        if (Character.isDigit(str.charAt(0))) {
            return 0;
        }
        return (hasDigit && hasCapitalLetter) ? 1 : 0;
    }

    }
