package prog2.spring2024.exercise2;
import java.time.LocalDate;
public class BookStore {
        enum BookDetails {
        BOOK1("001", "Carrie", "Stephen King", 272, "Horror", 3.98, 1974, "Wings", 14.0),
        BOOK2("002", "The Firm", "Robin Waterfield / John Grisham", 448, "Thriller", 4.01, 1991, "Addison Wesley Publishing Company", 25.0),
        BOOK3("003", "Slaughterhouse-Five", "Kurt Vonnegut Jr", 275, "Sci-Fi", 4.1, 1969, "Dial Press", 18.0),
        BOOK4("004", "The Great Gatsby", "F. Scott Fitzgerald", 188, "Classic", 3.91, 1925, "Scribner", 8.0),
        BOOK5("005", "American Gods", "Neil Gaiman", 635, "Fantasy", 4.11, 2001, "Harper Collins", 4.11);
    
        private  String bookID;
        private  String bookName;
        private  String bookAuthor;
        private  int bookPages;
        private  String bookGenre;
        private  double bookPrice;
        private  int bookPublishedyear;
        private  String bookPublisher;
        private  double bookRating;
    
        BookDetails(String bookID, String bookName, String bookAuthor, int bookPages, String bookGenre, double bookPrice, int bookPublishedyear, String bookPublisher, double bookRating) {
            this.bookID = bookID;
            this.bookName = bookName;
            this.bookAuthor = bookAuthor;
            this.bookPages = bookPages;
            this.bookGenre = bookGenre;
            this.bookPrice = bookPrice;
            this.bookPublishedyear = bookPublishedyear;
            this.bookPublisher = bookPublisher;
            this.bookRating = bookRating;
        }
    
        // Getters for each field
        public String getBookID() { return bookID; }
        public String getBookName() { return bookName; }
        public String getBookAuthor() { return bookAuthor; }
        public int getbookPages() { return bookPages; }
        public String getbookGenre() { return bookGenre; }
        public double getbookPrice() { return bookPrice; }
        public int getbookPublishedyear() { return bookPublishedyear; }
        public String getbookPublisher() { return bookPublisher; }
        public double getbookRating() { return bookRating; }
    }
    
    private String orderedBook;
    private LocalDate orderDate;
    private String orderID;
    private double transactionAmount;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String userID;
    private String orderType;

    
    public void setorderType(String orderType) { 
        this.orderType = orderType;
    } 
    public void setorderedBook(String orderedBook){
        this.orderedBook = orderedBook;
    }   
    public void setorderDate(LocalDate orderDate){
        this.orderDate = orderDate;
    }  
    public void setorderID(String orderID){
        this.orderID = orderID;
    }
    public void settransactionAmount(double transactionAmount){
        this.transactionAmount =transactionAmount;
    }
    public void setfirstName(String firstName){
        this.firstName = firstName;
    }
    public void setlastName(String lastName){
        this.lastName = lastName;
    }
    public void setUserID(){
    } 
    public void setemailAddress(String emailAddress){
        this.emailAddress =emailAddress;
    }

    public  String getorderID(){return orderID;} 
    public  String getFirstName(){return firstName;}
    public  String getLastName(){return lastName;}
    public  String getEmailAddress(){return emailAddress;}
   
    public  String getorderType(){return orderType;}
    public  LocalDate getorderDate(){return orderDate;}
    public  double gettransactionAmount(){return transactionAmount;}
    public  String getorderedBook(){return orderedBook;}
    // Constructor
    public BookStore(String firstName, String lastName, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.orderDate = LocalDate.now();
    }

    // Method to display book list
    public void displayBookList() {
        for (BookDetails book : BookDetails.values()) {
            System.out.println("bookID: " + book.getBookID() + ", bookName: " + book.getBookName());
        }
    }

    // Method to search for a book by bookID
    public int searchBook(String bookID) {
        for (BookDetails book : BookDetails.values()) {
            if (book.getBookID().equals(bookID)) {
                
            }
        }
        return 0;
    }

    // Method to order a book
    public int orderBook(int i) {
        
        if (i == 1) {
            System.out.println("You have chosen to rent the book for one month.");
            System.out.println("The rental fee is €5.");
        } else if (i == 2) {
            System.out.println("You have chosen to purchase the book.");
            System.out.println("The book bookPrice is: €" + BookDetails.BOOK4.getbookPrice());
            System.out.println("Your account will be charged for this amount.");
        } 
        else if (i==3){
            System.out.println("Exit.");
        }
        else {
            System.out.println("InvalbookID choice. Please try again.");
            }
        return i;
        }
    
         public String getUserID(){
            String nmae= getFirstName()+getLastName();
        return "TANLUS"+nmae.substring(0, 5).toUpperCase();
         }  
        
        public void orderConfirmation(){
            System.out.print("Dear, ");
            System.out.println(getFirstName()+" "+getLastName()+" ");
            System.out.println("Thank you for ordering orderedBook from Turn-A-New-Leaf. Following are your order details:");
            System.out.println("Order ID:TANLOD2024-03-01THE");
            System.out.println("Order Date:"+getorderDate());
            System.out.println("User ID: "+getUserID());
            System.out.println("User contact:"+getEmailAddress());
            System.out.println("Transaction type:"+getorderType());
            System.out.println("Transaction amount:"+gettransactionAmount());
        }
        public void emailAddress(String firstName2, String lastName2, String emailAddress2) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'emailAddress'");
        }
    }