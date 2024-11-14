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


            /*
             String errorMessage = "Errors! should be a: ";
        int initLength = errorMessage.length();


       // errorMessage += "Dtr"; // -> errorMessage = errorMessage + "Dtr;"
       //  int x = 10;
       // x -= 5; // x = x - 5;

        if (!isDigit) errorMessage += "digit in password; "; // "Errors! should be a: digit in password; "
        if (!isLowerCase) errorMessage += "lower case letter in password; "; // "Errors! should be a: digit in password; lower case letter in password;"
        if (!isUpperCase) errorMessage += "upper case letter in password; "; // "Errors! should be a: upper case letter in password; "
        if (!isSpecialSymbol) errorMessage += "special symbol in password; "; // "Errors! should be a: digit in password; lower case letter in password; special symbol in password;"

        // Несколько вариантов проверить, прошел ли пароль валидацию
//        if (errorMessage.length() > initLength) throw new PasswordValidateException(errorMessage);

        // Проверяем, если хотя бы в одной из переменных окажется false, то пароль не прошел валидацию. Бросаем исключение.
        if (!(isDigit && isUpperCase && isLowerCase && isSpecialSymbol)) throw new PasswordValidateException(errorMessage);

             */
        }
    }
