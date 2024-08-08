package org.example;

import java.time.LocalDate;

public class SoloArtist extends Artist {
    private String name;
    private String lastname;
    private LocalDate birthDate;

    public SoloArtist(String id, String stageName, LocalDate startYear, String nationality, String name, String lastname, LocalDate dateOfBirth) {
        super(id, stageName, startYear, nationality);
        this.name = name;
        this.lastname = lastname;
        this.birthDate = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
