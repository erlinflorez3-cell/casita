package com.incode.welcome_sdk.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class CombinedConsentData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<CombinedConsentData> CREATOR = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f7444a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f7445b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f7446d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f7447e = 0;
    private List<ConsentData> consents;
    private String languageConsentId;
    private String terms;
    private String title;

    public CombinedConsentData(String str, String str2, String str3, List<ConsentData> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.languageConsentId = str;
        this.title = str2;
        this.terms = str3;
        this.consents = list;
    }

    public /* synthetic */ CombinedConsentData(String str, String str2, String str3, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final String getLanguageConsentId() {
        int i2 = 2 % 2;
        int i3 = f7444a;
        int i4 = i3 + 25;
        f7447e = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        String str = this.languageConsentId;
        int i5 = i3 + 53;
        f7447e = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setLanguageConsentId(String str) {
        int i2 = 2 % 2;
        int i3 = f7447e + 89;
        f7444a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.languageConsentId = str;
        int i5 = f7444a + 81;
        f7447e = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final String getTitle() {
        int i2 = 2 % 2;
        int i3 = f7447e + 13;
        int i4 = i3 % 128;
        f7444a = i4;
        int i5 = i3 % 2;
        String str = this.title;
        int i6 = i4 + 103;
        f7447e = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final void setTitle(String str) {
        int i2 = 2 % 2;
        int i3 = f7447e + 23;
        f7444a = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.title = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.title = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final String getTerms() {
        int i2 = 2 % 2;
        int i3 = f7444a;
        int i4 = i3 + 121;
        f7447e = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.terms;
        int i5 = i3 + 47;
        f7447e = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 66 / 0;
        }
        return str;
    }

    public final void setTerms(String str) {
        int i2 = 2 % 2;
        int i3 = f7444a + 39;
        f7447e = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.terms = str;
            int i4 = 77 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.terms = str;
        }
        int i5 = f7444a + 45;
        f7447e = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final List<ConsentData> getConsents() {
        int i2 = 2 % 2;
        int i3 = f7444a;
        int i4 = i3 + 37;
        f7447e = i4 % 128;
        int i5 = i4 % 2;
        List<ConsentData> list = this.consents;
        int i6 = i3 + 27;
        f7447e = i6 % 128;
        int i7 = i6 % 2;
        return list;
    }

    public final void setConsents(List<ConsentData> list) {
        int i2 = 2 % 2;
        int i3 = f7447e + 61;
        f7444a = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(list, "");
            this.consents = list;
        } else {
            Intrinsics.checkNotNullParameter(list, "");
            this.consents = list;
            throw null;
        }
    }

    static {
        int i2 = f7445b + 39;
        f7446d = i2 % 128;
        int i3 = i2 % 2;
    }

    public CombinedConsentData() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int i3 = 2 % 2;
        int i4 = f7447e + 43;
        f7444a = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.languageConsentId);
        parcel.writeString(this.title);
        parcel.writeString(this.terms);
        List<ConsentData> list = this.consents;
        parcel.writeInt(list.size());
        Iterator<ConsentData> it = list.iterator();
        int i6 = f7444a + 93;
        f7447e = i6 % 128;
        int i7 = i6 % 2;
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i2);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i2 = 2 % 2;
        int i3 = f7444a + 3;
        f7447e = i3 % 128;
        int i4 = i3 % 2;
        return 0;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f7447e + 69;
            f7444a = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (!(obj instanceof CombinedConsentData)) {
            int i5 = f7444a + 103;
            f7447e = i5 % 128;
            return i5 % 2 != 0;
        }
        CombinedConsentData combinedConsentData = (CombinedConsentData) obj;
        if (!Intrinsics.areEqual(this.languageConsentId, combinedConsentData.languageConsentId)) {
            int i6 = f7447e + 123;
            f7444a = i6 % 128;
            return i6 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.title, combinedConsentData.title)) {
            return false;
        }
        if (Intrinsics.areEqual(this.terms, combinedConsentData.terms)) {
            return Intrinsics.areEqual(this.consents, combinedConsentData.consents);
        }
        int i7 = f7444a + 41;
        f7447e = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f7447e + 45;
        f7444a = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (((((this.languageConsentId.hashCode() * 31) + this.title.hashCode()) * 31) + this.terms.hashCode()) * 31) + this.consents.hashCode();
        int i5 = f7447e + 53;
        f7444a = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f7447e + 1;
        f7444a = i3 % 128;
        int i4 = i3 % 2;
        String str = "CombinedConsentData(languageConsentId=" + this.languageConsentId + ", title=" + this.title + ", terms=" + this.terms + ", consents=" + this.consents + ")";
        int i5 = f7447e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f7444a = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class c implements Parcelable.Creator<CombinedConsentData> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f7448b = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f7449e = 0;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CombinedConsentData createFromParcel(Parcel parcel) {
            int i2 = 2 % 2;
            int i3 = f7449e + 3;
            f7448b = i3 % 128;
            int i4 = i3 % 2;
            CombinedConsentData combinedConsentDataA = a(parcel);
            int i5 = f7448b + 109;
            f7449e = i5 % 128;
            int i6 = i5 % 2;
            return combinedConsentDataA;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CombinedConsentData[] newArray(int i2) {
            int i3 = 2 % 2;
            int i4 = f7449e + 125;
            f7448b = i4 % 128;
            int i5 = i4 % 2;
            CombinedConsentData[] combinedConsentDataArrE = e(i2);
            if (i5 == 0) {
                int i6 = 7 / 0;
            }
            return combinedConsentDataArrE;
        }

        private static CombinedConsentData a(Parcel parcel) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            int i4 = f7449e + 59;
            f7448b = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 / 5;
            }
            for (int i6 = 0; i6 != i3; i6++) {
                int i7 = f7448b + 81;
                f7449e = i7 % 128;
                int i8 = i7 % 2;
                arrayList.add(ConsentData.CREATOR.createFromParcel(parcel));
            }
            return new CombinedConsentData(string, string2, string3, arrayList);
        }

        private static CombinedConsentData[] e(int i2) {
            int i3 = 2 % 2;
            int i4 = f7449e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f7448b = i4 % 128;
            CombinedConsentData[] combinedConsentDataArr = new CombinedConsentData[i2];
            if (i4 % 2 == 0) {
                int i5 = 94 / 0;
            }
            return combinedConsentDataArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CombinedConsentData copy$default(CombinedConsentData combinedConsentData, String str, String str2, String str3, List list, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = f7444a + 99;
            f7447e = i4 % 128;
            int i5 = i4 % 2;
            str = combinedConsentData.languageConsentId;
        }
        if ((i2 & 2) != 0) {
            int i6 = f7447e + 117;
            f7444a = i6 % 128;
            int i7 = i6 % 2;
            str2 = combinedConsentData.title;
        }
        if ((i2 & 4) != 0) {
            str3 = combinedConsentData.terms;
        }
        if ((i2 & 8) != 0) {
            list = combinedConsentData.consents;
        }
        return combinedConsentData.copy(str, str2, str3, list);
    }

    public final CombinedConsentData copy(String str, String str2, String str3, List<ConsentData> list) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        CombinedConsentData combinedConsentData = new CombinedConsentData(str, str2, str3, list);
        int i3 = f7444a + 7;
        f7447e = i3 % 128;
        int i4 = i3 % 2;
        return combinedConsentData;
    }

    public final List<ConsentData> component4() {
        int i2 = 2 % 2;
        int i3 = f7444a;
        int i4 = i3 + 113;
        f7447e = i4 % 128;
        int i5 = i4 % 2;
        List<ConsentData> list = this.consents;
        int i6 = i3 + 35;
        f7447e = i6 % 128;
        if (i6 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i2 = 2 % 2;
        int i3 = f7444a + 93;
        f7447e = i3 % 128;
        int i4 = i3 % 2;
        String str = this.terms;
        if (i4 != 0) {
            int i5 = 51 / 0;
        }
        return str;
    }

    public final String component2() {
        int i2 = 2 % 2;
        int i3 = f7447e;
        int i4 = i3 + 21;
        f7444a = i4 % 128;
        int i5 = i4 % 2;
        String str = this.title;
        int i6 = i3 + 27;
        f7444a = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String component1() {
        int i2 = 2 % 2;
        int i3 = f7444a;
        int i4 = i3 + 23;
        f7447e = i4 % 128;
        int i5 = i4 % 2;
        String str = this.languageConsentId;
        int i6 = i3 + 33;
        f7447e = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }
}
