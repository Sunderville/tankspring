package com.sunderville.tanks.controllers;

import com.sunderville.tanks.domain.Tank;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

@Component
public class FormToFill {

    public MenuItem OOO;
    public MenuItem AO;
    public MenuItem PAO;
    public MenuItem MUP;
    public MenuItem IP;
    public MenuItem individual;
    public MenuItem other_property_form;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button save_log_button;
    @FXML
    private Button print_button;

    @FXML
    private MenuButton month;
    @FXML
    private MenuButton year;
    @FXML
    private MenuButton form_of_property_menubutton;

    @FXML
    private TextField customer_name;
    @FXML
    private TextField contact_name;
    @FXML
    private TextField phone_number;
    @FXML
    private TextField haul_to;
    @FXML
    private TextField quantity;
    @FXML
    private TextArea comment_field;

    @FXML
    void OOO(ActionEvent event) {
        form_of_property_menubutton.setText("ООО");
    }
    @FXML
    void AO(ActionEvent event) {
        form_of_property_menubutton.setText("АО");
    }
    @FXML
    void PAO(ActionEvent event) {
        form_of_property_menubutton.setText("ПАО");
    }
    @FXML
    void MUP(ActionEvent event) {
        form_of_property_menubutton.setText("МУП");
    }
    @FXML
    void IP(ActionEvent event) {
        form_of_property_menubutton.setText("ИП");
    }
    @FXML
    void individual(ActionEvent event) {
        form_of_property_menubutton.setText("частное лицо");
    }
    @FXML
    void other_property_form(ActionEvent event) {
        form_of_property_menubutton.setText("другая форма собственности");
    }

    @FXML
    void january(ActionEvent event) {
        month.setText("январь");
    }
    @FXML
    void february(ActionEvent event) {
        month.setText("февраль");
    }
    @FXML
    void march(ActionEvent event) {
        month.setText("март");
    }
    @FXML
    void april(ActionEvent event) {
        month.setText("апрель");
    }
    @FXML
    void may(ActionEvent event) {
        month.setText("май");
    }
    @FXML
    void june(ActionEvent event) {
        month.setText("июнь");
    }
    @FXML
    void july(ActionEvent event) {
        month.setText("июль");
    }
    @FXML
    void august(ActionEvent event) {
        month.setText("август");
    }
    @FXML
    void october(ActionEvent event) {
        month.setText("сентябрь");
    }
    @FXML
    void september(ActionEvent event) {
        month.setText("октябрь");
    }
    @FXML
    void november(ActionEvent event) {
        month.setText("ноябрь");
    }
    @FXML
    void december(ActionEvent event) {
        month.setText("декабрь");
    }
    @FXML
    void unknowember(ActionEvent event) {
        month.setText("х/з");
    }

    @FXML
    void year2020(ActionEvent event) {
        year.setText("2020");
    }
    @FXML
    void year2021(ActionEvent event) {
        year.setText("2021");
    }
    @FXML
    void year2022(ActionEvent event) {
        year.setText("2022");
    }
    @FXML
    void year2023(ActionEvent event) {
        year.setText("2023");
    }
    @FXML
    void year2024(ActionEvent event) {
        year.setText("2024");
    }
    @FXML
    void year2025(ActionEvent event) {
        year.setText("2025");
    }
    @FXML
    void year2026(ActionEvent event) {
        year.setText("2026");
    }
    @FXML
    void year2027(ActionEvent event) {
        year.setText("2027");
    }
    @FXML
    void year2028(ActionEvent event) {
        year.setText("2028");
    }
    @FXML
    void year2029(ActionEvent event) {
        year.setText("2029");
    }

    @FXML
    void initialize() {
//        compileLog(tank);

//TODO Реализовать сохранение и печать
//        print_button();
//        save_log_button();


    }

    public static void compileLog(Tank tank,
                                  MenuButton month, MenuButton year,
                                  MenuButton form_of_property, TextField customer_name,
                                  TextField contact_name, TextField phone_number,
                                  TextField haul_to, TextField quantity, TextArea comment_field){

//        File log = new File("c:\\tanklog.txt" +"-"+ LocalDateTime.now());
//        log.

    }
}