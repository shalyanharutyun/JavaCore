package homework.library;

import java.util.Scanner;

import static homework.library.Commands.*;

public class  LibraryDemo {

    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case SEARCH_BOOKS_BY_TITLE:
                    System.out.println("Please input keyword");
                    String keyword = scanner.nextLine();
                    bookStorage.search(keyword);
                    break;
                case PRINT_EXPENSIVE_BOOK:
                    Book expensiveBook = bookStorage.getBookByMaxPrice();
                    System.out.println(expensiveBook);
                    break;
                case SEARCH_BOOKS_BY_PRICE:
                    System.out.print("Enter minimum price ");
                    double min = scanner.nextDouble();
                    System.out.print("Enter maximum price ");
                    double max = scanner.nextDouble();
                    bookStorage.searchByPrice(min, max);
                    break;
                case DELETED_BOOK_ID:
                    System.out.print("Enter book id to delete: ");
                    int id = scanner.nextInt();
                    bookStorage.deleteById(id);
                    break;
                default:
                    System.err.println("wrong cammand, try again");
            }
        }
    }

    private static void addBook() {
        System.out.println("Please input book's ID");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input book's title");
        String bookTitle = scanner.nextLine();
        System.out.println("Please input book's authorName");
        String authorName = scanner.nextLine();
        System.out.println("Please input book's price");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input book's quantity");
        double quantity = Double.parseDouble(scanner.nextLine());
        // Book book = new Book(authorName, price, bookTitle);
        Book book = new Book();
        book.setTitle(bookTitle);
        book.setPrice(price);
        book.setAuthorName(authorName);
        book.setQuantity(quantity);
        book.setId(id);
        bookStorage.add(book);
        System.out.println("Books added successfuly");
    }

    private static void printCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_BOOK + " for ADD BOOK");
        System.out.println("Please input " + PRINT_ALL_BOOKS + " for ALL BOOKS");
        System.out.println("Please input " + SEARCH_BOOKS_BY_TITLE + " for SEARCH BOOK BY TITLE");
        System.out.println("Please input " + PRINT_EXPENSIVE_BOOK + " for PRINT EXPENSIVE BOOK");
        System.out.println("Please input " + SEARCH_BOOKS_BY_PRICE + " for SEARCH BOOK BY PRICE");
        System.out.println("Please input " + DELETED_BOOK_ID + " for SEARCH BOOK BY PRICE");
    }
}
