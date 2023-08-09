package Team02_Projeler.PROJE2_KUTUPHANEYONETIMSISTEMI;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

abstract class LibraryMaterial implements Sortable {
    private String title;
    private int year;

    public LibraryMaterial(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public abstract String getType();
    public abstract String getDetails();

    @Override
    public void sort() {
        // By default, the LibraryMaterial doesn't have a specific sorting mechanism.
        System.out.println("Sorting LibraryMaterials...");
    }
}

interface Borrowable {
    void borrow();
    void returnItem();
    String getTitle(); // Ekledik
    String getType(); // Ekledik
}

interface Sortable {
    void sort();
}

class Book extends LibraryMaterial implements Borrowable {
    private String author;

    public Book(String title, String author, int year) {
        super(title, year);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void borrow() {
        System.out.println(getTitle() + " kitabı ödünç alındı.");
    }

    @Override
    public void returnItem() {
        System.out.println(getTitle() + " kitabı iade edildi.");
    }

    @Override
    public String getType() {
        return "Kitap";
    }

    @Override
    public String getDetails() {
        return "Yazar: " + getAuthor() + ", Yıl: " + getYear();
    }

    @Override
    public void sort() {
        // Here, we can implement a sorting algorithm for books (e.g., sorting by title).
        // For simplicity, let's assume sorting by title in alphabetical order.
        // You can replace this with more sophisticated sorting algorithms if needed.

        // Note: To keep things simple in this example, we are using bubble sort.
        // In real-world scenarios, it's better to use more efficient sorting algorithms.
        LibraryManagementSystem.sortBooksByTitle();
    }
}

class DVD extends LibraryMaterial implements Borrowable {
    private String director;

    public DVD(String title, String director, int year) {
        super(title, year);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public void borrow() {
        System.out.println(getTitle() + " DVD'si ödünç alındı.");
    }

    @Override
    public void returnItem() {
        System.out.println(getTitle() + " DVD'si iade edildi.");
    }

    @Override
    public String getType() {
        return "DVD";
    }

    @Override
    public String getDetails() {
        return "Yönetmen: " + getDirector() + ", Yıl: " + getYear();
    }

    @Override
    public void sort() {
        // Here, we can implement a sorting algorithm for DVDs (e.g., sorting by title).
        // For simplicity, let's assume sorting by title in alphabetical order.
        // You can replace this with more sophisticated sorting algorithms if needed.

        // Note: To keep things simple in this example, we are using bubble sort.
        // In real-world scenarios, it's better to use more efficient sorting algorithms.
        LibraryManagementSystem.sortDVDsByTitle();
    }
}

class Customer {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private List<Borrowable> borrowedItems;

    public Customer(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.borrowedItems = new ArrayList<>();
    }

