package homework;

public class Bookshelf {
    public static void main(String[] args) {
        // Creating instances of Book
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Scribner", 1925);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "J.B. Lippincott & Co.", 1960);

        // Printing details of books
        System.out.println("Book 1:\n" + book1.toString() + "\n");
        System.out.println("Book 2:\n" + book2.toString());
    }
}
