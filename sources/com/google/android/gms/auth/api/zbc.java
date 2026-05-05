package com.google.android.gms.auth.api;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public final class zbc {
    protected Boolean zba;
    protected String zbb;

    public zbc() {
        this.zba = false;
    }

    public zbc(zbd zbdVar) {
        this.zba = false;
        zbd.zbb(zbdVar);
        this.zba = Boolean.valueOf(zbdVar.zbc);
        this.zbb = zbdVar.zbd;
    }

    public final zbc zba(String str) {
        this.zbb = str;
        return this;
    }
}
