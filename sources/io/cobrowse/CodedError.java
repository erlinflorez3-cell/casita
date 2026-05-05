package io.cobrowse;

/* JADX INFO: loaded from: classes3.dex */
class CodedError extends Error {
    public int code;

    CodedError(int i2, String str) {
        super(str);
        this.code = i2;
    }
}
