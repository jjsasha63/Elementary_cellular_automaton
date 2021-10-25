module com.example.prr1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.red.prr1 to javafx.fxml;
    exports com.red.prr1;
}