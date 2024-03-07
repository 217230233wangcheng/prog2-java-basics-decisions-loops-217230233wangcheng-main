package prog2.spring2024.exercise2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your first name: ");
        String FirstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String LastName = scanner.nextLine();

        System.out.print("Enter your email address: ");
        String EmailAddress = scanner.nextLine();

        BookStore Store;
        Store = new BookStore(FirstName,LastName,EmailAddress);
        Store.emailAddress(FirstName,LastName,EmailAddress);
        Store.setUserID();
        Store.displayBookList();
        Store.orderConfirmation();

        while (true) {
            System.out.print("Enter your choice (1 to rent, 2 to purchase, 3 to exit): ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 3) {
                break;
            }

         System.out.print("Enter the book ID you want to order : ");
            String bookID = scanner.nextLine();



            Store.searchBook(bookID);

        if (choice == 1) {
            System.out.print("Enter the book ID you want to order : ");
            bookID = scanner.nextLine();



            Store.searchBook(bookID);

            System.out.println("You have chosen to rent the book.");
            System.out.println("The rent is for one month, and the charge is €5.");
            System.out.println("After one month, the book will not be available to you.");

            Store.orderBook(1);
            Store.orderConfirmation();
        } else if (choice == 2) {
            System.out.println("You have chosen to purchase the book.");
            System.out.println("Your account will be charged the amount of the book.");
            Store.orderBook(2);
            Store.orderConfirmation();
        } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}



