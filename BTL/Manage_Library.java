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
        quantity = quan;
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
}

public class Manage_Library {
    int n = 5;
    public static void main(String[] args){
        
    }
}
