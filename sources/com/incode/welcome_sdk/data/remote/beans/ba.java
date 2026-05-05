package com.incode.welcome_sdk.data.remote.beans;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class ba {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9379d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f9380e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f9381a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f9382c = null;

    public ba(double d2) {
        this.f9381a = d2;
    }

    public final double e() {
        int i2 = 2 % 2;
        int i3 = f9379d;
        int i4 = i3 + 39;
        f9380e = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        double d2 = this.f9381a;
        int i5 = i3 + 17;
        f9380e = i5 % 128;
        if (i5 % 2 != 0) {
            return d2;
        }
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        String string = new StringBuilder("ResponseLiveness{confidence=").append(this.f9381a).append("statId=").append(this.f9382c).append(AbstractJsonLexerKt.END_OBJ).toString();
        int i3 = f9380e + 103;
        f9379d = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 54 / 0;
        }
        return string;
    }
}
