package hust.soict.hedspi.aims.media;
import java.util.ArrayList;
import java.util.List;

public class Book extends Media{

    private List<String> author = new ArrayList<String>();

    public List<String> getAuthor() {
        return author;
    }

    public void setAuthor(List<String> author) {
        this.author = author;
    }

    public Book(String title, String category, float cost, int ID, List<String> author) {
        super(title, category, cost, ID);
        this.author = author;
    }

    public void addAuthor(String authorName) {
        if(author.contains(authorName)) {
            System.out.println("Co phan tu can tim trong arrayList");
        }
        else {
            System.out.println(" Khong co phan tu can tim trong arrayList");
            author.add(authorName);
        }
    }

    public void removeAuthor(String authorName) {
        if (author.isEmpty()) {
            System.out.println("Danh sach rong");
        }
        else {
            System.out.println("Xoa phan tu");
            author.remove(authorName);
        }
    }

}
