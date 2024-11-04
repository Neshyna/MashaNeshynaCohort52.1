package lesson4;

public class TypeCasting {
    public static void main(String[] args) {

        byte byteVal = 123;
        int intVal ;
        intVal = byteVal; //неявное преобразование (автоматическиое)
        System.out.println("intVal:"+intVal);

        double doubleValue = intVal;// неявное преобраз int в double
        System.out.println("doubleValue:"+doubleValue);


        //явное преобразование, преобраз значение из большего типа данных в значение меньшего типа данных
        // т к это может привести к потере данных

        double doubleVal = 42.9;
        int int1 = (int )doubleVal;// явное преобразование (casting) из double в int

        System.out.println("douleVal:"+doubleVal);
        System.out.println("int1:"+int1);

        short shortVal = (short) int1;
        System.out.println("shortVal:"+shortVal);

        //прелбразования в вычислениях

        int x =20;
        int y = 7;

        double result;
        result = x/y;
        System.out.println("result:"+result); //неявное преобразование int 2 ->2.0 ->result

        result=x/7.0;
        System.out.println("result:"+result);
        /* если несколько типов данных,
        то все меньшие типы автоматом кастируются к более широкому
         */
        result = (float) x/y; //обычн деление не целочислен
        System.out.println("result flout cast:"+result);

        /*
        1. int x  явно преобраз во float
        2. int y не явно преобраз во float
        3. деление 20.0f /7.0f ->2.8f
        4. 2.85f -> неявно авто преобраз в тип double
         */

        result = x/(double)y;
        System.out.println("result double cast:"+result);


    }
}
