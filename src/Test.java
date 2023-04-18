import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Test extends Application {
    
    private ObservableList<Book> books = FXCollections.observableArrayList(
            new Book("Book 1", true),
            new Book("Book 2", false),
            new Book("Book 3", true)
    );
    
    @Override
    public void start(Stage primaryStage) {
        
        ListView<Book> bookList = new ListView<>();
        bookList.setItems(books);
        
        Label titleLabel = new Label("Title:");
        TextField titleField = new TextField();
        titleField.setPrefWidth(150);
        Button addButton = new Button("Add Book");
        addButton.setOnAction(e -> addBook(titleField.getText()));
        
        Button removeButton = new Button("Remove Book");
        removeButton.setOnAction(e -> removeBook(bookList.getSelectionModel().getSelectedItem()));
       // removeButton.disableProperty().bind(bookList.getSelectionModel().selectedItemProperty().isNull());
        
        HBox inputBox = new HBox(10, titleLabel, titleField, addButton, removeButton);
        inputBox.setPadding(new Insets(10));
        
        BorderPane root = new BorderPane(bookList, null, null, inputBox, null);
        
        Scene scene = new Scene(root, 400, 300);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private void addBook(String title) {
        Book book = new Book(title, true);
        books.add(book);
    }
    
    private void removeBook(Book book) {
        books.remove(book);
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}