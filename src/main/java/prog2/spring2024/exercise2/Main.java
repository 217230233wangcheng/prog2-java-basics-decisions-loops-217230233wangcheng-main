package prog2.spring2024.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Turn-A-New-Leaf Bookstore!");
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter your email address: ");
        String emailAddress = scanner.nextLine();

        BookStore customer = new BookStore(firstName, lastName, emailAddress);
        customer.setUserID();
        System.out.println("Enter one book ID to order:");

        for (BookStore.BookDetails book : BookStore.BookDetails.values()) {
            System.out.println(book.getBookID() + ": " + book.getBookName() + "written by " + book.getBookAuthor());
        }

        System.out.print("Enter your choice: ");
        String choice1 = scanner.nextLine();
        int flag1=customer.searchBook(choice1);
        while(flag1==-1){
            System.out.print("Enter your choice: ");
            choice1 = scanner.nextLine();
            flag1=customer.searchBook(choice1);
        }
        System.out.println("How you would like to order the book?");
        System.out.println("1. Rent the book");
        System.out.println("2. Purchase the book");
        System.out.println("3. Exit");
        int choice2=scanner.nextInt();
        int flag2=customer.orderBook(choice2);
        while (flag2 == -1) {
            System.out.println("How you would like to order the book?");
            System.out.println("1. Rent the book");
            System.out.println("2. Purchase the book");
            System.out.println("3. Exit");
            choice2=scanner.nextInt();
            flag2=(int) customer.orderBook(choice2);
        }
        if(flag2==1) {
            System.exit(0);
        }
            customer.orderConfirmation();

        scanner.close();
    }
}