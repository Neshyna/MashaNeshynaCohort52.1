package lesson3;

public class MathOperations {
    public static void main(String[] args) {
        int var1 = 20;
        int var2 = 7;
        //Ctrl+ D copy row
        //Ctrl+ A copy all

        int result;
        //sum  сложение

        result = var1 + var2;
        // в резалт присваивается значение суммы
        System.out.println("result:" + result);//alt + shift to put the row down or up

        result = var1 + 5;

        System.out.println(result);

        result = result + 5;
        System.out.println("result+:" + result);

        result =  var1 - var2;
        System.out.println("result-:"+result); //вычитание

        result = var1 * var2;
        System.out.println("result*:"+result);//умножение

        result = 1 + 2 * 2;
        System.out.println("result 1 + 2 * 2:"+result);
        //по математ правилам 1 скобки 2умножение 3 сложение

        result = var1/var2; // целочислен деление 20/7 = 2.777 и остаток
        System.out.println("result20/7:" +result); //при делении получается не целое число а напр 2.7777 джава выдаст только целое число

        System.out.println("целочислен деление 4/2:" +(4/2));//2
        System.out.println("целочислен деление 4%2:" +(4%2));//0
        System.out.println("остаток от деления 5/10: "+(5/10));
        System.out.println("остаток от деления 5%10: "+(5%10));

        //28/10 ->2.8 rest ->2*10+8 выводит статок от деления
        System.out.println("28%10="+28%10);
        System.out.println("======================= \n");



        double doubleVar1 = 20.0;
        double doubleVar2 = 7.0;
        double resultD = doubleVar1 / doubleVar2;
        System.out.println("resultD"+resultD);








    }
}
