package model;

public class Book extends Item {

    private String genre;
    private String isbn;
    private String publisher;
    private String numberOfPage;

    public Book(String item_id, String title, String authorOrDirector, String publicationYear, String isAvailable, String genre, String isbn, String publisher, String numberOfPage) {

        super(item_id, title, authorOrDirector, publicationYear, isAvailable);

        this.genre = genre;
        this.isbn = isbn;
        this.publisher = publisher;
        this.numberOfPage = numberOfPage;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(String numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

}
