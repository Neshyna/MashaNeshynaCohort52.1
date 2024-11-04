package homework5_Neshyna_16September;

public class Task2 {

     /*
    Author: Masha Neshyna
    Date: 16/09/2024

Task 2
1.Создайте строки:
"Java"
"is"
"a"
"powerful"
"language"
2.Склейте эти строки двумя разными способами, чтобы получить строку: "Java is a powerful language".
3.Выведите на экран получившуюся строку и её длину.

      */

    public static void main(String[] args) {

        //1
        String str1 = "Java";
        String str2 = "is";
        String str3 = "a";
        String str4 = "powerfull";
        String str5 = "language";
        String str6 = " ";


        //2
        String concatStr1 = String.join(" ", str1, str2, str3, str4, str5);
        /*
        this concat type join strings with ","
        not with "+"
        space (" ") mentioned at the beginning in brackets
        space is also possible instead of ""
         */
        System.out.println("concatStr1:" + concatStr1);

        String concatStr2 = str1.concat(str6).concat(str2).concat(str6).concat(str3).concat(str6).concat(str4).concat(str6).concat(str5);
        System.out.println("concatStr2:" + concatStr2);

        //3
        int length1 = concatStr1.length();
        System.out.println("length.concatStr1:" + length1);
        //to get length of the string
        int length2 = concatStr2.length();
        System.out.println("length.concatStr2:" + length2);



        //String result = concatStr2.replace("powerful", "super");
       String result = concatStr2.replace(str4, "super");
        System.out.println(result);



    }
}
