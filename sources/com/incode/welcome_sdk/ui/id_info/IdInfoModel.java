package com.incode.welcome_sdk.ui.id_info;

import android.os.Parcel;
import android.os.Parcelable;
import com.incode.welcome_sdk.IncodeWelcome;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class IdInfoModel implements Parcelable {
    public static final Parcelable.Creator<IdInfoModel> CREATOR = new Creator();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Companion f16336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f16337f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f16338g = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f16339j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f16340k = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f16343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f16344d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f16345h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f16346i;

    public IdInfoModel(String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.f16341a = str;
        this.f16343c = str2;
        this.f16344d = str3;
        this.f16342b = str4;
        this.f16346i = str5;
        this.f16345h = str6;
    }

    public final String getFullName() {
        int i2 = 2 % 2;
        int i3 = f16337f + 37;
        f16339j = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f16341a;
        if (i4 != 0) {
            int i5 = 81 / 0;
        }
        return str;
    }

    public final String getDateOfBirth() {
        int i2 = 2 % 2;
        int i3 = f16337f;
        int i4 = i3 + 45;
        f16339j = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f16343c;
        int i6 = i3 + 13;
        f16339j = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String getSex() {
        int i2 = 2 % 2;
        int i3 = f16337f;
        int i4 = i3 + 53;
        f16339j = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f16344d;
        int i6 = i3 + 111;
        f16339j = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getAddress() {
        int i2 = 2 % 2;
        int i3 = f16337f + 39;
        f16339j = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f16342b;
        if (i4 != 0) {
            int i5 = 66 / 0;
        }
        return str;
    }

    public final String getDocumentNumber() {
        int i2 = 2 % 2;
        int i3 = f16337f;
        int i4 = i3 + 21;
        f16339j = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f16346i;
        int i6 = i3 + 17;
        f16339j = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String getExpiryDate() {
        int i2 = 2 % 2;
        int i3 = f16339j + 27;
        f16337f = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f16345h;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final IdInfoModel fromOcrData(IncodeWelcome.OCRData oCRData) {
            String fullName;
            String birthDate;
            String gender;
            String address;
            String cic;
            Map<String, Object> extendedOcrJsonData;
            Object obj;
            Map<String, Object> extendedOcrJsonData2;
            Object obj2 = "";
            if (oCRData == null || (fullName = oCRData.getFullName()) == null) {
                fullName = "";
            }
            if (oCRData == null || (birthDate = oCRData.getBirthDate()) == null) {
                birthDate = "";
            }
            if (oCRData == null || (gender = oCRData.getGender()) == null) {
                gender = "";
            }
            if (oCRData == null || (address = oCRData.getAddress()) == null) {
                address = "";
            }
            if (oCRData == null || (extendedOcrJsonData2 = oCRData.getExtendedOcrJsonData()) == null || (cic = extendedOcrJsonData2.get("documentNumber")) == null) {
                cic = oCRData != null ? oCRData.getCic() : "";
            }
            Intrinsics.checkNotNull(cic, "");
            String str = (String) cic;
            if (oCRData != null && (extendedOcrJsonData = oCRData.getExtendedOcrJsonData()) != null && (obj = extendedOcrJsonData.get("expireAt")) != null) {
                obj2 = obj;
            }
            return new IdInfoModel(fullName, birthDate, gender, address, str, (String) obj2);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        f16336e = new Companion(defaultConstructorMarker);
        int i2 = f16340k + 11;
        f16338g = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    @JvmStatic
    public static final IdInfoModel fromOcrData(IncodeWelcome.OCRData oCRData) {
        int i2 = 2 % 2;
        int i3 = f16339j + 125;
        f16337f = i3 % 128;
        int i4 = i3 % 2;
        IdInfoModel idInfoModelFromOcrData = f16336e.fromOcrData(oCRData);
        int i5 = f16337f + 87;
        f16339j = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 90 / 0;
        }
        return idInfoModelFromOcrData;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int i3 = 2 % 2;
        int i4 = f16339j + 19;
        f16337f = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.f16341a);
        parcel.writeString(this.f16343c);
        parcel.writeString(this.f16344d);
        parcel.writeString(this.f16342b);
        parcel.writeString(this.f16346i);
        parcel.writeString(this.f16345h);
        int i6 = f16339j + 21;
        f16337f = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i2 = 2 % 2;
        int i3 = f16339j;
        int i4 = i3 + 27;
        f16337f = i4 % 128;
        int i5 = i4 % 2 == 0 ? 1 : 0;
        int i6 = i3 + 109;
        f16337f = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdInfoModel)) {
            return false;
        }
        IdInfoModel idInfoModel = (IdInfoModel) obj;
        if (!Intrinsics.areEqual(this.f16341a, idInfoModel.f16341a)) {
            int i3 = f16339j + 65;
            f16337f = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.f16343c, idInfoModel.f16343c) || !Intrinsics.areEqual(this.f16344d, idInfoModel.f16344d)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.f16342b, idInfoModel.f16342b)) {
            int i5 = f16339j + 13;
            f16337f = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.f16346i, idInfoModel.f16346i)) {
            return false;
        }
        if (Intrinsics.areEqual(this.f16345h, idInfoModel.f16345h)) {
            return true;
        }
        int i7 = f16339j + 67;
        f16337f = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f16339j + 1;
        f16337f = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (((((((((this.f16341a.hashCode() * 31) + this.f16343c.hashCode()) * 31) + this.f16344d.hashCode()) * 31) + this.f16342b.hashCode()) * 31) + this.f16346i.hashCode()) * 31) + this.f16345h.hashCode();
        int i5 = f16339j + 65;
        f16337f = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f16337f + 99;
        f16339j = i3 % 128;
        if (i3 % 2 != 0) {
            String str = "IdInfoModel(fullName=" + this.f16341a + ", dateOfBirth=" + this.f16343c + ", sex=" + this.f16344d + ", address=" + this.f16342b + ", documentNumber=" + this.f16346i + ", expiryDate=" + this.f16345h + ")";
            throw null;
        }
        String str2 = "IdInfoModel(fullName=" + this.f16341a + ", dateOfBirth=" + this.f16343c + ", sex=" + this.f16344d + ", address=" + this.f16342b + ", documentNumber=" + this.f16346i + ", expiryDate=" + this.f16345h + ")";
        int i4 = f16339j + 55;
        f16337f = i4 % 128;
        int i5 = i4 % 2;
        return str2;
    }

    public static /* synthetic */ IdInfoModel copy$default(IdInfoModel idInfoModel, String str, String str2, String str3, String str4, String str5, String str6, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            str = idInfoModel.f16341a;
        }
        if ((i2 & 2) != 0) {
            str2 = idInfoModel.f16343c;
        }
        if ((i2 & 4) != 0) {
            str3 = idInfoModel.f16344d;
        }
        if ((i2 & 8) != 0) {
            str4 = idInfoModel.f16342b;
        }
        if ((i2 & 16) != 0) {
            int i4 = f16339j + 93;
            f16337f = i4 % 128;
            int i5 = i4 % 2;
            str5 = idInfoModel.f16346i;
        }
        if ((i2 & 32) != 0) {
            int i6 = f16339j + 7;
            f16337f = i6 % 128;
            if (i6 % 2 == 0) {
                str6 = idInfoModel.f16345h;
                int i7 = 67 / 0;
            } else {
                str6 = idInfoModel.f16345h;
            }
        }
        return idInfoModel.copy(str, str2, str3, str4, str5, str6);
    }

    public final IdInfoModel copy(String str, String str2, String str3, String str4, String str5, String str6) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        IdInfoModel idInfoModel = new IdInfoModel(str, str2, str3, str4, str5, str6);
        int i3 = f16339j + 81;
        f16337f = i3 % 128;
        int i4 = i3 % 2;
        return idInfoModel;
    }

    public static final class Creator implements Parcelable.Creator<IdInfoModel> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f16347d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f16348e = 0;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ IdInfoModel createFromParcel(Parcel parcel) {
            int i2 = 2 % 2;
            int i3 = f16348e + 71;
            f16347d = i3 % 128;
            if (i3 % 2 == 0) {
                createFromParcel(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            IdInfoModel idInfoModelCreateFromParcel = createFromParcel(parcel);
            int i4 = f16348e + 85;
            f16347d = i4 % 128;
            int i5 = i4 % 2;
            return idInfoModelCreateFromParcel;
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ IdInfoModel[] newArray(int i2) {
            int i3 = 2 % 2;
            int i4 = f16347d + 57;
            f16348e = i4 % 128;
            int i5 = i4 % 2;
            IdInfoModel[] idInfoModelArrNewArray = newArray(i2);
            if (i5 != 0) {
                int i6 = 67 / 0;
            }
            return idInfoModelArrNewArray;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IdInfoModel createFromParcel(Parcel parcel) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            IdInfoModel idInfoModel = new IdInfoModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i3 = f16347d + 15;
            f16348e = i3 % 128;
            if (i3 % 2 == 0) {
                return idInfoModel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IdInfoModel[] newArray(int i2) {
            int i3 = 2 % 2;
            int i4 = f16347d;
            int i5 = i4 + 9;
            f16348e = i5 % 128;
            int i6 = i5 % 2;
            IdInfoModel[] idInfoModelArr = new IdInfoModel[i2];
            int i7 = i4 + 123;
            f16348e = i7 % 128;
            int i8 = i7 % 2;
            return idInfoModelArr;
        }
    }

    public final String component6() {
        int i2 = 2 % 2;
        int i3 = f16339j;
        int i4 = i3 + 5;
        f16337f = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f16345h;
        int i6 = i3 + 33;
        f16337f = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component5() {
        int i2 = 2 % 2;
        int i3 = f16337f + 91;
        int i4 = i3 % 128;
        f16339j = i4;
        int i5 = i3 % 2;
        String str = this.f16346i;
        int i6 = i4 + 83;
        f16337f = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String component4() {
        int i2 = 2 % 2;
        int i3 = f16337f + 93;
        f16339j = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f16342b;
        if (i4 != 0) {
            int i5 = 51 / 0;
        }
        return str;
    }

    public final String component3() {
        String str;
        int i2 = 2 % 2;
        int i3 = f16337f + 103;
        int i4 = i3 % 128;
        f16339j = i4;
        if (i3 % 2 != 0) {
            str = this.f16344d;
            int i5 = 6 / 0;
        } else {
            str = this.f16344d;
        }
        int i6 = i4 + 103;
        f16337f = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String component2() {
        int i2 = 2 % 2;
        int i3 = f16337f;
        int i4 = i3 + 49;
        f16339j = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f16343c;
        int i6 = i3 + 107;
        f16339j = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String component1() {
        int i2 = 2 % 2;
        int i3 = f16337f;
        int i4 = i3 + 75;
        f16339j = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        String str = this.f16341a;
        int i5 = i3 + 95;
        f16339j = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
