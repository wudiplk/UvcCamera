package com.iabe.lq368zndk;

/**
 * @author Wudi
 * @date 2021/11/4
 */
public class LQ368ZDevice {
    static {
        System.loadLibrary("lq368zdevice");
    }

    public LQ368ZDevice() {
    }

    public static native int AntiColl(byte[] var0);

    public static native int Authentication(byte[] var0, int var1, byte var2);

    public static native int BDPowerOff(int var0);

    public static native int BDPowerOn(int var0);

    public static native int BDRead(byte[] var0);

    public static native int BDWrite(byte[] var0, int var1);

    public static native int DisplayPowerOFF();

    public static native int DisplayPowerON();

    public static native int FM1715BusSel();

    public static native int FM24C64AClose();

    public static native int FM24C64AOpen();

    public static native int LoadkeyE2Cpy(byte[] var0);

    public static native int MifREAD(byte[] var0, int var1);

    public static native int MifWrite(byte[] var0, int var1);

    public static native int OBDPowerOff(int var0);

    public static native int OBDPowerOn(int var0);

    public static native int OBDRead(byte[] var0);

    public static native int OBDWrite(byte[] var0, int var1);

    public static native int OTGClose();

    public static native int OTGOpen();

    public static native int ReadBytes(byte[] var0, byte[] var1, int var2);

    public static native int ReadReg(byte var0);

    public static native int Request(byte var0);

    public static native int SelectCard();

    public static native int TorchClose();

    public static native int TorchOpen();

    public static native int UVCPowerOFF();

    public static native int UVCPowerON();

    public static native int WriteBytes(byte[] var0, byte[] var1, int var2);

    public static native int fignerPowerOff(int var0);

    public static native int fignerPowerOn(int var0);

    public static native int fingerRead(byte[] var0);

    public static native int fingerWrite(byte[] var0, int var1);
}
