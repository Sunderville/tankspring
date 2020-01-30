package com.sunderville.tanks.domain;

// Ready to use

public class Density {

    private static final double _ST3SP = 7.87;
    private static final double _09G2S = 7.85;
    private static final double _12H18N10T = 7.9;

    double getDensityByString(String steelType) {
        if(steelType.equals("Ст3сп")) return _ST3SP;
        if(steelType.equals("09Г2С")) return _09G2S;
        if(steelType.equals("12Х18Н10Т")) return _12H18N10T;
        else return _ST3SP;
    }

}
