package com.ts.coresdk.logger.network;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {
    private final String cb;
    private final String cc;
    private final int cd;
    private final String ce;
    private final String cf;
    private final String cg;

    public a(String str, String str2, int i2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.cb = str;
        this.cc = str2;
        this.cd = i2;
        this.ce = str3;
        this.cf = str4;
        this.cg = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.cb, aVar.cb) && Intrinsics.areEqual(this.cc, aVar.cc) && this.cd == aVar.cd && Intrinsics.areEqual(this.ce, aVar.ce) && Intrinsics.areEqual(this.cf, aVar.cf) && Intrinsics.areEqual(this.cg, aVar.cg);
    }

    public int hashCode() {
        return (((((((((this.cb.hashCode() * 31) + this.cc.hashCode()) * 31) + Integer.hashCode(this.cd)) * 31) + this.ce.hashCode()) * 31) + this.cf.hashCode()) * 31) + this.cg.hashCode();
    }

    public String toString() {
        return "ServerLogsMetaData(appId=" + this.cb + ", userID=" + this.cc + ", osVersion=" + this.cd + ", sdkVersion=" + this.ce + ", coreVersion=" + this.cf + ", clientPlatform=" + this.cg + ")";
    }
}
