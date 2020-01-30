package com.sunderville.tanks;

// according to https://drogago.net/javafxmavenspring-step-by-step/
// https://www.youtube.com/watch?v=2V5K5VcmgU0

import com.sunderville.tanks.configuration.spring.SpringConfiguration;
import com.sunderville.tanks.loaderProvider.FXMLLoaderPrivider;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        FXMLLoader loader = ctx.getBean(FXMLLoaderPrivider.class).getLoader("/fxml/MainWindow.fxml");
        Parent root = loader.load();
        primaryStage.setTitle("Tanks Calculator");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}