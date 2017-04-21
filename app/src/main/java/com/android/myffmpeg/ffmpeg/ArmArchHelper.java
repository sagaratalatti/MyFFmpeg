package com.android.myffmpeg.ffmpeg;

/**
 * Created by sagar on 20-04-2017.
 */

class ArmArchHelper {

    static {
        System.loadLibrary("ARM_ARCH");
    }
    public native String cpuArchFromJNI();

    boolean isARM_v7_CPU(String cpuInfoString) {
        return cpuInfoString.contains("v7");
    }

    boolean isNeonSupported(String cpuInfoString) {
        // check cpu arch for loading correct ffmpeg lib
        return cpuInfoString.contains("-neon");
    }
}
