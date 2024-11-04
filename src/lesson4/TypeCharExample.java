package lesson4;

public class TypeCharExample {
    public static void main(String[] args) {
        char a = 'A'; //variable keeps A letter
        char a1 = 65;// same A letter corresponds code 65
        char a2 = 0x41;// 16 format corresponds letter A full form 0x0041
        char a3 = '\u0041';



        System.out.println("a:"+ a);
        System.out.println("a1:" + a1);
        System.out.println("a2:"+a2);
        System.out.println("a3:"+a3);


        char digit0 = 48;
        System.out.println("digit0:"+digit0);



        //digit0 =(char)(digit0 + 5);
        // 1.digit0 ->int
        // 2.summ int->int
        // 3. casting result from type int to type char
        // digit0 += 5





        int var = 5;
        //var = var +5;
        var+=5;

        System.out.println("var:"+var);

        var -=2; //2
        System.out.println("var:"+var);
        //var *=2; умнож
        //var /=4; деление




        //инкремент декремент
        //var ++;
        //var = var +1;
        var += 1;
        System.out.println("var:"+var);
        var --;
        //var-=1;
        //var var-1;



        int x =100;
        System.out.println("x1:"+ x++); // x; x=x+1;

        //10+x++ -5
        // 10+x-5;
        //x = x + 1;

        //++x
        //x = x +1;
        // get x
      //  int z = 10;
      //  System.out.println(10 + z++ +z++) -> сразу берет а потом добавляет
        //10 + ++z + ++ z  ->33 (10+11+12)  если ++ впереди он сразу добавл 1 а потом берет значение

        System.out.println("x2:" + x);
        int y = 100;
        System.out.println("y1:" + ++y);
        System.out.println("y2:" + y);




        char letter = 97;//a
        System.out.println("letter:"+ letter);
        letter++;
        System.out.println("letter:"+letter);
        System.out.println("int from char gives 10type code symbol:"+(int)letter);
        System.out.println(0+letter);
        //0...9 -> correspond codes from 48 ..57
        //a...z  -> 97...122
        //A..Z -> 65..98
    }
}
