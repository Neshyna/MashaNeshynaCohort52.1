package homework5_Neshyna_16September;

public class Task2_2 {

     /*
    Author: Masha Neshyna
    Date: 16/09/2024

Task 2.2 * (Опционально)
1.Замените в результирующей строке слово "powerful" на "super".
2.Создайте переменную типа boolean с ответом на вопрос: содержит ли строка подстроку "age"?
3.Выведите на экран значение этой переменной.

      */

        public static void main(String[] args) {

            System.out.println("============Task2.2===========");
            //Task 2.2
            // 1
            String oldStr = "powerful";
            String newStr = oldStr.replace("powerful", "super");

            System.out.println("oldStr:" + oldStr);
            System.out.println("newStr(replaced):" + newStr);

            //2,3

            String containsAge = "Java is a powerful language";
            String question = "Does string contains substring \"age\"?:";
            boolean booleanTrue = containsAge.contains("age");
            //Returns true if and only if this string contains the specified sequence of char values.

            System.out.println(containsAge);
            System.out.println("Question:" + question);
            System.out.println("Output:" + booleanTrue);


            System.out.println("===================");


            //replace sting поиск вхождения поддержка работы с регулярными выражениями
            String replaceMe = "AbAbAbAc";
            String rerlace1 = replaceMe.replaceFirst("Ab","C");
            String replace2 = replaceMe.replace("Ab","D");
            String replace3 = replaceMe.replaceAll("Ab","E");

            System.out.println("replace1:" + rerlace1);
            System.out.println("replace2:" + replace2);
            System.out.println("replace3:" + replace3);



            // поиск индекса вхождения подстроки в строку
            //  to find the exact place where "age" is located in the string
            // i.e. symbol number 24 variable.indexOf

            int index = containsAge.indexOf("age");
            System.out.println(index);

           //replaceMe AbAb
            int indexAb1 =  replaceMe.indexOf("Ab");
            System.out.println(indexAb1);
            int indexAb2 = replaceMe.lastIndexOf("Ab");
            // last index where ab is located in the string
            System.out.println(indexAb2);

           }

        }


