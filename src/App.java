import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.layout.VBox;


public class App extends Application {

    // Declare variables for UI components
    private Stage stage;
    private BorderPane root;
    private Scene loginScene, librarianScene, readerScene;
    private Label loginLabel, idLabel, passwordLabel;
    private TextField idField;
    private PasswordField passwordField;
    private Button loginButton;
    private Label messageLabel;

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Initialize stage and root pane
        stage = primaryStage;
        root = new BorderPane();

        // Initialize UI components for login scene
        loginLabel = new Label("Library Management System");
        loginLabel.setStyle("-fx-font-size: 24px; -fx-padding: 10px;");
        idLabel = new Label("ID:");
        passwordLabel = new Label("Password:");
        idField = new TextField();
        passwordField = new PasswordField();
        loginButton = new Button("Login");
        messageLabel = new Label();

        // Initialize event handler for login button
        loginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String id = idField.getText();
                String password = passwordField.getText();
                String userType = getUserType(id, password);
                if (userType.equals("librarian")) {
                    showLibrarianDashboard();
                } else if (userType.equals("reader")) {
                    showReaderDashboard();
                } else {
                    messageLabel.setText("Invalid ID or password");
                }
            }
        });

        // Initialize UI components for login form
        GridPane loginForm = new GridPane();
        loginForm.setHgap(10);
        loginForm.setVgap(10);
        loginForm.setPadding(new Insets(20));
        loginForm.setAlignment(Pos.CENTER);
        loginForm.add(idLabel, 0, 0);
        loginForm.add(idField, 1, 0);
        loginForm.add(passwordLabel, 0, 1);
        loginForm.add(passwordField, 1, 1);
        loginForm.add(loginButton, 1, 2);
        loginForm.add(messageLabel, 1, 3);
        
        // Add login label and form to login scene
        loginScene = new Scene(root, 400, 300);
        root.setTop(loginLabel);
        root.setCenter(loginForm);
        
        // Set the scene for the stage and show it
        stage.setScene(loginScene);
        stage.show();
    }

    // This method checks the user's credentials and returns the user's type (librarian or reader)
    private String getUserType(String id, String password) {
        if (id.equals("1234") && password.equals("4567")) {
            return "librarian";
        } else if (id.equals("5678") && password.equals("9012")) {
            return "reader";
        } else {
            return "invalid";
        }
    }

    // This method shows the librarian dashboard
    private void showLibrarianDashboard() {
        // Initialize UI components for librarian dashboard
        Label librarianLabel = new Label("Librarian Dashboard");
        Button addButton = new Button("Add Book");
        Button removeButton = new Button("Remove Book");
        Button logoutButton = new Button("Logout");
            // Set UI component properties
    librarianLabel.setFont(new Font("Arial", 24));
    addButton.setPrefWidth(150);
    removeButton.setPrefWidth(150);
    logoutButton.setPrefWidth(150);
    
    // Create layout for librarian dashboard
    VBox librarianBox = new VBox(20, librarianLabel, addButton, removeButton, logoutButton);
    librarianBox.setAlignment(Pos.CENTER);
    
    // Set event handlers for buttons
    addButton.setOnAction(e -> {
        // Show add book scene
        showAddBookScene();
    });
    
    removeButton.setOnAction(e -> {
        // Show remove book scene
        showRemoveBookScene();
    });
    
    logoutButton.setOnAction(e -> {
        // Show login scene
        stage.setScene(loginScene);
        stage.show();
    });
    
    // Set librarian dashboard as the root of the scene
    Scene librarianScene = new Scene(librarianBox, 400, 400);
    stage.setScene(librarianScene);
}

