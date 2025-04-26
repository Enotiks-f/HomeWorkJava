import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int publisher;

    public Book(String title, Author author, int publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthour() {
        return author;
    }

    public int getPublisher() {
        return publisher;
    }

    public void setPublisher(int publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return title + " " + "author:" + author + " " + "publisher: " + publisher;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publisher == book.publisher && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publisher);
    }
}
