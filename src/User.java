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

    public void book_search(String title){
        Book book = new Book(title);
        if
        
    }
}

