package com.facetec.sdk;

import java.util.Date;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class gh {

    @Nullable
    public final fy Code;

    @Nullable
    public final fv Z;

    public static class I {
        private fv B;
        private Date C;
        private Date Code;
        private Date D;
        private String F;
        private long I;
        private long L;
        private long S;
        private fy V;
        private String Z;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f3224c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f3225e;

        public I(long j2, fv fvVar, fy fyVar) {
            this.f3224c = -1;
            this.I = j2;
            this.B = fvVar;
            this.V = fyVar;
            if (fyVar != null) {
                this.S = fyVar.S();
                this.L = fyVar.a();
                fr frVarZ = fyVar.Z();
                int iCode = frVarZ.Code();
                for (int i2 = 0; i2 < iCode; i2++) {
                    String strB = frVarZ.B(i2);
                    String strCode = frVarZ.Code(i2);
                    if ("Date".equalsIgnoreCase(strB)) {
                        this.Code = gw.Z(strCode);
                        this.Z = strCode;
                    } else if ("Expires".equalsIgnoreCase(strB)) {
                        this.D = gw.Z(strCode);
                    } else if ("Last-Modified".equalsIgnoreCase(strB)) {
                        this.C = gw.Z(strCode);
                        this.F = strCode;
                    } else if ("ETag".equalsIgnoreCase(strB)) {
                        this.f3225e = strCode;
                    } else if ("Age".equalsIgnoreCase(strB)) {
                        this.f3224c = gs.B(strCode, -1);
                    }
                }
            }
        }

        private static boolean B(fv fvVar) {
            return (fvVar.Z("If-Modified-Since") == null && fvVar.Z("If-None-Match") == null) ? false : true;
        }

        private boolean I() {
            return this.V.L().I() == -1 && this.D == null;
        }

        /* JADX WARN: Removed duplicated region for block: B:58:0x012a  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x01b7  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.facetec.sdk.gh Z() {
            /*
                Method dump skipped, instruction units count: 454
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.gh.I.Z():com.facetec.sdk.gh");
        }
    }

    gh(fv fvVar, fy fyVar) {
        this.Z = fvVar;
        this.Code = fyVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        if (r3.L().B() == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean I(com.facetec.sdk.fy r3, com.facetec.sdk.fv r4) {
        /*
            int r1 = r3.I()
            r0 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r1 == r0) goto L59
            r0 = 410(0x19a, float:5.75E-43)
            if (r1 == r0) goto L59
            r0 = 414(0x19e, float:5.8E-43)
            if (r1 == r0) goto L59
            r0 = 501(0x1f5, float:7.02E-43)
            if (r1 == r0) goto L59
            r0 = 203(0xcb, float:2.84E-43)
            if (r1 == r0) goto L59
            r0 = 204(0xcc, float:2.86E-43)
            if (r1 == r0) goto L59
            r0 = 307(0x133, float:4.3E-43)
            if (r1 == r0) goto L31
            r0 = 308(0x134, float:4.32E-43)
            if (r1 == r0) goto L59
            r0 = 404(0x194, float:5.66E-43)
            if (r1 == r0) goto L59
            r0 = 405(0x195, float:5.68E-43)
            if (r1 == r0) goto L59
            switch(r1) {
                case 300: goto L59;
                case 301: goto L59;
                case 302: goto L31;
                default: goto L30;
            }
        L30:
            return r2
        L31:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.B(r0)
            if (r0 != 0) goto L59
            com.facetec.sdk.fe r0 = r3.L()
            int r1 = r0.I()
            r0 = -1
            if (r1 != r0) goto L59
            com.facetec.sdk.fe r0 = r3.L()
            boolean r0 = r0.Code()
            if (r0 != 0) goto L59
            com.facetec.sdk.fe r0 = r3.L()
            boolean r0 = r0.B()
            if (r0 != 0) goto L59
            goto L30
        L59:
            com.facetec.sdk.fe r0 = r3.L()
            boolean r0 = r0.V()
            if (r0 != 0) goto L6f
            com.facetec.sdk.fe r0 = r4.C()
            boolean r0 = r0.V()
            if (r0 != 0) goto L6f
            r0 = 1
            return r0
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.gh.I(com.facetec.sdk.fy, com.facetec.sdk.fv):boolean");
    }
}
