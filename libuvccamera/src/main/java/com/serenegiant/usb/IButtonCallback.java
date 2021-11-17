package com.serenegiant.usb;

/**
 * @author pc
 */
public interface IButtonCallback {
    /**
     * 回调
     * @param button
     * @param state
     */
    void onButton(int button, int state);
}
