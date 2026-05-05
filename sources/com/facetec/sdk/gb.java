package com.facetec.sdk;

import com.facetec.sdk.cf;
import java.io.IOException;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gb {

    /* JADX INFO: renamed from: com.facetec.sdk.gb$3 */
    final class AnonymousClass3 extends gb {
        private /* synthetic */ int B = 0;
        private /* synthetic */ int Code;
        private /* synthetic */ byte[] Z;

        AnonymousClass3(int i2, byte[] bArr) {
            i = i2;
            bArr = bArr;
        }

        @Override // com.facetec.sdk.gb
        @Nullable
        public final fw B() {
            return fwVar;
        }

        @Override // com.facetec.sdk.gb
        public final void Code(cf.I i2) throws IOException {
            i2.Z(bArr, this.B, i);
        }

        @Override // com.facetec.sdk.gb
        public final long V() {
            return i;
        }
    }

    public static gb V(@Nullable fw fwVar, String str) {
        Charset charsetCode = gg.Code;
        if (fwVar != null && (charsetCode = fwVar.Code()) == null) {
            charsetCode = gg.Code;
            fwVar = fw.V(new StringBuilder().append(fwVar).append("; charset=utf-8").toString());
        }
        return V(fwVar, str.getBytes(charsetCode));
    }

    public static gb V(@Nullable fw fwVar, byte[] bArr) {
        return Z(fwVar, bArr, bArr.length);
    }

    private static gb Z(@Nullable fw fwVar, byte[] bArr, int i2) {
        if (bArr == null) {
            throw new NullPointerException("content == null");
        }
        gg.V(bArr.length, i2);
        return new gb() { // from class: com.facetec.sdk.gb.3
            private /* synthetic */ int B = 0;
            private /* synthetic */ int Code;
            private /* synthetic */ byte[] Z;

            AnonymousClass3(int i22, byte[] bArr2) {
                i = i22;
                bArr = bArr2;
            }

            @Override // com.facetec.sdk.gb
            @Nullable
            public final fw B() {
                return fwVar;
            }

            @Override // com.facetec.sdk.gb
            public final void Code(cf.I i22) throws IOException {
                i22.Z(bArr, this.B, i);
            }

            @Override // com.facetec.sdk.gb
            public final long V() {
                return i;
            }
        };
    }

    @Nullable
    public abstract fw B();

    public abstract void Code(cf.I i2) throws IOException;

    public long V() throws IOException {
        return -1L;
    }
}
