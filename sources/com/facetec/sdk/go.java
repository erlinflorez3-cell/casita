package com.facetec.sdk;

import com.facetec.sdk.cf;
import com.facetec.sdk.fo;
import com.facetec.sdk.fy;
import cz.msebera.android.httpclient.protocol.HTTP;
import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes3.dex */
public final class go implements fo {
    private final boolean V;

    static final class I extends id {
        private long Z;

        I(cf.I i2) {
            super(i2);
        }

        @Override // com.facetec.sdk.id, com.facetec.sdk.cf.I
        public final void Z(ie ieVar, long j2) throws IOException {
            super.Z(ieVar, j2);
            this.Z += j2;
        }
    }

    public go(boolean z2) {
        this.V = z2;
    }

    @Override // com.facetec.sdk.fo
    public final fy V(fo.Code code) throws IOException {
        gt gtVar = (gt) code;
        gp gpVarD = gtVar.D();
        gn gnVarL = gtVar.L();
        gm gmVar = (gm) gtVar.B();
        fv fvVarI = gtVar.I();
        long jCurrentTimeMillis = System.currentTimeMillis();
        gtVar.F();
        gtVar.S();
        gpVarD.Z(fvVarI);
        gtVar.F();
        gtVar.S();
        fy.B B = null;
        if (gu.V(fvVarI.Z()) && fvVarI.I() != null) {
            if (HTTP.EXPECT_CONTINUE.equalsIgnoreCase(fvVarI.Z("Expect"))) {
                gpVarD.V();
                gtVar.F();
                gtVar.S();
                B = gpVarD.B(true);
            }
            if (B == null) {
                gtVar.F();
                gtVar.S();
                cf.I iZ = ik.Z(new I(gpVarD.Code(fvVarI, fvVarI.I().V())));
                fvVarI.I().Code(iZ);
                iZ.close();
                gtVar.F();
                gtVar.S();
            } else if (!gmVar.o()) {
                gnVarL.B();
            }
        }
        gpVarD.Code();
        if (B == null) {
            gtVar.F();
            gtVar.S();
            B = gpVarD.B(false);
        }
        fy fyVarV = B.Code(fvVarI).B(gnVarL.I().n()).V(jCurrentTimeMillis).B(System.currentTimeMillis()).V();
        int I2 = fyVarV.I();
        if (I2 == 100) {
            fyVarV = gpVarD.B(false).Code(fvVarI).B(gnVarL.I().n()).V(jCurrentTimeMillis).B(System.currentTimeMillis()).V();
            I2 = fyVarV.I();
        }
        gtVar.F();
        gtVar.S();
        fy fyVarV2 = (this.V && I2 == 101) ? fyVarV.F().B(gg.I).V() : fyVarV.F().B(gpVarD.V(fyVarV)).V();
        if ("close".equalsIgnoreCase(fyVarV2.Code().Z("Connection")) || "close".equalsIgnoreCase(fyVarV2.B("Connection"))) {
            gnVarL.B();
        }
        if ((I2 == 204 || I2 == 205) && fyVarV2.D().B() > 0) {
            throw new ProtocolException(new StringBuilder("HTTP ").append(I2).append(" had non-zero Content-Length: ").append(fyVarV2.D().B()).toString());
        }
        return fyVarV2;
    }
}
