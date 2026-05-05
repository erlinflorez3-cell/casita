package okhttp3.internal.tls;

import androidx.webkit.ProxyConfig;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okio.Utf8;
import yg.C1499aX;
import yg.C1561oA;
import yg.EO;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00116B\u0005\"4\u0012\u0006%njG<L͜P.hS2\u000fq|<$i-yCAU\"}8\tWNmmtсZ!¼?\u0006Dw+1OUޯa\u0012\u001d2\u000b\u0002M7euM;ptd\u000bN7R<\b\f\u0019\u001aXPX\u0013\tLc\u0012\"2PphX;R5\u001e \rV /&\rk\\@`l\f<u#K}PY?_^\t}\u0011Ta?\r%gN/N>M\u0015S[K\u001d`fW\u0003m}m\tv4?+wy\b:f\u000e,\u0015Y^Sq;<j\u0015i`:3[Sq\\h\u000eV}+\u007f\u001bC\u001c\u000e4/\u000f.u4t\u0018&3#~\u0004F^\u0013vD\u0016y\u0010<G+\u000eEC;1e\u007fg\u0002\u0019\u0017M\n\u0018%\u001eQ\r\u001f%ih&`C!\u0005{_8i@kP\u0015\n\"G{\u0019\tb00,0u\u0006u{Y8%;O[g/Ik0N\u000bgG\u0011niki\u0001J\u0017̑Aގ;*\u0011ȱ+Pr\b\u0004P\u0003Z\u0003ҍ ɟX\u0007\u0006ܱ˟$s"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI7\u0003NJ\u0001\u001d*y\u001cK\u007f!=Yn Dq\u00172MP\u0011", "\u001aiPCT?\b\\\u0019\u000eDl:\u0004R\u0012o\u000e7\u0005<\t\u0017\bG|\u0012=z%B/", "u(E", "\u000fKC,7\u0015,M\u0002Zb>", "", "\u000fKC,<\u0017\u001aM\u0002Zb>", "/k[ h)CS\u0017\u000eVe;e\u00057e\u000e", "", "", "1daA\\-BQ\u0015\u000ez", "\u001aiPCTuLS\u0017\u000f\bb;\u0011R-e\r7E3Paj%o\u001bKz&9Wy/7C", "5dc h)CS\u0017\u000eVe;e\u00057e\u000e", "Bx_2", "Dda6Y@", "", "6nbA", "Adb@\\6G", "\u001aiPCT?\b\\\u0019\u000eDl:\u0004R\u001dSf\u0016{N\u000f\u001b!PE", "Dda6Y@!]'\u000e\u0004Z4|", "6nbAa(FS", ">`cAX9G", "Dda6Y@\"^t}yk,\u000b\u0017", "7o01W9>a'", "/rR6\\\u001bH:#\u0011zk*x\u0017/", "7r0@V0B", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    private final String asciiToLowercase(String str) {
        if (!isAscii(str)) {
            return str;
        }
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = str.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    private final List<String> getSubjectAltNames(X509Certificate x509Certificate, int i2) throws Throwable {
        Object obj;
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(EO.Od("{CfmZL&\r|[N9\n>M3\u000e\f\u000f\u000f+\u007fpxzI+QJ\u001dxZO\u001c", (short) (C1499aX.Xd() ^ (-31344)))).getMethod(C1561oA.Qd("30>\u001c=)0*'7\u0003-4$0+\u001d/#/\u001d\u0005\u0017\"\u0019&", (short) (C1499aX.Xd() ^ (-3585))), new Class[0]);
            try {
                method.setAccessible(true);
                Collection<List> collection = (Collection) method.invoke(x509Certificate, objArr);
                if (collection == null) {
                    return CollectionsKt.emptyList();
                }
                ArrayList arrayList = new ArrayList();
                for (List list : collection) {
                    if (list != null && list.size() >= 2 && Intrinsics.areEqual(list.get(0), Integer.valueOf(i2)) && (obj = list.get(1)) != null) {
                        arrayList.add((String) obj);
                    }
                }
                return arrayList;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (CertificateParsingException unused) {
            return CollectionsKt.emptyList();
        }
    }

    private final boolean isAscii(String str) {
        return str.length() == ((int) Utf8.size$default(str, 0, 0, 3, null));
    }

    private final boolean verifyHostname(String str, String str2) {
        String str3;
        String str4 = str2;
        String str5 = str;
        String str6 = str5;
        if (str6 != null && str6.length() != 0 && !StringsKt.startsWith$default(str5, ".", false, 2, (Object) null) && !StringsKt.endsWith$default(str5, "..", false, 2, (Object) null) && (str3 = str4) != null && str3.length() != 0 && !StringsKt.startsWith$default(str4, ".", false, 2, (Object) null) && !StringsKt.endsWith$default(str4, "..", false, 2, (Object) null)) {
            if (!StringsKt.endsWith$default(str5, ".", false, 2, (Object) null)) {
                str5 = str5 + '.';
            }
            if (!StringsKt.endsWith$default(str4, ".", false, 2, (Object) null)) {
                str4 = str4 + '.';
            }
            String strAsciiToLowercase = asciiToLowercase(str4);
            String str7 = strAsciiToLowercase;
            if (!StringsKt.contains$default((CharSequence) str7, (CharSequence) ProxyConfig.MATCH_ALL_SCHEMES, false, 2, (Object) null)) {
                return Intrinsics.areEqual(str5, strAsciiToLowercase);
            }
            if (!StringsKt.startsWith$default(strAsciiToLowercase, "*.", false, 2, (Object) null) || StringsKt.indexOf$default((CharSequence) str7, '*', 1, false, 4, (Object) null) != -1 || str5.length() < strAsciiToLowercase.length() || Intrinsics.areEqual("*.", strAsciiToLowercase)) {
                return false;
            }
            String strSubstring = strAsciiToLowercase.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            if (!StringsKt.endsWith$default(str5, strSubstring, false, 2, (Object) null)) {
                return false;
            }
            int length = str5.length() - strSubstring.length();
            return length <= 0 || StringsKt.lastIndexOf$default((CharSequence) str5, '.', length + (-1), false, 4, (Object) null) == -1;
        }
        return false;
    }

    private final boolean verifyHostname(String str, X509Certificate x509Certificate) throws Throwable {
        String strAsciiToLowercase = asciiToLowercase(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 2);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (INSTANCE.verifyHostname(strAsciiToLowercase, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean verifyIpAddress(String str, X509Certificate x509Certificate) throws Throwable {
        String canonicalHost = HostnamesKt.toCanonicalHost(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(canonicalHost, HostnamesKt.toCanonicalHost((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    public final List<String> allSubjectAltNames(X509Certificate certificate) throws Throwable {
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        return CollectionsKt.plus((Collection) getSubjectAltNames(certificate, 7), (Iterable) getSubjectAltNames(certificate, 2));
    }

    public final boolean verify(String host, X509Certificate certificate) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        return Util.canParseAsIpAddress(host) ? verifyIpAddress(host, certificate) : verifyHostname(host, certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String host, SSLSession session) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(session, "session");
        boolean zVerify = false;
        if (!isAscii(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            zVerify = verify(host, (X509Certificate) certificate);
            return zVerify;
        } catch (SSLException unused) {
            return zVerify;
        }
    }
}
