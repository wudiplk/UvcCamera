package com.iabe.lq368zndk;

import java.io.FileWriter;

/**
 * @author Wudi
 * @date 2021/11/4
 */
public class OTG {
    static FileWriter fw;
    String TAG = "OTG";

    public OTG() {
    }

    public static void DisPlay_Power_Disenable() {
        LQ368ZDevice.DisplayPowerOFF();
    }

    public static void DisPlay_Power_Enable() {
        LQ368ZDevice.DisplayPowerON();
    }

    public static void Power_5V_Disenable() {
        LQ368ZDevice.UVCPowerOFF();
    }

    public static void Power_5V_Enable() {
        LQ368ZDevice.UVCPowerON();
    }

    public static void off() {
        LQ368ZDevice.OTGClose();
    }

    public static void on() {
        LQ368ZDevice.OTGOpen();
    }

}
