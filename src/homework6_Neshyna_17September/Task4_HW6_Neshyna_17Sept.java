package homework6_Neshyna_17September;

public class Task4_HW6_Neshyna_17Sept {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        boolean result;

        result = (a + b) > 10;
        System.out.println("Result 1: " + result);// true 11>10

        result = (a - b) == 5;
        System.out.println("Result 2: " + result);// true 5=5

        result = (a * b) != 24;
        System.out.println("Result 3: " + result);// false 24=24

        result = (a / b) >= 2;
        System.out.println("Result 4: " + result);// true 2>2
        // целочислен деление 2,6 не будет а тольько 2=2

        result = !(a % b == 2);
        System.out.println("Result 5: " + result);// false  2 = 2 , but there is !, that's why
    }

}
