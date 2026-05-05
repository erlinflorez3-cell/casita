package com.facetec.sdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ff {
    public static final ff B;
    public static final ff C;
    public static final ff D;
    public static final ff F;
    public static final ff I;
    public static final ff L;
    public static final ff S;
    public static final ff V;
    public static final ff Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ff f3160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ff f3161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ff f3162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ff f3163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ff f3164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ff f3165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ff f3166g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ff f3167i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ff f3168j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final String f3170h;
    static final Comparator<String> Code = new Comparator<String>() { // from class: com.facetec.sdk.ff.1
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            int iMin = Math.min(str3.length(), str4.length());
            for (int i2 = 4; i2 < iMin; i2++) {
                char cCharAt = str3.charAt(i2);
                char cCharAt2 = str4.charAt(i2);
                if (cCharAt != cCharAt2) {
                    return cCharAt < cCharAt2 ? -1 : 1;
                }
            }
            int length = str3.length();
            int length2 = str4.length();
            if (length != length2) {
                return length < length2 ? -1 : 1;
            }
            return 0;
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Map<String, ff> f3169k = new LinkedHashMap();

    static {
        I("SSL_RSA_WITH_NULL_MD5");
        I("SSL_RSA_WITH_NULL_SHA");
        I("SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        I("SSL_RSA_WITH_RC4_128_MD5");
        I("SSL_RSA_WITH_RC4_128_SHA");
        I("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        I("SSL_RSA_WITH_DES_CBC_SHA");
        V = I("SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        I("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        I("SSL_DHE_DSS_WITH_DES_CBC_SHA");
        I("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        I("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        I("SSL_DHE_RSA_WITH_DES_CBC_SHA");
        I("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        I("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        I("SSL_DH_anon_WITH_RC4_128_MD5");
        I("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        I("SSL_DH_anon_WITH_DES_CBC_SHA");
        I("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        I("TLS_KRB5_WITH_DES_CBC_SHA");
        I("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        I("TLS_KRB5_WITH_RC4_128_SHA");
        I("TLS_KRB5_WITH_DES_CBC_MD5");
        I("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        I("TLS_KRB5_WITH_RC4_128_MD5");
        I("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        I("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        I("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        I("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        B = I("TLS_RSA_WITH_AES_128_CBC_SHA");
        I("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        I("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        I("TLS_DH_anon_WITH_AES_128_CBC_SHA");
        I = I("TLS_RSA_WITH_AES_256_CBC_SHA");
        I("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        I("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        I("TLS_DH_anon_WITH_AES_256_CBC_SHA");
        I("TLS_RSA_WITH_NULL_SHA256");
        I("TLS_RSA_WITH_AES_128_CBC_SHA256");
        I("TLS_RSA_WITH_AES_256_CBC_SHA256");
        I("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        I("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        I("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        I("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        I("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        I("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        I("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        I("TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        I("TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        I("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        I("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        I("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        I("TLS_PSK_WITH_RC4_128_SHA");
        I("TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        I("TLS_PSK_WITH_AES_128_CBC_SHA");
        I("TLS_PSK_WITH_AES_256_CBC_SHA");
        I("TLS_RSA_WITH_SEED_CBC_SHA");
        Z = I("TLS_RSA_WITH_AES_128_GCM_SHA256");
        S = I("TLS_RSA_WITH_AES_256_GCM_SHA384");
        I("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        I("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        I("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        I("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        I("TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        I("TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        I("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        I("TLS_FALLBACK_SCSV");
        I("TLS_ECDH_ECDSA_WITH_NULL_SHA");
        I("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        I("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        I("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        I("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        I("TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        I("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        I("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        I("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        I("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        I("TLS_ECDH_RSA_WITH_NULL_SHA");
        I("TLS_ECDH_RSA_WITH_RC4_128_SHA");
        I("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        I("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        I("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        I("TLS_ECDHE_RSA_WITH_NULL_SHA");
        I("TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        I("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        L = I("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        D = I("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        I("TLS_ECDH_anon_WITH_NULL_SHA");
        I("TLS_ECDH_anon_WITH_RC4_128_SHA");
        I("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        I("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        I("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        I("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        I("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        I("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        I("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        I("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        I("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        I("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        I("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        F = I("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        C = I("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        I("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        I("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        f3160a = I("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        f3164e = I("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        I("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        I("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        I("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        I("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        f3163d = I("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        f3162c = I("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
        I("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        I("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
        f3161b = I("TLS_AES_128_GCM_SHA256");
        f3167i = I("TLS_AES_256_GCM_SHA384");
        f3168j = I("TLS_CHACHA20_POLY1305_SHA256");
        f3166g = I("TLS_AES_128_CCM_SHA256");
        f3165f = I("TLS_AES_256_CCM_8_SHA256");
    }

    private ff(String str) {
        str.getClass();
        this.f3170h = str;
    }

    private static ff I(String str) {
        ff ffVar = new ff(str);
        f3169k.put(str, ffVar);
        return ffVar;
    }

    static List<ff> V(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(Z(str));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static synchronized ff Z(String str) {
        ff ffVar;
        Map<String, ff> map = f3169k;
        ffVar = map.get(str);
        if (ffVar == null) {
            ffVar = map.get(str.startsWith("TLS_") ? new StringBuilder("SSL_").append(str.substring(4)).toString() : str.startsWith("SSL_") ? new StringBuilder("TLS_").append(str.substring(4)).toString() : str);
            if (ffVar == null) {
                ffVar = new ff(str);
            }
            map.put(str, ffVar);
        }
        return ffVar;
    }

    public final String toString() {
        return this.f3170h;
    }
}
