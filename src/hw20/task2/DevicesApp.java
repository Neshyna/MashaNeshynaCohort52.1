package hw20.task2;

public class DevicesApp {

    public static void main(String[] args) {

        Camera camera = new Camera("Kodak", 3);
        System.out.println(camera.toSting("Kodak"));
        camera.takePhoto();
        camera.takePhoto();
        camera.takePhoto();
        camera.takePhoto();


        Headphones headphones = new Headphones("JBL", 2);
        System.out.println(headphones.toSting("JBL"));
        headphones.playMusic();
        headphones.playMusic();
        headphones.playMusic();


    }
}
