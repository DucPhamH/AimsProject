package hust.soict.hedspi.aims.media;

public class Disc extends Media{
    private String director;
    private int length;

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }
    public Disc(String title, String category, String director, int length, float cost, int ID) {
        super(title, category, cost, ID);
        this.director = director;
        this.length = length;
    }
}
