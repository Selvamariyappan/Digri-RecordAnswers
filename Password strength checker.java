import java.util.Scanner;

public class Main {

    public static String checkPasswordStrength(String password) {
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (isSpecialCharacter(c)) {
                hasSpecialChar = true;
            }
        }

      
        if (hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar && password.length() >= 8) {
            return "Strong";
        } else if ((hasUpperCase || hasLowerCase) && password.length() >= 6) {
            return "Moderate";
        } else {
            return "Weak";
        }
    }

 
    public static boolean isSpecialCharacter(char c) {
        String specialChars = "@#$%&*()_+[]-";
        return specialChars.contains(Character.toString(c));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        String password = scanner.nextLine();

       
        String strength = checkPasswordStrength(password);
        System.out.print(strength);
    }
}