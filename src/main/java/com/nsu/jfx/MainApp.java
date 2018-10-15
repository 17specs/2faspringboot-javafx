package com.nsu.jfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainApp extends Application {

    public ConfigurableApplicationContext springContext;
    public Parent rootNode;
    public FXMLLoader fxmlLoader;






    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void init() throws Exception {
        springContext = SpringApplication.run(MainApp.class);
        fxmlLoader = new FXMLLoader();
        fxmlLoader.setControllerFactory(springContext::getBean);




    }

    @Override
    public void start(Stage primaryStage) throws Exception{



        primaryStage.setTitle("NSU 2FA");
        primaryStage.getIcons().add(new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/NSU_1960_Logo.svg/220px-NSU_1960_Logo.svg.png"));



        fxmlLoader.setLocation(getClass().getResource("/fxml/gui.fxml"));
        rootNode = fxmlLoader.load();




        Scene scene = new Scene(rootNode, 580, 270);




        primaryStage.setScene(scene);


        primaryStage.show();
    }

public void swapscene(){

}

    @Override
    public void stop() {
        springContext.stop();
    }
}