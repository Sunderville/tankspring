package com.sunderville.tanks.controllers;

import com.sunderville.tanks.animations.Shake;
import com.sunderville.tanks.domain.GeneralCalculations;
import com.sunderville.tanks.domain.Tank;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

@Component
public class MainWindowController {

    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;

    @FXML
    private MenuButton diameter;

    @FXML
    private TextField ring12;
    @FXML
    private TextField ring11;
    @FXML
    private TextField ring10;
    @FXML
    private TextField ring9;
    @FXML
    private TextField ring8;
    @FXML
    private TextField ring7;
    @FXML
    private TextField ring6;
    @FXML
    private TextField ring5;
    @FXML
    private TextField ring4;
    @FXML
    private TextField ring3;
    @FXML
    private TextField ring2;
    @FXML
    private TextField ring1;

    @FXML
    private TextField bottom_center_thikness;
    @FXML
    private TextField bottom_rim_thikness;
    @FXML
    private TextField roof_thikness;

    @FXML
    private Button log_button;
    @FXML
    private Button calculate_button;
    @FXML
    private Button information_button;

    @FXML
    private TextField insulation_weight;
    @FXML
    private TextField heater_weight;
    @FXML
    private TextField other_weight1;
    @FXML
    private TextField other_weight2;
    @FXML
    private TextField other_weight1_name;
    @FXML
    private TextField other_weight2_name;

    @FXML
    private MenuButton steel_type;
    @FXML
    private TextField result_mass;
    @FXML
    private TextField ton_price;
    @FXML
    private TextField result_price;

    @FXML
    void d15180s(ActionEvent event) {
        diameter.setText("15180");
    }
    @FXML
    void d10430s(ActionEvent event) {
        diameter.setText("10430");
    }
    @FXML
    void d18980s(ActionEvent event) {
        diameter.setText("18980");
    }
    @FXML
    void d20920s(ActionEvent event) {
        diameter.setText("20920");
    }
    @FXML
    void d22800s(ActionEvent event) {
        diameter.setText("22800");
    }
    @FXML
    void d28500s(ActionEvent event) {
        diameter.setText("28500");
    }
    @FXML
    void d3800s(ActionEvent event) {
        diameter.setText("3800");
    }
    @FXML
    void d39900s(ActionEvent event) { diameter.setText("39900"); }
    @FXML
    void d34200s(ActionEvent event) { diameter.setText("34200"); }
    @FXML
    void d45600s(ActionEvent event) {
        diameter.setText("45600");
    }
    @FXML
    void d4730s(ActionEvent event) {
        diameter.setText("4730");
    }
    @FXML
    void d60700s(ActionEvent event) {
        diameter.setText("60700");
    }
    @FXML
    void d6630s(ActionEvent event) {
        diameter.setText("6630");
    }
    @FXML
    void d7580s(ActionEvent event) {
        diameter.setText("7580");
    }
    @FXML
    void d8530s(ActionEvent event) {
        diameter.setText("8530");
    }

    @FXML
    void sSt3selected(ActionEvent event) {
        steel_type.setText("Ст3сп");
    }
    @FXML
    void s09selected(ActionEvent event) {
        steel_type.setText("09Г2С");
    }
    @FXML
    void s12selected(ActionEvent event) {
        steel_type.setText("12Х18Н10Т");
    }

    @FXML
    void initialize() {

        calculate_button.setOnAction(actionEvent -> {

            if(!diameter.getText().equals("Выберите диаметр")){
                Tank tank = new Tank(diameter.getText(),
                        ring1.getText(), ring2.getText(), ring3.getText(), ring4.getText(),
                        ring5.getText(), ring6.getText(), ring7.getText(), ring8.getText(),
                        ring9.getText(), ring10.getText(), ring11.getText(), ring12.getText(),
                        bottom_rim_thikness.getText(), bottom_center_thikness.getText(), roof_thikness.getText(),
                        insulation_weight.getText(), heater_weight.getText(), other_weight1_name.getText(),
                        other_weight1.getText(), other_weight2_name.getText(), other_weight2.getText());

                GeneralCalculations generalCalculations = new GeneralCalculations();

                result_mass.setText(String.valueOf(generalCalculations.resultMass(tank, steel_type.getText())));
                result_price.setText(String.valueOf(generalCalculations.resultPrice(tank, steel_type.getText(), ton_price.getText())));

            } else {
                Shake shake = new Shake(diameter);
                shake.playShake();
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/fxml/SelectDiameter.fxml"));

                try {
                    fxmlLoader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        log_button.setOnAction(actionEvent -> {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/fxml/FormToFill.fxml"));

            try {
                fxmlLoader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = fxmlLoader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

//TODO: после обратного перехода главное окно отображается некорректно
        information_button.setOnAction(event -> {
            information_button.getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/fxml/Information.fxml"));

            try {
                fxmlLoader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = fxmlLoader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
    }
}
