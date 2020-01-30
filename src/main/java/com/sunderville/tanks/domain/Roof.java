package com.sunderville.tanks.domain;

import com.sunderville.tanks.config.Config;

class Roof {

    double getActualRoofMass(Tank tank) {
        double roofMass = 0;
        Checkings checkings = new Checkings();

        int localRoofThikness;
        if(tank.getRoofThiknessText().equals("")) localRoofThikness = 0;
        else localRoofThikness = Integer.parseInt(tank.getRoofThiknessText());

        switch (checkings.defineTankType(tank)) {
            case "РВС-50":
                roofMass = Double.parseDouble(Config.getProp("roof50")) / 4 * localRoofThikness;
                break;
            case "РВС-100":
                roofMass = Double.parseDouble(Config.getProp("roof100")) / 4 * localRoofThikness;
                break;
            case "РВС-200":
                roofMass = Double.parseDouble(Config.getProp("roof200")) / 4 * localRoofThikness;
                break;
            case "РВС-300":
                roofMass = Double.parseDouble(Config.getProp("roof300")) / 5 * localRoofThikness;
                break;
            case "РВС-400":
                roofMass = Double.parseDouble(Config.getProp("roof400")) / 5 * localRoofThikness;
                break;
            case "РВС-500":
                roofMass = Double.parseDouble(Config.getProp("roof500")) / 5 * localRoofThikness;
                break;
            case "РВС-700":
                roofMass = Double.parseDouble(Config.getProp("roof700")) / 5 * localRoofThikness;
                break;
            case "РВС-1000":
                roofMass = Double.parseDouble(Config.getProp("roof1000")) / 6 * localRoofThikness;
                break;
            case "РВС-2000":
                roofMass = Double.parseDouble(Config.getProp("roof2000")) / 4 * localRoofThikness;
                break;
            case "РВС-3000":
                roofMass = Double.parseDouble(Config.getProp("roof3000")) / 4 * localRoofThikness;
                break;
            case "РВС-5000-12":
                roofMass = Double.parseDouble(Config.getProp("roof5000_12")) / 4 * localRoofThikness;
                break;
            case "РВС-5000-15":
                roofMass = Double.parseDouble(Config.getProp("roof5000_15")) / 4 * localRoofThikness;
                break;
            case "РВС-10000-12":
                roofMass = Double.parseDouble(Config.getProp("roof10000_12")) / 4 * localRoofThikness;
                break;
            case "РВС-10000-18":
                roofMass = Double.parseDouble(Config.getProp("roof10000_18")) / 4 * localRoofThikness;
                break;
            case "РВС-20000":
                roofMass = Double.parseDouble(Config.getProp("roof20000")) / 5 * localRoofThikness;
                break;
            case "РВС-30000":
                roofMass = Double.parseDouble(Config.getProp("roof30000")) / 5 * localRoofThikness;
                break;
            case "РВС-50000":
                roofMass = Double.parseDouble(Config.getProp("roof50000")) / 5 * localRoofThikness;
                break;
        }
        return roofMass;
    }
}