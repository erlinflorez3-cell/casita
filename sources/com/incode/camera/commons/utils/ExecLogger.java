package com.incode.camera.commons.utils;

import android.util.Log;
import com.facebook.react.uimanager.ViewProps;
import java.text.NumberFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\u0003J\u0010\u0010\u0011\u001a\n \n*\u0004\u0018\u00010\u00030\u0003H\u0002J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0003J\b\u0010\u0015\u001a\u00020\u0006H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u0017J\u0006\u0010\u001a\u001a\u00020\u0017J\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0003R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/incode/camera/commons/utils/ExecLogger;", "", "loggableTag", "", "(Ljava/lang/String;)V", "durationSum", "", "firstStartTimestamp", "formatter", "Ljava/text/NumberFormat;", "kotlin.jvm.PlatformType", "logCounter", "logMap", "", "maxDuration", "minDuration", "dump", "getAverageDuration", "isTagLoggable", "", "tag", "lastDuration", "logIfLoggable", "", ViewProps.START, "stop", "stopAndLogIfLoggable", "tagIt", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ExecLogger {
    private static int getFrameAnalyzerWrapper = 0;
    private static int getPreviewView = 1;
    private long CameraConstants;
    private final String IncodeCamera;
    private Map<String, Long> ProcessCameraProviderExtensionsKt;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private long f3632e1;
    private final NumberFormat getAvailableCameraInternals;
    private long getConfig;
    private long getContext;
    private long setConfig;

    public ExecLogger(String str) {
        this.IncodeCamera = str;
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setGroupingUsed(false);
        numberFormat.setMaximumFractionDigits(1);
        this.getAvailableCameraInternals = numberFormat;
        this.ProcessCameraProviderExtensionsKt = new LinkedHashMap();
    }

    public /* synthetic */ ExecLogger(String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str);
    }

    public final void start() {
        int i2 = 2 % 2;
        Object obj = null;
        if (this.f3632e1 == 0) {
            int i3 = getFrameAnalyzerWrapper + 51;
            getPreviewView = i3 % 128;
            if (i3 % 2 != 0) {
                this.f3632e1 = System.currentTimeMillis();
            } else {
                this.f3632e1 = System.currentTimeMillis();
                obj.hashCode();
                throw null;
            }
        }
        this.ProcessCameraProviderExtensionsKt = MapsKt.mutableMapOf(new Pair("ExecLogger-start", Long.valueOf(System.currentTimeMillis())));
        int i4 = getPreviewView + 45;
        getFrameAnalyzerWrapper = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void stop() {
        int i2 = 2 % 2;
        int i3 = getFrameAnalyzerWrapper + 109;
        getPreviewView = i3 % 128;
        int i4 = i3 % 2;
        this.ProcessCameraProviderExtensionsKt.put("ExecLogger-end", Long.valueOf(System.currentTimeMillis()));
        this.CameraConstants++;
        long availableCameraInternals = getAvailableCameraInternals();
        this.getConfig += availableCameraInternals;
        if (availableCameraInternals > this.setConfig) {
            int i5 = getPreviewView + 107;
            getFrameAnalyzerWrapper = i5 % 128;
            if (i5 % 2 == 0) {
                this.setConfig = availableCameraInternals;
            } else {
                this.setConfig = availableCameraInternals;
                throw null;
            }
        }
        if (availableCameraInternals < this.getContext) {
            int i6 = getPreviewView + 71;
            getFrameAnalyzerWrapper = i6 % 128;
            int i7 = i6 % 2;
            this.getContext = availableCameraInternals;
        }
    }

    private final String IncodeCamera() {
        int i2 = 2 % 2;
        int i3 = getFrameAnalyzerWrapper + 27;
        getPreviewView = i3 % 128;
        int i4 = i3 % 2;
        String str = this.getAvailableCameraInternals.format(Float.valueOf(this.getConfig / this.CameraConstants));
        int i5 = getPreviewView + 21;
        getFrameAnalyzerWrapper = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private final long getAvailableCameraInternals() {
        long jLongValue;
        int i2 = 2 % 2;
        int i3 = getPreviewView + 91;
        getFrameAnalyzerWrapper = i3 % 128;
        int i4 = i3 % 2;
        Long l2 = this.ProcessCameraProviderExtensionsKt.get("ExecLogger-end");
        long jLongValue2 = 0;
        if (l2 != null) {
            int i5 = getPreviewView + 1;
            getFrameAnalyzerWrapper = i5 % 128;
            int i6 = i5 % 2;
            jLongValue = l2.longValue();
        } else {
            jLongValue = 0;
        }
        Long l3 = this.ProcessCameraProviderExtensionsKt.get("ExecLogger-start");
        if (l3 != null) {
            int i7 = getPreviewView + 9;
            getFrameAnalyzerWrapper = i7 % 128;
            if (i7 % 2 != 0) {
                jLongValue2 = l3.longValue();
                int i8 = 15 / 0;
            } else {
                jLongValue2 = l3.longValue();
            }
        }
        return jLongValue - jLongValue2;
    }

    public final String dump() {
        long jLongValue;
        int i2 = 2 % 2;
        int i3 = getFrameAnalyzerWrapper + 55;
        getPreviewView = i3 % 128;
        int i4 = i3 % 2;
        if (!this.ProcessCameraProviderExtensionsKt.isEmpty() && this.ProcessCameraProviderExtensionsKt.get("ExecLogger-start") != null) {
            int i5 = getPreviewView + 59;
            getFrameAnalyzerWrapper = i5 % 128;
            if (i5 % 2 != 0) {
                this.ProcessCameraProviderExtensionsKt.get("ExecLogger-end");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this.ProcessCameraProviderExtensionsKt.get("ExecLogger-end") != null) {
                Long l2 = this.ProcessCameraProviderExtensionsKt.get("ExecLogger-start");
                Intrinsics.checkNotNull(l2);
                long jLongValue2 = l2.longValue();
                Long l3 = this.ProcessCameraProviderExtensionsKt.get("ExecLogger-end");
                Intrinsics.checkNotNull(l3);
                long jLongValue3 = l3.longValue();
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(StringExtensionKt.trimNewline("\n            Execution took [" + (jLongValue3 - jLongValue2) + "] (ms) \n            avg[" + IncodeCamera() + "] \n            max[" + this.setConfig + "] \n            count[" + this.CameraConstants + "] \n            sinceStart[" + ((jLongValue3 - this.f3632e1) / 1000) + "] (s)"));
                Pair pair = null;
                for (Map.Entry<String, Long> entry : this.ProcessCameraProviderExtensionsKt.entrySet()) {
                    String key = entry.getKey();
                    long jLongValue4 = entry.getValue().longValue();
                    if (!Intrinsics.areEqual(key, "ExecLogger-start")) {
                        int i6 = getFrameAnalyzerWrapper + 53;
                        getPreviewView = i6 % 128;
                        int i7 = i6 % 2;
                        if (Intrinsics.areEqual(key, "ExecLogger-end")) {
                            continue;
                        } else {
                            int i8 = getPreviewView;
                            int i9 = i8 + 73;
                            getFrameAnalyzerWrapper = i9 % 128;
                            int i10 = i9 % 2;
                            if (pair != null) {
                                int i11 = i8 + 11;
                                getFrameAnalyzerWrapper = i11 % 128;
                                if (i11 % 2 != 0) {
                                    ((Number) pair.getSecond()).longValue();
                                    throw null;
                                }
                                jLongValue = ((Number) pair.getSecond()).longValue();
                            } else {
                                jLongValue = jLongValue2;
                            }
                            stringBuffer.append("\n---- (" + key + ") --> [" + (jLongValue4 - jLongValue) + " ms]");
                            pair = new Pair(key, Long.valueOf(jLongValue4));
                        }
                    }
                }
                String string = stringBuffer.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                return string;
            }
        }
        int i12 = getPreviewView + 5;
        getFrameAnalyzerWrapper = i12 % 128;
        int i13 = i12 % 2;
        return "";
    }

    public final void logIfLoggable() {
        int i2 = 2 % 2;
        String str = this.IncodeCamera;
        Object obj = null;
        if (str != null) {
            int i3 = getPreviewView + 117;
            getFrameAnalyzerWrapper = i3 % 128;
            int i4 = i3 % 2;
            if (Log.isLoggable(str, 2)) {
                int i5 = getFrameAnalyzerWrapper + 61;
                getPreviewView = i5 % 128;
                if (i5 % 2 == 0) {
                    Log.d(this.IncodeCamera, dump());
                    obj.hashCode();
                    throw null;
                }
                Log.d(this.IncodeCamera, dump());
            }
        }
        int i6 = getFrameAnalyzerWrapper + 79;
        getPreviewView = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public final void stopAndLogIfLoggable() {
        int i2 = 2 % 2;
        int i3 = getFrameAnalyzerWrapper + 105;
        getPreviewView = i3 % 128;
        int i4 = i3 % 2;
        stop();
        logIfLoggable();
        int i5 = getFrameAnalyzerWrapper + 13;
        getPreviewView = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void tagIt(String tag) {
        int i2 = 2 % 2;
        int i3 = getPreviewView + 39;
        getFrameAnalyzerWrapper = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(tag, "");
        this.ProcessCameraProviderExtensionsKt.put(tag, Long.valueOf(System.currentTimeMillis()));
        int i5 = getFrameAnalyzerWrapper + 23;
        getPreviewView = i5 % 128;
        int i6 = i5 % 2;
    }

    public final boolean isTagLoggable(String tag) {
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = getFrameAnalyzerWrapper + 27;
        getPreviewView = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(tag, "");
            i2 = 3;
        } else {
            Intrinsics.checkNotNullParameter(tag, "");
        }
        return Log.isLoggable(tag, i2);
    }

    public ExecLogger() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
