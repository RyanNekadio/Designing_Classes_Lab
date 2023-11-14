//Computer class
public class Computer {

//    Computer properties
    private int storage;
    private String model;
    private Boolean printerConnected;

//    Computer constructor
    public Computer (int storage, String model){
        this.storage = storage;
        this.model = model;
        this.printerConnected = false;
    }

//    EXTENSION TASK
    public void printMessage(String message){
        this.printerConnected = true;
        if (!printerConnected) {
        } else {
            System.out.println(message);
        }
    }

//    Getters and setters
    public int getStorage(){
        return this.storage;
    }

    public void addStorage(int storage){
        this.storage += storage;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }
}
