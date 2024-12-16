module org.example.proj1vanskiy {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.proj1vanskiy to javafx.fxml;
    exports org.example.proj1vanskiy;
}