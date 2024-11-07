package hw41;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    /*
    Task 3
    Пересечение двух карт: Реализуйте метод,
    который принимает две карты Map<String, Integer>
    и возвращает новую карту, содержащую только те записи,
    ключи которых присутствуют в обеих исходных картах.
    Для совпадающих ключей значение можно брать из любой карты
     */
    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 50);
        map1.put("banana", 20);
        map1.put("cherry", 30);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("banana", 25);
        map2.put("cherry", 30);
        map2.put("date", 40);

        Map<String, Integer> intersectionMap = retainAllMap(map1, map2);
        intersectionMap.forEach((key, value) -> System.out.println(key + ": " + value));

    }

    public static Map<String, Integer> retainAllMap (Map<String, Integer> map1, Map<String, Integer> map2) {

        map1.keySet().retainAll(map2.keySet());//same way as we do it in collections or set

        return map1;

    }

    //one more option
    public static Map<String, Integer> intersection(Map<String, Integer> map1, Map<String, Integer> map2){

        Map<String,Integer> fruit = new HashMap<>();

        // loop map1
        for (Map.Entry<String, Integer> x : map1.entrySet()) {//Set<Map.Entry<K,V>> entrySet(): возвращает Set представлений всех пар "ключ-значение" карты.

            String key = x.getKey();
            Integer valueMap1 = x.getValue();

            //  if key is in map 2 (boolean)
            if (map2.containsKey(key)) {
                Integer valueMap2 = map2.get(key);

                // if values are equals -> add to new map fruit
                if (valueMap1.equals(valueMap2)) {
                    fruit.put(key, valueMap1);
                }
            }
        }
        return fruit;
    }
}
