package Lab1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LinkedListExample<T, G> {

    private List<T> availableItems;
    private List<G> bookedItems;
    private Scanner scanner;

    public LinkedListExample() {
        availableItems = new ArrayList<>();
        bookedItems = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addItem(T item) {
        availableItems.add(item);
    }

    public void removeItem(T item) {
        availableItems.remove(item);
        bookedItems.remove(item);
    }

    public void bookItem(T item) {
        if (availableItems.contains(item)) {
            availableItems.remove(item);
            bookedItems.add((G)item);
            System.out.println("Ном амжилттай түрээслэгдлээ: " + item.toString());
        } else {
            System.out.println("Ном түрээслэх боломжгүй: " + item.toString());
        }
    }

    public void returnItem(G item) {
        if (bookedItems.contains(item)) {
            bookedItems.remove(item);
            availableItems.add((T)item);
            System.out.println("Ном буцаагдлаа: " + item.toString());
        } else {
            System.out.println("Ном олдсонгүй: " + item.toString());
        }
    }

    public void displayAvailableItems() {
        System.out.println("Байгаа номнууд:");
        for (T item : availableItems) {
            System.out.println(item.toString());
        }
    }

    public void displayBookedItems() {
        System.out.println("Түрээслэгдсэн номнууд:");
        for (G item : bookedItems) {
            System.out.println(item.toString());
        }
    }

    public void displayMenu() {
        System.out.println("\nЦэс:");
        System.out.println("1. Ном нэмэх");
        System.out.println("2. Ном түрээслэх");
        System.out.println("3. Ном буцаах");
        System.out.println("4. Боломжит номнуудаа харах");
        System.out.println("5. Түрээслэгдсэн ном харах");
        System.out.println("6. Гарах");
        System.out.print("Сонголтоо оруул: ");
    }

    public void run() {
        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Нэмэх номоо оруулна уу: ");
                    addItem((T) scanner.nextLine());
                    break;
                case 2:
                    System.out.print("Түрээслэх номоо оруулна уу: ");
                    bookItem((T) scanner.nextLine());
                    break;
                case 3:
                    System.out.print("Буцаах номны нэрийг оруулна уу: ");
                    returnItem((G) scanner.nextLine());
                    break;
                case 4:
                    displayAvailableItems();
                    break;
                case 5:
                    displayBookedItems();
                    break;
                case 6:
                    System.out.println("........");
                    break;
                default:
                    System.out.println("1-6 хооронд тоо оруулна уу");
            }
        } while (choice != 6);
    }

    public static void main(String[] args) {
        LinkedListExample<String, Integer> library = new LinkedListExample<>();
        library.run();
    }
}
