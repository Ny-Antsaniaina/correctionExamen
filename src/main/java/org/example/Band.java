package org.example;

import java.time.LocalDate;
import java.util.List;

public class Band extends Artist {
    private List<SoloArtist> members;

    public Band(String id, String stageName, LocalDate startYear, String nationality, List<SoloArtist> members) {
        super(id, stageName, startYear, nationality);
        this.members = members;
    }

    public List<SoloArtist> getMembers() {
        return members;
    }

    public void setMembers(List<SoloArtist> members) {
        this.members = members;
    }
}
