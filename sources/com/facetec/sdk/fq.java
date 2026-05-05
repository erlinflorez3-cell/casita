package com.facetec.sdk;

import com.facetec.sdk.cf;
import cz.msebera.android.httpclient.client.utils.URLEncodedUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes3.dex */
public final class fq extends gb {
    private static final fw I = fw.I(URLEncodedUtils.CONTENT_TYPE);
    private final List<String> Code;
    private final List<String> V;

    public static final class Z {
        private final List<String> B;
        private final Charset V;
        private final List<String> Z;

        public Z() {
            this(null);
        }

        private Z(Charset charset) {
            this.Z = new ArrayList();
            this.B = new ArrayList();
            this.V = charset;
        }

        public final Z B(String str, String str2) {
            if (str2 == null) {
                throw new NullPointerException("value == null");
            }
            this.Z.add(fp.I(str, HttpUrl.FORM_ENCODE_SET, this.V));
            this.B.add(fp.I(str2, HttpUrl.FORM_ENCODE_SET, this.V));
            return this;
        }

        public final fq Code() {
            return new fq(this.Z, this.B);
        }
    }

    fq(List<String> list, List<String> list2) {
        this.V = gg.Code(list);
        this.Code = gg.Code(list2);
    }

    private long Z(@Nullable cf.I i2, boolean z2) {
        ie ieVar = z2 ? new ie() : i2.L();
        int size = this.V.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 > 0) {
                ieVar.I(38);
            }
            ieVar.V(this.V.get(i3));
            ieVar.I(61);
            ieVar.V(this.Code.get(i3));
        }
        if (!z2) {
            return 0L;
        }
        long jH = ieVar.h();
        ieVar.m();
        return jH;
    }

    @Override // com.facetec.sdk.gb
    public final fw B() {
        return I;
    }

    @Override // com.facetec.sdk.gb
    public final void Code(cf.I i2) throws IOException {
        Z(i2, false);
    }

    @Override // com.facetec.sdk.gb
    public final long V() {
        return Z(null, true);
    }
}
