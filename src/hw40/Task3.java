package hw40;

import java.util.*;

public class Task3 {
    /*
    Task 3
Опционально
Написать метод, возвращающий первый неповторяющийся символ в строке
     */

    public static void main(String[] args) {

            String string = "abcdefj ab,cdf,";
            System.out.println(getFirstUniqueChar(string));

    }

    public static String getFirstUniqueChar(String string){

        Set<String> charSet = new LinkedHashSet<>();

        for (char ch: string.toCharArray()) {
            charSet.add(Character.toString(ch));
        }

        for (String s : charSet){
            int firstIndex = string.indexOf(s); //>=0
            int secondIndex = string.indexOf(s, firstIndex + 1);//not unique
            if (secondIndex == -1){//unique
                return s;
            }
        }
        return null;
    }
}
