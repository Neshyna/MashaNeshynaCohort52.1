package lesson21;

public class Driver {
    private String name;
    private final int id;
    private static int idCounter;
    private String licenceNumber;

    public Driver(String licenceNumber, String name) {
        this.licenceNumber = licenceNumber;
        this.id = idCounter++;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder("BusDriver: {");
        sb.append("id: ").append(id);
        sb.append(", name ").append(name);
        sb.append("}");
        return sb.toString();
    }
}
