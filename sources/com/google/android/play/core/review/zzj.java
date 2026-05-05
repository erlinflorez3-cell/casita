package com.google.android.play.core.review;

import io.sentry.SentryBaseEvent;
import io.sentry.protocol.SentryStackFrame;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class zzj {
    private static final Map zza;

    static {
        new HashSet(Arrays.asList(SentryStackFrame.JsonKeys.NATIVE, "unity"));
        zza = new HashMap();
        new com.google.android.play.core.review.internal.zzi("PlayCoreVersion");
    }

    public static synchronized Map zza() {
        Map map;
        map = zza;
        map.put(SentryBaseEvent.DEFAULT_PLATFORM, 20002);
        return map;
    }
}
