
public class Book {
    static int totalBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;
    static {
        totalBooks=0;
    }
    {//object init
        totalBooks++;
    }
    Book(String isbn,String title,String author){
        this.isbn=isbn;
        this.title=title;
        this.author=author;
    }
    Book(String isbn){
        this(isbn, "unknown","unknown");
    }
    static int getTotalBooks(){
        return totalBooks;
    }
     void borrowBook(){
        if(isBorrowed){
            System.out.println("book already borrowed");;
        } else {
            this.isBorrowed = true;
            System.out.println("enjoy "+this.title);
        }
    }
    void returnBook(){
        if(isBorrowed){
            this.isBorrowed=false;
            System.out.println("hope you enjoyed, please leave the review");

        } else {
            System.out.println("This book is already in the library");
        }
    }
    static void main(String[] args) {
        Book designOfThings=new Book("1","design","Author");
        Book myBook=new Book("2");
        System.out.println(Book.getTotalBooks());
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        designOfThings.returnBook();
    }


}
