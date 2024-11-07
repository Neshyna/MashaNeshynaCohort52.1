package lesson41;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<Integer,String> test = new HashMap<>();
        //created empty list.16 baskets. coefficient download 0.75(12 elements)
        test = new HashMap<>(32);
        //empty list with 32 basket.0.75(24 element)
        test = new HashMap<>(32,0.90f);
        //32 basket,  0.90(29)
        test = new HashMap<>(new HashMap<>());//accept map and copy all


        Map<Integer, String> oldTable = new Hashtable<>();//old not recommend

        //constructor creates empty map
        Map<Integer , String> map = new HashMap<>();

        //v put(K key, V value) add element - a pair(key - value)
        //return old value corresponding the key. no key - null
        String oldValue = map.put(1,"Hello");
        System.out.println(oldValue);
        map.put(2,"World");
        map.put(3,"Java");

        map.put(4,"Python");//return null. there was no key at the map before.no pair with key 4
        oldValue = map.put(4,"Orange");//return old value of element 4 - python

        System.out.println("map.put(4,Orange)" + oldValue);
        System.out.println("map: " + map);


        Map<Integer,String> newMap = new HashMap<>();
        newMap.put(0,"Python");
        newMap.put(2, "New Value");
        System.out.println("newMap: " + newMap);


        //putAll - accept map and copy all pairs (key-value)
        map.putAll(newMap);
        System.out.println("map: " + map);

        //boolean containsKey(Object key) - return true, if map has the key
        //boolean containsValue(Object key) - return true, if map has the value
        System.out.println(map.containsKey(8));//true
        System.out.println(map.containsKey(1));//false
        System.out.println(map.containsValue("Java"));//true
        System.out.println(map.containsValue("NoValue"));//false
        System.out.println(map.containsValue("Orange"));//true


        System.out.println("====get value by key=========");

        //get(Object key) - return value by key. no key - null
        String value = map.get(3);
        System.out.println("map.get(3): " + value);
        System.out.println("map.get(100): " + map.get(100));//null

        //V getOrDefault(Object key, V dafault value) - return value by key. when no key - return default value
        value = map.getOrDefault(3,"Default");
        System.out.println("map.getOrDefault(3): " + value);
        value = map.getOrDefault(100,"Default");
        System.out.println("map.getOrDefault(100): " + value);

        System.out.println("=====delete pair key-value by key");
        //V remove (Object key) - delete key value.return value or null
        System.out.println("map.remove(100): " + map.remove(100));
        System.out.println("map.remove(4): " + map.remove(4));//delete value and return old value(value before delete)



    }
}
