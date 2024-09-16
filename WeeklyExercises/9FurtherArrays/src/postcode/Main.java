package postcode;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> people = readPersonData(scanner);
        System.out.println("\nList of people:");
        printPeople(people);
    }

    public static ArrayList<Person> readPersonData(Scanner scanner) {
        ArrayList<Person> people = new ArrayList<>();
        System.out.println("Enter up to 25 pairs of names and postal codes (separated by tabs):");
        for (int i = 0; i < 25; i++) {
            String inputLine = scanner.nextLine().trim();
            if (inputLine.isEmpty()) {
                break;
            }
            String[] input = inputLine.split("\t");
            if (input.length != 3) {
                break;
            }
            String firstName = input[0];
            String lastName = input[1];
            String postalCode = input[2];
            people.add(new Person(firstName, lastName, postalCode));
        }
        return people;
    }

    public static void printPeople(ArrayList<Person> people) {
        System.out.println("First Name\tLast Name\tPostal Code");
        for (Person person : people) {
            System.out.println(person.getFirstName() + "\t\t" + person.getLastName() + "\t\t" + person.getPostalCode());
        }
    }
}