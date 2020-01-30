package com.sunderville.tanks.domain;

import java.util.ArrayList;
import java.util.List;

// Возможно, стоит переделать на BigDecimal

class Shell {

    private static final double PI = 3.14;
    private double ringWidth = 1.5d;

    double getShellVolume(Tank tank) {
        double perimeter = (2d*PI) * (Double.parseDouble(tank.getDiameterText())/2d/1000d);
        List<String> allRingsTextList = new ArrayList<>();
        allRingsTextList.add(tank.getRing1Text());
        allRingsTextList.add(tank.getRing2Text());
        allRingsTextList.add(tank.getRing3Text());
        allRingsTextList.add(tank.getRing4Text());
        allRingsTextList.add(tank.getRing5Text());
        allRingsTextList.add(tank.getRing6Text());
        allRingsTextList.add(tank.getRing7Text());
        allRingsTextList.add(tank.getRing8Text());
        allRingsTextList.add(tank.getRing9Text());
        allRingsTextList.add(tank.getRing10Text());
        allRingsTextList.add(tank.getRing11Text());
        allRingsTextList.add(tank.getRing12Text());

        double allRingsVolume = 0;
        for (String s : allRingsTextList) {
            if (s.equals("")) s = "0";
            double sI = ringWidth * perimeter * Double.parseDouble(s)/1000d;
            allRingsVolume = allRingsVolume + sI;
        }
        return allRingsVolume;
    }
}