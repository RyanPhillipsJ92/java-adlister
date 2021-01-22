package models;

import java.util.Date;

public class Album {

    private long idNo;
    private String artist;
    private String name;
    private int releaseDate;
    private double sales;
    private String genre;

    public Album(){}


    public long getIdNo() {
        return idNo;
    }

    public void setIdNo(long idNo) {
        this.idNo = idNo;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getSales() { return sales;}

    public void setSales(long sales) {
        this.sales = sales;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
