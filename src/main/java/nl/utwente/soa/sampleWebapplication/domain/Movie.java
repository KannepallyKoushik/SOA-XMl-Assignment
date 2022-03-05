package nl.utwente.soa.sampleWebapplication.domain;


import java.util.List;

public class Movie {
    private String name;
    private String year;

    private List<String> actors;

    private String description;

    private String languages;

    public Movie(String name, String year, List<String> actors, String description, String languages) {
        this.name = name;
        this.year = year;
        this.actors = actors;
        this.description = description;
        this.languages = languages;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public List<String> getActors() {
        return actors;
    }

    public String getDescription() {
        return description;
    }

    public String getLanguages() {
        return languages;
    }


}
