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
            System.out.println("3- Add Reader");
            System.out.println("4- Remove Reader");
            System.out.println("5- Search Book");
            System.out.println("6- Display Books");
            System.out.println("7- Search Reader");
            System.out.println("8- Exit");
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
                    String title1 = input.next();
                    library.remove_book(library.books, title1);
                    break;
                case 3:
                    System.out.println("Please enter the reader ID");
                    String id1 = input.next();
                    System.out.println("Please enter the reader password");
                    String password1 = input.next();
                    System.out.println("Please enter the reader first name");
                    String firstName = input.next();
                    System.out.println("Please enter the reader last name");
                    String lastName = input.next();
                    System.out.println("Please enter the reader address");
                    String address = input.next();
                    System.out.println("Please enter the reader cell phone");
                    String cellPhone = input.next();
                    System.out.println("Please enter the reader email");
                    String email = input.next();
                    System.out.println("Please enter the reader type");
                    String type = input.next();
                    Reader reader = new Reader(id1, password1, firstName, lastName, address, cellPhone, email, false, type);
                    library.add_reader(library.readers, reader);
                    break;
                case 4:
                    System.out.println("Please enter the reader ID");
                    String id2 = input.nextLine();
                    library.remove_reader(library.readers, id2);
                    break;
                case 5:
                    System.out.println("Please enter the book title");
                    String title2 = input.next();
                    library.book_search(title2, library.books);
                    break;
                case 6:
                    library.display_books(library.books);
                    break;
                case 7:
                    System.out.println("Please enter the reader ID");
                    String id3 = input.next();
                    library.reader_search(id3, library.readers);
                    break;
                case 8:
                    System.out.println("Thank you for using the Library");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;


    }
}
while(choice!=8);
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
