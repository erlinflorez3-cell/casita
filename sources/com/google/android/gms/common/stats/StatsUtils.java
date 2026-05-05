package com.google.android.gms.common.stats;

import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class StatsUtils {
    public static String getEventKey(PowerManager.WakeLock wakeLock, String str) {
        long jMyPid = Process.myPid();
        long jIdentityHashCode = System.identityHashCode(wakeLock);
        long j2 = jMyPid << 32;
        String strValueOf = String.valueOf((j2 + jIdentityHashCode) - (j2 & jIdentityHashCode));
        if (true == TextUtils.isEmpty(str)) {
            str = "";
        }
        return String.valueOf(strValueOf).concat(String.valueOf(str));
    }
}
