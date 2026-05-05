package com.incode.camera.commons.utils;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/incode/camera/commons/utils/Side;", "", "(Ljava/lang/String;I)V", "FRONT", "BACK", "UNKNOWN", "core-light_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Side {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Side[] $VALUES;
    private static int CameraConstants = 0;
    private static int ProcessCameraProviderExtensionsKt = 0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private static int f3638e1 = 1;
    private static int getAvailableCameraInternals = 1;
    public static final Side FRONT = new Side("FRONT", 0);
    public static final Side BACK = new Side("BACK", 1);
    public static final Side UNKNOWN = new Side("UNKNOWN", 2);

    private Side(String str, int i2) {
    }

    static {
        Side[] sideArr$values = $values();
        $VALUES = sideArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(sideArr$values);
        int i2 = ProcessCameraProviderExtensionsKt + 61;
        getAvailableCameraInternals = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final /* synthetic */ Side[] $values() {
        int i2 = 2 % 2;
        int i3 = f3638e1 + 51;
        int i4 = i3 % 128;
        CameraConstants = i4;
        int i5 = i3 % 2;
        Side[] sideArr = {FRONT, BACK, UNKNOWN};
        int i6 = i4 + 39;
        f3638e1 = i6 % 128;
        if (i6 % 2 != 0) {
            return sideArr;
        }
        throw null;
    }

    public static EnumEntries<Side> getEntries() {
        int i2 = 2 % 2;
        int i3 = CameraConstants + 75;
        f3638e1 = i3 % 128;
        if (i3 % 2 != 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static Side valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = CameraConstants + 101;
        f3638e1 = i3 % 128;
        int i4 = i3 % 2;
        Side side = (Side) Enum.valueOf(Side.class, str);
        int i5 = CameraConstants + 11;
        f3638e1 = i5 % 128;
        int i6 = i5 % 2;
        return side;
    }

    public static Side[] values() {
        Side[] sideArr;
        int i2 = 2 % 2;
        int i3 = f3638e1 + 109;
        CameraConstants = i3 % 128;
        if (i3 % 2 != 0) {
            sideArr = (Side[]) $VALUES.clone();
            int i4 = 85 / 0;
        } else {
            sideArr = (Side[]) $VALUES.clone();
        }
        int i5 = f3638e1 + 63;
        CameraConstants = i5 % 128;
        if (i5 % 2 == 0) {
            return sideArr;
        }
        throw null;
    }
}
