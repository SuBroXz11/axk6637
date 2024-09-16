package homework;

public class Bulb {
    private boolean isOn;

    // Constructor
    public Bulb() {
        this.isOn = false; // Bulb is initially off
    }

    // Method to turn on the bulb
    public void turnOn() {
        this.isOn = true;
        System.out.println("Bulb is now turned on.");
    }

    // Method to turn off the bulb
    public void turnOff() {
        this.isOn = false;
        System.out.println("Bulb is now turned off.");
    }
}

