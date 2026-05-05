package com.incode.welcome_sdk.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ConsentData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ConsentData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f7450a = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f7451c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f7452d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f7453e = 1;
    private String checkboxId;
    private String consentText;
    private boolean optional;

    public ConsentData(String str, String str2, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.checkboxId = str;
        this.consentText = str2;
        this.optional = z2;
    }

    public /* synthetic */ ConsentData(String str, String str2, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? false : z2);
    }

    public final String getCheckboxId() {
        int i2 = 2 % 2;
        int i3 = f7451c + 121;
        int i4 = i3 % 128;
        f7450a = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.checkboxId;
        int i5 = i4 + 37;
        f7451c = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 40 / 0;
        }
        return str;
    }

    public final void setCheckboxId(String str) {
        int i2 = 2 % 2;
        int i3 = f7451c + 75;
        f7450a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.checkboxId = str;
        int i5 = f7450a + 63;
        f7451c = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final String getConsentText() {
        int i2 = 2 % 2;
        int i3 = f7450a;
        int i4 = i3 + 65;
        f7451c = i4 % 128;
        int i5 = i4 % 2;
        String str = this.consentText;
        int i6 = i3 + 81;
        f7451c = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final void setConsentText(String str) {
        int i2 = 2 % 2;
        int i3 = f7450a + 25;
        f7451c = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.consentText = str;
        int i5 = f7450a + 59;
        f7451c = i5 % 128;
        int i6 = i5 % 2;
    }

    public final boolean getOptional() {
        int i2 = 2 % 2;
        int i3 = f7450a;
        int i4 = i3 + 101;
        f7451c = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.optional;
        int i6 = i3 + 43;
        f7451c = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final void setOptional(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f7450a + 25;
        int i4 = i3 % 128;
        f7451c = i4;
        int i5 = i3 % 2;
        this.optional = z2;
        int i6 = i4 + 17;
        f7450a = i6 % 128;
        int i7 = i6 % 2;
    }

    static {
        int i2 = f7453e + 111;
        f7452d = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 21 / 0;
        }
    }

    public ConsentData() {
        this(null, null, false, 7, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.checkboxId);
        parcel.writeString(this.consentText);
        if (this.optional) {
            int i5 = f7451c;
            int i6 = i5 + 21;
            f7450a = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 67;
            f7450a = i8 % 128;
            int i9 = i8 % 2;
            i3 = 1;
        } else {
            i3 = 0;
        }
        parcel.writeInt(i3);
        int i10 = f7450a + 21;
        f7451c = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i2 = 2 % 2;
        int i3 = f7451c;
        int i4 = i3 + 121;
        f7450a = i4 % 128;
        int i5 = i4 % 2 == 0 ? 1 : 0;
        int i6 = i3 + 115;
        f7450a = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f7451c + 125;
        int i4 = i3 % 128;
        f7450a = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 63;
            f7451c = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof ConsentData)) {
            return false;
        }
        ConsentData consentData = (ConsentData) obj;
        if (!Intrinsics.areEqual(this.checkboxId, consentData.checkboxId) || !Intrinsics.areEqual(this.consentText, consentData.consentText)) {
            return false;
        }
        if (this.optional == consentData.optional) {
            return true;
        }
        int i8 = f7450a + 41;
        f7451c = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f7450a + 35;
        f7451c = i3 % 128;
        int iHashCode = i3 % 2 != 0 ? (((this.checkboxId.hashCode() >>> 81) % this.consentText.hashCode()) << PanasonicMakernoteDirectory.TAG_BURST_SPEED) / Boolean.hashCode(this.optional) : (((this.checkboxId.hashCode() * 31) + this.consentText.hashCode()) * 31) + Boolean.hashCode(this.optional);
        int i4 = f7450a + 33;
        f7451c = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public static final class a implements Parcelable.Creator<ConsentData> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f7454a = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f7455d = 0;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ConsentData createFromParcel(Parcel parcel) {
            int i2 = 2 % 2;
            int i3 = f7454a + 31;
            f7455d = i3 % 128;
            int i4 = i3 % 2;
            ConsentData consentDataE = e(parcel);
            int i5 = f7455d + 89;
            f7454a = i5 % 128;
            int i6 = i5 % 2;
            return consentDataE;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ConsentData[] newArray(int i2) {
            int i3 = 2 % 2;
            int i4 = f7455d + 39;
            f7454a = i4 % 128;
            int i5 = i4 % 2;
            ConsentData[] consentDataArrB = b(i2);
            int i6 = f7455d + 23;
            f7454a = i6 % 128;
            int i7 = i6 % 2;
            return consentDataArrB;
        }

        private static ConsentData e(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ConsentData(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        private static ConsentData[] b(int i2) {
            int i3 = 2 % 2;
            int i4 = f7454a;
            int i5 = i4 + 1;
            f7455d = i5 % 128;
            int i6 = i5 % 2;
            ConsentData[] consentDataArr = new ConsentData[i2];
            int i7 = i4 + 5;
            f7455d = i7 % 128;
            if (i7 % 2 == 0) {
                return consentDataArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f7451c + 23;
        f7450a = i3 % 128;
        int i4 = i3 % 2;
        String str = "ConsentData(checkboxId=" + this.checkboxId + ", consentText=" + this.consentText + ", optional=" + this.optional + ")";
        int i5 = f7450a + 79;
        f7451c = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static /* synthetic */ ConsentData copy$default(ConsentData consentData, String str, String str2, boolean z2, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            str = consentData.checkboxId;
        }
        if ((i2 & 2) != 0) {
            int i4 = f7450a + 51;
            f7451c = i4 % 128;
            if (i4 % 2 != 0) {
                str2 = consentData.consentText;
                int i5 = 42 / 0;
            } else {
                str2 = consentData.consentText;
            }
        }
        if ((i2 & 4) != 0) {
            z2 = consentData.optional;
        }
        ConsentData consentDataCopy = consentData.copy(str, str2, z2);
        int i6 = f7450a + 111;
        f7451c = i6 % 128;
        int i7 = i6 % 2;
        return consentDataCopy;
    }

    public final ConsentData copy(String str, String str2, boolean z2) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        ConsentData consentData = new ConsentData(str, str2, z2);
        int i3 = f7451c + 25;
        f7450a = i3 % 128;
        int i4 = i3 % 2;
        return consentData;
    }

    public final boolean component3() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f7451c;
        int i4 = i3 + 89;
        f7450a = i4 % 128;
        if (i4 % 2 == 0) {
            z2 = this.optional;
            int i5 = 29 / 0;
        } else {
            z2 = this.optional;
        }
        int i6 = i3 + 83;
        f7450a = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final String component2() {
        String str;
        int i2 = 2 % 2;
        int i3 = f7451c;
        int i4 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f7450a = i4 % 128;
        if (i4 % 2 == 0) {
            str = this.consentText;
            int i5 = 25 / 0;
        } else {
            str = this.consentText;
        }
        int i6 = i3 + 77;
        f7450a = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String component1() {
        int i2 = 2 % 2;
        int i3 = f7450a + 77;
        f7451c = i3 % 128;
        int i4 = i3 % 2;
        String str = this.checkboxId;
        if (i4 != 0) {
            int i5 = 9 / 0;
        }
        return str;
    }
}
