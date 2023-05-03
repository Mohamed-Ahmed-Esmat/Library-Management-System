import java.util.ArrayList;
import java.util.Iterator;
public class Library {
    ArrayList<User> users = new ArrayList<User>();
    ArrayList<Book> books = new ArrayList<Book>();
    ArrayList<Reader> readers = new ArrayList<Reader>();
    ArrayList<Librarian> librarians = new ArrayList<Librarian>();
    public Library() {
        //User user1 = new User( "1", "1", "1", "1", "1", "1", "1", false, "librarian");
        //User user2 = new User( "2", "2", "2", "2", "2", "2", "2", false, "reader");
        //User user3 = new User( "3", "3", "3", "3", "3", "3", "3", false, "reader");

        Librarian librarian1 = new Librarian( "1", "1", "1", "1", "1", "1", "1", false, "librarian");
        Reader reader1 = new Reader( "2", "2", "2", "2", "2", "2", "2", false, "reader");
        Reader reader2 = new Reader( "3", "3", "3", "3", "3", "3", "3", false, "reader");

        Book book1 = new Book("book1", true);
        Book book2 = new Book("book2", true);
        Book book3 = new Book("book3", false);

        //users.add(user1);
        //users.add(user2);
        //users.add(user3);

        readers.add(reader1);
        readers.add(reader2);
        librarians.add(librarian1);
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


    

    public void add_reader(ArrayList<Reader> readers, Reader reader){
        readers.add(reader);
    }

    public void remove_reader(ArrayList<Reader> readers, String id){
        Iterator<Reader> iterator = readers.iterator();
        while (iterator.hasNext()) {
            Reader reader = iterator.next();
            if (reader.getId().equals(id)) {
                iterator.remove();
            }
        }
    }

    

    public void reader_search(String id1, ArrayList<Reader> readers){
        int size = readers.size();
        for (int i = 0 ; i<size ; i++) {

            if(i>=size){
                System.out.println("User not found");
            }

            if (id1.equals(readers.get(i).getId())){
                System.out.println(readers.get(i).toString());
                break;
            }
            
        }
    }








    /*public void add_user(ArrayList<User> users, User user){
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

    

    public void user_search(String id, ArrayList<User> users){
        for (User user : users) {
            if (user.getId().equals(id)) {
                System.out.println(user.toString());

            }
            else{
                System.out.println("User not found");
            }
        }
    }*/


}
