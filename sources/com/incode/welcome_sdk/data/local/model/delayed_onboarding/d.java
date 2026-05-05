package com.incode.welcome_sdk.data.local.model.delayed_onboarding;

import com.drew.metadata.exif.ExifDirectoryBase;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.ui.id_capture.viewmodel.IdCaptureViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f8774f = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f8775j = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f8776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f8778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f8779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f8780e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f8781i;

    public static /* synthetic */ Object a(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
        int i8 = ~i3;
        int i9 = ~i4;
        int i10 = ~(i8 | i9);
        int i11 = ~(i8 | i2);
        int i12 = ~i2;
        int i13 = i12 | i3;
        int i14 = ~(i4 | i13);
        int i15 = i10 | i11 | i14;
        int i16 = i14 | (~(i8 | i12 | i9));
        int i17 = (~i13) | i11;
        int i18 = i3 + i2 + i7 + ((-573665793) * i5) + ((-1595597844) * i6);
        int i19 = i18 * i18;
        int i20 = ((-1787860089) * i3) + 959184896 + (1033409659 * i2) + ((-1473697548) * i15) + (1473697548 * i16) + ((-1410634874) * i17) + ((-377225216) * i7) + (1316749312 * i5) + (833617920 * i6) + (497221632 * i19);
        int i21 = ((i3 * 2143800573) - 1595758) + (i2 * 2143800249) + (i15 * (-324)) + (i16 * ExifDirectoryBase.TAG_TILE_OFFSETS) + (i17 * 162) + (i7 * 2143800411) + (i5 * 1405922725) + (i6 * (-1943733020)) + (i19 * 1827733504);
        return i20 + ((i21 * i21) * (-911933440)) != 1 ? d(objArr) : c(objArr);
    }

    public d(long j2, long j3, long j4, boolean z2, boolean z3, String str) {
        this.f8778c = j2;
        this.f8776a = j3;
        this.f8780e = j4;
        this.f8779d = z2;
        this.f8777b = z3;
        this.f8781i = str;
    }

    public final long b() {
        int i2 = 2 % 2;
        int i3 = f8774f + 61;
        f8775j = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f8778c;
        }
        throw null;
    }

    public final long a() {
        int i2 = 2 % 2;
        int i3 = f8774f + 69;
        f8775j = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f8776a;
        }
        throw null;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        d dVar = (d) objArr[0];
        int i2 = 2 % 2;
        int i3 = f8775j + 101;
        f8774f = i3 % 128;
        if (i3 % 2 == 0) {
            return Long.valueOf(dVar.f8780e);
        }
        long j2 = dVar.f8780e;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean c() {
        int i2 = 2 % 2;
        int i3 = f8775j;
        int i4 = i3 + 105;
        f8774f = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        boolean z2 = this.f8779d;
        int i5 = i3 + 103;
        f8774f = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    public final void d() {
        int i2 = 2 % 2;
        int i3 = f8775j + 9;
        int i4 = i3 % 128;
        f8774f = i4;
        int i5 = i3 % 2;
        this.f8779d = true;
        int i6 = i4 + 71;
        f8775j = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void g() {
        int i2 = 2 % 2;
        int i3 = f8775j;
        int i4 = i3 + 21;
        f8774f = i4 % 128;
        if (i4 % 2 != 0) {
            this.f8777b = false;
        } else {
            this.f8777b = true;
        }
        int i5 = i3 + 29;
        f8774f = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 47 / 0;
        }
    }

    public final boolean j() {
        int i2 = 2 % 2;
        int i3 = f8775j + 75;
        f8774f = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f8777b;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        d dVar = (d) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        int i3 = f8775j + 81;
        f8774f = i3 % 128;
        int i4 = i3 % 2;
        dVar.f8781i = str;
        if (i4 == 0) {
            return null;
        }
        int i5 = 89 / 0;
        return null;
    }

    public final String f() {
        int i2 = 2 % 2;
        int i3 = f8774f + 67;
        f8775j = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f8781i;
        if (i4 == 0) {
            int i5 = 91 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            int i3 = f8775j + 93;
            f8774f = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        d dVar = (d) obj;
        if (this.f8778c != dVar.f8778c) {
            int i5 = f8775j + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f8774f = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (this.f8776a != dVar.f8776a) {
            int i7 = f8775j + 23;
            f8774f = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (this.f8780e != dVar.f8780e || this.f8779d != dVar.f8779d) {
            return false;
        }
        if (this.f8777b != dVar.f8777b) {
            int i9 = f8775j + 19;
            f8774f = i9 % 128;
            return i9 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.f8781i, dVar.f8781i)) {
            return true;
        }
        int i10 = f8775j + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f8774f = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int i2 = 2 % 2;
        int i3 = f8774f + 113;
        f8775j = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode2 = ((((((((Long.hashCode(this.f8778c) * 31) + Long.hashCode(this.f8776a)) * 31) + Long.hashCode(this.f8780e)) * 31) + Boolean.hashCode(this.f8779d)) * 31) + Boolean.hashCode(this.f8777b)) * 31;
        String str = this.f8781i;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i5 = f8774f + 47;
            f8775j = i5 % 128;
            int i6 = i5 % 2;
        }
        return iHashCode2 + iHashCode;
    }

    public final String toString() {
        String str;
        int i2 = 2 % 2;
        int i3 = f8774f + 11;
        f8775j = i3 % 128;
        if (i3 % 2 == 0) {
            str = "DelayedOnboardingEntity(id=" + this.f8778c + ", sessionConfigId=" + this.f8776a + ", flowConfigId=" + this.f8780e + ", isCompleted=" + this.f8779d + ", isSynced=" + this.f8777b + ", resultCode=" + this.f8781i + ")";
            int i4 = 11 / 0;
        } else {
            str = "DelayedOnboardingEntity(id=" + this.f8778c + ", sessionConfigId=" + this.f8776a + ", flowConfigId=" + this.f8780e + ", isCompleted=" + this.f8779d + ", isSynced=" + this.f8777b + ", resultCode=" + this.f8781i + ")";
        }
        int i5 = f8774f + 11;
        f8775j = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final void d(String str) {
        a(-2141955887, 2141955887, IdCaptureViewModel.ai.d(), new Object[]{this, str}, IdCaptureViewModel.ai.d(), IdCaptureViewModel.ai.d(), IdCaptureViewModel.ai.d());
    }

    public final long e() {
        return ((Long) a(-977628280, 977628281, IdCaptureViewModel.ai.d(), new Object[]{this}, IdCaptureViewModel.ai.d(), IdCaptureViewModel.ai.d(), IdCaptureViewModel.ai.d())).longValue();
    }
}