// This method shows the reader dashboard
private void showReaderDashboard() {
    // Initialize UI components for reader dashboard
    Label readerLabel = new Label("Reader Dashboard");
    Button searchButton = new Button("Search Book");
    Button orderButton = new Button("Order Book");
    Button logoutButton = new Button("Logout");
    
    // Set UI component properties
    readerLabel.setFont(new Font("Arial", 24));
    searchButton.setPrefWidth(150);
    orderButton.setPrefWidth(150);
    logoutButton.setPrefWidth(150);
    
    // Create layout for reader dashboard
    VBox readerBox = new VBox(20, readerLabel, searchButton, orderButton, logoutButton);
    readerBox.setAlignment(Pos.CENTER);
    
    // Set event handlers for buttons
    searchButton.setOnAction(e -> {
        // Show search book scene
        //showSearchBookScene();
    });
    
    orderButton.setOnAction(e -> {
        // Show order book scene
        //showOrderBookScene();
    });
    
    logoutButton.setOnAction(e -> {
        // Show login scene
        stage.setScene(loginScene);
        stage.show();
    });
    
    // Set reader dashboard as the root of the scene
    Scene readerScene = new Scene(readerBox, 400, 400);
    stage.setScene(readerScene);
}
private void showAddBookScene(){
    // Initialize UI components for add book scene
    Label addBookLabel = new Label("Add Book");
    Label titleLabel = new Label("Title:");
    Label authorLabel = new Label("Author:");
    Label isbnLabel = new Label("ISBN:");
    TextField titleField = new TextField();
    TextField authorField = new TextField();
    TextField isbnField = new TextField();
    Button addButton = new Button("Add");
    Button backButton = new Button("Back");
    
    // Set UI component properties
    addBookLabel.setFont(new Font("Arial", 24));
    titleLabel.setFont(new Font("Arial", 16));
    authorLabel.setFont(new Font("Arial", 16));
    isbnLabel.setFont(new Font("Arial", 16));
    titleField.setPrefWidth(200);
    authorField.setPrefWidth(200);
    isbnField.setPrefWidth(200);
    addButton.setPrefWidth(150);
    backButton.setPrefWidth(150);
    
    // Create layout for add book scene
    GridPane addBookForm = new GridPane();
    addBookForm.setHgap(10);
    addBookForm.setVgap(10);
    addBookForm.setPadding(new Insets(20));
    addBookForm.setAlignment(Pos.CENTER);
    addBookForm.add(addBookLabel, 0, 0);
    addBookForm.add(titleLabel, 0, 1);
    addBookForm.add(titleField, 1, 1);
    addBookForm.add(authorLabel, 0, 2);
    addBookForm.add(authorField, 1, 2);
    addBookForm.add(isbnLabel, 0, 3);
    addBookForm.add(isbnField, 1, 3);
    addBookForm.add(addButton, 1, 4);
    addBookForm.add(backButton, 1, 5);
    
    // Set event handlers for buttons
    addButton.setOnAction(e -> {
        // Add book to database
        //showLibrarianDashboard();
    });
    
    backButton.setOnAction(e -> {
        // Show librarian dashboard
        showLibrarianDashboard();
    });
    
    // Set add book scene as the root of the scene
    Scene addBookScene = new Scene(addBookForm, 400, 400);
    stage.setScene(addBookScene);
}
private void showRemoveBookScene(){
    // Initialize UI components for remove book scene
    Label removeBookLabel = new Label("Remove Book");
    Label titleLabel = new Label("Title:");
    Label authorLabel = new Label("Author:");
    Label isbnLabel = new Label("ISBN:");
    TextField titleField = new TextField();
    TextField authorField = new TextField();
    TextField isbnField = new TextField();
    Button removeButton = new Button("Remove");
    Button backButton = new Button("Back");
    
    // Set UI component properties
    removeBookLabel.setFont(new Font("Arial", 24));
    titleLabel.setFont(new Font("Arial", 16));
    authorLabel.setFont(new Font("Arial", 16));
    isbnLabel.setFont(new Font("Arial", 16));
    titleField.setPrefWidth(200);
    authorField.setPrefWidth(200);
    isbnField.setPrefWidth(200);
    removeButton.setPrefWidth(150);
    backButton.setPrefWidth(150);
    
    // Create layout for remove book scene
    GridPane removeBookForm = new GridPane();
    removeBookForm.setHgap(10);
    removeBookForm.setVgap(10);
    removeBookForm.setPadding(new Insets(20));
    removeBookForm.setAlignment(Pos.CENTER);
    removeBookForm.add(removeBookLabel, 0, 0);
    removeBookForm.add(titleLabel, 0, 1);
    removeBookForm.add(titleField, 1, 1);
    removeBookForm.add(authorLabel, 0, 2);
    removeBookForm.add(authorField, 1, 2);
    removeBookForm.add(isbnLabel, 0, 3);
    removeBookForm.add(isbnField, 1, 3);
    removeBookForm.add(removeButton, 1, 4);
    removeBookForm.add(backButton, 1, 5);
    
    // Set event handlers for buttons
    removeButton.setOnAction(e -> {
        // Remove book from database
        //showLibrarianDashboard();
    });
    
    backButton.setOnAction(e -> {
        // Show librarian dashboard
        showLibrarianDashboard();
    });
    
    // Set remove book scene as the root of the scene
    Scene removeBookScene = new Scene(removeBookForm, 400, 400);
    stage.setScene(removeBookScene);
}
}

