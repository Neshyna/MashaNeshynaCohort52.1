package lesson3;

public class Variables {
    public static void main(String[] args) {
        int myFirstVariable; //declare first variable int type

        myFirstVariable = 1; //initialization , first naming the variables


        int mySecondVariable = 25; //declare and initialization in one row

        System.out.println(myFirstVariable);
        System.out.println(mySecondVariable);

        mySecondVariable = 50;//declare new value

        System.out.println("Variable value:" + mySecondVariable);

        byte byteVariable = 125;//declare initialization byte variable
        byteVariable = 0;
        System.out.println("byte value:" + byteVariable);

        short shortVarialbe;
        shortVarialbe = 31000;
        System.out.println("short value:" +shortVarialbe);

        long longVariable = 2_100_000_000_000L; //_ sign helps to read numerals easier and doesn't mean anything
        System.out.println("longvar:" + longVariable);
        // L long format of numerals

        double doubleVar = 10.5421;
        System.out.println("doublevar:" + doubleVar);

        float floatVar = 11.65F;// F float format numerals
        System.out.println("float var:" + floatVar);



        }
}
