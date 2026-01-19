class Books{
    private String tittle;
    private String author;
    private boolean issue;

    Books(String tittle, String author, Boolean issue){
        this.tittle = tittle;
        this.author = author;
        this.issue = false;
    }

    public void setTittle(){
        this.tittle = tittle;
    }
    public void setAuthor(){
        this.author = author;
    }
    public String getTittle(){
        return tittle;
    }
    public String getAuthor(){
        return author;
    }


    public void isIssue(){
        if (boolean issue){

        }
    }
}

public class LibaraySystem {

    public static void main (String[] args){
        Books b2 = new Books("Avengers", "Robert");
    }
}
