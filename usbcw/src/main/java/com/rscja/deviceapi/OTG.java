package com.rscja.deviceapi;

/**
 * @author Wudi
 * @date 2021/10/27
 */
public class OTG extends Device {
    private static OTG single = null;

    private DeviceAPI deviceAPI;


    private OTG() {
        super();

        deviceAPI = new DeviceAPI();
    }

    public static OTG getInstance() {
        if (single == null) {
            synchronized (OTG.class) {
                if (single == null) {
                    single = new OTG();
                }
            }
        }
        return single;
    }

    public void off() {
        synchronized (this) {
            try {
                if ("CJ6008909".equals(DeviceConfiguration.getModel())) {
                    deviceAPI.OTG_GPIO_ON(DeviceConfiguration.getModel());
                    this.setPowerOn(false);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void on() {
        synchronized (this) {
            try {
                if ("CJ6008909".equals(DeviceConfiguration.getModel())) {
                    deviceAPI.OTG_GPIO_OFF(DeviceConfiguration.getModel());
                    this.setPowerOn(true);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
