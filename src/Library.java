import java.util.ArrayList;
import java.util.Iterator;
public class Library {
    ArrayList<User> users = new ArrayList<User>();
    ArrayList<Book> books = new ArrayList<Book>();
    public Library() {
        User user1 = new User( "1", "1", "1", "1", "1", "1", "1", false, "librarian");
        User user2 = new User( "2", "2", "2", "2", "2", "2", "2", false, "reader");
        User user3 = new User( "3", "3", "3", "3", "3", "3", "3", false, "reader");
        Book book1 = new Book("book1", true);
        Book book2 = new Book("book2", true);
        Book book3 = new Book("book3", false);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        books.add(book1);
        books.add(book2);
        books.add(book3);
    }

    public void add_book(ArrayList<Book> books, Book book){
        books.add(book);
    }

    public void remove_book(ArrayList<Book> books, String title){
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getTitle().equals(title)) {
                iterator.remove();
            }
        }
    }
    
    //function to dipslay all books
    public void display_books(ArrayList<Book> books){
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

    public void add_user(ArrayList<User> users, User user){
        users.add(user);
    }

    public void remove_user(ArrayList<User> users, String id){
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.getId().equals(id)) {
                iterator.remove();
            }
        }
    }

    public void book_search(String title, ArrayList<Book> books){
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getTitle().equals(title)) {
                System.out.println(book.toString());
                break;
            }
            else{
                System.out.println("Book not found");
            }
        }
       
    
    }

    public void user_search(String id, ArrayList<User> users){
        for (User user : users) {
            if (user.getId().equals(id)) {
                System.out.println(user.toString());

            }
            else{
                System.out.println("User not found");
            }
        }
    }
}
