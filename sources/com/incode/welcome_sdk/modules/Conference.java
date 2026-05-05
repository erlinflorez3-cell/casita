package com.incode.welcome_sdk.modules;

import com.incode.welcome_sdk.modules.exceptions.ModuleConfigurationException;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class Conference extends BaseModule {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f10451b = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f10452e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f10453a;

    public static final class Builder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10454b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10455e = 1;
        private boolean disableMicOnCallStart = false;

        public final Builder setDisableMicOnCallStart(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10454b + 33;
            f10455e = i3 % 128;
            if (i3 % 2 != 0) {
                this.disableMicOnCallStart = z2;
                return this;
            }
            this.disableMicOnCallStart = z2;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Conference build() {
            int i2 = 2 % 2;
            Conference conference = new Conference(this.disableMicOnCallStart);
            int i3 = f10455e + 89;
            f10454b = i3 % 128;
            if (i3 % 2 == 0) {
                return conference;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    Conference(boolean z2) {
        super(Modules.CONFERENCE);
        this.f10453a = z2;
    }

    public final boolean b() {
        int i2 = 2 % 2;
        int i3 = f10451b;
        int i4 = i3 + 23;
        f10452e = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f10453a;
        int i6 = i3 + 61;
        f10452e = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    @Override // com.incode.welcome_sdk.modules.BaseModule
    public void verifyConfiguration(List<Modules> list) throws ModuleConfigurationException {
        boolean z2;
        int i2 = 2 % 2;
        boolean zContains = list.contains(Modules.QR_SCAN);
        boolean zContains2 = list.contains(Modules.ID);
        if (zContains && zContains2) {
            int i3 = f10451b;
            int i4 = i3 + 115;
            f10452e = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 121;
            f10452e = i6 % 128;
            int i7 = i6 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        verifyIfAfter(list, Modules.SELFIE);
        if (z2) {
            int i8 = f10451b + 13;
            f10452e = i8 % 128;
            int i9 = i8 % 2;
            verifyIfAfterEither(list, Modules.FACE_MATCH, Modules.INE_VALIDATION);
            int i10 = f10451b + 73;
            f10452e = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            return;
        }
        if (zContains2) {
            verifyIfAfter(list, Modules.FACE_MATCH);
            return;
        }
        if (!zContains) {
            verifyIfAfterEither(list, Modules.ID, Modules.QR_SCAN);
            return;
        }
        int i11 = f10452e + 85;
        f10451b = i11 % 128;
        if (i11 % 2 != 0) {
            verifyIfAfter(list, Modules.INE_VALIDATION);
        } else {
            verifyIfAfter(list, Modules.INE_VALIDATION);
            int i12 = 56 / 0;
        }
    }
}
