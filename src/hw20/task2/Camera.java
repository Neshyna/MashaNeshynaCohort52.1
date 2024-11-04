package hw20.task2;

public class Camera extends Devices{

    private int memory;
    private int savedPhotos;

    public Camera(String name, int memory) {
        super(name);
        this.memory = memory;
        this.savedPhotos = savedPhotos;
    }

    public boolean takePhoto(){
        if(memory > savedPhotos){
            savedPhotos++;
            System.out.println("photo made");
            return true;
        }
        System.out.println("no space");
        return false;
    }

    public int getMemory(){
        return memory;
    }

    public int getSavedPhotos(){
        return savedPhotos;
    }
}
