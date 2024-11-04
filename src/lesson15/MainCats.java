package lesson15;

public class MainCats {
    public static void main(String[] args) {

        Cat cat = new Cat();
        //object cat class created
        // создаем объект класса Cat
        // 1. Физически создается объект в памяти
        // 2. Вызывается конструктор класса для инициализаций свойств объекта (заполнение полей)

        cat.sayMeuw();
 /*
        При создании объекта класса все его поля инициализируются значениями по умолчанию
        Для числовых примитивных типов -> 0 / 0.0
        boolean -> false
        Для всех ссылочных (в том числе String) -> null
         */
        String catName = cat.name;
        System.out.println("cat name: " + catName);

        int catAge = cat.age;
        System.out.println("age: " + cat.age);

        System.out.println("======================================");

        Cat cat1 = new Cat ("Max");
        // Будет создан новый объект класса Cat
        // Имя (строка) которая была передана в конструкторе будет присвоено полю класса name
        System.out.println("color: " + cat1.color);
        System.out.println("name: "+ cat1.name);


        System.out.println("=============");
        Cat cat2 = new Cat("Diamond" , "red");
        cat2.whoAmI();

        System.out.println("=============");
        Cat barsik = new Cat("barsik", "white", 2);
        barsik.whoAmI();
    }
}
