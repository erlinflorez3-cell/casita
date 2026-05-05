package com.incode.welcome_sdk.modules;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;

/* JADX INFO: loaded from: classes5.dex */
public final class EKYB extends BaseModule {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f10500b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f10501c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f10502d = PanasonicMakernoteDirectory.TAG_BURST_SPEED % 128;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f10503e = 0;
    private final boolean isShowAddress;
    private final boolean isShowName;
    private final boolean isShowTaxId;

    public final boolean isShowName() {
        int i2 = 2 % 2;
        int i3 = f10500b + 7;
        f10503e = i3 % 128;
        if (i3 % 2 == 0) {
            return this.isShowName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isShowAddress() {
        int i2 = 2 % 2;
        int i3 = f10500b + 75;
        int i4 = i3 % 128;
        f10503e = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z2 = this.isShowAddress;
        int i5 = i4 + 17;
        f10500b = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    public final boolean isShowTaxId() {
        int i2 = 2 % 2;
        int i3 = f10500b + 101;
        int i4 = i3 % 128;
        f10503e = i4;
        int i5 = i3 % 2;
        boolean z2 = this.isShowTaxId;
        int i6 = i4 + 93;
        f10500b = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public EKYB(boolean z2, boolean z3, boolean z4) {
        super(Modules.EKYB);
        this.isShowName = z2;
        this.isShowAddress = z3;
        this.isShowTaxId = z4;
    }

    public static final class Builder {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f10504a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10505b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10506c = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10507e = 0;
        private boolean isShowAddress = true;
        private boolean isShowBusinessName = true;
        private boolean isShowTaxId = true;

        public final Builder setShowAddress(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10507e;
            int i4 = i3 + 9;
            f10506c = i4 % 128;
            if (i4 % 2 == 0) {
                this.isShowAddress = z2;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.isShowAddress = z2;
            int i5 = i3 + 65;
            f10506c = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final Builder setShowBusinessName(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10507e + 9;
            int i4 = i3 % 128;
            f10506c = i4;
            if (i3 % 2 == 0) {
                this.isShowBusinessName = z2;
                throw null;
            }
            this.isShowBusinessName = z2;
            int i5 = i4 + 97;
            f10507e = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 61 / 0;
            }
            return this;
        }

        public final Builder setShowTaxId(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10507e + 33;
            int i4 = i3 % 128;
            f10506c = i4;
            if (i3 % 2 == 0) {
                this.isShowTaxId = z2;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.isShowTaxId = z2;
            int i5 = i4 + 103;
            f10507e = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final EKYB build() {
            int i2 = 2 % 2;
            EKYB ekyb = new EKYB(this.isShowBusinessName, this.isShowAddress, this.isShowTaxId);
            int i3 = f10507e + 123;
            f10506c = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 68 / 0;
            }
            return ekyb;
        }

        static {
            int i2 = 1 + 93;
            f10504a = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    static {
        if (PanasonicMakernoteDirectory.TAG_BURST_SPEED % 2 == 0) {
            int i2 = 20 / 0;
        }
    }
}
