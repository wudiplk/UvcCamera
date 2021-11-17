
package com.rscja.deviceapi;

import android.util.Log;

public class DeviceAPI {
    private static final String TAG = "DeviceAPI";

    static {
        try {
            System.loadLibrary("DeviceAPI");
        } catch (Exception e) {
            Log.e(TAG, "JNI库加载异常！" + e.toString());
        }
    }


    public native int OTG_GPIO_OFF(String var);

    public native int OTG_GPIO_ON(String var);

}
