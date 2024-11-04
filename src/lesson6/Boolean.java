package lesson6;

import java.util.Random;

public class Boolean {
    public static void main(String[] args) {

        boolean bol1 = true;
        bol1 = false;

        int x = 10;
        int y = 5;

        //сравнение на равенство
        boolean b1 = x == y;
        //x = y -> 10 = 5 -> false
        System.out.println(x + "==" +y + "->" + b1);

        //не равенство !=
        b1 = x != y;
        //10 != -> true
        System.out.println(x + "!=" +y + "->" + b1);

        //больше ">"
        b1 = x > y;// 10 > 5 -> true

        y = 10;
        b1 = x > y;
        //10 > 10 -> false
        System.out.println(x + ">" + y + "->" + b1);

        // more or equal ">="
        b1 = x >= y; //10 >= 10
        System.out.println(x + ">=" + y + "->" + b1);

        //less "<"
        x = 7 ;
        b1 = x < y;
        //7 < 10 -> true
        System.out.println(x + "<" + y + "->" + b1);

        //less or equal <=
        b1 = x <= y; //7 <= 10 -> true
        System.out.println(x + "<=" + y + "->" + b1);

        String str = "Java is the best";
        boolean contains = str.contains("Java");
        // string str contains substing "Java"
        System.out.println("str.contains(\"Java\"):" + contains);

        System.out.println("==========Logic operations===========");
        //логическое отрицание
        // меняет значение boolean  на противоположное

        boolean b2;
        b2 = !false; //to get true
        System.out.println("!false:" + b2 );

        b2 = !(4 == 5);//false -> true
        System.out.println("!(4 == 5):" + b2);

        // составные сравнения - два условия
        //использ тогда когда нужно что б оба условия были истинны
        //логическое и &
        // рим столица италии и берлин столица германии
        // если хотя бы в одной части  false то получим false

        b2 = true & true;
        System.out.println(b2);
        b2 = (2<5 )& (11==10); //true & false -> false
        System.out.println(b2);

        //insert numerals from 0 till 100
        int x1 = 50;
        boolean b3 = x1>0 & x1< 100;


        // логическое или "|"
        // когда достаточно что бы хотя бы одно условие было истинно

        boolean b4 = true | false;
        System.out.println("true | false -> " + b4);
        System.out.println("true | false -> " + (true | false));


        //insert even or odd number to divide into 5 without rest
        //generate random  number

        Random random = new Random();
        int rand = random.nextInt(100);
        // generate random number in between 0...x-1    -> 0....99
        System.out.println("rand:" + rand);
        boolean isEven = rand % 2 == 0;
        System.out.println("isEvan:" + isEven);

        boolean isGoodNumber = (rand % 5 ==0 ) | (rand %2 == 0);
        System.out.println("isgoodnumber:" + isGoodNumber);

        System.out.println("=============");
        //XOR "^"   true if 2 parts are equal
        //логическая исключающая
        boolean b5 = true^false;
        System.out.println(b5);
        b5 = false^true;
        System.out.println(b5);
        b5 = true^true;
        System.out.println(b5);
        b5 = false^false;
        System.out.println(b5);


        System.out.println("=================");
        // логическое сокращенное  и "&&"
        // gives true when all both parts are true
        boolean b6 = true&&false;
        System.out.println(b6);
        b6 = true&&true;
        System.out.println(b6);
        b6 = (2>5)&& (11==11);
        System.out.println(b6);


        int a = 10;
        int b =0;
        boolean b7 = (b != 0)&&(a/b >2);
        System.out.println(b7);
        //right part doesn't count
        //as well as left part is false
        //and value b7 doesn't depend on right part


        //логическое сокращ ИЛИ "||"
        // gives true if at least one part is true
        boolean b8 = true || (a / b > 2);
        System.out.println(b8);


        System.out.println("====================");
        /*
        приоритет логических операций
        !
        &
        ^
        |
        &&
        ||
         */

        System.out.println(true ^ true & false);//true
        System.out.println(true ^ true && false);//false
        System.out.println(true | false| (25 < 100) & ! true ^ (26 == 5));//true










    }
}
