package hust.soict.hedspi.aims.media;
import hust.soict.hedspi.aims.interfaces.Playable;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    public ArrayList<Track> tracks = new ArrayList<Track>();

    public String getArtist() {
        return artist;
    }


    public CompactDisc(String title, String category, String director, int length, float cost, int ID, String artist, ArrayList<Track> tracks) {
        super(title, category, director, length, cost, ID);
        this.artist = artist;
        this.tracks = tracks;
    }

    public void addTrack(Track track) {
        if(tracks.contains(track)) {
            System.out.println("Co phan tu can tim trong arrayList");
        }
        else {
            System.out.println(" Khong co phan tu can tim trong arrayList");
            tracks.add(track);
        }
    }

    public void removeTrack(Track track) {
        if (tracks.isEmpty()) {
            System.out.println("Danh sach rong");
        }
        else {
            System.out.println("Xoa phan tu");
            tracks.remove(track);
        }
    }

    public int getLength(){
        int totalLength = 0;
        for(Track track : tracks) {
            totalLength += track.getLength();
        }
        System.out.println("Total length: " + totalLength);
        return totalLength;
    }

    @Override
    public void play() {
        for(Track track : tracks) {
            track.play();
        }
    }


}

