package com.serenegiant.usb;

import java.nio.ByteBuffer;

/**
 * @author pc
 */
public interface IStatusCallback {
    /**
     * 回调
     * @param statusClass
     * @param event
     * @param selector
     * @param statusAttribute
     * @param data
     */
    void onStatus(int statusClass, int event, int selector, int statusAttribute, ByteBuffer data);
}
