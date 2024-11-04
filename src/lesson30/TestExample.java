package lesson30;

import lesson27.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import javax.xml.transform.Source;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TestExample {

   // done before each test method
   @BeforeEach
   public void setUp(){
       System.out.println("Method @BeforeEach");
   }
   /*
    @BeforeAll - метод выполняется только один раз перед выполнение первого теста
    @AfterEach - выполняется после КАЖДОГО тестовым методом
    @AfterAll - метод выполняется только один раз после выполнение всех тестовых матодов
    @Disabled - указывает, что тест отключен и выполняться не будет
    @Nested - позволяет создать вложенный тестовый класс. Может быть использована для логический группировки тестовых методов
     */


    //declares test method
    @Test
    public void testAddition(){
        System.out.println("addition");
        int result = 2 + 2;
        //expected result 4
        //actual result  at result variable
        //method to check assumption
        //assertEquals(expected, actual) - checks are they both equal
        Assertions.assertEquals(4,result);//check are two values equal

        Assertions.assertNotEquals(5,result);
        //test passed if not expected result is not equal to actual one

        Assertions.assertTrue(result >= 4); //check if condition true
        assertFalse(result > 5); //check false and return false
        assertNull(null);//check obj = null
        assertNotNull("String");//check not null
    }
    public void emptyTest(){
        System.out.println("test empty");
        //empty test method is passed
        //when there is no false assumption

    }
    @ParameterizedTest
    @ValueSource(strings = {"apple","banana","cherry"})
    public void testFruits(String fruit){
        System.out.println(fruit);
        assertTrue(fruit.length() > 2);
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    void testInts(int value){
        System.out.println("current value: " + value);
        Assertions.assertTrue(value > -5);
    }

    //CSV - comma separated value
    //data source CSV format
    @ParameterizedTest
    @CsvSource({"apple,1" , "banana,2" , "cherry, 3"})
    void testWithSource(String fruit, int rank){
        System.out.println(fruit + "|" + (rank +10));
        assertTrue(fruit.length() > 4 && rank > 0);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "data.csv")
    void testCsvFileSource(String fruit, int rank, boolean flag){
        System.out.println(fruit + "|" + rank + "|" + !flag);
        assertNotNull(fruit);
        assertTrue(rank > 0);
    }

    //data source - method
    @ParameterizedTest
    @MethodSource("testDataFruit")
    void testMethodSource(String fruit ){
        System.out.println(fruit);
        assertNotNull(fruit);
    }

    static Stream<String> testDataFruit(){
        return Stream.of("apple","banana","cherry");
    }

    @ParameterizedTest
    @MethodSource("testDataInt")
    void testMethodSource2(int value){
        System.out.println("current value: " + value);
        assertNotEquals(100,value);
    }

    static Stream<Integer> testDataInt(){
        return Stream.of(1,2,3,4,5);
    }
    @ParameterizedTest
    @MethodSource("testDataArguments")
    void testMethodSourse(int value, int expected, boolean isEquals){
        System.out.println(value + "|" + expected + "|" + isEquals);
        int result = value * value;
        //assertEquals(expected,result);
        assertEquals(isEquals, result==expected);
    }

    static Stream<Arguments> testDataArguments(){
        return Stream.of(
                Arguments.of(2,4,true),
                Arguments.of(3,9,true),
                Arguments.of(4,15,false)
        );
    }

    @ParameterizedTest
    @MethodSource("testPersonsData")
    void testPersonsData(PersonTest person, String newEmail){
        System.out.println(person);
        System.out.println(newEmail);
    }
    static Stream<Arguments> testPersonsData(){
        return Stream.of(
                Arguments.of(new PersonTest("test@mail.com","pass234"),"new123@gmail.com"),
                Arguments.of(new PersonTest("invalid.mail.com", "password"), "mail.test.com")
        );
    }







}