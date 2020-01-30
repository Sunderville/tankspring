package com.sunderville.tanks.domain;

import com.sunderville.tanks.config.Config;

class Etc {

    double getEtcMass(Tank tank) {
        String etcMass = "0";
        Checkings checkings = new Checkings();

        switch (checkings.defineTankType(tank)) {
            case "РВС-50":
                etcMass = Config.getProp("etc50");
                break;
            case "РВС-100":
                etcMass = Config.getProp("etc100");
                break;
            case "РВС-200":
                etcMass = Config.getProp("etc200");
                break;
            case "РВС-300":
                etcMass = Config.getProp("etc300");
                break;
            case "РВС-400":
                etcMass = Config.getProp("etc400");
                break;
            case "РВС-500":
                etcMass = Config.getProp("etc500");
                break;
            case "РВС-700":
                etcMass = Config.getProp("etc700");
                break;
            case "РВС-1000":
                etcMass = Config.getProp("etc1000");
                break;
            case "РВС-2000":
                etcMass = Config.getProp("etc2000");
                break;
            case "РВС-3000":
                etcMass = Config.getProp("etc3000");
                break;
            case "РВС-5000-12":
                etcMass = Config.getProp("etc5000_12");
                break;
            case "РВС-5000-15":
                etcMass = Config.getProp("etc5000_15");
                break;
            case "РВС-10000-12":
                etcMass = Config.getProp("etc10000_12");
                break;
            case "РВС-10000-18":
                etcMass = Config.getProp("etc10000_18");
                break;
            case "РВС-20000":
                etcMass = Config.getProp("etc20000");
                break;
            case "РВС-30000":
                etcMass = Config.getProp("etc30000");
                break;
            case "РВС-50000":
                etcMass = Config.getProp("etc50000");
                break;
        }
        return Double.parseDouble(etcMass);
    }
}

// То же самое через if
//        if(defineTankType(tank).equals("РВС-50")) etcMass = Config.getProp("etc50");
//                else if(defineTankType(tank).equals("РВС-100")) etcMass = Config.getProp("etc100");
//                else if(defineTankType(tank).equals("РВС-200")) etcMass = Config.getProp("etc200");
//                else if(defineTankType(tank).equals("РВС-300")) etcMass = Config.getProp("etc300");
//                else if(defineTankType(tank).equals("РВС-400")) etcMass = Config.getProp("etc400");
//                else if(defineTankType(tank).equals("РВС-500")) etcMass = Config.getProp("etc500");
//                else if(defineTankType(tank).equals("РВС-700")) etcMass = Config.getProp("etc700");
//                else if(defineTankType(tank).equals("РВС-1000")) etcMass = Config.getProp("etc1000");
//                else if(defineTankType(tank).equals("РВС-2000")) etcMass = Config.getProp("etc2000");
//                else if(defineTankType(tank).equals("РВС-3000")) etcMass = Config.getProp("etc3000");
//                else if(defineTankType(tank).equals("РВС-5000-12")) etcMass = Config.getProp("etc5000_12");
//                else if(defineTankType(tank).equals("РВС-5000-15")) etcMass = Config.getProp("etc5000_15");
//                else if(defineTankType(tank).equals("РВС-10000-12")) etcMass = Config.getProp("etc10000_12");
//                else if(defineTankType(tank).equals("РВС-10000-18")) etcMass = Config.getProp("etc10000_18");
//                else if(defineTankType(tank).equals("РВС-20000")) etcMass = Config.getProp("etc20000");
//                else if(defineTankType(tank).equals("РВС-30000")) etcMass = Config.getProp("etc30000");
//                else if(defineTankType(tank).equals("РВС-50000")) etcMass = Config.getProp("etc50000");