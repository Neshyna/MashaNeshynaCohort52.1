package lesson9;

public class TernaryOprator {
    public static void main(String[] args) {

        int x = 5;
        String result;

        String res1 = (x >= 0) ? "positive" : "negative";
        //альтернатива if & else. но только для 2х условий
        System.out.println("number:" + res1);
    }
}
