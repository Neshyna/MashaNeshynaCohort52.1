package lesson30;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//order of execution of the tests methods in the class is determined by @order
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTests {

    @Test
    @Order(10)
    void firstTest(){
        System.out.println("firstTest");
    }
    @Test
    @Order(20)
    void secondTest(){
        System.out.println("second test");
    }
    @Test
    @Order(30)
    void thirdTest(){
        System.out.println("third test");
    }

    @Test
    @Order(15)
    void betweenTest(){
        System.out.println("between test");
    }
    @Test
    void randomTest(){
        System.out.println("random test");
    }
}
