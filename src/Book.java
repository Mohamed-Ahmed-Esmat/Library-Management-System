public class Book {
    private String title;
    private boolean is_available;
    private Book[] books= new Book[10]; 
    public Book() {
    }

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, boolean is_available) {
        this.title = title;
        this.is_available = is_available;
    }

    public String getTitle() {
        return title;
    }

    public boolean isIs_available() {
        return is_available;
    }

    public void setIs_available(boolean is_available) {
        this.is_available = is_available;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", is_available=" + is_available + '}';
    }

}
