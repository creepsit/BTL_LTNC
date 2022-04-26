import java.io.*;
import java.util.*;


public class Book{
    private int bookId;
    private String bookName;
    private String writerName;
    private boolean borrowed;
    public Book(int id, String bN, String wN, int pr){
        bookId = id;
        bookName = bN;
        writerName = wN;
        price = pr;
    }
    public String getbookName(){
        return bookName;
    }
    public String getwriterName(){
        return writerName;
    }
    public int getbookId(){
        return bookId;
    }
    public boolean getborrowed(){
        return borrowed;
    }

}
public class Admin{
    private String Name;
    private String Passwork;
    private Hashtable<Integer, String> User_Book_Lent; // Lưu id, và tên của user mượn sách. 
    public Admin(String name, String pass){
        User_Book_Lent = new Hashtable<Integer, String>();
        Name = name;
        Passwork = pass;
    }
    public String getName(){
        return Name;
    }
    public String getPasswork(){
        return Passwork;
    }
    public int get_id_book_lent(int idex){
        
    }

}
public class Library{
    private Vector<Book> books;
    private Vector<Admin> admin;
    public Library(){
        books = new Vector<Book>();
        admin = new Vector<Admin>();
    }
    public void add_Book(Book bookNeedAdd){
        Win.books.add(bookNeedAdd);
    }
    public static void delete_Book(Book bookNeedDelete){
        int length = Win.books.size();
        for(int indexOfBook = 0; indexOfBook < length; indexOfBook++){
            if(Win.books.get(indexOfBook) == bookNeedDelete){
                Win.books.remove(indexOfBook);
                return;
            }
        }
    }
    public static Vector<Book> search_Book(String bookNeedSearch){
        Vector<Book> stringOfBook = new Vector<Book>();
        bookNeedSearch = bookNeedSearch.toLowerCase();
        bookNeedSearch = bookNeedSearch.replaceAll("\\s+","");
        int length = Win.books.size();
        for(int indexOfBook = 0; indexOfBook < length; indexOfBook++){
            Book nameOfBook = Win.books.get(indexOfBook);
            if(nameOfBook.getBook().contains(bookNeedSearch) || nameOfBook.getwriterName().contains(bookNeedSearch)){
                stringOfBook.add(Win.books.get(indexOfBook));
            }
        }
        return stringOfBook;
    }
}

public class Manage_Library {
    int n = 5;
    public static void main(String[] args){
        
    }
}
