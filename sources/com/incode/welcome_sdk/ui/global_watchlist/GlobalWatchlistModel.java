package com.incode.welcome_sdk.ui.global_watchlist;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class GlobalWatchlistModel {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f14393d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f14394f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f14395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f14397c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f14398e;

    public GlobalWatchlistModel(String str, String str2, Integer num, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.f14398e = str;
        this.f14396b = str2;
        this.f14395a = num;
        this.f14397c = str3;
    }

    public /* synthetic */ GlobalWatchlistModel(String str, String str2, Integer num, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : str3);
    }

    public final String getFirstName() {
        int i2 = 2 % 2;
        int i3 = f14394f + 71;
        int i4 = i3 % 128;
        f14393d = i4;
        int i5 = i3 % 2;
        String str = this.f14398e;
        int i6 = i4 + 43;
        f14394f = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String getSurName() {
        int i2 = 2 % 2;
        int i3 = f14394f;
        int i4 = i3 + 53;
        f14393d = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f14396b;
        int i6 = i3 + 53;
        f14393d = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final Integer getBirthYear() {
        int i2 = 2 % 2;
        int i3 = f14394f;
        int i4 = i3 + 25;
        f14393d = i4 % 128;
        int i5 = i4 % 2;
        Integer num = this.f14395a;
        int i6 = i3 + 15;
        f14393d = i6 % 128;
        if (i6 % 2 == 0) {
            return num;
        }
        throw null;
    }

    public final String getCountryCode() {
        int i2 = 2 % 2;
        int i3 = f14393d + 123;
        f14394f = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f14397c;
        if (i4 == 0) {
            int i5 = 80 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f14394f + 29;
            f14393d = i3 % 128;
            return i3 % 2 == 0;
        }
        if (!(obj instanceof GlobalWatchlistModel)) {
            int i4 = f14394f + 43;
            f14393d = i4 % 128;
            return i4 % 2 != 0;
        }
        GlobalWatchlistModel globalWatchlistModel = (GlobalWatchlistModel) obj;
        if (!Intrinsics.areEqual(this.f14398e, globalWatchlistModel.f14398e)) {
            int i5 = f14393d + 47;
            f14394f = i5 % 128;
            return i5 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.f14396b, globalWatchlistModel.f14396b)) {
            int i6 = f14393d + 55;
            f14394f = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.f14395a, globalWatchlistModel.f14395a)) {
            return false;
        }
        if (Intrinsics.areEqual(this.f14397c, globalWatchlistModel.f14397c)) {
            return true;
        }
        int i8 = f14394f + 87;
        f14393d = i8 % 128;
        if (i8 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i2 = 2 % 2;
        int i3 = f14393d + 31;
        f14394f = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode2 = ((this.f14398e.hashCode() * 31) + this.f14396b.hashCode()) * 31;
        Integer num = this.f14395a;
        if (num == null) {
            int i5 = f14394f + 51;
            f14393d = i5 % 128;
            iHashCode = i5 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = num.hashCode();
        }
        int i6 = (iHashCode2 + iHashCode) * 31;
        String str = this.f14397c;
        return i6 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f14394f + 117;
        f14393d = i3 % 128;
        if (i3 % 2 == 0) {
            return "GlobalWatchlistModel(firstName=" + this.f14398e + ", surName=" + this.f14396b + ", birthYear=" + this.f14395a + ", countryCode=" + this.f14397c + ")";
        }
        String str = "GlobalWatchlistModel(firstName=" + this.f14398e + ", surName=" + this.f14396b + ", birthYear=" + this.f14395a + ", countryCode=" + this.f14397c + ")";
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ GlobalWatchlistModel copy$default(GlobalWatchlistModel globalWatchlistModel, String str, String str2, Integer num, String str3, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = f14393d + 125;
        int i5 = i4 % 128;
        f14394f = i5;
        int i6 = i4 % 2;
        Object obj2 = null;
        if ((i2 & 1) != 0) {
            int i7 = i5 + 61;
            f14393d = i7 % 128;
            if (i7 % 2 != 0) {
                String str4 = globalWatchlistModel.f14398e;
                obj2.hashCode();
                throw null;
            }
            str = globalWatchlistModel.f14398e;
        }
        if ((i2 & 2) != 0) {
            int i8 = i5 + 43;
            f14393d = i8 % 128;
            int i9 = i8 % 2;
            str2 = globalWatchlistModel.f14396b;
        }
        if ((i2 & 4) != 0) {
            num = globalWatchlistModel.f14395a;
        }
        if ((i2 & 8) != 0) {
            int i10 = i5 + 9;
            f14393d = i10 % 128;
            if (i10 % 2 != 0) {
                String str5 = globalWatchlistModel.f14397c;
                obj2.hashCode();
                throw null;
            }
            str3 = globalWatchlistModel.f14397c;
        }
        return globalWatchlistModel.copy(str, str2, num, str3);
    }

    public final GlobalWatchlistModel copy(String str, String str2, Integer num, String str3) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        GlobalWatchlistModel globalWatchlistModel = new GlobalWatchlistModel(str, str2, num, str3);
        int i3 = f14393d + 29;
        f14394f = i3 % 128;
        int i4 = i3 % 2;
        return globalWatchlistModel;
    }

    public final String component4() {
        int i2 = 2 % 2;
        int i3 = f14393d + 51;
        int i4 = i3 % 128;
        f14394f = i4;
        int i5 = i3 % 2;
        String str = this.f14397c;
        int i6 = i4 + 81;
        f14393d = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer component3() {
        int i2 = 2 % 2;
        int i3 = f14393d;
        int i4 = i3 + 77;
        f14394f = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            throw null;
        }
        Integer num = this.f14395a;
        int i5 = i3 + 13;
        f14394f = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i2 = 2 % 2;
        int i3 = f14394f + 85;
        int i4 = i3 % 128;
        f14393d = i4;
        int i5 = i3 % 2;
        String str = this.f14396b;
        int i6 = i4 + 101;
        f14394f = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component1() {
        int i2 = 2 % 2;
        int i3 = f14393d + 109;
        int i4 = i3 % 128;
        f14394f = i4;
        int i5 = i3 % 2;
        String str = this.f14398e;
        int i6 = i4 + 97;
        f14393d = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }
}
