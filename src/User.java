import java.util.ArrayList;

public class User {
    private String id;
    private String password;
    private String firstName;
    private String lastName;
    private String address;
    private String type;
    private String cellPhone;
    private String email;
    private boolean isBlocked;
    private static int count=0;

    public User() {
    }
    public User(String id, String password,  String firstName, String lastName, String address, String cellPhone, String email, boolean isBlocked, String type) {
        this.id = id;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.cellPhone = cellPhone;
        this.email = email;
        this.isBlocked = isBlocked;
        this.type = type;
        count++;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public String getEmail() {
        return email;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void user_search(int id){


    }

    private static int getCount() {
        return count;
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


    private void user_search(String id, ArrayList<User> users){
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

