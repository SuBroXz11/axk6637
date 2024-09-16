package homework;

public class Lights {
    public static void main(String[] args) {
        // Instantiating Bulb objects
        Bulb bulb1 = new Bulb();
        Bulb bulb2 = new Bulb();
        Bulb bulb3 = new Bulb();

        // Turning on some bulbs
        bulb1.turnOn();
        bulb3.turnOn();

        // Turning off one bulb
        bulb2.turnOff();
    }
}

