package homework;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private int copyright;

    // Constructor
    public Book(String title, String author, String publisher, int copyright) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.copyright = copyright;
    }

    // Getter and Setter methods (same as before)

    // ToString method
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        String formattedDate = sdf.format(new Date());

        return "Title: " + title + "\n" +
               "Author: " + author + "\n" +
               "Publisher: " + publisher + "\n" +
               "Copyright: " + copyright;
    }
}

