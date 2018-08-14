package models;

public enum Genre {

    COMEDY("this is funny"),
    THRILLER("this is nervewracking"),
    ROMANCE("this is shit");

    private String description;

    Genre(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
