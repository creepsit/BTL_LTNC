import java.io.*;
import java.util.*;
import java.util.jar.Attributes.Name;


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

public class User_Book_Lent{
    private int Id_user;
    private String Name_user;
    public User_Book_Lent(int id_u, String name_u){
        Id_user = id_u;
        Name_user = name_u;
    }
    public int getId_user(){
        return Id_user;
    }
    public String getName_user(){
        return Name_user;
    }
}

public class Admin{
    private String Name;
    private String Passwork;

    public Admin(String name, String pass){
        Name = name;
        Passwork = pass;
    }

    public String getName(){
        return Name;
    }

    public String getPasswork(){
        return Passwork;
    }



}
public class Library{

    private Vector<Book> books;
    private Vector<Admin> admins;
    // viết thêm 1 véc tơ kiểu class User_Book_Lent
    public Library(){
        books = new Vector<Book>();
        admins = new Vector<Admin>();
        //
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
