package com.facetec.sdk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class fr {
    private final String[] Z;

    public static final class V {
        final List<String> Z = new ArrayList(20);

        public final V B(String str) {
            int i2 = 0;
            while (i2 < this.Z.size()) {
                if (str.equalsIgnoreCase(this.Z.get(i2))) {
                    this.Z.remove(i2);
                    this.Z.remove(i2);
                    i2 -= 2;
                }
                i2 += 2;
            }
            return this;
        }

        final V B(String str, String str2) {
            this.Z.add(str);
            this.Z.add(str2.trim());
            return this;
        }

        public final fr I() {
            return new fr(this);
        }

        public final V V(String str, String str2) {
            fr.I(str);
            fr.V(str2, str);
            return B(str, str2);
        }

        public final V Z(String str, String str2) {
            fr.I(str);
            fr.V(str2, str);
            B(str);
            B(str, str2);
            return this;
        }
    }

    fr(V v2) {
        this.Z = (String[]) v2.Z.toArray(new String[v2.Z.size()]);
    }

    static void I(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt <= ' ' || cCharAt >= 127) {
                throw new IllegalArgumentException(gg.Code("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i2), str));
            }
        }
    }

    static void V(String str, String str2) {
        if (str == null) {
            throw new NullPointerException(new StringBuilder("value for name ").append(str2).append(" == null").toString());
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if ((cCharAt <= 31 && cCharAt != '\t') || cCharAt >= 127) {
                throw new IllegalArgumentException(gg.Code("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(cCharAt), Integer.valueOf(i2), str2, str));
            }
        }
    }

    public final V B() {
        V v2 = new V();
        Collections.addAll(v2.Z, this.Z);
        return v2;
    }

    public final String B(int i2) {
        return this.Z[i2 << 1];
    }

    public final int Code() {
        return this.Z.length / 2;
    }

    public final String Code(int i2) {
        return this.Z[(i2 << 1) + 1];
    }

    @Nullable
    public final String Code(String str) {
        String[] strArr = this.Z;
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof fr) && Arrays.equals(((fr) obj).Z, this.Z);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.Z);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int iCode = Code();
        for (int i2 = 0; i2 < iCode; i2++) {
            sb.append(B(i2)).append(": ").append(Code(i2)).append("\n");
        }
        return sb.toString();
    }
}
