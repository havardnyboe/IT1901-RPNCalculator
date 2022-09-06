module haavasny.calc {
    requires javafx.controls;
    requires javafx.fxml;

    opens haavasny.calc to javafx.graphics, javafx.fxml;
}
