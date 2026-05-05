package com.incode.welcome_sdk.modules;

import android.os.Parcel;
import android.os.Parcelable;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.data.CombinedConsentData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class CombinedConsent extends BaseModule implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<CombinedConsent> CREATOR = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f10441a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f10442b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f10443c = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f10444e = 0;
    private final String combinedConsentsId;
    private final CombinedConsentData offlineConsent;

    public final String getCombinedConsentsId() {
        String str;
        int i2 = 2 % 2;
        int i3 = f10441a + 109;
        int i4 = i3 % 128;
        f10442b = i4;
        if (i3 % 2 != 0) {
            str = this.combinedConsentsId;
            int i5 = 65 / 0;
        } else {
            str = this.combinedConsentsId;
        }
        int i6 = i4 + 95;
        f10441a = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final CombinedConsentData getOfflineConsent() {
        int i2 = 2 % 2;
        int i3 = f10442b + 103;
        f10441a = i3 % 128;
        if (i3 % 2 != 0) {
            return this.offlineConsent;
        }
        throw null;
    }

    public CombinedConsent(String str, CombinedConsentData combinedConsentData) {
        super(Modules.COMBINED_CONSENT);
        this.combinedConsentsId = str;
        this.offlineConsent = combinedConsentData;
    }

    public static final class Builder {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f10445a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10446b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10447c = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10448e = 77 % 128;
        private String combinedConsentsId;
        private CombinedConsentData offlineConsent;

        public final Builder setCombinedConsentsId(String str) {
            int i2 = 2 % 2;
            int i3 = f10445a;
            int i4 = i3 + 95;
            f10447c = i4 % 128;
            int i5 = i4 % 2;
            this.combinedConsentsId = str;
            int i6 = i3 + 25;
            f10447c = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final Builder setOfflineCombinedConsentData(CombinedConsentData combinedConsentData) {
            int i2 = 2 % 2;
            int i3 = f10447c + 65;
            int i4 = i3 % 128;
            f10445a = i4;
            int i5 = i3 % 2;
            this.offlineConsent = combinedConsentData;
            int i6 = i4 + 111;
            f10447c = i6 % 128;
            if (i6 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public final CombinedConsent build() {
            int i2 = 2 % 2;
            CombinedConsent combinedConsent = new CombinedConsent(this.combinedConsentsId, this.offlineConsent);
            int i3 = f10447c + 29;
            f10445a = i3 % 128;
            int i4 = i3 % 2;
            return combinedConsent;
        }

        static {
            if (77 % 2 == 0) {
                int i2 = 54 / 0;
            }
        }
    }

    public static final class d implements Parcelable.Creator<CombinedConsent> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10449b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10450e = 1;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CombinedConsent createFromParcel(Parcel parcel) {
            int i2 = 2 % 2;
            int i3 = f10449b + 61;
            f10450e = i3 % 128;
            int i4 = i3 % 2;
            CombinedConsent combinedConsentC = c(parcel);
            if (i4 == 0) {
                int i5 = 44 / 0;
            }
            int i6 = f10450e + 97;
            f10449b = i6 % 128;
            int i7 = i6 % 2;
            return combinedConsentC;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CombinedConsent[] newArray(int i2) {
            int i3 = 2 % 2;
            int i4 = f10449b + 17;
            f10450e = i4 % 128;
            if (i4 % 2 != 0) {
                return b(i2);
            }
            b(i2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static CombinedConsent c(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CombinedConsent(parcel.readString(), parcel.readInt() == 0 ? null : CombinedConsentData.CREATOR.createFromParcel(parcel));
        }

        private static CombinedConsent[] b(int i2) {
            int i3 = 2 % 2;
            int i4 = f10450e + 121;
            int i5 = i4 % 128;
            f10449b = i5;
            int i6 = i4 % 2;
            CombinedConsent[] combinedConsentArr = new CombinedConsent[i2];
            int i7 = i5 + 7;
            f10450e = i7 % 128;
            int i8 = i7 % 2;
            return combinedConsentArr;
        }
    }

    static {
        int i2 = f10443c + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f10444e = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 56 / 0;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int i3 = 2 % 2;
        int i4 = f10441a + 13;
        f10442b = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.combinedConsentsId);
        CombinedConsentData combinedConsentData = this.offlineConsent;
        if (combinedConsentData != null) {
            parcel.writeInt(1);
            combinedConsentData.writeToParcel(parcel, i2);
        } else {
            int i6 = f10441a + 9;
            f10442b = i6 % 128;
            int i7 = i6 % 2;
            parcel.writeInt(0);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i2 = 2 % 2;
        int i3 = f10441a;
        int i4 = i3 + 73;
        f10442b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 67;
        f10442b = i6 % 128;
        if (i6 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
