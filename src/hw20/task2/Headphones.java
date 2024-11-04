package hw20.task2;

public class Headphones extends Devices {

    private int batteryStatus;

    public Headphones(String name, int battery) {
        super(name);
        this.batteryStatus = batteryStatus;
    }

    public int getBatteryStatus(){
        return batteryStatus;
    }

    public boolean playMusic(){

        if(batteryStatus > 0){
            System.out.println("play music");
            batteryStatus --;
            return true;
        }
        System.out.println("low battery, please charge");
        return false;
    }

}
