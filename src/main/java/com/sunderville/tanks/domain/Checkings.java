package com.sunderville.tanks.domain;

import com.sunderville.tanks.exceptions.DefineTankTypeException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

class Checkings {

    String defineTankType(Tank tank) {
        String type = "";
        if(tank.getDiameterText().equals("3800") && ringsNumber(tank) == 3) type = "РВС-50";
        else if(tank.getDiameterText().equals("4730") && ringsNumber(tank) == 4) type = "РВС-100";
        else if(tank.getDiameterText().equals("6630") && ringsNumber(tank) == 4) type = "РВС-200";
        else if(tank.getDiameterText().equals("7580") && ringsNumber(tank) == 5) type = "РВС-300";
        else if(tank.getDiameterText().equals("8530") && ringsNumber(tank) == 5) type = "РВС-400";
        else if(tank.getDiameterText().equals("8530") && ringsNumber(tank) == 6) type = "РВС-500";
        else if(tank.getDiameterText().equals("10430") && ringsNumber(tank) == 6) type = "РВС-700";
        else if(tank.getDiameterText().equals("10430") && ringsNumber(tank) == 8) type = "РВС-1000";
        else if(tank.getDiameterText().equals("15180") && ringsNumber(tank) == 8) type = "РВС-2000";
        else if(tank.getDiameterText().equals("18980") && ringsNumber(tank) == 8) type = "РВС-3000";
        else if(tank.getDiameterText().equals("20920") && ringsNumber(tank) == 10) type = "РВС-5000-15";
        else if(tank.getDiameterText().equals("22800") && ringsNumber(tank) == 8) type = "РВС-5000-12";
        else if(tank.getDiameterText().equals("28500") && ringsNumber(tank) == 12) type = "РВС-10000-12";
        else if(tank.getDiameterText().equals("34200") && ringsNumber(tank) == 8) type = "РВС-10000-18";
        else if(tank.getDiameterText().equals("39900") && ringsNumber(tank) == 12) type = "РВС-20000";
        else if(tank.getDiameterText().equals("45600") && ringsNumber(tank) == 12) type = "РВС-30000";
        else if(tank.getDiameterText().equals("60700") && ringsNumber(tank) == 12) type = "РВС-50000";

        else try {
                diamRingDiscrep();
            throw new DefineTankTypeException("Несоответствие диаметра и количества поясов. Проверьте введённые данные");
        } catch (DefineTankTypeException e) {
            e.printStackTrace();
        }

        return type;
    }

    private int ringsNumber(Tank tank) {
        int number = 0;
        if(!tank.getRing1Text().equals("")) number++;
        if(!tank.getRing2Text().equals("")) number++;
        if(!tank.getRing3Text().equals("")) number++;
        if(!tank.getRing4Text().equals("")) number++;
        if(!tank.getRing5Text().equals("")) number++;
        if(!tank.getRing6Text().equals("")) number++;
        if(!tank.getRing7Text().equals("")) number++;
        if(!tank.getRing8Text().equals("")) number++;
        if(!tank.getRing9Text().equals("")) number++;
        if(!tank.getRing10Text().equals("")) number++;
        if(!tank.getRing11Text().equals("")) number++;
        if(!tank.getRing12Text().equals("")) number++;
        return number;
    }

    private void diamRingDiscrep() {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(Checkings.class.getResource("/fxml/DiamRingsDiscrepancy.fxml"));

        try {
            fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = fxmlLoader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.showAndWait();

        throw new RuntimeException("");
    }
}
