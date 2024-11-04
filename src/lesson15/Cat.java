package lesson15;

    public class Cat {
        public String name;
        public String color;
        public int age;
        // Конструктор класса
        // Специальный тип метода.
        // Основная задача - установить начальные значения свойств объекта
    /*
    1. Имя конструктора совпадает с именем класса
    2. Конструктор не имеет возвращаемого типа.
    3. Конструктор вызывается автоматически при создании объекта.
     */
        // Перегрузка конструкторов
        public Cat(String catName){
            name = catName;
        }
        // Конструктор по умолчанию.
        public Cat () {

        }
        // Ключевое слово this используется внутри класса для ссылки на текущий объект
        // Оно поможет для разрешения конфликта имен между полями класса и
        // параметрами методов / конструктов
        public Cat(String catName, String color){
            name = catName;
            this.color = color;
        }
        public Cat (String name, String color, int age){
            this(name,color);
            // вызов другого конструктора, должен быть первой строкой исполняемого кода
            // Вызываю конструктор класса, принимающий две стринги.
            // Соответсвующее поля будут проинициализированы
            // Ключевое слово this может быть использована для вызова других конструкторов класса
            // или для передачи текущего объекта в качестве параметра метода (разберем позже)

            //this.name = name;
            //this.color = color;
            this.age = age;
        }

        public void sleep (){
            System.out.println("sleep");
        }

        public void run(){
            System.out.println("run");
        }

        public void sayMeuw(){
            System.out.println("meuw");
        }

        public void whoAmI(){
            System.out.printf("I am a cat %s, my age %d, my color %s\n" , name , age , color);
        }
    }

