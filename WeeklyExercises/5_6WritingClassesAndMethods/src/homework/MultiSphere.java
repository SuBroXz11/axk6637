package homework;

public class MultiSphere {
    public static void main(String[] args) {
        // Creating instances of Sphere
        Sphere sphere1 = new Sphere(5.0);
        Sphere sphere2 = new Sphere(7.0);

        // Printing initial details
        System.out.println("Sphere 1: " + sphere1.toString());
        System.out.println("Volume of Sphere 1: " + sphere1.calculateVolume());
        System.out.println("Surface Area of Sphere 1: " + sphere1.calculateSurfaceArea());

        System.out.println();

        System.out.println("Sphere 2: " + sphere2.toString());
        System.out.println("Volume of Sphere 2: " + sphere2.calculateVolume());
        System.out.println("Surface Area of Sphere 2: " + sphere2.calculateSurfaceArea());

        // Updating diameter of sphere1
        sphere1.setDiameter(10.0);

        // Printing updated details of sphere1
        System.out.println("\nUpdated details of Sphere 1: ");
        System.out.println("Sphere 1: " + sphere1.toString());
        System.out.println("Volume of Sphere 1: " + sphere1.calculateVolume());
        System.out.println("Surface Area of Sphere 1: " + sphere1.calculateSurfaceArea());
    }
}