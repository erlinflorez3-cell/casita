package com.incode.welcome_sdk;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class CameraFacing {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CameraFacing[] $VALUES;
    private final int cameraFacing;
    public static final CameraFacing FRONT = new CameraFacing("FRONT", 0, 1);
    public static final CameraFacing BACK = new CameraFacing("BACK", 1, 0);

    private static final /* synthetic */ CameraFacing[] $values() {
        return new CameraFacing[]{FRONT, BACK};
    }

    public static EnumEntries<CameraFacing> getEntries() {
        return $ENTRIES;
    }

    public static CameraFacing valueOf(String str) {
        return (CameraFacing) Enum.valueOf(CameraFacing.class, str);
    }

    public static CameraFacing[] values() {
        return (CameraFacing[]) $VALUES.clone();
    }

    private CameraFacing(String str, int i2, int i3) {
        this.cameraFacing = i3;
    }

    public final int getCameraFacing() {
        return this.cameraFacing;
    }

    static {
        CameraFacing[] cameraFacingArr$values = $values();
        $VALUES = cameraFacingArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(cameraFacingArr$values);
    }
}
