module com.example.journalfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.journalfx to javafx.fxml;
    exports com.example.journalfx;
    exports com.example.journalfx.Controllers;
    opens com.example.journalfx.Controllers to javafx.fxml;
}