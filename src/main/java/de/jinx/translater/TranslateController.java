package de.jinx.translater;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class TranslateController{

    @FXML
    private Button translateButton;

    @FXML
    private TextArea translatedText;

    @FXML
    private TextField vocalText;

    @FXML
    void vocalInput(KeyEvent event) {
        //Sending Key using Short Cut
        if(event.getCode() == KeyCode.ENTER) {

            if(vocalText.getText().equals("") || vocalText.getText().equals(" ")) {

                translatedText.setText(translatedText.getText() + " ");

                vocalText.clear();

            }else
                translateButton.fireEvent(new ActionEvent());
        }
        //Remove one Key of *TRANSLATED TEXT*
        if(event.getCode() == KeyCode.BACK_SPACE && isEmpty(vocalText.getText()) && !isEmpty(translatedText.getText())) {
            translatedText.setText(translatedText.getText(0,translatedText.getLength()-1));
        }
        //Remove one Key of *VOCAL*
        if(event.getCode() == KeyCode.BACK_SPACE && !isEmpty(vocalText.getText())) {
            vocalText.setText(vocalText.getText(0,vocalText.getLength()-1));
        }
    }

    @FXML
    void translateVocals(ActionEvent event) {
        String vocals = vocalText.getText();

        if(RussianVocals.RUSSIAN_VOCALS.containsKey(vocals)){

            translatedText.setText(translatedText.getText() + RussianVocals.RUSSIAN_VOCALS.get(vocals));

        }
        vocalText.setText("");
    }

    boolean isEmpty(String text){
        if(text.equals("") || text.equals(" ") || text == null)
            return true;
        return false;
    }
}