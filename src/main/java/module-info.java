module de.jinx.translater {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens de.jinx.translater to javafx.fxml;
    exports de.jinx.translater;
}