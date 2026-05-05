package com.incode.welcome_sdk.modules;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class QES extends BaseModule {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f10638b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f10639c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f10640d = 47 % 128;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f10641e = 1;
    private final boolean downloadDocument;

    public /* synthetic */ QES(boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z2);
    }

    public final boolean getDownloadDocument() {
        int i2 = 2 % 2;
        int i3 = f10639c + 61;
        int i4 = i3 % 128;
        f10641e = i4;
        int i5 = i3 % 2;
        boolean z2 = this.downloadDocument;
        int i6 = i4 + 103;
        f10639c = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public QES(boolean z2) {
        super(Modules.QE_SIGNATURE);
        this.downloadDocument = z2;
    }

    public static final class Builder {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f10642a = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10643c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10644d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10645e = 0;
        private boolean downloadDocument;

        public final Builder setDownloadDocument(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10645e;
            int i4 = i3 + 95;
            f10643c = i4 % 128;
            if (i4 % 2 == 0) {
                this.downloadDocument = z2;
                int i5 = 40 / 0;
            } else {
                this.downloadDocument = z2;
            }
            int i6 = i3 + 57;
            f10643c = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 73 / 0;
            }
            return this;
        }

        public final QES build() {
            int i2 = 2 % 2;
            QES qes = new QES(this.downloadDocument);
            int i3 = f10643c + 45;
            f10645e = i3 % 128;
            int i4 = i3 % 2;
            return qes;
        }

        static {
            int i2 = 1 + 53;
            f10642a = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }
    }

    static {
        int i2 = 47 % 2;
    }

    public QES() {
        this(false, 1, null);
    }
}
