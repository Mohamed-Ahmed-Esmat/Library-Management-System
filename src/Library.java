import java.util.ArrayList;
public class Library {
    ArrayList<User> users = new ArrayList<User>();
    ArrayList<Book> books = new ArrayList<Book>();
    User user1 = new User( "1", "1", "1", "1", "1", "1", "1", false, "librarian");
    User user2 = new User( "2", "2", "2", "2", "2", "2", "2", false, "reader");
    User user3 = new User( "3", "3", "3", "3", "3", "3", "3", false, "reader");
    Book book1 = new Book("book1", true);
    Book book2 = new Book("book2", true);
    Book book3 = new Book("book3", false);

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

    private void book_search(String title, ArrayList<Book> books){
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                System.out.println(book.toString());

            }
            else{
                System.out.println("Book not found");
            }
        }
       
    
    }
}
