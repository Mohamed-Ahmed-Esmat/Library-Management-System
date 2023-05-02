import java.util.Scanner;

public class Primary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Library library = new Library();
        int choice;
        System.out.println("Welcome to the Library");
        System.out.println("Please enter your ID");
        String id = input.nextLine();
        System.out.println("Please enter your password");
        String password = input.nextLine();
        if (id.equals("1") && password.equals("1")) {
            System.out.println("Welcome Librarian");
       do{
            System.out.println("Please enter your choice");
            System.out.println("1- Add Book");
            System.out.println("2- Remove Book");
            System.out.println("3- Add User");
            System.out.println("4- Remove User");
            System.out.println("5- Search Book");
            System.out.println("6- Search User");
            System.out.println("7- Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Please enter the book title");
                    String title = input.next();
                    Book book = new Book(title, true);
                    library.add_book(library.books, book);
                    System.out.println(book);
                    break;
                case 2:
                    System.out.println("Please enter the book title");
                    String title1 = input.nextLine();
                    Book book1 = new Book(title1, true);
                    library.remove_book(library.books, book1);
                    break;
                case 3:
                    System.out.println("Please enter the user ID");
                    String id1 = input.nextLine();
                    System.out.println("Please enter the user password");
                    String password1 = input.nextLine();
                    System.out.println("Please enter the user first name");
                    String firstName = input.nextLine();
                    System.out.println("Please enter the user last name");
                    String lastName = input.nextLine();
                    System.out.println("Please enter the user address");
                    String address = input.nextLine();
                    System.out.println("Please enter the user cell phone");
                    String cellPhone = input.nextLine();
                    System.out.println("Please enter the user email");
                    String email = input.nextLine();
                    System.out.println("Please enter the user type");
                    String type = input.nextLine();
                    User user = new User(id1, password1, firstName, lastName, address, cellPhone, email, false, type);
                    library.add_user(library.users, user);
                    break;
                case 4:
                    System.out.println("Please enter the user ID");
                    String id2 = input.nextLine();
                    System.out.println("Please enter the user password");
                    String password2 = input.nextLine();
                    System.out.println("Please enter the user first name");
                    String firstName1 = input.nextLine();
                    System.out.println("Please enter the user last name");
                    String lastName1 = input.nextLine();
                    System.out.println("Please enter the user address");
                    String address1 = input.nextLine();
                    System.out.println("Please enter the user cell phone");
                    String cellPhone1 = input.nextLine();
                    System.out.println("Please enter the user email");
                    String email1 = input.nextLine();
                    System.out.println("Please enter the user type");
                    String type1 = input.nextLine();
                    User user1 = new User(id2, password2, firstName1, lastName1, address1, cellPhone1, email1, false, type1);
                    library.remove_user(library.users, user1);
                    break;
                case 5:
                    System.out.println("Please enter the book title");
                    String title2 = input.nextLine();
                    library.book_search(title2, library.books);
                    break;
                case 6:
                    System.out.println("Please enter the user ID");
                    String id3 = input.nextLine();
                    library.user_search(id3, library.users);
                    break;
                case 7:
                    System.out.println("Thank you for using the Library");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;


    }
}
while(choice!=7);
}

//for reader
if(id.equals("2") && password.equals("2")){
    System.out.println("Welcome Reader");
    do{
        System.out.println("Please enter your choice");
        System.out.println("1- Search Book");
        System.out.println("2- Exit");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Please enter the book title");
                String title = input.next();
                library.book_search(title, library.books);
                break;
            case 2:
                System.out.println("Thank you for using the Library");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
    while(choice!=2);
}
}
}
