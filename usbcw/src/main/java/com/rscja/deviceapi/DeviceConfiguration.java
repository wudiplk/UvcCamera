//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.rscja.deviceapi;

import android.os.Build;

/**
 * @author pc
 */
public class DeviceConfiguration {
    private static final String TAG = DeviceConfiguration.class.getSimpleName();
    private static String model;
    private static String uartPath_finger_RFID;
    private static String uartPath_obd_bd;
    private int baudrate;
    private String deviceName;
    private String uart;

    static {
        model = Build.DISPLAY.toUpperCase();
        uartPath_finger_RFID = "/dev/ttyHSL1";
        uartPath_obd_bd = "/dev/ttyHSL1";
        if (model.contains("6018909")) {
            model = "CJ6008909";
            uartPath_obd_bd = "/dev/ttyHSL0";
        } else if (model.contains("6008909")) {
            model = "CJ6008909";
        }
    }

    private DeviceConfiguration(String var1, String var2, int var3) {
        this.deviceName = var1;
        this.uart = var2;
        this.baudrate = var3;
    }

    public static DeviceConfiguration builderBDConfiguration() throws ConfigurationException {
        return new DeviceConfiguration(getModel(), uartPath_obd_bd, 9600);
    }

    public static DeviceConfiguration builderFingerprintConfiguration() throws ConfigurationException {
        return new DeviceConfiguration(getModel(), uartPath_finger_RFID, 57600);
    }

    public static DeviceConfiguration builderRFIDConfiguration() throws ConfigurationException {
        return new DeviceConfiguration(getModel(), uartPath_finger_RFID, 115200);
    }

    public static DeviceConfiguration builderSerialPortConfiguration() throws ConfigurationException {
        return new DeviceConfiguration(getModel(), uartPath_obd_bd, 9600);
    }

    public static String getModel() {
        String var0;
        if (model.equals("i760")) {
            var0 = "C4000";
        } else {
            var0 = model.toUpperCase();
        }
        return var0;
    }

    public int getBaudrate() {
        return this.baudrate;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public String getUart() {
        return this.uart;
    }

    public void setBaudrate(int var1) {
        this.baudrate = var1;
    }

    public void setDeviceName(String var1) {
        this.deviceName = var1;
    }

    public void setUart(String var1) {
        this.uart = var1;
    }
}
