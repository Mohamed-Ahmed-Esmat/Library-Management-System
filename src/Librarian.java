import java.util.ArrayList;

public class Librarian  extends User {
    public Librarian(String id, String password, String firstName, String lastName, String address, String cellPhone, String email, boolean isBlocked, String type) {
        super(id, password, firstName, lastName, address, cellPhone, email, isBlocked, "Librarian" );
    }

    public void add_book(ArrayList<Book> books, Book book){
        books.add(book);
    }
        
    public void remove_book(ArrayList<Book> books, Book book){
        books.remove(book);
    }

    public void add_user(ArrayList<User> users, User user){
        users.add(user);
    }

    public void remove_user(ArrayList<User> users, User user){
        users.remove(user);
    }

    
}
