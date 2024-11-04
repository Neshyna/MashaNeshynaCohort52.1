package lesson7;

public class Block {
    public static void main(String[] args) {
        int x = 10;
        {
            int y = 5;
            x = x + y;

            System.out.println("x:" + x);
            System.out.println("y:" + y);

        }

        //x = x + y;
        //compilation error
        //y variable not available outside the/it's block

        int y = 124;
        //new y variable
    }
}
