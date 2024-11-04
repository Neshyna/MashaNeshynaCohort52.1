package lesson20.transport;

public class TransportApp {
    public static void main(String[] args) {
        Bus bus = new Bus("bus_x1",2020,10);

        System.out.println(bus.toString());

        bus.start();
        bus.stop();

        System.out.println(bus.getModel() + " " + bus.getCapacity());

        System.out.println("==========");
        Bus bus1 = new Bus("bus_x2",2024,3);
        System.out.println(bus1.takePassenger());
        System.out.println(bus1.takePassenger());
        System.out.println(bus1.takePassenger());
        System.out.println(bus1.takePassenger());

        System.out.println(bus1.dropPassenger());
        System.out.println(bus1.dropPassenger());
        System.out.println(bus1.dropPassenger());
        System.out.println(bus1.dropPassenger());

    }
}
