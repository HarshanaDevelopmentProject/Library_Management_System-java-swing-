package model;

public class DVD extends Item {

    private String language;
    private String genre;
    private String duration;
    private String isSubtitleAvailable;

    public DVD(String item_id, String title, String authorOrDirector, String publicationYear, String isAvailable, String language, String genre, String duration, String isSubtitleAvailable) {
        super(item_id, title, authorOrDirector, publicationYear, isAvailable);
        this.language = language;
        this.genre = genre;
        this.duration = duration;
        this.isSubtitleAvailable = isSubtitleAvailable;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getIsSubtitleAvailable() {
        return isSubtitleAvailable;
    }

    public void setIsSubtitleAvailable(String isSubtitleAvailable) {
        this.isSubtitleAvailable = isSubtitleAvailable;
    }

}
