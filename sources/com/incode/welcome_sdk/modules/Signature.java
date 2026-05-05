package com.incode.welcome_sdk.modules;

import com.incode.welcome_sdk.modules.exceptions.ModuleConfigurationException;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class Signature extends BaseModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f10650a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f10651c = 1;
    private final int descriptionResId;
    private final int titleResId;

    public static final class Builder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10652c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10653d = 0;
        private int titleResId = 0;
        private int descriptionResId = 0;

        @Deprecated
        public final Builder setTitle(int i2) {
            int i3 = 2 % 2;
            int i4 = f10652c;
            int i5 = i4 + 75;
            f10653d = i5 % 128;
            if (i5 % 2 == 0) {
                this.titleResId = i2;
                int i6 = i4 + 83;
                f10653d = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 96 / 0;
                }
                return this;
            }
            this.titleResId = i2;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Deprecated
        public final Builder setDescription(int i2) {
            int i3 = 2 % 2;
            int i4 = f10653d + 95;
            int i5 = i4 % 128;
            f10652c = i5;
            int i6 = i4 % 2;
            this.descriptionResId = i2;
            int i7 = i5 + 51;
            f10653d = i7 % 128;
            int i8 = i7 % 2;
            return this;
        }

        public final Signature build() {
            int i2 = 2 % 2;
            Signature signature = new Signature(this.titleResId, this.descriptionResId);
            int i3 = f10652c + 89;
            f10653d = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 13 / 0;
            }
            return signature;
        }
    }

    public Signature() {
        super(Modules.SIGNATURE);
        this.titleResId = 0;
        this.descriptionResId = 0;
    }

    @Deprecated
    Signature(int i2, int i3) {
        super(Modules.SIGNATURE);
        this.titleResId = i2;
        this.descriptionResId = i3;
    }

    @Deprecated
    public int getTitleResId() {
        int i2 = 2 % 2;
        int i3 = f10651c + 109;
        f10650a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.titleResId;
        if (i4 != 0) {
            int i6 = 17 / 0;
        }
        return i5;
    }

    @Deprecated
    public int getDescriptionResId() {
        int i2;
        int i3 = 2 % 2;
        int i4 = f10650a;
        int i5 = i4 + 25;
        f10651c = i5 % 128;
        if (i5 % 2 == 0) {
            i2 = this.descriptionResId;
            int i6 = 52 / 0;
        } else {
            i2 = this.descriptionResId;
        }
        int i7 = i4 + 77;
        f10651c = i7 % 128;
        if (i7 % 2 != 0) {
            return i2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.modules.BaseModule
    public void verifyConfiguration(List<Modules> list) throws ModuleConfigurationException {
        int i2 = 2 % 2;
        int i3 = f10651c + 47;
        f10650a = i3 % 128;
        if (i3 % 2 != 0) {
            verifyAddAndProcessDataNotAfterApprove(list);
            int i4 = 51 / 0;
        } else {
            verifyAddAndProcessDataNotAfterApprove(list);
        }
    }
}
