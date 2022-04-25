import java.io.*;
import java.util.*;


class Book{
    int bookId;
    String bookName;
    String writerName;
    int price;
    int quantity;
    boolean borrowed;
    public Book(int id, String bN, String wN, int pr, int quan){
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
    Hashtable<Interger, String> User_Book_Lent; // Lưu id, và tên của user mượn sách. 
    
}
class User{
        String Name;
        String Passwork;
        Vector<Integer> Book_Borrowed; // Tên sách mà user mượn. Tối đa 5 quyển sách. 
}
class Library{
    Vector<Book> books;
    Vector<User> users;
    Vector<Admin> admin;

}

public class Manage_Library {
    int n = 5;
    public static void main(String[] args){
        
    }
}