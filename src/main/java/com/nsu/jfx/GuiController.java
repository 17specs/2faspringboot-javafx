package com.nsu.jfx;

import java.io.IOException;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.web.WebView;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Node;
import javafx.scene.Scene;

@Controller
public class GuiController implements Initializable{


    @FXML
    private AnchorPane rootPane;

    @FXML
    private Pane pane1;

    @FXML
    private JFXTextField phonetext;

    @FXML
    private JFXButton sendbtn;

    @FXML
    private Pane pane2;

    @FXML
    private JFXTextField verifytext;

    @FXML
    private JFXButton verifybtn;

    @FXML
    void sendclick(ActionEvent event) throws IOException{
        String num = phonetext.getText();
        TwilioSender.sendText(num);
        pane1.setVisible(false);
        pane2.setVisible(true);
    }

    @FXML
    void verify(ActionEvent event) {
        String secretCode = verifytext.getText();
        if(secretCode.equals(TwilioSender.generatedString) && !secretCode.equals(""))
            System.out.println("Negus Succeesed");
        else
            System.out.println("Wrong Code Entered");
    }







    @Override
    public void initialize(URL url,ResourceBundle rb){


    }
}
