package lesson16;

public class TestArray {

    public static void main(String[] args) {
        MagicArray magicArray = new MagicArray();

        System.out.println(magicArray.toString());
        // loop runs 0 times -> "[" only printed

        magicArray.add(100);
        magicArray.add(200);
        magicArray.add(300);

        System.out.println("there are elements now:"  +  magicArray.size());

        magicArray.add(500,600,700,800);

        System.out.println(magicArray.toString());

        System.out.println(magicArray.cursor);


    }
}
