package hw30;

import hw27.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PersonTestClass {

    hw27.Person person;
    String startEmail = "john@test.com";
    String startPassword = "qwerty10$";

    @BeforeEach
    void setUp() {
        person = new Person(startEmail,startPassword);
    }
    /*
    1. Берем валидный email
    2. Устанавливает сеттером валидный email person-у
    3. Мы ожидаем: что у person в поле email будет валидный email, который мы установили на шаге 2
    4. Проверить равенство person.getEmail() c валидным email, который мы устанавливали
     */


    @Test
    void testValidEmailSet() {
        String validEmail = "Valid123@test.com";
        person.setEmail(validEmail);
        System.out.println("getEamil: " + person.getEmail());
        Assertions.assertEquals(validEmail, person.getEmail());
    }

    /*
    1. Берем не валидный email
    2. Устанавливаем сеттером не валидный email person-у
    3. Ожидаем результат: Email установлен не будет.
    1) Т.е. значение email у person не будет равно не валидному email
    2) Значение поля email у person останется прежним
    4.
     */
    @ParameterizedTest
    @MethodSource("invalidEmailData")
    void testInvalidEmailSet(String invalidEmail) {
        person.setEmail(invalidEmail);
        Assertions.assertNotEquals(invalidEmail,person.getEmail());
        Assertions.assertEquals(startEmail,person.getEmail());
    }
    static Stream<String> invalidEmailData(){
        return Stream.of(
                "testmail.net",
                "test@@mail.net",
                "test@mai@l.net",
                "test@mailnet",
                "test@mail.ne.t",
                "test@mail.net.",
                "test@mailne.t",
                "test@ mail.net",
                "test@ma!il.net",
                "t#est@mail.net",
                "test@mail.?net",
                "@testmail.net",
                "1test@mail.net",
                "_test@mail.net",
                "-t@mail.net",
                ".est@mail.net",
                "test+1@mail.net"
                //add upper case
        );
    }
    @Test
    void testValidPasswordSet(){
        String validPassword = "Test_123";
        //i.e. String validPassword = "Test123"; with incorrect pass will fail
        person.setPassword(validPassword);
        System.out.println("validPassword: " + person.getPassword());
        Assertions.assertEquals(validPassword,person.getPassword());
    }
    @ParameterizedTest
    @MethodSource("invalidPassword")
    void testInvalidPassword(String invalidPassword){
        person.setPassword(invalidPassword);
        Assertions.assertEquals(startPassword,person.getPassword());
        Assertions.assertNotEquals(invalidPassword,person.getPassword());
    }
    static Stream<String> invalidPassword(){
        return Stream.of(
                "Test_1",//length less than 8
                "Test_test",//no numbers
                "TEST_123",//no lower case
                "test_123",//no upper case
                "Test123456"//no special symbol
                //"Test_123" test will fail as well as email passed gut
        );
    }
    @Disabled
    @Test
    void assertNulEquals(){
        // При сравнеие на равенство null с null - assertEquals выдает true
        String string = null;
        Assertions.assertEquals(null, string);
    }



}
