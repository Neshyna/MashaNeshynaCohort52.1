package lesson20;

import java.util.Arrays;
import java.util.Scanner;

public class StringBuilderExample {
    public static void main(String[] args) {
        String str = "Java" + "is" + " " + "the" + " " + "best";


        StringBuilder sb = new StringBuilder("Hello");
        StringBuilder sb1 = new StringBuilder(str);

        //method to add in the end of line, to add to the right, concatenate analog
        sb.append(" ").append("Java");

        //return string representation
        String string = sb.toString();
        System.out.println(string);

        //insert symbols to particular position
        StringBuilder sb2 = new StringBuilder("Hello World");
        sb2.insert(6,"beautiful ");
        System.out.println(sb2);

        //replace substring by index to the set value
        StringBuilder sb3 = new StringBuilder("Hello World");
        sb3.replace(6,11,"Java");//not including
        System.out.println(sb3);

        //delete
        StringBuilder sb4 = new StringBuilder("Hello World");
        sb4.delete(5,11);
        System.out.println(sb4);

        //reverse
        StringBuilder sb5 = new StringBuilder("Hello World");
        sb5.reverse();
        System.out.println(sb5);

        //line length
        System.out.println("length: " + sb5.length());

        //get symbol by index
        char ch = sb5.charAt(3);
        System.out.println(ch);

        //return substring
        sb = new StringBuilder("hello world");
        String substring = sb.substring(1);//from index till the end of line
        System.out.println("substr: " + substring);

        substring = sb.substring(6,9);//from start index till end index
        System.out.println("substr 6-9: " + substring);


        //change size
        // Изменять размер последовательности символов
        sb = new StringBuilder("Hello");
        sb.setLength(10);
        // Если увеличить строку, она будет заполнена char с кодом 0
        System.out.println("set length: " + sb);
        char ch1 = sb.charAt(8);
        System.out.println("sb.char: " + (int)ch1);

        sb.setLength(3);
        System.out.println("sb set length 3: " + sb);


         /*
        Написать метод, который запрашивает у пользователя строку,
        состоящую из нескольких слов
        и возвращающий аббревиатуру этой фразы
        (первые буквы каждого слова, записанных в верхнем регистре)
         */
        String example = String.join(" ", "Java", "is", "the", "best");
        System.out.println(example);
        String[] strings = example.split(" ");
        System.out.println(Arrays.toString(strings));

        String result = phraseString();
        System.out.println("Аббревиатура: " + result);

        // Потоко-безопасный брат StringBuilder
        StringBuffer stringBuffer = new StringBuffer();

    }
    //method
    public static String phraseString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку из нескольких слов");

        String input = sc.nextLine();

        String[] words = input.split(" ");
        StringBuilder sb = new StringBuilder();
        // String result = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            // result = result + word.charAt(0);
            sb.append(word.charAt(0));
        }

        // System.out.println("Результирующая строка: " + result.toUpperCase());

        return sb.toString().toUpperCase();
    }
}

