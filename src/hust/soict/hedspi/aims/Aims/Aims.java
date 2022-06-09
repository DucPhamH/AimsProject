package hust.soict.hedspi.aims.Aims;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

import hust.soict.hedspi.aims.media.*;
import hust.soict.hedspi.aims.order.Order.Order;

public class Aims {

    public static void main(String[] args) {

        boolean valid = false;
        Order anOrder = null;
        Scanner in = new Scanner(System.in);
        showMenu();
        boolean quit = false;
        int menuItem;
        int ID = 0;

        do {
            System.out.print("Please choose a number: 0-1-2-3-4-5: ");
            menuItem = in.nextInt();
            in = new Scanner(System.in);
            switch (menuItem) {

                case 1:
                    anOrder = new Order();
                    valid = true;
                    System.out.println("Them order thanh cong");
                    break;
                case 2:
                    if(valid == true){
                        System.out.print("ban muon them Book/DVD/Disc?: ");
                        String check = in.nextLine();
                        in = new Scanner(System.in);
                        if (check.equals("DVD")) {
                            System.out.print("add Title: ");
                            String title = in.nextLine();
                            System.out.print("add Category: ");
                            String category = in.nextLine();
                            System.out.print("add Director: ");
                            String director = in.nextLine();
                            System.out.print("add Length: ");
                            int length = in.nextInt();
                            System.out.print("add Cost: ");
                            float cost = in.nextFloat();
                            DigitalVideoDisc newDvd = new DigitalVideoDisc( title, category, director, length, cost, ID++ );
                            anOrder.addMedia(newDvd);

                        }else if (check.equals("Book")) {
                            System.out.print("add Title: ");
                            String title = in.nextLine();
                            System.out.print("add Category: ");
                            String category = in.nextLine();
                            System.out.print("add Cost: ");
                            float cost = in.nextFloat();
                            System.out.print("Nhap so Author: ");
                            List<String> authors = new ArrayList<String>();
                            int numberOfAuthor = in.nextInt();
                            in.nextLine();
                            for (int i = 0; i < numberOfAuthor; i++) {
                                System.out.print("Author " + (i + 1) + ": ");
                                String name = in.nextLine();
                                authors.add(name);
                            }
                            Book book = new Book(title, category, cost, ID++, authors);
                            anOrder.addMedia(book);

                        } else if (check.equals("Disc")) {
                            System.out.print("add Title: ");
                            String title = in.nextLine();
                            System.out.print("add Category: ");
                            String category = in.nextLine();
                            System.out.print("add Director: ");
                            String director = in.nextLine();
                            System.out.print("add Length: ");
                            int length = in.nextInt();
                            System.out.print("add Cost: ");
                            float cost = in.nextFloat();
                            System.out.print("add artist: ");
                            in = new Scanner(System.in);
                            String artist = in.nextLine();
                            System.out.print("Nhap so track: ");
                            ArrayList<Track> tracks = new ArrayList<Track>();
                            int numberOfTrack = in.nextInt();
                            in.nextLine();
                            for (int i = 0; i < numberOfTrack; i++) {
                                System.out.print("Track " + (i + 1) + ": ");
                                String newName = in.nextLine();
                                int newLength = in.nextInt();
                                in = new Scanner(System.in);
                                tracks.add(new Track(newName,newLength));

                            }
                            CompactDisc compactDisc = new CompactDisc(title, category,director,length, cost, ID++ ,artist, tracks);
                            anOrder.addMedia(compactDisc);

                        }
                    } else {
                        System.out.println("Chua tao order");
                    }
                    break;
                case 3:
                    if(valid==true){
                    System.out.println("Nhap mot so theo thu tu de xoa dvd ");
                    int xoaSo = in.nextInt();
                    anOrder.removeMedia(xoaSo);
                    } else {
                        System.out.println("Chua tao order");
                    }
                    break;
                case 4:
                    if(valid==true) {
                        anOrder.orderList();
                    }else {
                        System.out.println("Chua tao order");
                    }
                    break;
                case 5:
                    if(valid==true){
                        System.out.println("Nhap mot so theo thu tu cua DVD hoac CD trong order de hien thi ");
                        int nhapSo = in.nextInt();
                        anOrder.orderPlay(nhapSo);
                    } else {
                        System.out.println("Chua tao order");
                    }
                    break;


                case 0:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (!quit);
        System.out.println("Bye-bye!");



    }
    public static void showMenu() {
        System.out.println("Order Management Application: ");
        System.out.println("--------------------------------");
        System.out.println("1. Create new order");
        System.out.println("2. Add item to the order");
        System.out.println("3. Delete item by id");
        System.out.println("4. Display the items list of order");
        System.out.println("5. Show and play DVD/CD");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
    }

}