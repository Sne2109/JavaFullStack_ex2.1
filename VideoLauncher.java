package exp3;

import java.util.Scanner;

public class VideoLauncher {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VideoStore store = new VideoStore();

        int choice;

        do {

            System.out.println();
            System.out.println("MAIN MENU");
            System.out.println("==========");
            System.out.println("1. Add Videos");
            System.out.println("2. Check Out Video");
            System.out.println("3. Return Video");
            System.out.println("4. Receive Rating");
            System.out.println("5. List Inventory");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1..6): ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter video name: ");
                    String name = sc.nextLine();
                    store.addVideo(name);
                    break;

                case 2:
                    System.out.print("Enter video name: ");
                    name = sc.nextLine();
                    store.doCheckout(name);
                    break;

                case 3:
                    System.out.print("Enter video name: ");
                    name = sc.nextLine();
                    store.doReturn(name);
                    break;

                case 4:
                    System.out.print("Enter video name: ");
                    name = sc.nextLine();

                    System.out.print("Enter rating (1-10): ");
                    int rating = sc.nextInt();

                    store.receiveRating(name, rating);
                    break;

                case 5:
                    store.listInventory();
                    break;

                case 6:
                    System.out.println("Thank You!!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}
