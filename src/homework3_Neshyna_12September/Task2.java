package homework3_Neshyna_12September;

public class Task2 {
     /*Task 2
    Объявите 4 переменных типа int со значениями 0, 1, 2, 3.
    Объявите ещё одну переменную int и сохраните в неё сумму
    этих переменных, деленную на 4. Получается, у вас будет
    среднее арифметическое этих чисел в одной переменной.
    Выведите на экран значение переменной.
    Сколько программа отбросила в дробной части?
     */

    public static void main(String[] args) {
        int var1 = 0;
        int var2 = 1;
        int var3 = 2;
        int var4 = 3;

        int sumDivide4 = (var1 +var2+var3 +var4 )/4;

        System.out.println("sumDivide4:" + sumDivide4);//среднее арифм

        int sumDivide4Rest = (var1 +var2+var3 +var4 )%4;//остаток от деления

        System.out.println("sumDivide4Rest:" + sumDivide4Rest);



    }

}
