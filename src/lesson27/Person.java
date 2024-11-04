package lesson27;

public class Person {
    private String email;
    private String password;

    public Person(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)){
            this.email = email;
        }
    }

    private boolean isEmailValid(String email) {
    /*
    test@email.com.net
    1. Должна присутствовать @ и только одна - done
    2. Точка после собаки - done
    3. После последней точки есть 2 или более символов
    4. Алфавит, цифры, '-', '_', '.', '@'
    5. До собаки должен быть хотя бы 1 символ
    6. Первый символ - должна быть буква
     */
        //1
        int indexAt = email.indexOf("@");
        //int lastAt = email.lastIndexOf("@");
        if (indexAt == -1 || indexAt != email.lastIndexOf("@")) return false;

        //2
        int dotIndexAfterAt = email.indexOf(".",indexAt +1);
        if (dotIndexAfterAt == -1) return false;

        Character.isAlphabetic('c');
        Character.isDigit('c');
        Character.isLetterOrDigit('c');

        return true;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String toString(){
        return "Person(" +
                "email ='" + email + '\'' +
                ",password ='" + password + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person person = new Person("email","password");
        System.out.println(person);

        System.out.println(Character.isLetterOrDigit('@'));
        System.out.println(Character.isLetterOrDigit('1'));
        System.out.println(Character.isLetterOrDigit('F'));
        System.out.println(Character.isLetterOrDigit('.'));
        System.out.println(Character.isLetterOrDigit('ы'));
        System.out.println(Character.isAlphabetic('R'));
    }
}
/*
Требование к паролю:
длина >= 8
Должна быть мин 1 цифра
Должна быть мин 1 маленькая буква
Должна быть мин 1 большая буква
Должна быть мин 1 спец. символ (!%$@&*()[].,-)

5 boolean переменных. Каждая "отвечает за свой пункт".
Пароль будет подходить только если все пять - true
return b1 && b2 && b3 && b4 && b5;
 */