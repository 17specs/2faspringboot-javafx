package com.nsu.jfx;

import java.io.IOException;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
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
import javafx.scene.text.Text;

@Controller
public class GuiController implements Initializable{


    @FXML
    private AnchorPane rootPane;

    @FXML
    private Pane pane1;

    @FXML
    private MenuBar menueB1;

    @FXML
    private MenuItem menpan0;

    @FXML
    private MenuItem aboutNSU0;

    @FXML
    private JFXTextField phonetext;

    @FXML
    private JFXButton sendbtn;

    @FXML
    private Pane pane2;

    @FXML
    private MenuBar menueB2;

    @FXML
    private MenuItem menpan1;

    @FXML
    private MenuItem aboutNSU1;

    @FXML
    private JFXTextField aboutclicktext;

    @FXML
    private JFXButton verifybtn;

    @FXML
    private Pane pan3;

    @FXML
    private MenuBar menueB3;

    @FXML
    private MenuItem menpan2;

    @FXML
    private MenuItem aboutNSU2;

    @FXML
    private JFXButton demoagain;

    @FXML
    private JFXButton aboutdemo;

    @FXML
    private Pane pane4;

    @FXML
    private MenuBar menueB4;

    @FXML
    private Menu menpan3;

    @FXML
    private MenuItem menupan3;

    @FXML
    private MenuItem aboutNSU3;

    @FXML
    private Text about2fatxt;

    @FXML
    private JFXButton homescreen;

    @FXML
    private Pane pane5;

    @FXML
    private MenuBar menueB5;

    @FXML
    private JFXTextField verifytext;

    @FXML
    private MenuItem menpan4Home;
    @FXML
    void sendclick(ActionEvent event) throws IOException{
        String num = phonetext.getText();
        TwilioSender.sendText(num);
        pane1.setVisible(false);
        pane2.setVisible(true);
        pan3.setVisible(false);
        pane4.setVisible(false);
        pane5.setVisible(false);
        phonetext.clear();
    }

    @FXML
    void verify(ActionEvent event) {
        String secretCode = verifytext.getText();
        if(secretCode.equals(TwilioSender.generatedString) && !secretCode.equals("")) {

            pane1.setVisible(false);
            pane2.setVisible(false);
            pan3.setVisible(true);
            pane4.setVisible(false);
            pane5.setVisible(false);
           verifytext.clear();
        }
        else
            System.out.println(secretCode + " does not equal " + TwilioSender.generatedString);
    }


    @FXML
    void aboutclick(ActionEvent event) {
        pane1.setVisible(false);
        pane2.setVisible(false);
        pan3.setVisible(false);
        pane4.setVisible(true);
        pane5.setVisible(false);
    }

    @FXML
    void democlick(ActionEvent event) {
        pane1.setVisible(true);
        pane2.setVisible(false);
        pan3.setVisible(false);
        pane4.setVisible(false);
        pane5.setVisible(false);
    }

    @FXML
    void backtohomescreen(ActionEvent event) {
        pane1.setVisible(true);
        pane2.setVisible(false);
        pan3.setVisible(false);
        pane4.setVisible(false);
        pane5.setVisible(false);
    }
    @FXML
    void about0click(ActionEvent event) {
        System.out.println("Testclick");
        pane1.setVisible(false);
        pane2.setVisible(false);
        pan3.setVisible(false);
        pane4.setVisible(true);
        pane5.setVisible(false);
    }

    @FXML
    void about1click(ActionEvent event) {
        pane1.setVisible(false);
        pane2.setVisible(false);
        pan3.setVisible(false);
        pane4.setVisible(true);
        pane5.setVisible(false);
    }

    @FXML
    void about2click(ActionEvent event) {
        pane1.setVisible(false);
        pane2.setVisible(false);
        pan3.setVisible(false);
        pane4.setVisible(true);
        pane5.setVisible(false);
    }

    @FXML
    void about3click(ActionEvent event) {
        pane1.setVisible(false);
        pane2.setVisible(false);
        pan3.setVisible(false);
        pane4.setVisible(true);
        pane5.setVisible(false);
    }

    @FXML
    void menpan4Home(ActionEvent event) {
        pane1.setVisible(true);
        pane2.setVisible(false);
        pan3.setVisible(false);
        pane4.setVisible(false);
        pane5.setVisible(false);
    }

    @FXML
    void aboutNSU0(ActionEvent event) {
        pane1.setVisible(false);
        pane2.setVisible(false);
        pan3.setVisible(false);
        pane4.setVisible(false);
        pane5.setVisible(true);
    }

    @FXML
    void aboutNSU1(ActionEvent event) {
        pane1.setVisible(false);
        pane2.setVisible(false);
        pan3.setVisible(false);
        pane4.setVisible(false);
        pane5.setVisible(true);
    }

    @FXML
    void aboutNSU2(ActionEvent event) {
        pane1.setVisible(false);
        pane2.setVisible(false);
        pan3.setVisible(false);
        pane4.setVisible(false);
        pane5.setVisible(true);
    }

    @FXML
    void aboutNSU3(ActionEvent event) {
        pane1.setVisible(false);
        pane2.setVisible(false);
        pan3.setVisible(false);
        pane4.setVisible(false);
        pane5.setVisible(true);
    }




    @Override
    public void initialize(URL url,ResourceBundle rb){


    }
}
