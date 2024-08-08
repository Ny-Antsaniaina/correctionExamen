package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PlayList {
    private String id;
    private String playlistName;
    private List<Song> songs;
    private User author;
    private List<User> likes;

    public PlayList(String id, String playlistName, List<Song> songs, User author, List<User> likes) {
        this.id = id;
        this.playlistName = playlistName;
        this.songs = songs;
        this.author = author;
        this.likes = likes;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public List<User> getLikes() {
        return likes;
    }

    public void setLikes(List<User> likes) {
        this.likes = likes;
    }

    public void addSong(Song song) {
        this.songs.add(song);
    }
    public void addAlbum(Album album) {
        this.songs.addAll(album.getSongs());
    }

    public void removeById(String songId) {
        this.songs.removeIf(song -> song.getId().equals(songId));
    }

    public void like(User user) {
        if (this.likes.contains(user)) {
            this.likes.remove(user);
            user.removeIsplaylist(this);
        }else {
            this.likes.add(user);
            user.addIsplaylist(this);
        }
    }

    public PlayList exclude(List<Genre> genres) {
        List<Song> newSongs = new ArrayList<>(this.songs);
        List<Song> filteredSongs = songs.stream()
                .filter(song -> genres.stream().noneMatch(song.getGenres()::contains))
                .collect(Collectors.toList());
        return new PlayList(id, playlistName, filteredSongs, author, likes);
    }
     public int countPlaylist(String songId , List<PlayList> allPlayLists){
        int count = 0;
        for (PlayList playList : allPlayLists) {
            if (playList.getId().equals(songId)) {
                count++;
            }
        }
        return count;
     }

     public int getTotalLikes(){
        return this.likes.size();
     }
}
