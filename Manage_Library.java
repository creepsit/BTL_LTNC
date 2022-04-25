import java.io.*;
import java.util.*;


class Book{
    int bookId;
    String bookName;
    String writerName;
    boolean borrowed;
    public Book(int id, String bN, String wN, int pr){
        bookId = id;
        bookName = bN;
        writerName = wN;
        price = pr;
        quantity = quan;
    }
}
class Admin{
    String Name;
    String Passwork;
    Hashtable<Integer, String> User_Book_Lent; // Lưu id, và tên của user mượn sách. 
    public Admin(String name, String pass){
        User_Book_Lent = new Hashtable<Integer, String>();
        Name = name;
        Passwork = pass;
    }
}
class Library{
    Vector<Book> books;
    Vector<Admin> admin;
    public Library(){
        books = new Vector<Book>();
        admin = new Vector<Admin>();
    }
    public void add_Book(Book bookNeedAdd){
        Win.books.add(bookNeedAdd);
    }
}

public class Manage_Library {
    int n = 5;
    public static void main(String[] args){
        
    }
}
