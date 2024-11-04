package lesson24.flyable;

public class Flyers {
    public static void main(String[] args) {
        Airplane airplane = new Airplane(50);
        Duck duck = new Duck();

        duck.fly();
        duck.swim();

        FLyable[] flyables = new FLyable[2];
        flyables[0] = airplane;
        flyables[1] = duck;

        for (int i = 0 ; i < flyables.length; i++){
            FLyable fLyable = flyables[i];
            if (fLyable instanceof  Airplane){
                // Проверяем возможность приведения ссылки к типу класса
                Airplane airplanelink = (Airplane) fLyable;
                System.out.println("airplane link take passengers:  " + airplanelink.takePassengers());
                System.out.println("capacity" + airplanelink.capacity);
                System.out.println("airplane link count" + airplanelink.countPassengers());
            }
            // Проверяем возможность приведения ссылки к типу интерфейса
            if (fLyable instanceof Swimmable){
                Swimmable swimmable = (Swimmable) fLyable;
                swimmable.swim();
            }
            System.out.println("===============");
            fLyable.fly();
        }

    }
}
