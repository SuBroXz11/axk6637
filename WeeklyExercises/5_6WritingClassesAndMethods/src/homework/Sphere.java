package homework;

import java.text.DecimalFormat;

// Define a Sphere constructor to accept and initialize the diameter.
public class Sphere {
	private double diameter;

    // Constructor
    public Sphere(double diameter) {
        this.diameter = diameter;
    }


// Include getter and setter methods for the diameter.
    
// Getter for diameter
public double getDiameter() {
    return diameter;
}

// Setter for diameter
public void setDiameter(double diameter) {
    this.diameter = diameter;
}

// Include methods to calculate and return the volume and surface area of the sphere.
//Method to calculate volume
public double calculateVolume() {
    return (4.0 / 3.0) * Math.PI * Math.pow(diameter / 2.0, 3);
}

// Method to calculate surface area
public double calculateSurfaceArea() {
    return 4.0 * Math.PI * Math.pow(diameter / 2.0, 2);
}
// Include a toString method that returns a one-line description of the sphere.
//ToString method
public String toString() {
    DecimalFormat df = new DecimalFormat("#.##");
    return "Sphere with diameter " + df.format(diameter);
}

// Create a driver class (main class) called MultiSphere, whose main method instantiates and updates several Sphere objects.
}