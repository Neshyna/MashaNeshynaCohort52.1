package lesson24.interfaces;

public interface Printable {
    //combination of abstract methods declaring behavior
    //interfaces are abstract by default

    public abstract  void  print();

    default void test(){
        System.out.println("test");
        // Начиная с JDK 8 доступны методы по умолчанию (имеющие реализацию)
    }

    static  void testStatic(String str){ // Начиная с JDK8 доступны статические методы
        System.out.println("static method printable: " + str);
    }
// c JDK 9 появились приватные методы (могут быть статические и нестатические).
    // Переопределить их в классе невозможно.
}

