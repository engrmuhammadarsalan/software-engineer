class Books {
    private String title;
    private String author;
    private boolean isIssued;

    // Constructor
    Books(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public void issueBook() {
        if (isIssued) {
            System.out.println("Book already issued");
        } else {
            isIssued = true;
            System.out.println("Book issued successfully");
        }
    }

    public void returnBook() {
        if (!isIssued) {
            System.out.println("Book was not issued");
        } else {
            isIssued = false;
            System.out.println("Book returned successfully");
        }
    }

    public void showDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Issued: " + isIssued);
    }
}

public class LibaraySystem {
    public static void main(String[] args) {

        Books b1 = new Books("Avengers", "Robert");

        b1.showDetails();
        b1.issueBook();
        b1.issueBook();
        b1.returnBook();
        b1.showDetails();
    }
}
