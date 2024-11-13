package hw45;

public class ValidatePassMain {

    public static void main(String[] args) {

        String password = "masha123";

        try {
            PasswordValidator.isPasswordValid(password);
            System.out.println("password is valid");

        } catch (PasswordValidateException e) {

            System.out.println("password '" + password + "' is invalid");
            System.out.println(e.getMessage());

        }
    }
}
