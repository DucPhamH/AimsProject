package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.interfaces.Playable;

public class DigitalVideoDisc extends Disc implements Playable {

    public DigitalVideoDisc(String title, String category, String director, int length, float cost, int ID) {
        super(title, category, director, length, cost, ID);
    }

    @Override
    public void play(){
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}

