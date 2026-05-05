package com.google.android.gms.iid;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaa extends Exception {
    private final int errorCode;

    public zzaa(int i2, String str) {
        super(str);
        this.errorCode = i2;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }
}
