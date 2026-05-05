package com.incode.welcome_sdk.modules;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class AES extends BaseModule {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f10431a = 15 % 128;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f10432c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f10433d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f10434e = 0;
    private final boolean downloadDocument;
    private final boolean uploadDocument;

    public /* synthetic */ AES(boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z2, (i2 & 2) != 0 ? false : z3);
    }

    public final boolean getUploadDocument() {
        int i2 = 2 % 2;
        int i3 = f10432c + 9;
        int i4 = i3 % 128;
        f10434e = i4;
        int i5 = i3 % 2;
        boolean z2 = this.uploadDocument;
        int i6 = i4 + 73;
        f10432c = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean getDownloadDocument() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f10432c + 65;
        int i4 = i3 % 128;
        f10434e = i4;
        if (i3 % 2 != 0) {
            z2 = this.downloadDocument;
            int i5 = 9 / 0;
        } else {
            z2 = this.downloadDocument;
        }
        int i6 = i4 + 5;
        f10432c = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public AES(boolean z2, boolean z3) {
        super(Modules.AE_SIGNATURE);
        this.uploadDocument = z2;
        this.downloadDocument = z3;
    }

    public static final class Builder {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10435b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10436c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10437d = 69 % 128;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10438e = 1;
        private boolean downloadDocument;
        private boolean uploadDocument;

        public final Builder setUploadDocument(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10436c + 59;
            int i4 = i3 % 128;
            f10438e = i4;
            if (i3 % 2 == 0) {
                this.uploadDocument = z2;
                int i5 = 78 / 0;
            } else {
                this.uploadDocument = z2;
            }
            int i6 = i4 + 7;
            f10436c = i6 % 128;
            if (i6 % 2 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setDownloadDocument(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10438e + 15;
            f10436c = i3 % 128;
            if (i3 % 2 == 0) {
                this.downloadDocument = z2;
                return this;
            }
            this.downloadDocument = z2;
            throw null;
        }

        public final AES build() {
            int i2 = 2 % 2;
            AES aes = new AES(this.uploadDocument, this.downloadDocument);
            int i3 = f10438e + 11;
            f10436c = i3 % 128;
            int i4 = i3 % 2;
            return aes;
        }

        static {
            int i2 = 69 % 2;
        }
    }

    static {
        if (15 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AES() {
        boolean z2 = false;
        this(z2, z2, 3, null);
    }
}
