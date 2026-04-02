package OOPs.codes;

/* Practical No: 6.5
Title: Library Management with Custom Exception

Practical Statement:
- Create custom exception: BookNotAvailableException
- Class Library:
    availableBooks (int)
    issueBook(int count)
- Throw exception if requested books > availableBooks
*/

 // Custom Exception
class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}

// Library class
class Library {

    private int availableBooks;

    // Constructor
    public Library(int books) {
        this.availableBooks = books;
    }

    // Method to issue books
    public void issueBook(int count) throws BookNotAvailableException {

        if (count <= availableBooks) {
            availableBooks -= count;
            System.out.println("Book issued successfully");
            System.out.println("Remaining books: " + availableBooks);
        } else {
            throw new BookNotAvailableException("Requested books not available");
        }
    }
}

// Main class
public class Practical_6_5 {
    public static void main(String[] args) {

        Library lib = new Library(3);

        try {
            // First issue (valid)
            lib.issueBook(2);

            // Second issue (invalid)
            lib.issueBook(2);

        } catch (BookNotAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}