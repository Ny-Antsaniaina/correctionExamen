package org.example;

import java.time.LocalDate;
import java.util.List;

public class Album {
    private String id;
    private String title;
    private Artist artiste;
    private LocalDate releaseDate;
    private List<Song> songs;

    public Album(String id, String title, Artist artiste, LocalDate releaseDate, List<Song> songs) {
        this.id = id;
        this.title = title;
        this.artiste = artiste;
        this.releaseDate = releaseDate;
        this.songs = songs;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtiste() {
        return artiste;
    }

    public void setArtiste(Artist artiste) {
        this.artiste = artiste;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
