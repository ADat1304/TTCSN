module com.example.test {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.mariadb.jdbc;

    opens com.example.test to javafx.fxml;
    opens com.example.test.Controller to javafx.fxml;
    exports com.example.test;

}
