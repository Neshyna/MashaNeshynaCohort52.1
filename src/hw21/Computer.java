package hw21;

public class Computer {

    private Processor processor;
    private Memory memory;
    private Storage storage;

    private String model;

    public Computer( String model, Storage storage) {
        this.processor = new Processor("fgh","hggf");
        this.memory = new Memory("jhgjfh", "djfhgjf");
        this.storage = storage;
        this.model = model;
    }
}
