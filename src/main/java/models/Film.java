package models;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "films")

public class Film {


    private int id;
    private String title;
    private int ageRating;
    private Director director;
    private Genre genre;
    private Calendar relaseDate;

    public Film(){}

    public Film(String title, int ageRating, Director director, Genre genre, Calendar relaseDate) {
        this.title = title;
        this.ageRating = ageRating;
        this.director =director;
        this.genre = genre;
        this.relaseDate= relaseDate;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "age_rating")
    public int getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(int ageRating) {
        this.ageRating = ageRating;
    }

    @ManyToOne
    @JoinColumn(name = "director_id", nullable = false)
    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Enumerated(value = EnumType.STRING)
    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }


    @Column(name = "release_date")
    public Calendar getRelaseDate() {
        return relaseDate;
    }

    public void setRelaseDate(Calendar relaseDate) {
        this.relaseDate = relaseDate;
    }
}
