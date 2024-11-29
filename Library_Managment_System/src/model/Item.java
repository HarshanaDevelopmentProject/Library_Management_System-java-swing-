package model;

public class Item {

    private String item_id;
    private String title;
    private String authorOrDirector;
    private String publicationYear;
    private String isAvailable;

    public Item(String item_id, String title, String authorOrDirector, String publicationYear, String isAvailable) {
        this.item_id = item_id;
        this.title = title;
        this.authorOrDirector = authorOrDirector;
        this.publicationYear = publicationYear;
        this.isAvailable = isAvailable;
    }

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorOrDirector() {
        return authorOrDirector;
    }

    public void setAuthorOrDirector(String authorOrDirector) {
        this.authorOrDirector = authorOrDirector;
    }

    public String getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(String isAvailable) {
        this.isAvailable = isAvailable;
    }

}
