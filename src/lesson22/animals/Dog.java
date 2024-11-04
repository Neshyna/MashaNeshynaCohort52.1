package lesson22.animals;

public class Dog extends Animal {
    @Override
    public void voice() {
        // super - обращение к объекту родителя
        super.voice();
    }

    @Override
    public String toString() {
        return super.toString() + " | Dog. Дополнение реализации родительского метода";
    }
}
