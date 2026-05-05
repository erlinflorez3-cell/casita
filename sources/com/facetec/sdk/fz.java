package com.facetec.sdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public enum fz {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");

    final String B;

    fz(String str) {
        this.B = str;
    }

    static List<fz> B(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(I(str));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facetec.sdk.fz I(java.lang.String r6) {
        /*
            int r5 = r6.hashCode()
            r0 = 79201641(0x4b88569, float:4.338071E-36)
            r4 = 4
            r3 = 3
            r2 = 2
            r1 = 1
            if (r5 == r0) goto L4b
            r0 = 79923350(0x4c38896, float:4.5969714E-36)
            if (r5 == r0) goto L41
            switch(r5) {
                case -503070503: goto L23;
                case -503070502: goto L2d;
                case -503070501: goto L37;
                default: goto L15;
            }
        L15:
            r0 = -1
        L16:
            if (r0 == 0) goto L6e
            if (r0 == r1) goto L6b
            if (r0 == r2) goto L68
            if (r0 == r3) goto L65
            if (r0 != r4) goto L55
            com.facetec.sdk.fz r0 = com.facetec.sdk.fz.SSL_3_0
            return r0
        L23:
            java.lang.String r0 = "TLSv1.1"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L15
            r0 = r2
            goto L16
        L2d:
            java.lang.String r0 = "TLSv1.2"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L15
            r0 = r1
            goto L16
        L37:
            java.lang.String r0 = "TLSv1.3"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L15
            r0 = 0
            goto L16
        L41:
            java.lang.String r0 = "TLSv1"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L15
            r0 = r3
            goto L16
        L4b:
            java.lang.String r0 = "SSLv3"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L15
            r0 = r4
            goto L16
        L55:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unexpected TLS version: "
            java.lang.String r0 = java.lang.String.valueOf(r6)
            java.lang.String r0 = r1.concat(r0)
            r2.<init>(r0)
            throw r2
        L65:
            com.facetec.sdk.fz r0 = com.facetec.sdk.fz.TLS_1_0
            return r0
        L68:
            com.facetec.sdk.fz r0 = com.facetec.sdk.fz.TLS_1_1
            return r0
        L6b:
            com.facetec.sdk.fz r0 = com.facetec.sdk.fz.TLS_1_2
            return r0
        L6e:
            com.facetec.sdk.fz r0 = com.facetec.sdk.fz.TLS_1_3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.fz.I(java.lang.String):com.facetec.sdk.fz");
    }
}
