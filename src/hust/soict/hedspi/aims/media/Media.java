package hust.soict.hedspi.aims.media;

public abstract class Media {
    private String title;
    private String category;
    private float cost;
    private int ID;

    public int getID() {
        return ID;
    }

    public Media(String title, String category, float cost, int ID) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }


}
