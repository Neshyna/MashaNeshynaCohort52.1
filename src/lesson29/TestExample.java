package lesson29;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;

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


}