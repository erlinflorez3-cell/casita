package com.incode.welcome_sdk.c.b;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Long f4504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f4506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, Object> f4507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f4508e;

    public d(String str, String str2, String str3, Map<String, ? extends Object> map, Long l2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f4506c = str;
        this.f4508e = str2;
        this.f4505b = str3;
        this.f4507d = map;
        this.f4504a = l2;
    }

    public final String d() {
        return this.f4506c;
    }

    public final String e() {
        return this.f4508e;
    }

    public final String b() {
        return this.f4505b;
    }

    public final Map<String, Object> c() {
        return this.f4507d;
    }

    public /* synthetic */ d(String str, String str2, String str3, Map map, Long l2, int i2) {
        this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) == 0 ? map : null, (i2 & 16) != 0 ? Long.valueOf(System.currentTimeMillis()) : l2);
    }

    public final Long a() {
        return this.f4504a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f4506c, dVar.f4506c) && Intrinsics.areEqual(this.f4508e, dVar.f4508e) && Intrinsics.areEqual(this.f4505b, dVar.f4505b) && Intrinsics.areEqual(this.f4507d, dVar.f4507d) && Intrinsics.areEqual(this.f4504a, dVar.f4504a);
    }

    public final int hashCode() {
        int iHashCode = this.f4506c.hashCode() * 31;
        String str = this.f4508e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f4505b;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, Object> map = this.f4507d;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Long l2 = this.f4504a;
        return iHashCode4 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return "InterviewEvent(eventName=" + this.f4506c + ", moduleName=" + this.f4508e + ", screenName=" + this.f4505b + ", payload=" + this.f4507d + ", eventTimeStamp=" + this.f4504a + ")";
    }
}
