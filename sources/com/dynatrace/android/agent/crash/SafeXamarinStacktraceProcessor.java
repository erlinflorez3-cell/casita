package com.dynatrace.android.agent.crash;

import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.Utility;

/* JADX INFO: loaded from: classes3.dex */
class SafeXamarinStacktraceProcessor implements StacktraceProcessor {
    private static final String TAG = Global.LOG_PREFIX + "SafeXamarinCrashProcessor";
    private final String exception;
    private final int maxLines;
    private final Throwable throwable;

    public SafeXamarinStacktraceProcessor(Throwable th, String str, int i2) {
        this.throwable = th;
        this.exception = str;
        this.maxLines = i2;
    }

    @Override // com.dynatrace.android.agent.crash.StacktraceProcessor
    public StacktraceData process() {
        try {
            return new XamarinStacktraceProcessor(this.exception, this.maxLines).process();
        } catch (Exception e2) {
            if (Global.DEBUG) {
                Utility.zlogD(TAG, "invalid Xamarin crash", e2);
            }
            return new JavaStacktraceProcessor(this.throwable, this.maxLines).process();
        }
    }
}
