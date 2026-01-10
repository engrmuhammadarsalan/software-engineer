class Book{
    String tittle;
    String author;


    Book(){
        System.out.println("Book object created");
    }
    public void display(){
        System.out.println(this.tittle);
        System.out.println(this.author);
    }
}



public class BookAuthorsAndDetails {

    public static void main(String[] args){

        Book b1= new Book();
        b1.tittle = "Romantic Life";
        b1.author = "By Ali";

        Book b2 = new Book();
        b2.tittle = "Avengers";
        b2.author = "thomas";

        b1.display();
        b2.display();

    }
}
