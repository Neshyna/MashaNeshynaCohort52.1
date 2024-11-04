package lesson7;

public class StringEquals {
    public static void main(String[] args) {

        int x = 10;


        String str1 = "Java";
        // ссылочный тип данных.
        // ссылка на область памяти в кот находится объект типа стринг (значение)
        String str2 = "Java"; //same value in memory as str1
        String str3 = "JaVa";
        String str4 = new String("Java");
        //new value in memory, not same as str1

        System.out.println(str1 + "|" + str2 + "|" + str3 + "|" + str4);

        // compare values in variables by links
        boolean b1 = (str1 == str2);
        System.out.println("str1==str2: " + b1);//true
        System.out.println("str1==str3: " + (str1 == str3));//false
        System.out.println("str1==str4: " + (str1 == str4));//false

        //String poll
        //!!Important
        //to compare strings by values we need to use method equals
        boolean b2 = str1.equals(str2);//compare string values not links
        System.out.println("str1.equals(str2) -> " + b2);//true
        System.out.println("str1.equals(str4) -> " + str1.equals(str4));//true
        System.out.println("str1.equals(str3) -> " + str1.equals(str3));

        System.out.println(str1 + "equalsIgnoreCase(" + str3 + ") ->  " + str1.equalsIgnoreCase(str3));
        // compare by value
        //the best way to compare is only equals!!




    }
}
