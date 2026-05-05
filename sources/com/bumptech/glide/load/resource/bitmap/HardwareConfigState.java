package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class HardwareConfigState {
    private static final File FD_SIZE_LIST = new File("/proc/self/fd");
    private static final int MAXIMUM_FDS_FOR_HARDWARE_CONFIGS_O = 700;
    private static final int MAXIMUM_FDS_FOR_HARDWARE_CONFIGS_P = 20000;
    private static final int MINIMUM_DECODES_BETWEEN_FD_CHECKS = 50;
    static final int MIN_HARDWARE_DIMENSION_O = 128;
    private static final int MIN_HARDWARE_DIMENSION_P = 0;
    private static volatile HardwareConfigState instance = null;
    private int decodesSinceLastFdCheck;
    private final int fdCountLimit;
    private boolean isFdSizeBelowHardwareLimit = true;
    private final boolean isHardwareConfigAllowedByDeviceModel = isHardwareConfigAllowedByDeviceModel();
    private final int minHardwareDimension;

    HardwareConfigState() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.fdCountLimit = 20000;
            this.minHardwareDimension = 0;
        } else {
            this.fdCountLimit = 700;
            this.minHardwareDimension = 128;
        }
    }

    public static HardwareConfigState getInstance() {
        if (instance == null) {
            synchronized (HardwareConfigState.class) {
                if (instance == null) {
                    instance = new HardwareConfigState();
                }
            }
        }
        return instance;
    }

    private synchronized boolean isFdSizeBelowHardwareLimit() {
        int i2 = this.decodesSinceLastFdCheck + 1;
        this.decodesSinceLastFdCheck = i2;
        if (i2 >= 50) {
            this.decodesSinceLastFdCheck = 0;
            int length = FD_SIZE_LIST.list().length;
            boolean z2 = length < this.fdCountLimit;
            this.isFdSizeBelowHardwareLimit = z2;
            if (!z2 && Log.isLoggable("Downsampler", 5)) {
                String str = "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + this.fdCountLimit;
            }
        }
        return this.isFdSizeBelowHardwareLimit;
    }

    private static boolean isHardwareConfigAllowedByDeviceModel() {
        if (Build.MODEL == null || Build.MODEL.length() < 7) {
            return true;
        }
        String strSubstring = Build.MODEL.substring(0, 7);
        strSubstring.hashCode();
        switch (strSubstring) {
            case "SM-A520":
            case "SM-G930":
            case "SM-G935":
            case "SM-G960":
            case "SM-G965":
            case "SM-J720":
            case "SM-N935":
                if (Build.VERSION.SDK_INT == 26) {
                    break;
                }
                break;
        }
        return true;
    }

    public boolean isHardwareConfigAllowed(int i2, int i3, boolean z2, boolean z3) {
        int i4;
        return z2 && this.isHardwareConfigAllowedByDeviceModel && !z3 && i2 >= (i4 = this.minHardwareDimension) && i3 >= i4 && isFdSizeBelowHardwareLimit();
    }

    boolean setHardwareConfigIfAllowed(int i2, int i3, BitmapFactory.Options options, boolean z2, boolean z3) {
        boolean zIsHardwareConfigAllowed = isHardwareConfigAllowed(i2, i3, z2, z3);
        if (zIsHardwareConfigAllowed) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return zIsHardwareConfigAllowed;
    }
}
