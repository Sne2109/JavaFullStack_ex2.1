package exp3;

import java.util.ArrayList;

public class VideoStore {

    private ArrayList<Video> store;

    public VideoStore() {
        store = new ArrayList<>();
    }

    public void addVideo(String name) {
        store.add(new Video(name));
        System.out.println("Video added successfully.");
    }

    public void doCheckout(String name) {
        for (Video v : store) {
            if (v.getName().equalsIgnoreCase(name)) {
                if (v.getCheckout()) {
                    System.out.println("Video is already checked out.");
                } else {
                    v.doCheckout();
                    System.out.println("Video checked out successfully.");
                }
                return;
            }
        }
        System.out.println("Video not found.");
    }

    public void doReturn(String name) {
        for (Video v : store) {
            if (v.getName().equalsIgnoreCase(name)) {
                if (!v.getCheckout()) {
                    System.out.println("Video is already available.");
                } else {
                    v.doReturn();
                    System.out.println("Video returned successfully.");
                }
                return;
            }
        }
        System.out.println("Video not found.");
    }

    public void receiveRating(String name, int rating) {
        for (Video v : store) {
            if (v.getName().equalsIgnoreCase(name)) {
                v.receiveRating(rating);
                System.out.println("Rating has been updated.");
                return;
            }
        }
        System.out.println("Video not found.");
    }

    public void listInventory() {

        System.out.println("--------------------------------------------------------------");
        System.out.printf("%-20s %-15s %-10s\n", "Video Name", "Checkout", "Rating");
        System.out.println("--------------------------------------------------------------");

        for (Video v : store) {
            System.out.printf("%-20s %-15s %-10d\n",
                    v.getName(),
                    v.getCheckout() ? "Yes" : "No",
                    v.getRating());
        }

        System.out.println("--------------------------------------------------------------");
    }
}
