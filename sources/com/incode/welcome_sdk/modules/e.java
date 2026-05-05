package com.incode.welcome_sdk.modules;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.modules.exceptions.ModuleConfigurationException;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends BaseModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f10674a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f10675b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f10676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f10677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f10678e;

    public e() {
        super(Modules.USER_APPROVAL);
    }

    public e(boolean z2, boolean z3, boolean z4) {
        super(Modules.USER_APPROVAL);
        this.f10677d = z2;
        this.f10676c = z3;
        this.f10678e = z4;
    }

    public final boolean d() {
        int i2 = 2 % 2;
        int i3 = f10675b + 121;
        f10674a = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f10677d;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean a() {
        int i2 = 2 % 2;
        int i3 = f10674a + 101;
        int i4 = i3 % 128;
        f10675b = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f10676c;
        int i6 = i4 + 91;
        f10674a = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean c() {
        int i2 = 2 % 2;
        int i3 = f10674a + 99;
        int i4 = i3 % 128;
        f10675b = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f10678e;
        int i6 = i4 + 81;
        f10674a = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    @Override // com.incode.welcome_sdk.modules.BaseModule
    public final void verifyConfiguration(List<Modules> list) throws ModuleConfigurationException {
        int i2 = 2 % 2;
        boolean zContains = list.contains(Modules.QR_SCAN);
        boolean zContains2 = list.contains(Modules.ID);
        boolean z2 = false;
        if (zContains && !(!zContains2)) {
            int i3 = f10674a + 53;
            f10675b = i3 % 128;
            if (i3 % 2 == 0) {
                z2 = true;
            }
        }
        verifyIfAfter(list, Modules.SELFIE);
        if (z2) {
            if (this.f10676c) {
                verifyIfAfter(list, Modules.INE_VALIDATION);
            } else {
                verifyIfAfterEither(list, Modules.FACE_MATCH, Modules.INE_VALIDATION);
            }
        } else if (zContains2) {
            if (!this.f10676c) {
                verifyIfAfter(list, Modules.FACE_MATCH);
            }
        } else if (zContains) {
            verifyIfAfter(list, Modules.INE_VALIDATION);
        } else {
            verifyIfAfterEither(list, Modules.ID, Modules.QR_SCAN);
            int i4 = f10675b + 49;
            f10674a = i4 % 128;
            int i5 = i4 % 2;
        }
        if (this.f10676c) {
            int i6 = f10675b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f10674a = i6 % 128;
            int i7 = i6 % 2;
            verifyNotTogether(list, Modules.FACE_MATCH);
        }
    }
}
