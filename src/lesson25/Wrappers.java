package lesson25;

public class Wrappers {

    /*
    класс обертка
    использ для представления примитивных типов данных как объектов
    Byte - byte
    Short - short
    Integer - int
    Long - long
    Float
    Double
    Character
    Boolean

     */

    public static void main(String [] args){

        // Автоматическое приведение типов
        // Автоупаковка и автораспаковка

        //auto wrapping and rewrapping
        Integer wrapperInt = 5 ;
         //auto wrapping int into Integer (link type from primitive)
        System.out.println(wrapperInt);

        int primitiveInt = wrapperInt;//auto rewrapp from Integer into  int

        //compare objects
        //cash obj -128 ...127
        Integer a = 127;
        Integer b = 127;
        System.out.println(a==b);//true//links compared
        System.out.println(a.equals(b));//need to use equals method//true

        Integer c =128;
        Integer d = 128;
        System.out.println(c==d);//false
        System.out.println(c.equals(d));//true


        String j1 = "Jave";
        String j2 = "Java";
        System.out.println("j1==j2" + (j1==j2));//true
        String j3 = new String("Java");
        System.out.println(j2==j3);//false
        System.out.println(j2.equals(j3));//true//better use equals to compare strings

        System.out.println("==========");
        Integer maxValue = Integer.MAX_VALUE;
        System.out.println("max" + maxValue);
        System.out.println("min" + Integer.MIN_VALUE);


        /*
        wrap methods
        1 valueOf

         */

        Integer e = Integer.valueOf(127);
        Integer f = Integer.valueOf(127);
        System.out.println(e==f);

        Integer intStr = Integer.valueOf("123");//send string
        System.out.println(intStr + 100);//223

        Double doubleWrap = Double.valueOf(154.5);
        System.out.println(doubleWrap);

        //2 parseXXX() transforms string into primitive
        System.out.println(Integer.parseInt("456") + 100);
        double d1 = Double.parseDouble(("345.67") + 200);
        System.out.println(d1);

        //3 toString
        System.out.println(doubleWrap);
        // 4. equals(Object obj) - сравнение объектов на равенство по значению
        Long l1 = Long.valueOf(200);
        // Вариант 2
        l1 = 200L;
        System.out.println("l1.equals(200): " + l1.equals(200));
        // Мы хотим сравнить объект типа Long с примитивом int
        // Метод equals принимает объект типа Object. Поэтому примитив должен быть приведен к ссылочному типу
        // для примитива int его обертка (ссылочный тип) это Integer -> int автоупаковывается (приводится) к типу Integer
        // Логика сравнения метода equals



        System.out.println("l1.equals(200): " + l1.equals(200L));
        Integer i1 = 150;
        System.out.println("i1.equals(150): " + i1.equals(150));

        // 5. compareTo() - сравнивает текущий объект с другим объектом того же типа (кто больше?)
        // 1 - если наш объект больше чем тот объект, с которым сравниваем
        // -1 - если наш объект меньше
        // 0 - если объекты равны по значению

        Integer iMax = 250;
        Integer iMin = 125;
        Integer iSuper = 500;
        System.out.println(iMax +  ".compareTo(" + iMin + ") -> " + iMax.compareTo(iMin)); // 1
        System.out.println(iMax + " .compareTo( " + iSuper + ") -> " + iMax.compareTo(iSuper)); // -1
        System.out.println(iMax +  ".compareTo(" + 250 + ") -> " + iMax.compareTo(250)); // 0

        // xxxValue() - возвращает значение объекта в виде примитивного типа
        // doubleValue

        Double d2 = Double.valueOf(125.56); // Явная / принудительная упаковка. Примитив -> Обертку
        double dPrimitive = d2.doubleValue(); // Явная / принудительная распаковка. Обертка -> примитив

        System.out.println("\n ========================= \n");

        /*
        Все числовые обертки наследуются от абстрактного класса Number.

        Byte
        Short
        Integer
        Long
        Float
        Double
         */

        /*
        Методы возвращают соответсвующий примитив
        byteValue()
        shortValue()
        intValue()
        longValue()
        floatValue()
        doubleValue()
         */

        Integer integer = 31844;
        Double doubleVal = 235.76;

        System.out.println(integer.doubleValue());

        short shortPrimitive = integer.shortValue();

        int intPrimitive = doubleVal.intValue();
        System.out.println("intPrimitive: " + intPrimitive);


    }
}
