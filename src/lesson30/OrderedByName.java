package lesson30;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//alphabetic order
@TestMethodOrder(MethodOrderer.MethodName.class)
public class OrderedByName {

    @Test
    void testB(){
        System.out.println("testB");
    }
    @Test
    void testA(){
        System.out.println("testA");
    }
    @Test
    void testC(){
        System.out.println("testC");
    }
}
