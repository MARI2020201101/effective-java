package ch07.item46;

public class Album {

    private Artist artist;
    private int sales;

    public Album(Artist artist, int sales) {
        this.artist = artist;
        this.sales = sales;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    @Override
    public String toString() {
        return "Album{ "  +
                "artist=" + artist +
                " , sales=" + sales +
                " } ";
    }
}
