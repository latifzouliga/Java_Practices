package day25_constructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;


public class Movie {

    public String country, title, genre, director;
    public LocalDate releaseDate;
    public ArrayList<String> casts ;


    public Movie(String country, String title, String genre, String director, LocalDate releaseDate, ArrayList<String> casts) {
        this.country = country;
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.releaseDate = releaseDate;
        this.casts = casts;
    }
    public void addCast(String cast){
        casts.add(cast);
    }

    public void addCasts(String casts){
        this.casts.addAll(Arrays.asList(casts));
    }

    public void addCasts(String[] Casts){


    }

    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", releaseDate=" + releaseDate +
                ", casts=" + casts +
                '}';
    }
}
