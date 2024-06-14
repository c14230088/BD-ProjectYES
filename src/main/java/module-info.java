module com.example.bdprojectyes {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.bdprojectyes to javafx.fxml;
    exports com.example.bdprojectyes;
}