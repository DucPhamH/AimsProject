package hust.soict.hedspi.aims.order.Order;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import java.util.ArrayList;


public class Order {
    private static double TotalCost = 0;
    private ArrayList<Media> itemOrdered = new ArrayList<Media>();



    public void addMedia(Media media) {
        System.out.println("Them media thanh cong");
        itemOrdered.add(media);
    }

    public void removeMedia(int Number) {
        System.out.println("Xoa media thanh cong");
        itemOrdered.remove(Number);
    }

    public void totalCost() {
        TotalCost = 0;
        for(Media media : itemOrdered) {
            TotalCost += media.getCost();
        }
        System.out.println("Total cost: " + TotalCost);
    }

    public void orderList() {
        System.out.println("Order list");
        String Class = null;
        for(Media media : itemOrdered) {
            if(media.getClass().toString().contains("Book")) {
                Class = "Book";
            } else if (media.getClass().toString().contains("DigitalVideoDisc")) {
                Class = "DigitalVideoDisc";
            } else if (media.getClass().toString().contains("CompactDisc")) {
                Class = "CompactDisc";
            }
            System.out.println(Class + " ID: "+ media.getID() +": "+ media.getTitle() + "-" + media.getCategory() + "-" + media.getCost());

        }
        totalCost();
    }

    public void orderPlay(int id){
        System.out.println("Order Play");
        Media media = itemOrdered.get(id);
             if (media.getClass().toString().contains("DigitalVideoDisc")) {
                DigitalVideoDisc dvd = (DigitalVideoDisc)media;
                dvd.play();
            } else if (media.getClass().toString().contains("CompactDisc")) {
                CompactDisc disc = (CompactDisc) media;
                disc.play();
            }
    }


}