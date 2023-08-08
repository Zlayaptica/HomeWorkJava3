import java.util.Scanner;

public class PasswordVerifierMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pass;
        System.out.print("Enter password:");
        pass = input.nextLine();

        if (isValid(pass)) {

            boolean hasUppercase = pass.equals(pass.toUpperCase());
            if (!hasUppercase) {
                System.out.print("Must have atleast one uppercase letter!");
            } else {
                System.out.print("Password Successful!");
            }

        } else {
            System.out.print("""
                    Invalid Password! The password must be at least 8 characters long.
                    The password must contain at least one digit.
                    The password must contain at least one capital letter.""");
        }

        System.out.println();
        System.out.println(isValid(pass));
    }

    private static boolean isValid(String pass) {
        if (pass.length() < 8) {
            return false;
        } else {
            int dCount = 0;
            int cCount = 0;
            for (int i = 0; i <= pass.length() - 1; i++) {
                char c = pass.charAt(i);

                if (Character.isLetter(c)) {
                    cCount++;
                }
                if (Character.isDigit(c)) {
                    dCount++;
                }
            }
            return dCount > 0 && cCount > 0;
        }

    }
}