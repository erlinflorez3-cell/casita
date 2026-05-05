package com.incode.welcome_sdk.modules;

import android.os.Parcel;
import android.os.Parcelable;
import com.incode.welcome_sdk.IdCategory;
import com.incode.welcome_sdk.modules.exceptions.ModuleConfigurationException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class FaceMatch extends BaseModule implements Parcelable {
    public static final Parcelable.Creator<FaceMatch> CREATOR = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f10535d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f10536f = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f10537h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f10538j = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<IdCategory> f10541c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MatchType f10542e;

    /* JADX WARN: Multi-variable type inference failed */
    private FaceMatch(List<? extends IdCategory> list, boolean z2, MatchType matchType, boolean z3) {
        super(Modules.FACE_MATCH);
        this.f10541c = list;
        this.f10539a = z2;
        this.f10542e = matchType;
        this.f10540b = z3;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MatchType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ MatchType[] $VALUES;
        public static final c Companion;
        public final String apiName;
        public static final MatchType ID_SELFIE = new MatchType("ID_SELFIE", 0, "selfieVsId");
        public static final MatchType NFC_SELFIE = new MatchType("NFC_SELFIE", 1, "selfieVsNfc");
        public static final MatchType NFC_3_WAY = new MatchType("NFC_3_WAY", 2, "nfc3Way");

        private static final /* synthetic */ MatchType[] $values() {
            return new MatchType[]{ID_SELFIE, NFC_SELFIE, NFC_3_WAY};
        }

        public static EnumEntries<MatchType> getEntries() {
            return $ENTRIES;
        }

        public static MatchType valueOf(String str) {
            return (MatchType) Enum.valueOf(MatchType.class, str);
        }

        public static MatchType[] values() {
            return (MatchType[]) $VALUES.clone();
        }

        private MatchType(String str, int i2, String str2) {
            this.apiName = str2;
        }

        static {
            MatchType[] matchTypeArr$values = $values();
            $VALUES = matchTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(matchTypeArr$values);
            Companion = new c(null);
        }

        public static final class c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f10549b = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f10550e = 1;

            private c() {
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
            
                if (r3 != null) goto L18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
            
                r1 = com.incode.welcome_sdk.modules.FaceMatch.MatchType.c.f10550e + 5;
                com.incode.welcome_sdk.modules.FaceMatch.MatchType.c.f10549b = r1 % 128;
                r1 = r1 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
            
                return com.incode.welcome_sdk.modules.FaceMatch.MatchType.ID_SELFIE;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
            
                return r3;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static com.incode.welcome_sdk.modules.FaceMatch.MatchType e(java.lang.String r8) {
                /*
                    r7 = 2
                    int r0 = r7 % r7
                    int r0 = com.incode.welcome_sdk.modules.FaceMatch.MatchType.c.f10550e
                    int r1 = r0 + 89
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.modules.FaceMatch.MatchType.c.f10549b = r0
                    int r1 = r1 % r7
                    com.incode.welcome_sdk.modules.FaceMatch$MatchType[] r6 = com.incode.welcome_sdk.modules.FaceMatch.MatchType.values()
                    int r5 = r6.length
                    int r0 = com.incode.welcome_sdk.modules.FaceMatch.MatchType.c.f10550e
                    int r1 = r0 + 25
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.modules.FaceMatch.MatchType.c.f10549b = r0
                    int r1 = r1 % r7
                    r4 = 0
                L1b:
                    r3 = 0
                    if (r4 >= r5) goto L34
                    r2 = r6[r4]
                    java.lang.String r0 = r2.apiName
                    boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r8)
                    if (r0 == 0) goto L42
                    int r0 = com.incode.welcome_sdk.modules.FaceMatch.MatchType.c.f10550e
                    int r1 = r0 + 95
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.modules.FaceMatch.MatchType.c.f10549b = r0
                    int r1 = r1 % r7
                    if (r1 != 0) goto L4e
                    r3 = r2
                L34:
                    if (r3 != 0) goto L41
                    int r0 = com.incode.welcome_sdk.modules.FaceMatch.MatchType.c.f10550e
                    int r1 = r0 + 5
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.modules.FaceMatch.MatchType.c.f10549b = r0
                    int r1 = r1 % r7
                    com.incode.welcome_sdk.modules.FaceMatch$MatchType r3 = com.incode.welcome_sdk.modules.FaceMatch.MatchType.ID_SELFIE
                L41:
                    return r3
                L42:
                    int r4 = r4 + 1
                    int r0 = com.incode.welcome_sdk.modules.FaceMatch.MatchType.c.f10550e
                    int r1 = r0 + 97
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.modules.FaceMatch.MatchType.c.f10549b = r0
                    int r1 = r1 % r7
                    goto L1b
                L4e:
                    r3.hashCode()
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.modules.FaceMatch.MatchType.c.e(java.lang.String):com.incode.welcome_sdk.modules.FaceMatch$MatchType");
            }

            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    public static final class Builder {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f10543a = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10544c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10545d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10546e = 0;
        private Set<IdCategory> idCategories = new LinkedHashSet();
        private boolean showUserExists = true;
        private MatchType matchType = MatchType.ID_SELFIE;
        private boolean enableFaceMatchAnimation = true;

        public final Builder setIdCategory(IdCategory... idCategoryArr) {
            int i2 = 2 % 2;
            int i3 = f10543a + 33;
            f10545d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(idCategoryArr, "");
            int length = idCategoryArr.length;
            int i5 = 0;
            while (i5 < length) {
                int i6 = f10543a + 31;
                f10545d = i6 % 128;
                if (i6 % 2 == 0) {
                    this.idCategories.add(idCategoryArr[i5]);
                    i5 += 22;
                } else {
                    this.idCategories.add(idCategoryArr[i5]);
                    i5++;
                }
            }
            return this;
        }

        public final void addIdCategory(IdCategory idCategory) {
            int i2 = 2 % 2;
            int i3 = f10543a + 125;
            f10545d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(idCategory, "");
            this.idCategories.add(idCategory);
            int i5 = f10543a + 55;
            f10545d = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setShowUserExists(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10543a + 57;
            f10545d = i3 % 128;
            if (i3 % 2 != 0) {
                this.showUserExists = z2;
                return this;
            }
            this.showUserExists = z2;
            throw null;
        }

        public final Builder setMatchType(MatchType matchType) {
            int i2 = 2 % 2;
            int i3 = f10543a + 5;
            f10545d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(matchType, "");
            this.matchType = matchType;
            int i5 = f10545d + 109;
            f10543a = i5 % 128;
            if (i5 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public final Builder setFaceMatchAnimationEnabled(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10545d;
            int i4 = i3 + 53;
            f10543a = i4 % 128;
            int i5 = i4 % 2;
            this.enableFaceMatchAnimation = z2;
            int i6 = i3 + 105;
            f10543a = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final FaceMatch build() {
            int i2 = 2 % 2;
            if (this.idCategories.isEmpty()) {
                int i3 = f10543a + 121;
                f10545d = i3 % 128;
                if (i3 % 2 == 0) {
                    this.idCategories.add(IdCategory.FIRST);
                    int i4 = 6 / 0;
                } else {
                    this.idCategories.add(IdCategory.FIRST);
                }
                int i5 = f10545d + 67;
                f10543a = i5 % 128;
                int i6 = i5 % 2;
            }
            return new FaceMatch(CollectionsKt.sortedWith(this.idCategories, new d()), this.showUserExists, this.matchType, this.enableFaceMatchAnimation, (byte) 0);
        }

        public static final class d<T> implements Comparator {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f10547c = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f10548e = 1;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                int i2 = 2 % 2;
                int i3 = f10547c + 9;
                f10548e = i3 % 128;
                IdCategory idCategory = (IdCategory) t2;
                if (i3 % 2 != 0) {
                    return ComparisonsKt.compareValues(Integer.valueOf(idCategory.ordinal()), Integer.valueOf(((IdCategory) t3).ordinal()));
                }
                ComparisonsKt.compareValues(Integer.valueOf(idCategory.ordinal()), Integer.valueOf(((IdCategory) t3).ordinal()));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        static {
            int i2 = 1 + 47;
            f10546e = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    @Override // com.incode.welcome_sdk.modules.BaseModule
    public final void verifyConfiguration(List<? extends Modules> list) throws ModuleConfigurationException {
        int i2 = 2 % 2;
        int i3 = f10538j + 89;
        f10535d = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(list, "");
            verifyAddAndProcessDataNotAfterApprove(list);
            verifyIfAfter(list, Modules.SELFIE);
            verifyIfAfter(list, Modules.ID);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(list, "");
        verifyAddAndProcessDataNotAfterApprove(list);
        verifyIfAfter(list, Modules.SELFIE);
        verifyIfAfter(list, Modules.ID);
        int i4 = f10535d + 19;
        f10538j = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class b implements Parcelable.Creator<FaceMatch> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f10551a = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10552e = 0;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FaceMatch createFromParcel(Parcel parcel) {
            int i2 = 2 % 2;
            int i3 = f10552e + 53;
            f10551a = i3 % 128;
            int i4 = i3 % 2;
            FaceMatch faceMatchC = c(parcel);
            int i5 = f10552e + 99;
            f10551a = i5 % 128;
            if (i5 % 2 != 0) {
                return faceMatchC;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FaceMatch[] newArray(int i2) {
            int i3 = 2 % 2;
            int i4 = f10552e + 101;
            f10551a = i4 % 128;
            int i5 = i4 % 2;
            FaceMatch[] faceMatchArrD = d(i2);
            int i6 = f10551a + 41;
            f10552e = i6 % 128;
            int i7 = i6 % 2;
            return faceMatchArrD;
        }

        private static FaceMatch c(Parcel parcel) {
            boolean z2;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            int i4 = 0;
            while (i4 != i3) {
                int i5 = f10552e + 105;
                f10551a = i5 % 128;
                int i6 = i5 % 2;
                arrayList.add(IdCategory.valueOf(parcel.readString()));
                i4++;
                int i7 = f10552e + 25;
                f10551a = i7 % 128;
                int i8 = i7 % 2;
            }
            ArrayList arrayList2 = arrayList;
            if (parcel.readInt() != 0) {
                int i9 = f10552e + 45;
                f10551a = i9 % 128;
                z2 = i9 % 2 != 0;
            } else {
                z2 = false;
            }
            return new FaceMatch(arrayList2, z2, MatchType.valueOf(parcel.readString()), parcel.readInt() != 0, (byte) 0);
        }

        private static FaceMatch[] d(int i2) {
            int i3 = 2 % 2;
            int i4 = f10552e + 29;
            f10551a = i4 % 128;
            FaceMatch[] faceMatchArr = new FaceMatch[i2];
            if (i4 % 2 != 0) {
                return faceMatchArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i2 = f10537h + 27;
        f10536f = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ FaceMatch(List list, boolean z2, MatchType matchType, boolean z3, byte b2) {
        this(list, z2, matchType, z3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        List<IdCategory> list = this.f10541c;
        parcel.writeInt(list.size());
        Iterator<IdCategory> it = list.iterator();
        while (it.hasNext()) {
            int i5 = f10538j + 89;
            f10535d = i5 % 128;
            int i6 = i5 % 2;
            parcel.writeString(it.next().name());
        }
        int i7 = 1;
        if (this.f10539a) {
            int i8 = f10538j + 13;
            f10535d = i8 % 128;
            int i9 = i8 % 2;
            i3 = 1;
        } else {
            i3 = 0;
        }
        parcel.writeInt(i3);
        parcel.writeString(this.f10542e.name());
        if (this.f10540b) {
            int i10 = f10535d + 67;
            f10538j = i10 % 128;
            int i11 = i10 % 2;
        } else {
            i7 = 0;
        }
        parcel.writeInt(i7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i2 = 2 % 2;
        int i3 = f10535d;
        int i4 = i3 + 55;
        f10538j = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 15;
        f10538j = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 53 / 0;
        }
        return 0;
    }
}
