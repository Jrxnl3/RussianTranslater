package de.jinx.translater;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TranslateMain extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        RussianVocals.populateVocals();

        FXMLLoader fxmlLoader = new FXMLLoader(TranslateMain.class.getResource("translator.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Translator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}