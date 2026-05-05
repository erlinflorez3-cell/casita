package com.facetec.sdk;

import com.facetec.sdk.fr;
import cz.msebera.android.httpclient.client.methods.HttpPost;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class fv {
    final Map<Class<?>, Object> B;
    final fp Code;

    @Nullable
    private volatile fe F;
    final fr I;

    @Nullable
    final gb V;
    final String Z;

    public static class Z {
        fr.V B;
        Map<Class<?>, Object> Code;

        @Nullable
        gb I;
        String V;

        @Nullable
        fp Z;

        public Z() {
            this.Code = Collections.emptyMap();
            this.V = "GET";
            this.B = new fr.V();
        }

        Z(fv fvVar) {
            this.Code = Collections.emptyMap();
            this.Z = fvVar.Code;
            this.V = fvVar.Z;
            this.I = fvVar.V;
            this.Code = fvVar.B.isEmpty() ? Collections.emptyMap() : new LinkedHashMap<>(fvVar.B);
            this.B = fvVar.I.B();
        }

        public final Z B(gb gbVar) {
            return I(HttpPost.METHOD_NAME, gbVar);
        }

        public final Z Code(String str, String str2) {
            this.B.Z(str, str2);
            return this;
        }

        public final Z I(fp fpVar) {
            if (fpVar == null) {
                throw new NullPointerException("url == null");
            }
            this.Z = fpVar;
            return this;
        }

        public final Z I(String str) {
            String string = str;
            if (string == null) {
                throw new NullPointerException("url == null");
            }
            if (string.regionMatches(true, 0, "ws:", 0, 3)) {
                string = new StringBuilder("http:").append(string.substring(3)).toString();
            } else if (string.regionMatches(true, 0, "wss:", 0, 4)) {
                string = new StringBuilder("https:").append(string.substring(4)).toString();
            }
            return I(fp.B(string));
        }

        public final Z I(String str, @Nullable gb gbVar) {
            if (str == null) {
                throw new NullPointerException("method == null");
            }
            if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            }
            if (gbVar != null && !gu.V(str)) {
                throw new IllegalArgumentException(new StringBuilder("method ").append(str).append(" must not have a request body.").toString());
            }
            if (gbVar == null && gu.B(str)) {
                throw new IllegalArgumentException(new StringBuilder("method ").append(str).append(" must have a request body.").toString());
            }
            this.V = str;
            this.I = gbVar;
            return this;
        }

        public final Z V(String str) {
            this.B.B(str);
            return this;
        }

        public final Z Z(fr frVar) {
            this.B = frVar.B();
            return this;
        }

        public final Z Z(String str, String str2) {
            this.B.V(str, str2);
            return this;
        }

        public final fv Z() {
            if (this.Z != null) {
                return new fv(this);
            }
            throw new IllegalStateException("url == null");
        }
    }

    fv(Z z2) {
        this.Code = z2.Z;
        this.Z = z2.V;
        this.I = z2.B.I();
        this.V = z2.I;
        this.B = gg.Code(z2.Code);
    }

    public final Z B() {
        return new Z(this);
    }

    public final fe C() {
        fe feVar = this.F;
        if (feVar != null) {
            return feVar;
        }
        fe feVarZ = fe.Z(this.I);
        this.F = feVarZ;
        return feVarZ;
    }

    public final fp Code() {
        return this.Code;
    }

    @Nullable
    public final gb I() {
        return this.V;
    }

    public final boolean L() {
        return this.Code.V();
    }

    public final fr V() {
        return this.I;
    }

    public final String Z() {
        return this.Z;
    }

    @Nullable
    public final String Z(String str) {
        return this.I.Code(str);
    }

    public final String toString() {
        return new StringBuilder("Request{method=").append(this.Z).append(", url=").append(this.Code).append(", tags=").append(this.B).append(AbstractJsonLexerKt.END_OBJ).toString();
    }
}
