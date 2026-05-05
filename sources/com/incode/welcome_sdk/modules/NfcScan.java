package com.incode.welcome_sdk.modules;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.modules.IdScan;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class NfcScan extends BaseModule {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f10614a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f10615b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f10616c = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f10617e = 0;
    private final IdScan.IdType idType;
    private final int nfcMaxRetries;
    private final boolean processNfcData;
    private final boolean returnResultImmediately;
    private boolean showInitialDataConfirmationScreen;
    private final boolean showNfcSymbolConfirmationScreen;
    private final boolean showTutorials;

    public final boolean getShowNfcSymbolConfirmationScreen() {
        int i2 = 2 % 2;
        int i3 = f10616c;
        int i4 = i3 + 57;
        f10615b = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.showNfcSymbolConfirmationScreen;
        int i6 = i3 + 15;
        f10615b = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    public final boolean getShowInitialDataConfirmationScreen() {
        int i2 = 2 % 2;
        int i3 = f10616c;
        int i4 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f10615b = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.showInitialDataConfirmationScreen;
        int i6 = i3 + 1;
        f10615b = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    public final void setShowInitialDataConfirmationScreen(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f10615b + 87;
        int i4 = i3 % 128;
        f10616c = i4;
        int i5 = i3 % 2;
        this.showInitialDataConfirmationScreen = z2;
        int i6 = i4 + 23;
        f10615b = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public final boolean getShowTutorials() {
        int i2 = 2 % 2;
        int i3 = f10616c;
        int i4 = i3 + 101;
        f10615b = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.showTutorials;
        int i6 = i3 + 27;
        f10615b = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 24 / 0;
        }
        return z2;
    }

    public final boolean getProcessNfcData() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f10616c;
        int i4 = i3 + 5;
        f10615b = i4 % 128;
        if (i4 % 2 != 0) {
            z2 = this.processNfcData;
            int i5 = 67 / 0;
        } else {
            z2 = this.processNfcData;
        }
        int i6 = i3 + 117;
        f10615b = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final int getNfcMaxRetries() {
        int i2 = 2 % 2;
        int i3 = f10616c + 9;
        int i4 = i3 % 128;
        f10615b = i4;
        int i5 = i3 % 2;
        int i6 = this.nfcMaxRetries;
        int i7 = i4 + 11;
        f10616c = i7 % 128;
        if (i7 % 2 != 0) {
            return i6;
        }
        throw null;
    }

    public final IdScan.IdType getIdType() {
        int i2 = 2 % 2;
        int i3 = f10615b + 57;
        f10616c = i3 % 128;
        if (i3 % 2 != 0) {
            return this.idType;
        }
        throw null;
    }

    public final boolean getReturnResultImmediately() {
        int i2 = 2 % 2;
        int i3 = f10616c;
        int i4 = i3 + 87;
        f10615b = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z2 = this.returnResultImmediately;
        int i5 = i3 + 25;
        f10615b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 54 / 0;
        }
        return z2;
    }

    private NfcScan(boolean z2, boolean z3, boolean z4, boolean z5, int i2, IdScan.IdType idType, boolean z6) {
        super(Modules.NFC_SCAN);
        this.showNfcSymbolConfirmationScreen = z2;
        this.showInitialDataConfirmationScreen = z3;
        this.showTutorials = z4;
        this.processNfcData = z5;
        this.nfcMaxRetries = i2;
        this.idType = idType;
        this.returnResultImmediately = z6;
    }

    public static final class Builder {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10618b = 101 % 128;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10619c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10620d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10621e = 0;
        private IdScan.IdType idType;
        private boolean returnResultImmediately;
        private boolean showNfcSymbolConfirmationScreen = true;
        private boolean showInitialDataConfirmationScreen = true;
        private boolean showTutorials = true;
        private boolean processNfcData = true;
        private int nfcMaxRetries = 5;

        public final Builder setShowNfcSymbolConfirmationScreen(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10621e;
            int i4 = i3 + 49;
            f10619c = i4 % 128;
            Object obj = null;
            if (i4 % 2 != 0) {
                this.showNfcSymbolConfirmationScreen = z2;
                int i5 = i3 + 57;
                f10619c = i5 % 128;
                if (i5 % 2 != 0) {
                    return this;
                }
                obj.hashCode();
                throw null;
            }
            this.showNfcSymbolConfirmationScreen = z2;
            throw null;
        }

        public final Builder setShowTutorials(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10621e;
            int i4 = i3 + 95;
            f10619c = i4 % 128;
            int i5 = i4 % 2;
            this.showTutorials = z2;
            int i6 = i3 + 71;
            f10619c = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final Builder setProcessNfcData(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10621e + 77;
            int i4 = i3 % 128;
            f10619c = i4;
            int i5 = i3 % 2;
            this.processNfcData = z2;
            int i6 = i4 + 115;
            f10621e = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 16 / 0;
            }
            return this;
        }

        public final Builder setNfcMaxRetries(int i2) {
            int i3 = 2 % 2;
            int i4 = f10619c + 125;
            int i5 = i4 % 128;
            f10621e = i5;
            int i6 = i4 % 2;
            this.nfcMaxRetries = i2;
            int i7 = i5 + 11;
            f10619c = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 18 / 0;
            }
            return this;
        }

        public final Builder setIdType(IdScan.IdType idType) {
            int i2 = 2 % 2;
            int i3 = f10621e + 73;
            f10619c = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(idType, "");
            this.idType = idType;
            int i5 = f10619c + 47;
            f10621e = i5 % 128;
            if (i5 % 2 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setShowInitialDataConfirmationScreen(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10619c + 35;
            int i4 = i3 % 128;
            f10621e = i4;
            int i5 = i3 % 2;
            this.showInitialDataConfirmationScreen = z2;
            int i6 = i4 + 19;
            f10619c = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final Builder setReturnResultImmediately(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10621e;
            int i4 = i3 + 69;
            f10619c = i4 % 128;
            int i5 = i4 % 2;
            this.returnResultImmediately = z2;
            int i6 = i3 + 37;
            f10619c = i6 % 128;
            if (i6 % 2 != 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final NfcScan build() {
            int i2 = 2 % 2;
            NfcScan nfcScan = new NfcScan(this.showNfcSymbolConfirmationScreen, this.showInitialDataConfirmationScreen, this.showTutorials, this.processNfcData, this.nfcMaxRetries, this.idType, this.returnResultImmediately, null);
            int i3 = f10621e + 1;
            f10619c = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 36 / 0;
            }
            return nfcScan;
        }

        static {
            if (101 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i2 = 1 + 95;
        f10617e = i2 % 128;
        int i3 = i2 % 2;
    }

    public /* synthetic */ NfcScan(boolean z2, boolean z3, boolean z4, boolean z5, int i2, IdScan.IdType idType, boolean z6, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, z3, z4, z5, i2, idType, z6);
    }
}
