package com.incode.welcome_sdk.data.e;

import android.util.Base64;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f7658a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f7659c = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f7660e = new b(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f7661g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f7662h = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PublicKey f7663b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f7664d;

    public d(PublicKey publicKey, String str) {
        Intrinsics.checkNotNullParameter(publicKey, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.f7663b = publicKey;
        this.f7664d = str;
    }

    public final PublicKey c() {
        PublicKey publicKey;
        int i2 = 2 % 2;
        int i3 = f7659c;
        int i4 = i3 + 55;
        f7658a = i4 % 128;
        if (i4 % 2 != 0) {
            publicKey = this.f7663b;
            int i5 = 60 / 0;
        } else {
            publicKey = this.f7663b;
        }
        int i6 = i3 + 13;
        f7658a = i6 % 128;
        int i7 = i6 % 2;
        return publicKey;
    }

    public final String a() {
        int i2 = 2 % 2;
        int i3 = f7659c + 91;
        int i4 = i3 % 128;
        f7658a = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.f7664d;
        int i5 = i4 + 31;
        f7659c = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 2 / 0;
        }
        return str;
    }

    public static final class b {
        private b() {
        }

        public static d b(String str) throws InvalidKeySpecException {
            String str2 = "";
            Intrinsics.checkNotNullParameter(str, "");
            JSONObject jSONObject = new JSONObject(str);
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(jSONObject.optString("publicKey"), 0)));
            Intrinsics.checkNotNull(publicKeyGeneratePublic);
            String strOptString = jSONObject.optString("sessionId");
            if (strOptString != null) {
                Intrinsics.checkNotNull(strOptString);
                str2 = strOptString;
            }
            return new d(publicKeyGeneratePublic, str2);
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    static {
        int i2 = f7662h + 115;
        f7661g = i2 % 128;
        int i3 = i2 % 2;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f7659c + 55;
            f7658a = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (!(!(obj instanceof d))) {
            d dVar = (d) obj;
            if (!Intrinsics.areEqual(this.f7663b, dVar.f7663b)) {
                int i5 = f7658a + 99;
                f7659c = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 35 / 0;
                }
                return false;
            }
            if (Intrinsics.areEqual(this.f7664d, dVar.f7664d)) {
                return true;
            }
            int i7 = f7659c + 15;
            f7658a = i7 % 128;
            int i8 = i7 % 2;
        }
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f7659c + 105;
        f7658a = i3 % 128;
        int iHashCode = i3 % 2 != 0 ? (this.f7663b.hashCode() * 27) - this.f7664d.hashCode() : (this.f7663b.hashCode() * 31) + this.f7664d.hashCode();
        int i4 = f7659c + 117;
        f7658a = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f7658a + 13;
        f7659c = i3 % 128;
        int i4 = i3 % 2;
        String str = "E2EEResponse(publicKey=" + this.f7663b + ", sessionId=" + this.f7664d + ")";
        int i5 = f7658a + 97;
        f7659c = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
