package com.ts.coresdk.controllers;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f18262j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f18263k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<String> f18264l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f18265m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f18266n;

    public a(String str, boolean z2, List<String> list, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.f18262j = str;
        this.f18263k = z2;
        this.f18264l = list;
        this.f18265m = str2;
        this.f18266n = str3;
    }

    public final String a() {
        return this.f18262j;
    }

    public final List<String> b() {
        return this.f18264l;
    }

    public final String c() {
        return this.f18265m;
    }

    public final String d() {
        return this.f18266n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f18262j, aVar.f18262j) && this.f18263k == aVar.f18263k && Intrinsics.areEqual(this.f18264l, aVar.f18264l) && Intrinsics.areEqual(this.f18265m, aVar.f18265m) && Intrinsics.areEqual(this.f18266n, aVar.f18266n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    public int hashCode() {
        int iHashCode = this.f18262j.hashCode() * 31;
        boolean z2 = this.f18263k;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        int i2 = (iHashCode + r02) * 31;
        List<String> list = this.f18264l;
        return ((((i2 + (list == null ? 0 : list.hashCode())) * 31) + this.f18265m.hashCode()) * 31) + this.f18266n.hashCode();
    }

    public String toString() {
        return "SendDataWorkerModuleInfo(subSystem=" + this.f18262j + ", isLoggerEnabled=" + this.f18263k + ", endpointIgnoreList=" + this.f18264l + ", tenantID=" + this.f18265m + ", version=" + this.f18266n + ")";
    }
}
