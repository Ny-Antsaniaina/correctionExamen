package org.example;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private String id;
    private String name;
    private java.util.List<PlayList> isplaylists;

    public User(String id, String name, List<PlayList> playlists, List<PlayList> isplaylists) {
        this.id = id;
        this.name = name;
        this.isplaylists = isplaylists;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PlayList> getIsplaylists() {
        return isplaylists;
    }

    public void setIsplaylists(List<PlayList> isplaylists) {
        this.isplaylists = isplaylists;
    }

    public void addIsplaylist(PlayList playlist) {
        if (isplaylists.contains(playlist)) {
            isplaylists.remove(playlist);
        }else {
            isplaylists.add(playlist);
        }
    }

    public void removeIsplaylist(PlayList playlist) {
        isplaylists.remove(playlist);
    }
}