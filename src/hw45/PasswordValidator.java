package hw45;

public class PasswordValidator {

        public static void isPasswordValid (String password) throws PasswordValidateException{

            if (password == null || password.length() < 8) {
                System.out.println("Password should be at least 8 characters");
                throw new PasswordValidateException("length error");
            }

            boolean isDigit = false;
            boolean isUpperCase = false;
            boolean isLowerCase = false;
            boolean isSpecialSymbol = false;

            boolean[] result = new boolean[4]; // false, false, false, false

            String symbols = "!%$@&*()[].,-";

            //throw exception can't be declared at for loop, better after check conditions are done
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);

                if (Character.isDigit(ch)) isDigit = true;
                if (Character.isUpperCase(ch)) isUpperCase = true;
                if (Character.isLowerCase(ch)) isLowerCase = true;
                if (symbols.indexOf(ch) >= 0) isSpecialSymbol = true;
            }

            System.out.printf("%s | %s | %s | %s\n", isDigit, isUpperCase, isLowerCase, isSpecialSymbol);

            if (!isDigit) throw new PasswordValidateException("digit error");
            if (!isUpperCase) throw new PasswordValidateException("uppercase error");
            if (!isLowerCase) throw new PasswordValidateException("lowercase error");
            if (!isSpecialSymbol) throw new PasswordValidateException("special symbol error");

        }
    }