    public void setPhoneNumber(String phoneNumber) {
        try {
            Long.parseLong(phoneNumber);
            this.phoneNumber = phoneNumber;
        } catch (NumberFormatException e) {
            System.out.println("Hata: Geçersiz telefon numarası, sadece rakamlardan oluşan bir numara girin.");
        }
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void borrowItem(Borrowable item) {
        borrowedItems.add(item);
    }

    public void returnItem(Borrowable item) {
        borrowedItems.remove(item);
    }

    public void listReturnedItems() {
        if (borrowedItems.isEmpty()) {
            System.out.println("İade edilecek öğe bulunmamaktadır.");
            return;
        }

        System.out.println("Ödünç Alınan Kitaplar ve DVD'ler:");
        for (int i = 0; i < borrowedItems.size(); i++) {
            Borrowable item = borrowedItems.get(i);
            System.out.println((i + 1) + ". " + item.getType() + ": " + item.getTitle());
        }
        Scanner scanner=new Scanner(System.in);
        System.out.print("İade etmek istediğiniz öğenin numarasını girin (0 to exit): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Buffer temizleme

        if (choice == 0) {
            System.out.println("İade işlemi iptal edildi.");
            return;
        }

        if (choice >= 1 && choice <= borrowedItems.size()) {
            Borrowable item = borrowedItems.get(choice - 1);
            item.returnItem();
            borrowedItems.remove(item);
        } else {
            System.out.println("Geçersiz seçim, lütfen listeden bir numara seçin.");
        }
    }

    public void listBorrowedItems() {
        if (borrowedItems.isEmpty()) {
            System.out.println("Ödünç alınmış kitap veya DVD bulunmamaktadır.");
            return;
        }

        System.out.println("Ödünç Alınan Kitaplar ve DVD'ler:");
        for (int i = 0; i < borrowedItems.size(); i++) {
            Borrowable item = borrowedItems.get(i);
            System.out.println((i + 1) + ". " + item.getType() + ": " + item.getTitle());
        }
    }
}

public class LibraryManagementSystem {
    static LibraryMaterial[] materials;

    public static void main(String[] args) {
        materials = new LibraryMaterial[10];

        materials[0] = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 1997);
        materials[1] = new Book("1984", "George Orwell", 1949);
        materials[2] = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        materials[3] = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        materials[4] = new Book("Pride and Prejudice", "Jane Austen", 1813);

        materials[5] = new DVD("Inception", "Christopher Nolan", 2010);
        materials[6] = new DVD("The Shawshank Redemption", "Frank Darabont", 1994);
        materials[7] = new DVD("The Matrix", "Lana Wachowski", 1999);
        materials[8] = new DVD("The Lord of the Rings: The Fellowship of the Ring", "Peter Jackson", 2001);
        materials[9] = new DVD("The Dark Knight", "Christopher Nolan", 2008);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınızı girin: ");
        String firstName = scanner.nextLine();

        System.out.print("Soyadınızı girin: ");
        String lastName = scanner.nextLine();

        System.out.print("Telefon numaranızı girin: ");
        String phoneNumber = scanner.nextLine();

        Customer customer = new Customer(firstName, lastName, phoneNumber);

        while (true) {
            System.out.println("\n1. Kitap Ödünç Al");
            System.out.println("2. DVD Ödünç Al");
            System.out.println("3. Ödünç Verilenleri Listele");
            System.out.println("4. Ödünç Alınanları Listele");
            System.out.println("0. Çıkış");
            System.out.print("Seçiminizi yapın: ");

            try {
                int choice = scanner.nextInt();

                switch (choice) {
                    case 0:
                        System.out.println("Programdan çıkılıyor...");
                        scanner.close();
                        return;
                    case 1:
                        System.out.println("\nMevcut kitaplar:");
                        for (int i = 0; i < 5; i++) {
                            System.out.println((i + 1) + ". " + materials[i].getTitle());
                        }
                        System.out.print("Seçiminizi yapın: ");
                        int bookChoice = scanner.nextInt();
                        if (bookChoice >= 1 && bookChoice <= 5) {
                            Book selectedBook = (Book) materials[bookChoice - 1];
                            selectedBook.borrow();
                            customer.borrowItem(selectedBook);
                        } else {
                            System.out.println("Geçersiz seçim, lütfen mevcut kitaplardan birini seçin (1-5).");
                        }
                        break;
                    case 2:
                        System.out.println("\nMevcut DVD'ler:");
                        for (int i = 5; i < 10; i++) {
                            System.out.println((i - 4) + ". " + materials[i].getTitle());
                        }
                        System.out.print("Seçiminizi yapın: ");
                        int dvdChoice = scanner.nextInt();
                        if (dvdChoice >= 1 && dvdChoice <= 5) {
                            DVD selectedDVD = (DVD) materials[dvdChoice + 4];
                            selectedDVD.borrow();
                            customer.borrowItem(selectedDVD);
                        } else {
                            System.out.println("Geçersiz seçim, lütfen mevcut DVD'lerden birini seçin (1-5).");
                        }
                        break;
                    case 3:
                        System.out.println("\nÖdünç Verilen Kitaplar ve DVD'ler:");
                        customer.listReturnedItems();
                        break;
                    case 4:
                        System.out.println("\nÖdünç Alınan Kitaplar ve DVD'ler:");
                        customer.listBorrowedItems();
                        break;
                    default:
                        System.out.println("Geçersiz seçim, lütfen 1, 2, 3 veya 4 tuşlarından birini seçin.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Hata: Geçersiz giriş, sayı giriniz.");
                scanner.nextLine(); // Buffer temizleme
            }
        }
    }

    public static void sortBooksByTitle() {
        LibraryMaterial[] materials = LibraryManagementSystem.materials;
        boolean swapped;
        int n = materials.length;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (materials[j].getTitle().compareTo(materials[j + 1].getTitle()) > 0) {
                    // Swap materials[j] and materials[j+1]
                    LibraryMaterial temp = materials[j];
                    materials[j] = materials[j + 1];
                    materials[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, the array is already sorted.
            if (!swapped) {
                break;
            }
        }
    }

    public static void sortDVDsByTitle() {
        LibraryMaterial[] materials = LibraryManagementSystem.materials;
        boolean swapped;
        int n = materials.length;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (materials[j].getTitle().compareTo(materials[j + 1].getTitle()) > 0) {
                    // Swap materials[j] and materials[j+1]
                    LibraryMaterial temp = materials[j];
                    materials[j] = materials[j + 1];
                    materials[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, the array is already sorted.
            if (!swapped) {
                break;
            }
        }
    }
}
