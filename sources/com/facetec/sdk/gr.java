package com.facetec.sdk;

import com.facetec.sdk.fo;
import com.facetec.sdk.fv;
import com.facetec.sdk.fy;
import cz.msebera.android.httpclient.protocol.HTTP;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gr implements fo {
    private final fm B;

    public gr(fm fmVar) {
        this.B = fmVar;
    }

    @Override // com.facetec.sdk.fo
    public final fy V(fo.Code code) throws IOException {
        boolean z2;
        fv fvVarI = code.I();
        fv.Z zB = fvVarI.B();
        gb gbVarI = fvVarI.I();
        if (gbVarI != null) {
            fw fwVarB = gbVarI.B();
            if (fwVarB != null) {
                zB.Code("Content-Type", fwVarB.toString());
            }
            long jV = gbVarI.V();
            if (jV != -1) {
                zB.Code("Content-Length", Long.toString(jV));
                zB.V("Transfer-Encoding");
            } else {
                zB.Code("Transfer-Encoding", HTTP.CHUNK_CODING);
                zB.V("Content-Length");
            }
        }
        if (fvVarI.Z("Host") == null) {
            zB.Code("Host", gg.V(fvVarI.Code(), false));
        }
        if (fvVarI.Z("Connection") == null) {
            zB.Code("Connection", "Keep-Alive");
        }
        if (fvVarI.Z("Accept-Encoding") == null && fvVarI.Z("Range") == null) {
            zB.Code("Accept-Encoding", "gzip");
            z2 = true;
        } else {
            z2 = false;
        }
        fm fmVar = this.B;
        fvVarI.Code();
        List<fj> listV = fmVar.V();
        if (!listV.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = listV.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 > 0) {
                    sb.append("; ");
                }
                fj fjVar = listV.get(i2);
                sb.append(fjVar.V()).append('=').append(fjVar.Z());
            }
            zB.Code("Cookie", sb.toString());
        }
        if (fvVarI.Z("User-Agent") == null) {
            zB.Code("User-Agent", gu.I());
        }
        fy fyVarV = code.V(zB.Z());
        gs.I(this.B, fvVarI.Code(), fyVarV.Z());
        fy.B bCode = fyVarV.F().Code(fvVarI);
        if (z2 && "gzip".equalsIgnoreCase(fyVarV.B("Content-Encoding")) && gs.Z(fyVarV)) {
            ij ijVar = new ij(fyVarV.D().I());
            bCode.Code(fyVarV.Z().B().B("Content-Encoding").B("Content-Length").I());
            bCode.B(new gv(fyVarV.B("Content-Type"), -1L, ik.Code(ijVar)));
        }
        return bCode.V();
    }
}
