package com.incode.welcome_sdk.ui.camera.id_validation.base;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class IdOrientation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f11816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ IdOrientation[] f11817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final IdOrientation f11818c = new IdOrientation("HORIZONTAL", 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final IdOrientation f11819d = new IdOrientation("VERTICAL", 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f11820e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f11821f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f11822g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f11823h = 0;

    private IdOrientation(String str, int i2) {
    }

    static {
        IdOrientation[] idOrientationArrD = d();
        f11817b = idOrientationArrD;
        f11816a = EnumEntriesKt.enumEntries(idOrientationArrD);
        int i2 = f11823h + 95;
        f11822g = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final /* synthetic */ IdOrientation[] d() {
        int i2 = 2 % 2;
        int i3 = f11821f + 53;
        int i4 = i3 % 128;
        f11820e = i4;
        int i5 = i3 % 2;
        IdOrientation[] idOrientationArr = {f11818c, f11819d};
        int i6 = i4 + 113;
        f11821f = i6 % 128;
        int i7 = i6 % 2;
        return idOrientationArr;
    }

    public static EnumEntries<IdOrientation> getEntries() {
        int i2 = 2 % 2;
        int i3 = f11820e;
        int i4 = i3 + 5;
        f11821f = i4 % 128;
        int i5 = i4 % 2;
        EnumEntries<IdOrientation> enumEntries = f11816a;
        int i6 = i3 + 49;
        f11821f = i6 % 128;
        if (i6 % 2 != 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static IdOrientation valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f11821f + 87;
        f11820e = i3 % 128;
        int i4 = i3 % 2;
        IdOrientation idOrientation = (IdOrientation) Enum.valueOf(IdOrientation.class, str);
        int i5 = f11820e + 7;
        f11821f = i5 % 128;
        int i6 = i5 % 2;
        return idOrientation;
    }

    public static IdOrientation[] values() {
        IdOrientation[] idOrientationArr;
        int i2 = 2 % 2;
        int i3 = f11820e + 101;
        f11821f = i3 % 128;
        if (i3 % 2 == 0) {
            idOrientationArr = (IdOrientation[]) f11817b.clone();
            int i4 = 8 / 0;
        } else {
            idOrientationArr = (IdOrientation[]) f11817b.clone();
        }
        int i5 = f11821f + 29;
        f11820e = i5 % 128;
        if (i5 % 2 == 0) {
            return idOrientationArr;
        }
        throw null;
    }
}
