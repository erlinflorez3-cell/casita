package com.facetec.sdk;

import com.facetec.sdk.cf;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.sessions.settings.RemoteSettings;
import cz.msebera.android.httpclient.client.methods.HttpPost;
import cz.msebera.android.httpclient.cookie.ClientCookie;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class hf {
    static final hc[] B;
    static final Map<ib, Integer> V;

    static final class V {
        private hc[] B;
        private int C;
        private final int Code;
        private int F;
        private int I;
        private int S;
        private final cf.I V;
        private final List<hc> Z;

        private V(cf.I i2) {
            this.Z = new ArrayList();
            this.B = new hc[8];
            this.F = r0.length - 1;
            this.C = 0;
            this.S = 0;
            this.Code = 4096;
            this.I = 4096;
            this.V = ik.Code(i2);
        }

        V(cf.I i2, byte b2) {
            this(i2);
        }

        private int B(int i2, int i3) throws IOException {
            int i4 = (i2 + i3) - (i2 | i3);
            if (i4 < i3) {
                return i4;
            }
            int i5 = 0;
            while (true) {
                int I = I();
                if ((I + 128) - (128 | I) == 0) {
                    return i3 + (I << i5);
                }
                i3 += ((I + 127) - (I | 127)) << i5;
                i5 += 7;
            }
        }

        private ib B(int i2) throws IOException {
            if (I(i2)) {
                return hf.B[i2].L;
            }
            int iV = V(i2 - hf.B.length);
            if (iV >= 0) {
                hc[] hcVarArr = this.B;
                if (iV < hcVarArr.length) {
                    return hcVarArr[iV].L;
                }
            }
            throw new IOException(new StringBuilder("Header index too large ").append(i2 + 1).toString());
        }

        private void B(hc hcVar) {
            this.Z.add(hcVar);
            int i2 = hcVar.S;
            int i3 = this.I;
            if (i2 > i3) {
                Code();
                return;
            }
            Code((this.S + i2) - i3);
            int i4 = this.C + 1;
            hc[] hcVarArr = this.B;
            if (i4 > hcVarArr.length) {
                hc[] hcVarArr2 = new hc[hcVarArr.length << 1];
                System.arraycopy(hcVarArr, 0, hcVarArr2, hcVarArr.length, hcVarArr.length);
                this.F = this.B.length - 1;
                this.B = hcVarArr2;
            }
            int i5 = this.F;
            this.F = i5 - 1;
            this.B[i5] = hcVar;
            this.C++;
            this.S += i2;
        }

        private int Code(int i2) {
            int i3;
            int i4 = 0;
            if (i2 > 0) {
                int length = this.B.length - 1;
                while (true) {
                    i3 = this.F;
                    if (length < i3 || i2 <= 0) {
                        break;
                    }
                    i2 -= this.B[length].S;
                    this.S -= this.B[length].S;
                    this.C--;
                    i4++;
                    length--;
                }
                hc[] hcVarArr = this.B;
                System.arraycopy(hcVarArr, i3 + 1, hcVarArr, i3 + 1 + i4, this.C);
                this.F += i4;
            }
            return i4;
        }

        private void Code() {
            Arrays.fill(this.B, (Object) null);
            this.F = this.B.length - 1;
            this.C = 0;
            this.S = 0;
        }

        private int I() throws IOException {
            return (-1) - (((-1) - this.V.D()) | ((-1) - 255));
        }

        private static boolean I(int i2) {
            return i2 >= 0 && i2 <= hf.B.length - 1;
        }

        private ib S() throws IOException {
            int I = I();
            boolean z2 = (I & 128) == 128;
            int iB = B(I, 127);
            return z2 ? ib.V(hh.I().V(this.V.D(iB))) : this.V.Code(iB);
        }

        private int V(int i2) {
            return this.F + 1 + i2;
        }

        private void Z() {
            int i2 = this.I;
            int i3 = this.S;
            if (i2 < i3) {
                if (i2 == 0) {
                    Code();
                } else {
                    Code(i3 - i2);
                }
            }
        }

        final void B() throws IOException {
            while (!this.V.F()) {
                byte bD = this.V.D();
                int i2 = bD & 255;
                if (i2 == 128) {
                    throw new IOException("index == 0");
                }
                if ((-1) - (((-1) - bD) | ((-1) - 128)) == 128) {
                    int iB = B(i2, 127);
                    int i3 = iB - 1;
                    if (!I(i3)) {
                        int iV = V(i3 - hf.B.length);
                        if (iV >= 0) {
                            hc[] hcVarArr = this.B;
                            if (iV < hcVarArr.length) {
                                this.Z.add(hcVarArr[iV]);
                            }
                        }
                        throw new IOException(new StringBuilder("Header index too large ").append(iB).toString());
                    }
                    this.Z.add(hf.B[i3]);
                } else if (i2 == 64) {
                    B(new hc(hf.Code(S()), S()));
                } else if ((-1) - (((-1) - bD) | ((-1) - 64)) == 64) {
                    B(new hc(B(B(i2, 63) - 1), S()));
                } else if ((bD & 32) == 32) {
                    int iB2 = B(i2, 31);
                    this.I = iB2;
                    if (iB2 < 0 || iB2 > this.Code) {
                        throw new IOException(new StringBuilder("Invalid dynamic table size update ").append(this.I).toString());
                    }
                    Z();
                } else if (i2 == 16 || i2 == 0) {
                    this.Z.add(new hc(hf.Code(S()), S()));
                } else {
                    this.Z.add(new hc(B(B(i2, 15) - 1), S()));
                }
            }
        }

        public final List<hc> V() {
            ArrayList arrayList = new ArrayList(this.Z);
            this.Z.clear();
            return arrayList;
        }
    }

    static final class Z {
        private int B;
        private int C;
        private int Code;
        private int D;
        private hc[] F;
        private final boolean I;
        private int L;
        private boolean V;
        private final ie Z;

        Z(ie ieVar) {
            this(ieVar, (byte) 0);
        }

        private Z(ie ieVar, byte b2) {
            this.B = Integer.MAX_VALUE;
            hc[] hcVarArr = new hc[8];
            this.F = hcVarArr;
            this.L = hcVarArr.length - 1;
            this.C = 0;
            this.D = 0;
            this.Code = 4096;
            this.I = true;
            this.Z = ieVar;
        }

        private void Code(hc hcVar) {
            int i2 = hcVar.S;
            int i3 = this.Code;
            if (i2 > i3) {
                Z();
                return;
            }
            V((this.D + i2) - i3);
            int i4 = this.C + 1;
            hc[] hcVarArr = this.F;
            if (i4 > hcVarArr.length) {
                hc[] hcVarArr2 = new hc[hcVarArr.length << 1];
                System.arraycopy(hcVarArr, 0, hcVarArr2, hcVarArr.length, hcVarArr.length);
                this.L = this.F.length - 1;
                this.F = hcVarArr2;
            }
            int i5 = this.L;
            this.L = i5 - 1;
            this.F[i5] = hcVar;
            this.C++;
            this.D += i2;
        }

        private int V(int i2) {
            int i3;
            int i4 = 0;
            if (i2 > 0) {
                int length = this.F.length - 1;
                while (true) {
                    i3 = this.L;
                    if (length < i3 || i2 <= 0) {
                        break;
                    }
                    i2 -= this.F[length].S;
                    this.D -= this.F[length].S;
                    this.C--;
                    i4++;
                    length--;
                }
                hc[] hcVarArr = this.F;
                System.arraycopy(hcVarArr, i3 + 1, hcVarArr, i3 + 1 + i4, this.C);
                hc[] hcVarArr2 = this.F;
                int i5 = this.L;
                Arrays.fill(hcVarArr2, i5 + 1, i5 + 1 + i4, (Object) null);
                this.L += i4;
            }
            return i4;
        }

        private void V(int i2, int i3, int i4) {
            if (i2 < i3) {
                this.Z.I((-1) - (((-1) - i2) & ((-1) - i4)));
                return;
            }
            this.Z.I((i4 + i3) - (i4 & i3));
            int i5 = i2 - i3;
            while (i5 >= 128) {
                int i6 = (-1) - (((-1) - i5) | ((-1) - 127));
                this.Z.I((128 + i6) - (128 & i6));
                i5 >>>= 7;
            }
            this.Z.I(i5);
        }

        private void V(ib ibVar) throws IOException {
            if (this.I) {
                hh.I();
                if (hh.V(ibVar) < ibVar.S()) {
                    ie ieVar = new ie();
                    hh.I();
                    hh.Z(ibVar, ieVar);
                    ib ibVarI = ieVar.i();
                    V(ibVarI.S(), 127, 128);
                    this.Z.B(ibVarI);
                    return;
                }
            }
            V(ibVar.S(), 127, 0);
            this.Z.B(ibVar);
        }

        private void Z() {
            Arrays.fill(this.F, (Object) null);
            this.L = this.F.length - 1;
            this.C = 0;
            this.D = 0;
        }

        final void B(int i2) {
            int iMin = Math.min(i2, 16384);
            int i3 = this.Code;
            if (i3 == iMin) {
                return;
            }
            if (iMin < i3) {
                this.B = Math.min(this.B, iMin);
            }
            this.V = true;
            this.Code = iMin;
            int i4 = this.D;
            if (iMin < i4) {
                if (iMin == 0) {
                    Z();
                } else {
                    V(i4 - iMin);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x00e5  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        final void Z(java.util.List<com.facetec.sdk.hc> r13) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 238
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.hf.Z.Z(java.util.List):void");
        }
    }

    static {
        int i2 = 0;
        hc[] hcVarArr = {new hc(hc.D, ""), new hc(hc.B, "GET"), new hc(hc.B, HttpPost.METHOD_NAME), new hc(hc.Z, RemoteSettings.FORWARD_SLASH_STRING), new hc(hc.Z, "/index.html"), new hc(hc.Code, "http"), new hc(hc.Code, "https"), new hc(hc.I, "200"), new hc(hc.I, "204"), new hc(hc.I, "206"), new hc(hc.I, "304"), new hc(hc.I, "400"), new hc(hc.I, "404"), new hc(hc.I, "500"), new hc("accept-charset", ""), new hc("accept-encoding", "gzip, deflate"), new hc("accept-language", ""), new hc("accept-ranges", ""), new hc("accept", ""), new hc("access-control-allow-origin", ""), new hc("age", ""), new hc("allow", ""), new hc("authorization", ""), new hc("cache-control", ""), new hc("content-disposition", ""), new hc("content-encoding", ""), new hc("content-language", ""), new hc("content-length", ""), new hc("content-location", ""), new hc("content-range", ""), new hc("content-type", ""), new hc("cookie", ""), new hc("date", ""), new hc("etag", ""), new hc("expect", ""), new hc(ClientCookie.EXPIRES_ATTR, ""), new hc("from", ""), new hc("host", ""), new hc("if-match", ""), new hc("if-modified-since", ""), new hc("if-none-match", ""), new hc("if-range", ""), new hc("if-unmodified-since", ""), new hc("last-modified", ""), new hc("link", ""), new hc(FirebaseAnalytics.Param.LOCATION, ""), new hc("max-forwards", ""), new hc("proxy-authenticate", ""), new hc("proxy-authorization", ""), new hc("range", ""), new hc("referer", ""), new hc("refresh", ""), new hc("retry-after", ""), new hc("server", ""), new hc("set-cookie", ""), new hc("strict-transport-security", ""), new hc("transfer-encoding", ""), new hc("user-agent", ""), new hc("vary", ""), new hc("via", ""), new hc("www-authenticate", "")};
        B = hcVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(hcVarArr.length);
        while (true) {
            hc[] hcVarArr2 = B;
            if (i2 >= hcVarArr2.length) {
                V = Collections.unmodifiableMap(linkedHashMap);
                return;
            } else {
                if (!linkedHashMap.containsKey(hcVarArr2[i2].L)) {
                    linkedHashMap.put(hcVarArr2[i2].L, Integer.valueOf(i2));
                }
                i2++;
            }
        }
    }

    static ib Code(ib ibVar) throws IOException {
        int iS = ibVar.S();
        for (int i2 = 0; i2 < iS; i2++) {
            byte B2 = ibVar.B(i2);
            if (B2 >= 65 && B2 <= 90) {
                throw new IOException(new StringBuilder("PROTOCOL_ERROR response malformed: mixed case name: ").append(ibVar.Z()).toString());
            }
        }
        return ibVar;
    }
}
