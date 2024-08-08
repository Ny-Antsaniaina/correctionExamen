package org.example;

import java.sql.Timestamp;
import java.time.Duration;
import java.util.List;
import java.util.Objects;

public class Song {
 private String id;
 private String title;
 private Duration duration;
 private List<Genre> genres ;

    public Song(String id, String title, Duration duration, List<Genre> genres) {
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.genres = genres;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }


}
