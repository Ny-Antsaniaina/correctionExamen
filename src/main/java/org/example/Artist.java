package org.example;

import java.time.LocalDate;

public class Artist {
    private String id;
    private String stageName;
    private LocalDate startYear;
    private String nationality;

    public Artist(String id, String stageName, LocalDate startYear, String nationality) {
        this.id = id;
        this.stageName = stageName;
        this.startYear = startYear;
        this.nationality = nationality;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public LocalDate getStartYear() {
        return startYear;
    }

    public void setStartYear(LocalDate startYear) {
        this.startYear = startYear;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
