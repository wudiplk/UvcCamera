package com.rscja.deviceapi;

/**
 * @author Wudi
 * @date 2021/10/27
 */
public abstract class Device {
    protected boolean powerOn = false;

    public Device() {
    }

    public boolean isPowerOn() {
        return this.powerOn;
    }

    protected void setPowerOn(boolean var1) {
        this.powerOn = var1;
    }
}
