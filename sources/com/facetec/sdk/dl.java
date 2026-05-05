package com.facetec.sdk;

import java.io.ObjectStreamException;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes3.dex */
public final class dl extends Number {
    private final String V;

    public dl(String str) {
        this.V = str;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new BigDecimal(this.V);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.V);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl)) {
            return false;
        }
        String str = this.V;
        String str2 = ((dl) obj).V;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.V);
    }

    public final int hashCode() {
        return this.V.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.V);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.V).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(this.V);
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.V);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.V).longValue();
        }
    }

    public final String toString() {
        return this.V;
    }
}
