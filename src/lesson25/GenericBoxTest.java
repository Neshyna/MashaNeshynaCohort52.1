package lesson25;

public class GenericBoxTest {
    private int value;

    public GenericBoxTest(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericBox{" +
                "value= " + value +
                '}';
    }
}
