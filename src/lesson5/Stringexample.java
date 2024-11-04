package lesson5;

public class Stringexample {
    public static void main(String[] args) {
        String string = "Java";
        //declare and initialization string type
        String string1 = new String("Hello");
        // create new row  or string, not recommended
        System.out.println(string);

        int length = string.length();
        System.out.println("length:" + length);
        //to get length of the string


        System.out.println(string.toUpperCase());
        //method helps to make all symbols to upper case

        //string value must not change
        //to save changes of the value. need to sve and create new variable
        String stringUpper = string.toUpperCase();
        System.out.println("stringtouupercase:" + stringUpper);
        System.out.println("string:"+ string);

        //to lower case
        stringUpper = stringUpper.toLowerCase();
        System.out.println("stringLow:" + stringUpper);
        //rewrite value. results og method can save to the same variable

        System.out.println("==========================\n");


        //unite strings
        //concat конкатенация
        String str1 = "One";
        String str2 = " ";
        String str3 = "hello";
        String concatStr = str1 + str2 + str3;
        System.out.println("concatStr:" + concatStr);

        //concate vs. sum
        System.out.println(1+3);//sum
        System.out.println(1+3 + ":" + 2+3);
        /*concate result: " 4 : 23" (sum + string)
        when there is string (example ":") all the rest declare
        as string and not as sum despite sign +
        + is not all the time sum but also concat*/

        System.out.println(1+3+":" +(2+3));
        //sum +concat+sum because of the brackets ()

        //concat1
        String concatStr2 = str1.concat(str2);//str1+str2
        concatStr2 = concatStr2.concat(str3); //str1+str2+str3
        System.out.println("concatStr2:" +concatStr2);

        //method chain concat 2
        String concatStr3 = str1.concat(str2).concat(str3);
        System.out.println("concatStr3:" + concatStr3);
        //(str1 + str2) +str3


        //concat3
        //"One", "hello", "java" + space between all
        String concatStr4 = str1 + " " + str3 + " " + "java";
        System.out.println("concatStr4:" + concatStr4);
        concatStr4 = String.join( "  -   ", str1, str2, str3, "java");
        System.out.println("concatStr4:" + concatStr4);

        System.out.println("========================\n");

        String digits = "0123456789";
        System.out.println("digits.length():" + digits.length());
        //take a symbol from the line by it's index
        char firstChar = digits.charAt(0);
        System.out.println("firstChar:" + firstChar);// take number 0 from the line
        System.out.println(digits.charAt(4));
        char lastChar = digits.charAt(digits.length() -1);
        System.out.println(lastChar);
        //despite the line length index of the last symbol is all the time -1

        System.out.println("====================");


        String subString = digits.substring(2);
        //takes substring from second index till the end (till the last)
        System.out.println("substring:" + subString);

        String subString2 = digits.substring(2,7);
        //take symbols form second (including) till 7th (not including)
        //(2,7] including 2th and including 7th
        System.out.println(subString2);



    }
}
