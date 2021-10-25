module com.example.prr1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.red to javafx.fxml;
    exports com.red;
}