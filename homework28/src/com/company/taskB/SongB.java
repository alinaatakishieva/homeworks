package com.company.taskB;

public class SongB {
    private String name;
    private String genre;
    private String singer;
    private String lyrics;

    public SongB() {
    }

    public SongB(String name, String genre, String singer, String lyrics) {
        this.name = name;
        this.genre = genre;
        this.singer = singer;
        this.lyrics = lyrics;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    @Override
    public String toString() {
        return "SongB{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", singer='" + singer + '\'' +
                ", lyrics='" + lyrics + '\'' +
                '}';
    }
}
