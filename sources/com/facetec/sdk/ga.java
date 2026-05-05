package com.facetec.sdk;

import com.facetec.sdk.cf;
import java.io.Closeable;
import java.io.IOException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ga implements Closeable {
    public static ga V(@Nullable final fw fwVar, byte[] bArr) {
        final ie ieVarZ = new ie().Z(bArr);
        final long length = bArr.length;
        if (ieVarZ != null) {
            return new ga() { // from class: com.facetec.sdk.ga.3
                @Override // com.facetec.sdk.ga
                public final long B() {
                    return length;
                }

                @Override // com.facetec.sdk.ga
                @Nullable
                public final fw Code() {
                    return fwVar;
                }

                @Override // com.facetec.sdk.ga
                public final cf.I I() {
                    return ieVarZ;
                }
            };
        }
        throw new NullPointerException("source == null");
    }

    public abstract long B();

    @Nullable
    public abstract fw Code();

    public abstract cf.I I();

    public final String V() throws IOException {
        cf.I I = I();
        try {
            fw fwVarCode = Code();
            return I.Code(gg.I(I, fwVarCode != null ? fwVarCode.I(gg.Code) : gg.Code));
        } finally {
            gg.B(I);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        gg.B(I());
    }
}
