package com.sunderville.tanks.domain;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class GeneralCalculations {

    public double resultMass(Tank tank, String steelType) {
        Density density = new Density();
        Shell shell = new Shell();
        Bottom bottom = new Bottom();
        Roof roof = new Roof();
        Etc etc = new Etc();
        double EtcMass = etc.getEtcMass(tank);

        double heaterWeight = tank.getHeaterWeightText().equals("") ?
                0d : Double.parseDouble(tank.getHeaterWeightText());
        double insulationWeight = tank.getInsulationWeightText().equals("") ?
                0d : Double.parseDouble(tank.getInsulationWeightText());
        double otherWeight1 = tank.getOtherWeight1Text().equals("") ?
                0d : Double.parseDouble(tank.getOtherWeight1Text());
        double otherWeight2 = tank.getOtherWeight2Text().equals("") ?
                0d : Double.parseDouble(tank.getOtherWeight2Text());

        if(bottom.getBottomVolume(tank) == 0 || roof.getActualRoofMass(tank) == 0) {
            EtcMass = 0;
        }
        double result = (shell.getShellVolume(tank) + bottom.getBottomVolume(tank)) * density.getDensityByString(steelType) +
                roof.getActualRoofMass(tank) + EtcMass + heaterWeight + insulationWeight + otherWeight1 + otherWeight2;

        return new BigDecimal(result).setScale(1, RoundingMode.UP).doubleValue();
    }

    public int resultPrice(Tank tank, String steelType, String ton_price) {
        if (ton_price.equals("")) ton_price = "0";

        double price = resultMass(tank, steelType) * Integer.parseInt(ton_price);

        return (int)price;
    }
}