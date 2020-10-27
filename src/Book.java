
public class Book {

    String title;
    String publisher;
    int year;

    public Book(String title, String publisher, int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }

    public String title() {
        return this.title = title;
    }

    public String publisher() {
        return this.publisher = publisher;
    }

    public int year() {
        return this.year = year;
    }

    public String toString() {
        return this.title + ", " + this.publisher + ", " + this.year;
    }
}
