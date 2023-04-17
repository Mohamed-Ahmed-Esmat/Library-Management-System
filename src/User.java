public class User {
    private String id;
    private String password;
    private String firstName;
    private String lastName;
    private String address;
    private String cellPhone;
    private String email;
    private boolean isBlocked;

    public User(String id, String password,  String firstName, String lastName, String address, String cellPhone, String email, boolean isBlocked) {
        this.id = id;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.cellPhone = cellPhone;
        this.email = email;
        this.isBlocked = isBlocked;
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
}

