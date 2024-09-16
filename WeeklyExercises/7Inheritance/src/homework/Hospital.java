package homework;

public class Hospital {
    public static void main(String[] args) {
        // Instantiating objects
        Doctor doctor1 = new Doctor("Dr. Smith", 101, "Cardiology");
        Nurse nurse1 = new Nurse("Alice", 201, 5);
        Cleaner cleaner1 = new Cleaner("John", 301, "ICU");

        // Testing methods
        doctor1.provideService();
        nurse1.provideService();
        cleaner1.provideService();
    }
}
